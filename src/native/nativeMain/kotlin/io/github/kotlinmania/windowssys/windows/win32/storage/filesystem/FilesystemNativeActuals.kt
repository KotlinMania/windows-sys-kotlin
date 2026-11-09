@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.io.LPOVERLAPPED_COMPLETION_ROUTINE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AddLogContainer(hlog: HANDLE, pcbcontainer: Long, pwszcontainerpath: PCWSTR, preserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_AddLogContainer(hlog.toCPointer<ByteVar>(), pcbcontainer.toCPointer<ByteVar>(), pwszcontainerpath.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun AddLogContainerSet(hlog: HANDLE, ccontainer: UShort, pcbcontainer: Long, rgwszcontainerpath: Long, preserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_AddLogContainerSet(hlog.toCPointer<ByteVar>(), ccontainer, pcbcontainer.toCPointer<ByteVar>(), rgwszcontainerpath.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun AddUsersToEncryptedFile(lpfilename: PCWSTR, pencryptioncertificates: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_AddUsersToEncryptedFile(lpfilename.toCPointer<ByteVar>(), pencryptioncertificates.toCPointer<ByteVar>())

public actual fun AdvanceLogBase(pvmarshal: Long, plsnbase: Long, fflags: UInt, poverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_AdvanceLogBase(pvmarshal.toCPointer<ByteVar>(), plsnbase.toCPointer<ByteVar>(), fflags, poverlapped.toCPointer<ByteVar>())

public actual fun AlignReservedLog(pvmarshal: Long, creservedrecords: UInt, rgcbreservation: Long, pcbalignreservation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_AlignReservedLog(pvmarshal.toCPointer<ByteVar>(), creservedrecords, rgcbreservation.toCPointer<ByteVar>(), pcbalignreservation.toCPointer<ByteVar>())

public actual fun AllocReservedLog(pvmarshal: Long, creservedrecords: UInt, pcbadjustment: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_AllocReservedLog(pvmarshal.toCPointer<ByteVar>(), creservedrecords, pcbadjustment.toCPointer<ByteVar>())

public actual fun AreFileApisANSI(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_AreFileApisANSI()

public actual fun AreShortNamesEnabled(handle: HANDLE, enabled: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_AreShortNamesEnabled(handle.toCPointer<ByteVar>(), enabled.toCPointer<ByteVar>())

public actual fun BackupRead(hfile: HANDLE, lpbuffer: Long, nnumberofbytestoread: UInt, lpnumberofbytesread: Long, babort: BOOL, bprocesssecurity: BOOL, lpcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_BackupRead(hfile.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nnumberofbytestoread, lpnumberofbytesread.toCPointer<ByteVar>(), babort, bprocesssecurity, lpcontext.toCPointer<ByteVar>())

public actual fun BackupSeek(hfile: HANDLE, dwlowbytestoseek: UInt, dwhighbytestoseek: UInt, lpdwlowbyteseeked: Long, lpdwhighbyteseeked: Long, lpcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_BackupSeek(hfile.toCPointer<ByteVar>(), dwlowbytestoseek, dwhighbytestoseek, lpdwlowbyteseeked.toCPointer<ByteVar>(), lpdwhighbyteseeked.toCPointer<ByteVar>(), lpcontext.toCPointer<ByteVar>())

public actual fun BackupWrite(hfile: HANDLE, lpbuffer: Long, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: Long, babort: BOOL, bprocesssecurity: BOOL, lpcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_BackupWrite(hfile.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nnumberofbytestowrite, lpnumberofbyteswritten.toCPointer<ByteVar>(), babort, bprocesssecurity, lpcontext.toCPointer<ByteVar>())

public actual fun BuildIoRingCancelRequest(ioring: HIORING, file: IORING_HANDLE_REF, optocancel: ULong, userdata: ULong): HRESULT =
    0

public actual fun BuildIoRingFlushFile(ioring: HIORING, fileref: IORING_HANDLE_REF, flushmode: FILE_FLUSH_MODE, userdata: ULong, sqeflags: IORING_SQE_FLAGS): HRESULT =
    0

public actual fun BuildIoRingReadFile(ioring: HIORING, fileref: IORING_HANDLE_REF, dataref: IORING_BUFFER_REF, numberofbytestoread: UInt, fileoffset: ULong, userdata: ULong, sqeflags: IORING_SQE_FLAGS): HRESULT =
    0

public actual fun BuildIoRingRegisterBuffers(ioring: HIORING, count: UInt, buffers: Long, userdata: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_BuildIoRingRegisterBuffers(ioring.toCPointer<ByteVar>(), count, buffers.toCPointer<ByteVar>(), userdata)

public actual fun BuildIoRingRegisterFileHandles(ioring: HIORING, count: UInt, handles: Long, userdata: ULong): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_BuildIoRingRegisterFileHandles(ioring.toCPointer<ByteVar>(), count, handles.toCPointer<ByteVar>(), userdata)

public actual fun BuildIoRingWriteFile(ioring: HIORING, fileref: IORING_HANDLE_REF, bufferref: IORING_BUFFER_REF, numberofbytestowrite: UInt, fileoffset: ULong, writeflags: FILE_WRITE_FLAGS, userdata: ULong, sqeflags: IORING_SQE_FLAGS): HRESULT =
    0

public actual fun CheckNameLegalDOS8Dot3A(lpname: PCSTR, lpoemname: PSTR, oemnamesize: UInt, pbnamecontainsspaces: Long, pbnamelegal: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CheckNameLegalDOS8Dot3A(lpname.toCPointer<ByteVar>(), lpoemname.toCPointer<ByteVar>(), oemnamesize, pbnamecontainsspaces.toCPointer<ByteVar>(), pbnamelegal.toCPointer<ByteVar>())

public actual fun CheckNameLegalDOS8Dot3W(lpname: PCWSTR, lpoemname: PSTR, oemnamesize: UInt, pbnamecontainsspaces: Long, pbnamelegal: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CheckNameLegalDOS8Dot3W(lpname.toCPointer<ByteVar>(), lpoemname.toCPointer<ByteVar>(), oemnamesize, pbnamecontainsspaces.toCPointer<ByteVar>(), pbnamelegal.toCPointer<ByteVar>())

public actual fun CloseAndResetLogFile(hlog: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CloseAndResetLogFile(hlog.toCPointer<ByteVar>())

public actual fun CloseEncryptedFileRaw(pvcontext: Long) {
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CloseEncryptedFileRaw(pvcontext.toCPointer<ByteVar>())
}

public actual fun CloseIoRing(ioring: HIORING): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CloseIoRing(ioring.toCPointer<ByteVar>())

public actual fun CommitComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CommitComplete(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun CommitEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CommitEnlistment(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun CommitTransaction(transactionhandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CommitTransaction(transactionhandle.toCPointer<ByteVar>())

public actual fun CommitTransactionAsync(transactionhandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CommitTransactionAsync(transactionhandle.toCPointer<ByteVar>())

public actual fun CompareFileTime(lpfiletime1: Long, lpfiletime2: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CompareFileTime(lpfiletime1.toCPointer<ByteVar>(), lpfiletime2.toCPointer<ByteVar>())

public actual fun CopyFile2(pwszexistingfilename: PCWSTR, pwsznewfilename: PCWSTR, pextendedparameters: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CopyFile2(pwszexistingfilename.toCPointer<ByteVar>(), pwsznewfilename.toCPointer<ByteVar>(), pextendedparameters.toCPointer<ByteVar>())

public actual fun CopyFileA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, bfailifexists: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CopyFileA(lpexistingfilename.toCPointer<ByteVar>(), lpnewfilename.toCPointer<ByteVar>(), bfailifexists)

public actual fun CopyFileExA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: COPYFILE_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CopyFileExA(lpexistingfilename.toCPointer<ByteVar>(), lpnewfilename.toCPointer<ByteVar>(), lpprogressroutine.toLong().toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), pbcancel.toCPointer<ByteVar>(), dwcopyflags)

public actual fun CopyFileExW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: COPYFILE_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CopyFileExW(lpexistingfilename.toCPointer<ByteVar>(), lpnewfilename.toCPointer<ByteVar>(), lpprogressroutine.toLong().toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), pbcancel.toCPointer<ByteVar>(), dwcopyflags)

public actual fun CopyFileFromAppW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, bfailifexists: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CopyFileFromAppW(lpexistingfilename.toCPointer<ByteVar>(), lpnewfilename.toCPointer<ByteVar>(), bfailifexists)

public actual fun CopyFileTransactedA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: UInt, htransaction: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CopyFileTransactedA(lpexistingfilename.toCPointer<ByteVar>(), lpnewfilename.toCPointer<ByteVar>(), lpprogressroutine.toLong().toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), pbcancel.toCPointer<ByteVar>(), dwcopyflags, htransaction.toCPointer<ByteVar>())

public actual fun CopyFileTransactedW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: UInt, htransaction: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CopyFileTransactedW(lpexistingfilename.toCPointer<ByteVar>(), lpnewfilename.toCPointer<ByteVar>(), lpprogressroutine.toLong().toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), pbcancel.toCPointer<ByteVar>(), dwcopyflags, htransaction.toCPointer<ByteVar>())

public actual fun CopyFileW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, bfailifexists: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CopyFileW(lpexistingfilename.toCPointer<ByteVar>(), lpnewfilename.toCPointer<ByteVar>(), bfailifexists)

public actual fun CopyLZFile(hfsource: Int, hfdest: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CopyLZFile(hfsource, hfdest)

public actual fun CreateDirectoryA(lppathname: PCSTR, lpsecurityattributes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateDirectoryA(lppathname.toCPointer<ByteVar>(), lpsecurityattributes.toCPointer<ByteVar>())

public actual fun CreateDirectoryExA(lptemplatedirectory: PCSTR, lpnewdirectory: PCSTR, lpsecurityattributes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateDirectoryExA(lptemplatedirectory.toCPointer<ByteVar>(), lpnewdirectory.toCPointer<ByteVar>(), lpsecurityattributes.toCPointer<ByteVar>())

public actual fun CreateDirectoryExW(lptemplatedirectory: PCWSTR, lpnewdirectory: PCWSTR, lpsecurityattributes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateDirectoryExW(lptemplatedirectory.toCPointer<ByteVar>(), lpnewdirectory.toCPointer<ByteVar>(), lpsecurityattributes.toCPointer<ByteVar>())

public actual fun CreateDirectoryFromAppW(lppathname: PCWSTR, lpsecurityattributes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateDirectoryFromAppW(lppathname.toCPointer<ByteVar>(), lpsecurityattributes.toCPointer<ByteVar>())

public actual fun CreateDirectoryTransactedA(lptemplatedirectory: PCSTR, lpnewdirectory: PCSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateDirectoryTransactedA(lptemplatedirectory.toCPointer<ByteVar>(), lpnewdirectory.toCPointer<ByteVar>(), lpsecurityattributes.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>())

public actual fun CreateDirectoryTransactedW(lptemplatedirectory: PCWSTR, lpnewdirectory: PCWSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateDirectoryTransactedW(lptemplatedirectory.toCPointer<ByteVar>(), lpnewdirectory.toCPointer<ByteVar>(), lpsecurityattributes.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>())

public actual fun CreateDirectoryW(lppathname: PCWSTR, lpsecurityattributes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateDirectoryW(lppathname.toCPointer<ByteVar>(), lpsecurityattributes.toCPointer<ByteVar>())

public actual fun CreateEnlistment(lpenlistmentattributes: Long, resourcemanagerhandle: HANDLE, transactionhandle: HANDLE, notificationmask: UInt, createoptions: UInt, enlistmentkey: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateEnlistment(lpenlistmentattributes.toCPointer<ByteVar>(), resourcemanagerhandle.toCPointer<ByteVar>(), transactionhandle.toCPointer<ByteVar>(), notificationmask, createoptions, enlistmentkey.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateFile2(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, dwcreationdisposition: FILE_CREATION_DISPOSITION, pcreateexparams: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateFile2(lpfilename.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, dwcreationdisposition, pcreateexparams.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateFile2FromAppW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationdisposition: UInt, pcreateexparams: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateFile2FromAppW(lpfilename.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, dwcreationdisposition, pcreateexparams.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateFileA(lpfilename: PCSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateFileA(lpfilename.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, lpsecurityattributes.toCPointer<ByteVar>(), dwcreationdisposition, dwflagsandattributes, htemplatefile.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateFileFromAppW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: Long, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: HANDLE): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateFileFromAppW(lpfilename.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, lpsecurityattributes.toCPointer<ByteVar>(), dwcreationdisposition, dwflagsandattributes, htemplatefile.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateFileTransactedA(lpfilename: PCSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE, htransaction: HANDLE, pusminiversion: Long, lpextendedparameter: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateFileTransactedA(lpfilename.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, lpsecurityattributes.toCPointer<ByteVar>(), dwcreationdisposition, dwflagsandattributes, htemplatefile.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>(), pusminiversion.toCPointer<ByteVar>(), lpextendedparameter.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateFileTransactedW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE, htransaction: HANDLE, pusminiversion: Long, lpextendedparameter: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateFileTransactedW(lpfilename.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, lpsecurityattributes.toCPointer<ByteVar>(), dwcreationdisposition, dwflagsandattributes, htemplatefile.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>(), pusminiversion.toCPointer<ByteVar>(), lpextendedparameter.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateFileW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateFileW(lpfilename.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, lpsecurityattributes.toCPointer<ByteVar>(), dwcreationdisposition, dwflagsandattributes, htemplatefile.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateHardLinkA(lpfilename: PCSTR, lpexistingfilename: PCSTR, lpsecurityattributes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateHardLinkA(lpfilename.toCPointer<ByteVar>(), lpexistingfilename.toCPointer<ByteVar>(), lpsecurityattributes.toCPointer<ByteVar>())

public actual fun CreateHardLinkTransactedA(lpfilename: PCSTR, lpexistingfilename: PCSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateHardLinkTransactedA(lpfilename.toCPointer<ByteVar>(), lpexistingfilename.toCPointer<ByteVar>(), lpsecurityattributes.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>())

public actual fun CreateHardLinkTransactedW(lpfilename: PCWSTR, lpexistingfilename: PCWSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateHardLinkTransactedW(lpfilename.toCPointer<ByteVar>(), lpexistingfilename.toCPointer<ByteVar>(), lpsecurityattributes.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>())

public actual fun CreateHardLinkW(lpfilename: PCWSTR, lpexistingfilename: PCWSTR, lpsecurityattributes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateHardLinkW(lpfilename.toCPointer<ByteVar>(), lpexistingfilename.toCPointer<ByteVar>(), lpsecurityattributes.toCPointer<ByteVar>())

public actual fun CreateIoRing(ioringversion: IORING_VERSION, flags: IORING_CREATE_FLAGS, submissionqueuesize: UInt, completionqueuesize: UInt, h: Long): HRESULT =
    0

public actual fun CreateLogContainerScanContext(hlog: HANDLE, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: Long, poverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateLogContainerScanContext(hlog.toCPointer<ByteVar>(), cfromcontainer, ccontainers, escanmode, pcxscan.toCPointer<ByteVar>(), poverlapped.toCPointer<ByteVar>())

public actual fun CreateLogFile(pszlogfilename: PCWSTR, fdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, psalogfile: Long, fcreatedisposition: FILE_CREATION_DISPOSITION, fflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateLogFile(pszlogfilename.toCPointer<ByteVar>(), fdesiredaccess, dwsharemode, psalogfile.toCPointer<ByteVar>(), fcreatedisposition, fflagsandattributes)?.toLong() ?: 0L

public actual fun CreateLogMarshallingArea(hlog: HANDLE, pfnallocbuffer: CLFS_BLOCK_ALLOCATION, pfnfreebuffer: CLFS_BLOCK_DEALLOCATION, pvblockalloccontext: Long, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshal: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateLogMarshallingArea(hlog.toCPointer<ByteVar>(), pfnallocbuffer.toLong().toCPointer<ByteVar>(), pfnfreebuffer.toLong().toCPointer<ByteVar>(), pvblockalloccontext.toCPointer<ByteVar>(), cbmarshallingbuffer, cmaxwritebuffers, cmaxreadbuffers, ppvmarshal.toCPointer<ByteVar>())

public actual fun CreateResourceManager(lpresourcemanagerattributes: Long, resourcemanagerid: Long, createoptions: UInt, tmhandle: HANDLE, description: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateResourceManager(lpresourcemanagerattributes.toCPointer<ByteVar>(), resourcemanagerid.toCPointer<ByteVar>(), createoptions, tmhandle.toCPointer<ByteVar>(), description.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateSymbolicLinkA(lpsymlinkfilename: PCSTR, lptargetfilename: PCSTR, dwflags: SYMBOLIC_LINK_FLAGS): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateSymbolicLinkA(lpsymlinkfilename.toCPointer<ByteVar>(), lptargetfilename.toCPointer<ByteVar>(), dwflags)

public actual fun CreateSymbolicLinkTransactedA(lpsymlinkfilename: PCSTR, lptargetfilename: PCSTR, dwflags: SYMBOLIC_LINK_FLAGS, htransaction: HANDLE): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateSymbolicLinkTransactedA(lpsymlinkfilename.toCPointer<ByteVar>(), lptargetfilename.toCPointer<ByteVar>(), dwflags, htransaction.toCPointer<ByteVar>())

public actual fun CreateSymbolicLinkTransactedW(lpsymlinkfilename: PCWSTR, lptargetfilename: PCWSTR, dwflags: SYMBOLIC_LINK_FLAGS, htransaction: HANDLE): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateSymbolicLinkTransactedW(lpsymlinkfilename.toCPointer<ByteVar>(), lptargetfilename.toCPointer<ByteVar>(), dwflags, htransaction.toCPointer<ByteVar>())

public actual fun CreateSymbolicLinkW(lpsymlinkfilename: PCWSTR, lptargetfilename: PCWSTR, dwflags: SYMBOLIC_LINK_FLAGS): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateSymbolicLinkW(lpsymlinkfilename.toCPointer<ByteVar>(), lptargetfilename.toCPointer<ByteVar>(), dwflags)

public actual fun CreateTapePartition(hdevice: HANDLE, dwpartitionmethod: CREATE_TAPE_PARTITION_METHOD, dwcount: UInt, dwsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateTapePartition(hdevice.toCPointer<ByteVar>(), dwpartitionmethod, dwcount, dwsize)

public actual fun CreateTransaction(lptransactionattributes: Long, uow: Long, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateTransaction(lptransactionattributes.toCPointer<ByteVar>(), uow.toCPointer<ByteVar>(), createoptions, isolationlevel, isolationflags, timeout, description.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateTransactionManager(lptransactionattributes: Long, logfilename: PCWSTR, createoptions: UInt, commitstrength: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_CreateTransactionManager(lptransactionattributes.toCPointer<ByteVar>(), logfilename.toCPointer<ByteVar>(), createoptions, commitstrength)?.toLong() ?: 0L

public actual fun DecryptFileA(lpfilename: PCSTR, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_DecryptFileA(lpfilename.toCPointer<ByteVar>(), dwreserved)

public actual fun DecryptFileW(lpfilename: PCWSTR, dwreserved: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_DecryptFileW(lpfilename.toCPointer<ByteVar>(), dwreserved)

public actual fun DefineDosDeviceA(dwflags: DEFINE_DOS_DEVICE_FLAGS, lpdevicename: PCSTR, lptargetpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_DefineDosDeviceA(dwflags, lpdevicename.toCPointer<ByteVar>(), lptargetpath.toCPointer<ByteVar>())

public actual fun DefineDosDeviceW(dwflags: DEFINE_DOS_DEVICE_FLAGS, lpdevicename: PCWSTR, lptargetpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_DefineDosDeviceW(dwflags, lpdevicename.toCPointer<ByteVar>(), lptargetpath.toCPointer<ByteVar>())

public actual fun DeleteFileA(lpfilename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_DeleteFileA(lpfilename.toCPointer<ByteVar>())

public actual fun DeleteFileFromAppW(lpfilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_DeleteFileFromAppW(lpfilename.toCPointer<ByteVar>())

public actual fun DeleteFileTransactedA(lpfilename: PCSTR, htransaction: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_DeleteFileTransactedA(lpfilename.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>())

public actual fun DeleteFileTransactedW(lpfilename: PCWSTR, htransaction: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_DeleteFileTransactedW(lpfilename.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>())

public actual fun DeleteFileW(lpfilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_DeleteFileW(lpfilename.toCPointer<ByteVar>())

public actual fun DeleteLogByHandle(hlog: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_DeleteLogByHandle(hlog.toCPointer<ByteVar>())

public actual fun DeleteLogFile(pszlogfilename: PCWSTR, pvreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_DeleteLogFile(pszlogfilename.toCPointer<ByteVar>(), pvreserved.toCPointer<ByteVar>())

public actual fun DeleteLogMarshallingArea(pvmarshal: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_DeleteLogMarshallingArea(pvmarshal.toCPointer<ByteVar>())

public actual fun DeleteVolumeMountPointA(lpszvolumemountpoint: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_DeleteVolumeMountPointA(lpszvolumemountpoint.toCPointer<ByteVar>())

public actual fun DeleteVolumeMountPointW(lpszvolumemountpoint: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_DeleteVolumeMountPointW(lpszvolumemountpoint.toCPointer<ByteVar>())

public actual fun DeregisterManageableLogClient(hlog: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_DeregisterManageableLogClient(hlog.toCPointer<ByteVar>())

public actual fun DuplicateEncryptionInfoFile(srcfilename: PCWSTR, dstfilename: PCWSTR, dwcreationdistribution: UInt, dwattributes: UInt, lpsecurityattributes: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_DuplicateEncryptionInfoFile(srcfilename.toCPointer<ByteVar>(), dstfilename.toCPointer<ByteVar>(), dwcreationdistribution, dwattributes, lpsecurityattributes.toCPointer<ByteVar>())

public actual fun EncryptFileA(lpfilename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_EncryptFileA(lpfilename.toCPointer<ByteVar>())

public actual fun EncryptFileW(lpfilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_EncryptFileW(lpfilename.toCPointer<ByteVar>())

public actual fun EncryptionDisable(dirpath: PCWSTR, disable: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_EncryptionDisable(dirpath.toCPointer<ByteVar>(), disable)

public actual fun EraseTape(hdevice: HANDLE, dwerasetype: ERASE_TAPE_TYPE, bimmediate: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_EraseTape(hdevice.toCPointer<ByteVar>(), dwerasetype, bimmediate)

public actual fun FileEncryptionStatusA(lpfilename: PCSTR, lpstatus: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FileEncryptionStatusA(lpfilename.toCPointer<ByteVar>(), lpstatus.toCPointer<ByteVar>())

public actual fun FileEncryptionStatusW(lpfilename: PCWSTR, lpstatus: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FileEncryptionStatusW(lpfilename.toCPointer<ByteVar>(), lpstatus.toCPointer<ByteVar>())

public actual fun FileTimeToLocalFileTime(lpfiletime: Long, lplocalfiletime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FileTimeToLocalFileTime(lpfiletime.toCPointer<ByteVar>(), lplocalfiletime.toCPointer<ByteVar>())

public actual fun FindClose(hfindfile: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindClose(hfindfile.toCPointer<ByteVar>())

public actual fun FindCloseChangeNotification(hchangehandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindCloseChangeNotification(hchangehandle.toCPointer<ByteVar>())

public actual fun FindFirstChangeNotificationA(lppathname: PCSTR, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindFirstChangeNotificationA(lppathname.toCPointer<ByteVar>(), bwatchsubtree, dwnotifyfilter)?.toLong() ?: 0L

public actual fun FindFirstChangeNotificationW(lppathname: PCWSTR, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindFirstChangeNotificationW(lppathname.toCPointer<ByteVar>(), bwatchsubtree, dwnotifyfilter)?.toLong() ?: 0L

public actual fun FindFirstFileA(lpfilename: PCSTR, lpfindfiledata: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindFirstFileA(lpfilename.toCPointer<ByteVar>(), lpfindfiledata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindFirstFileExA(lpfilename: PCSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: FIND_FIRST_EX_FLAGS): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindFirstFileExA(lpfilename.toCPointer<ByteVar>(), finfolevelid, lpfindfiledata.toCPointer<ByteVar>(), fsearchop, lpsearchfilter.toCPointer<ByteVar>(), dwadditionalflags)?.toLong() ?: 0L

public actual fun FindFirstFileExFromAppW(lpfilename: PCWSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindFirstFileExFromAppW(lpfilename.toCPointer<ByteVar>(), finfolevelid, lpfindfiledata.toCPointer<ByteVar>(), fsearchop, lpsearchfilter.toCPointer<ByteVar>(), dwadditionalflags)?.toLong() ?: 0L

public actual fun FindFirstFileExW(lpfilename: PCWSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: FIND_FIRST_EX_FLAGS): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindFirstFileExW(lpfilename.toCPointer<ByteVar>(), finfolevelid, lpfindfiledata.toCPointer<ByteVar>(), fsearchop, lpsearchfilter.toCPointer<ByteVar>(), dwadditionalflags)?.toLong() ?: 0L

public actual fun FindFirstFileNameTransactedW(lpfilename: PCWSTR, dwflags: UInt, stringlength: Long, linkname: PWSTR, htransaction: HANDLE): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindFirstFileNameTransactedW(lpfilename.toCPointer<ByteVar>(), dwflags, stringlength.toCPointer<ByteVar>(), linkname.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindFirstFileNameW(lpfilename: PCWSTR, dwflags: UInt, stringlength: Long, linkname: PWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindFirstFileNameW(lpfilename.toCPointer<ByteVar>(), dwflags, stringlength.toCPointer<ByteVar>(), linkname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindFirstFileTransactedA(lpfilename: PCSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: UInt, htransaction: HANDLE): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindFirstFileTransactedA(lpfilename.toCPointer<ByteVar>(), finfolevelid, lpfindfiledata.toCPointer<ByteVar>(), fsearchop, lpsearchfilter.toCPointer<ByteVar>(), dwadditionalflags, htransaction.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindFirstFileTransactedW(lpfilename: PCWSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: UInt, htransaction: HANDLE): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindFirstFileTransactedW(lpfilename.toCPointer<ByteVar>(), finfolevelid, lpfindfiledata.toCPointer<ByteVar>(), fsearchop, lpsearchfilter.toCPointer<ByteVar>(), dwadditionalflags, htransaction.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindFirstFileW(lpfilename: PCWSTR, lpfindfiledata: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindFirstFileW(lpfilename.toCPointer<ByteVar>(), lpfindfiledata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindFirstStreamTransactedW(lpfilename: PCWSTR, infolevel: STREAM_INFO_LEVELS, lpfindstreamdata: Long, dwflags: UInt, htransaction: HANDLE): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindFirstStreamTransactedW(lpfilename.toCPointer<ByteVar>(), infolevel, lpfindstreamdata.toCPointer<ByteVar>(), dwflags, htransaction.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FindFirstStreamW(lpfilename: PCWSTR, infolevel: STREAM_INFO_LEVELS, lpfindstreamdata: Long, dwflags: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindFirstStreamW(lpfilename.toCPointer<ByteVar>(), infolevel, lpfindstreamdata.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L

public actual fun FindFirstVolumeA(lpszvolumename: PSTR, cchbufferlength: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindFirstVolumeA(lpszvolumename.toCPointer<ByteVar>(), cchbufferlength)?.toLong() ?: 0L

public actual fun FindFirstVolumeMountPointA(lpszrootpathname: PCSTR, lpszvolumemountpoint: PSTR, cchbufferlength: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindFirstVolumeMountPointA(lpszrootpathname.toCPointer<ByteVar>(), lpszvolumemountpoint.toCPointer<ByteVar>(), cchbufferlength)?.toLong() ?: 0L

public actual fun FindFirstVolumeMountPointW(lpszrootpathname: PCWSTR, lpszvolumemountpoint: PWSTR, cchbufferlength: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindFirstVolumeMountPointW(lpszrootpathname.toCPointer<ByteVar>(), lpszvolumemountpoint.toCPointer<ByteVar>(), cchbufferlength)?.toLong() ?: 0L

public actual fun FindFirstVolumeW(lpszvolumename: PWSTR, cchbufferlength: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindFirstVolumeW(lpszvolumename.toCPointer<ByteVar>(), cchbufferlength)?.toLong() ?: 0L

public actual fun FindNextChangeNotification(hchangehandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindNextChangeNotification(hchangehandle.toCPointer<ByteVar>())

public actual fun FindNextFileA(hfindfile: HANDLE, lpfindfiledata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindNextFileA(hfindfile.toCPointer<ByteVar>(), lpfindfiledata.toCPointer<ByteVar>())

public actual fun FindNextFileNameW(hfindstream: HANDLE, stringlength: Long, linkname: PWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindNextFileNameW(hfindstream.toCPointer<ByteVar>(), stringlength.toCPointer<ByteVar>(), linkname.toCPointer<ByteVar>())

public actual fun FindNextFileW(hfindfile: HANDLE, lpfindfiledata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindNextFileW(hfindfile.toCPointer<ByteVar>(), lpfindfiledata.toCPointer<ByteVar>())

public actual fun FindNextStreamW(hfindstream: HANDLE, lpfindstreamdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindNextStreamW(hfindstream.toCPointer<ByteVar>(), lpfindstreamdata.toCPointer<ByteVar>())

public actual fun FindNextVolumeA(hfindvolume: HANDLE, lpszvolumename: PSTR, cchbufferlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindNextVolumeA(hfindvolume.toCPointer<ByteVar>(), lpszvolumename.toCPointer<ByteVar>(), cchbufferlength)

public actual fun FindNextVolumeMountPointA(hfindvolumemountpoint: HANDLE, lpszvolumemountpoint: PSTR, cchbufferlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindNextVolumeMountPointA(hfindvolumemountpoint.toCPointer<ByteVar>(), lpszvolumemountpoint.toCPointer<ByteVar>(), cchbufferlength)

public actual fun FindNextVolumeMountPointW(hfindvolumemountpoint: HANDLE, lpszvolumemountpoint: PWSTR, cchbufferlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindNextVolumeMountPointW(hfindvolumemountpoint.toCPointer<ByteVar>(), lpszvolumemountpoint.toCPointer<ByteVar>(), cchbufferlength)

public actual fun FindNextVolumeW(hfindvolume: HANDLE, lpszvolumename: PWSTR, cchbufferlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindNextVolumeW(hfindvolume.toCPointer<ByteVar>(), lpszvolumename.toCPointer<ByteVar>(), cchbufferlength)

public actual fun FindVolumeClose(hfindvolume: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindVolumeClose(hfindvolume.toCPointer<ByteVar>())

public actual fun FindVolumeMountPointClose(hfindvolumemountpoint: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FindVolumeMountPointClose(hfindvolumemountpoint.toCPointer<ByteVar>())

public actual fun FlushFileBuffers(hfile: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FlushFileBuffers(hfile.toCPointer<ByteVar>())

public actual fun FlushLogBuffers(pvmarshal: Long, poverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FlushLogBuffers(pvmarshal.toCPointer<ByteVar>(), poverlapped.toCPointer<ByteVar>())

public actual fun FlushLogToLsn(pvmarshalcontext: Long, plsnflush: Long, plsnlastflushed: Long, poverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FlushLogToLsn(pvmarshalcontext.toCPointer<ByteVar>(), plsnflush.toCPointer<ByteVar>(), plsnlastflushed.toCPointer<ByteVar>(), poverlapped.toCPointer<ByteVar>())

public actual fun FreeEncryptedFileMetadata(pbmetadata: Long) {
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FreeEncryptedFileMetadata(pbmetadata.toCPointer<ByteVar>())
}

public actual fun FreeEncryptionCertificateHashList(pusers: Long) {
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FreeEncryptionCertificateHashList(pusers.toCPointer<ByteVar>())
}

public actual fun FreeReservedLog(pvmarshal: Long, creservedrecords: UInt, pcbadjustment: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_FreeReservedLog(pvmarshal.toCPointer<ByteVar>(), creservedrecords, pcbadjustment.toCPointer<ByteVar>())

public actual fun GetBinaryTypeA(lpapplicationname: PCSTR, lpbinarytype: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetBinaryTypeA(lpapplicationname.toCPointer<ByteVar>(), lpbinarytype.toCPointer<ByteVar>())

public actual fun GetBinaryTypeW(lpapplicationname: PCWSTR, lpbinarytype: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetBinaryTypeW(lpapplicationname.toCPointer<ByteVar>(), lpbinarytype.toCPointer<ByteVar>())

public actual fun GetCompressedFileSizeA(lpfilename: PCSTR, lpfilesizehigh: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetCompressedFileSizeA(lpfilename.toCPointer<ByteVar>(), lpfilesizehigh.toCPointer<ByteVar>())

public actual fun GetCompressedFileSizeTransactedA(lpfilename: PCSTR, lpfilesizehigh: Long, htransaction: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetCompressedFileSizeTransactedA(lpfilename.toCPointer<ByteVar>(), lpfilesizehigh.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>())

public actual fun GetCompressedFileSizeTransactedW(lpfilename: PCWSTR, lpfilesizehigh: Long, htransaction: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetCompressedFileSizeTransactedW(lpfilename.toCPointer<ByteVar>(), lpfilesizehigh.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>())

public actual fun GetCompressedFileSizeW(lpfilename: PCWSTR, lpfilesizehigh: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetCompressedFileSizeW(lpfilename.toCPointer<ByteVar>(), lpfilesizehigh.toCPointer<ByteVar>())

public actual fun GetCurrentClockTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetCurrentClockTransactionManager(transactionmanagerhandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun GetDiskFreeSpaceA(lprootpathname: PCSTR, lpsectorspercluster: Long, lpbytespersector: Long, lpnumberoffreeclusters: Long, lptotalnumberofclusters: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetDiskFreeSpaceA(lprootpathname.toCPointer<ByteVar>(), lpsectorspercluster.toCPointer<ByteVar>(), lpbytespersector.toCPointer<ByteVar>(), lpnumberoffreeclusters.toCPointer<ByteVar>(), lptotalnumberofclusters.toCPointer<ByteVar>())

public actual fun GetDiskFreeSpaceExA(lpdirectoryname: PCSTR, lpfreebytesavailabletocaller: Long, lptotalnumberofbytes: Long, lptotalnumberoffreebytes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetDiskFreeSpaceExA(lpdirectoryname.toCPointer<ByteVar>(), lpfreebytesavailabletocaller.toCPointer<ByteVar>(), lptotalnumberofbytes.toCPointer<ByteVar>(), lptotalnumberoffreebytes.toCPointer<ByteVar>())

public actual fun GetDiskFreeSpaceExW(lpdirectoryname: PCWSTR, lpfreebytesavailabletocaller: Long, lptotalnumberofbytes: Long, lptotalnumberoffreebytes: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetDiskFreeSpaceExW(lpdirectoryname.toCPointer<ByteVar>(), lpfreebytesavailabletocaller.toCPointer<ByteVar>(), lptotalnumberofbytes.toCPointer<ByteVar>(), lptotalnumberoffreebytes.toCPointer<ByteVar>())

public actual fun GetDiskFreeSpaceW(lprootpathname: PCWSTR, lpsectorspercluster: Long, lpbytespersector: Long, lpnumberoffreeclusters: Long, lptotalnumberofclusters: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetDiskFreeSpaceW(lprootpathname.toCPointer<ByteVar>(), lpsectorspercluster.toCPointer<ByteVar>(), lpbytespersector.toCPointer<ByteVar>(), lpnumberoffreeclusters.toCPointer<ByteVar>(), lptotalnumberofclusters.toCPointer<ByteVar>())

public actual fun GetDiskSpaceInformationA(rootpath: PCSTR, diskspaceinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetDiskSpaceInformationA(rootpath.toCPointer<ByteVar>(), diskspaceinfo.toCPointer<ByteVar>())

public actual fun GetDiskSpaceInformationW(rootpath: PCWSTR, diskspaceinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetDiskSpaceInformationW(rootpath.toCPointer<ByteVar>(), diskspaceinfo.toCPointer<ByteVar>())

public actual fun GetDriveTypeA(lprootpathname: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetDriveTypeA(lprootpathname.toCPointer<ByteVar>())

public actual fun GetDriveTypeW(lprootpathname: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetDriveTypeW(lprootpathname.toCPointer<ByteVar>())

public actual fun GetEncryptedFileMetadata(lpfilename: PCWSTR, pcbmetadata: Long, ppbmetadata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetEncryptedFileMetadata(lpfilename.toCPointer<ByteVar>(), pcbmetadata.toCPointer<ByteVar>(), ppbmetadata.toCPointer<ByteVar>())

public actual fun GetEnlistmentId(enlistmenthandle: HANDLE, enlistmentid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetEnlistmentId(enlistmenthandle.toCPointer<ByteVar>(), enlistmentid.toCPointer<ByteVar>())

public actual fun GetEnlistmentRecoveryInformation(enlistmenthandle: HANDLE, buffersize: UInt, buffer: Long, bufferused: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetEnlistmentRecoveryInformation(enlistmenthandle.toCPointer<ByteVar>(), buffersize, buffer.toCPointer<ByteVar>(), bufferused.toCPointer<ByteVar>())

public actual fun GetExpandedNameA(lpszsource: PCSTR, lpszbuffer: PSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetExpandedNameA(lpszsource.toCPointer<ByteVar>(), lpszbuffer.toCPointer<ByteVar>())

public actual fun GetExpandedNameW(lpszsource: PCWSTR, lpszbuffer: PWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetExpandedNameW(lpszsource.toCPointer<ByteVar>(), lpszbuffer.toCPointer<ByteVar>())

public actual fun GetFileAttributesA(lpfilename: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileAttributesA(lpfilename.toCPointer<ByteVar>())

public actual fun GetFileAttributesExA(lpfilename: PCSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileAttributesExA(lpfilename.toCPointer<ByteVar>(), finfolevelid, lpfileinformation.toCPointer<ByteVar>())

public actual fun GetFileAttributesExFromAppW(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileAttributesExFromAppW(lpfilename.toCPointer<ByteVar>(), finfolevelid, lpfileinformation.toCPointer<ByteVar>())

public actual fun GetFileAttributesExW(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileAttributesExW(lpfilename.toCPointer<ByteVar>(), finfolevelid, lpfileinformation.toCPointer<ByteVar>())

public actual fun GetFileAttributesTransactedA(lpfilename: PCSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long, htransaction: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileAttributesTransactedA(lpfilename.toCPointer<ByteVar>(), finfolevelid, lpfileinformation.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>())

public actual fun GetFileAttributesTransactedW(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long, htransaction: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileAttributesTransactedW(lpfilename.toCPointer<ByteVar>(), finfolevelid, lpfileinformation.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>())

public actual fun GetFileAttributesW(lpfilename: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileAttributesW(lpfilename.toCPointer<ByteVar>())

public actual fun GetFileBandwidthReservation(hfile: HANDLE, lpperiodmilliseconds: Long, lpbytesperperiod: Long, pdiscardable: Long, lptransfersize: Long, lpnumoutstandingrequests: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileBandwidthReservation(hfile.toCPointer<ByteVar>(), lpperiodmilliseconds.toCPointer<ByteVar>(), lpbytesperperiod.toCPointer<ByteVar>(), pdiscardable.toCPointer<ByteVar>(), lptransfersize.toCPointer<ByteVar>(), lpnumoutstandingrequests.toCPointer<ByteVar>())

public actual fun GetFileInformationByHandle(hfile: HANDLE, lpfileinformation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileInformationByHandle(hfile.toCPointer<ByteVar>(), lpfileinformation.toCPointer<ByteVar>())

public actual fun GetFileInformationByHandleEx(hfile: HANDLE, fileinformationclass: FILE_INFO_BY_HANDLE_CLASS, lpfileinformation: Long, dwbuffersize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileInformationByHandleEx(hfile.toCPointer<ByteVar>(), fileinformationclass, lpfileinformation.toCPointer<ByteVar>(), dwbuffersize)

public actual fun GetFileSize(hfile: HANDLE, lpfilesizehigh: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileSize(hfile.toCPointer<ByteVar>(), lpfilesizehigh.toCPointer<ByteVar>())

public actual fun GetFileSizeEx(hfile: HANDLE, lpfilesize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileSizeEx(hfile.toCPointer<ByteVar>(), lpfilesize.toCPointer<ByteVar>())

public actual fun GetFileTime(hfile: HANDLE, lpcreationtime: Long, lplastaccesstime: Long, lplastwritetime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileTime(hfile.toCPointer<ByteVar>(), lpcreationtime.toCPointer<ByteVar>(), lplastaccesstime.toCPointer<ByteVar>(), lplastwritetime.toCPointer<ByteVar>())

public actual fun GetFileType(hfile: HANDLE): FILE_TYPE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileType(hfile.toCPointer<ByteVar>())

public actual fun GetFileVersionInfoA(lptstrfilename: PCSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoA(lptstrfilename.toCPointer<ByteVar>(), dwhandle, dwlen, lpdata.toCPointer<ByteVar>())

public actual fun GetFileVersionInfoExA(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoExA(dwflags, lpwstrfilename.toCPointer<ByteVar>(), dwhandle, dwlen, lpdata.toCPointer<ByteVar>())

public actual fun GetFileVersionInfoExW(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCWSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoExW(dwflags, lpwstrfilename.toCPointer<ByteVar>(), dwhandle, dwlen, lpdata.toCPointer<ByteVar>())

public actual fun GetFileVersionInfoSizeA(lptstrfilename: PCSTR, lpdwhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoSizeA(lptstrfilename.toCPointer<ByteVar>(), lpdwhandle.toCPointer<ByteVar>())

public actual fun GetFileVersionInfoSizeExA(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCSTR, lpdwhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoSizeExA(dwflags, lpwstrfilename.toCPointer<ByteVar>(), lpdwhandle.toCPointer<ByteVar>())

public actual fun GetFileVersionInfoSizeExW(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCWSTR, lpdwhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoSizeExW(dwflags, lpwstrfilename.toCPointer<ByteVar>(), lpdwhandle.toCPointer<ByteVar>())

public actual fun GetFileVersionInfoSizeW(lptstrfilename: PCWSTR, lpdwhandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoSizeW(lptstrfilename.toCPointer<ByteVar>(), lpdwhandle.toCPointer<ByteVar>())

public actual fun GetFileVersionInfoW(lptstrfilename: PCWSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoW(lptstrfilename.toCPointer<ByteVar>(), dwhandle, dwlen, lpdata.toCPointer<ByteVar>())

public actual fun GetFinalPathNameByHandleA(hfile: HANDLE, lpszfilepath: PSTR, cchfilepath: UInt, dwflags: GETFINALPATHNAMEBYHANDLE_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFinalPathNameByHandleA(hfile.toCPointer<ByteVar>(), lpszfilepath.toCPointer<ByteVar>(), cchfilepath, dwflags)

public actual fun GetFinalPathNameByHandleW(hfile: HANDLE, lpszfilepath: PWSTR, cchfilepath: UInt, dwflags: GETFINALPATHNAMEBYHANDLE_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFinalPathNameByHandleW(hfile.toCPointer<ByteVar>(), lpszfilepath.toCPointer<ByteVar>(), cchfilepath, dwflags)

public actual fun GetFullPathNameA(lpfilename: PCSTR, nbufferlength: UInt, lpbuffer: PSTR, lpfilepart: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFullPathNameA(lpfilename.toCPointer<ByteVar>(), nbufferlength, lpbuffer.toCPointer<ByteVar>(), lpfilepart.toCPointer<ByteVar>())

public actual fun GetFullPathNameTransactedA(lpfilename: PCSTR, nbufferlength: UInt, lpbuffer: PSTR, lpfilepart: Long, htransaction: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFullPathNameTransactedA(lpfilename.toCPointer<ByteVar>(), nbufferlength, lpbuffer.toCPointer<ByteVar>(), lpfilepart.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>())

public actual fun GetFullPathNameTransactedW(lpfilename: PCWSTR, nbufferlength: UInt, lpbuffer: PWSTR, lpfilepart: Long, htransaction: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFullPathNameTransactedW(lpfilename.toCPointer<ByteVar>(), nbufferlength, lpbuffer.toCPointer<ByteVar>(), lpfilepart.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>())

public actual fun GetFullPathNameW(lpfilename: PCWSTR, nbufferlength: UInt, lpbuffer: PWSTR, lpfilepart: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetFullPathNameW(lpfilename.toCPointer<ByteVar>(), nbufferlength, lpbuffer.toCPointer<ByteVar>(), lpfilepart.toCPointer<ByteVar>())

public actual fun GetIoRingInfo(ioring: HIORING, info: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetIoRingInfo(ioring.toCPointer<ByteVar>(), info.toCPointer<ByteVar>())

public actual fun GetLogContainerName(hlog: HANDLE, cidlogicalcontainer: UInt, pwstrcontainername: PCWSTR, clencontainername: UInt, pcactuallencontainername: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetLogContainerName(hlog.toCPointer<ByteVar>(), cidlogicalcontainer, pwstrcontainername.toCPointer<ByteVar>(), clencontainername, pcactuallencontainername.toCPointer<ByteVar>())

public actual fun GetLogFileInformation(hlog: HANDLE, pinfobuffer: Long, cbbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetLogFileInformation(hlog.toCPointer<ByteVar>(), pinfobuffer.toCPointer<ByteVar>(), cbbuffer.toCPointer<ByteVar>())

public actual fun GetLogIoStatistics(hlog: HANDLE, pvstatsbuffer: Long, cbstatsbuffer: UInt, estatsclass: CLFS_IOSTATS_CLASS, pcbstatswritten: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetLogIoStatistics(hlog.toCPointer<ByteVar>(), pvstatsbuffer.toCPointer<ByteVar>(), cbstatsbuffer, estatsclass, pcbstatswritten.toCPointer<ByteVar>())

public actual fun GetLogReservationInfo(pvmarshal: Long, pcbrecordnumber: Long, pcbuserreservation: Long, pcbcommitreservation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetLogReservationInfo(pvmarshal.toCPointer<ByteVar>(), pcbrecordnumber.toCPointer<ByteVar>(), pcbuserreservation.toCPointer<ByteVar>(), pcbcommitreservation.toCPointer<ByteVar>())

public actual fun GetLogicalDriveStringsA(nbufferlength: UInt, lpbuffer: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetLogicalDriveStringsA(nbufferlength, lpbuffer.toCPointer<ByteVar>())

public actual fun GetLogicalDriveStringsW(nbufferlength: UInt, lpbuffer: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetLogicalDriveStringsW(nbufferlength, lpbuffer.toCPointer<ByteVar>())

public actual fun GetLogicalDrives(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetLogicalDrives()

public actual fun GetLongPathNameA(lpszshortpath: PCSTR, lpszlongpath: PSTR, cchbuffer: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetLongPathNameA(lpszshortpath.toCPointer<ByteVar>(), lpszlongpath.toCPointer<ByteVar>(), cchbuffer)

public actual fun GetLongPathNameTransactedA(lpszshortpath: PCSTR, lpszlongpath: PSTR, cchbuffer: UInt, htransaction: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetLongPathNameTransactedA(lpszshortpath.toCPointer<ByteVar>(), lpszlongpath.toCPointer<ByteVar>(), cchbuffer, htransaction.toCPointer<ByteVar>())

public actual fun GetLongPathNameTransactedW(lpszshortpath: PCWSTR, lpszlongpath: PWSTR, cchbuffer: UInt, htransaction: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetLongPathNameTransactedW(lpszshortpath.toCPointer<ByteVar>(), lpszlongpath.toCPointer<ByteVar>(), cchbuffer, htransaction.toCPointer<ByteVar>())

public actual fun GetLongPathNameW(lpszshortpath: PCWSTR, lpszlongpath: PWSTR, cchbuffer: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetLongPathNameW(lpszshortpath.toCPointer<ByteVar>(), lpszlongpath.toCPointer<ByteVar>(), cchbuffer)

public actual fun GetNextLogArchiveExtent(pvarchivecontext: Long, rgadextent: Long, cdescriptors: UInt, pcdescriptorsreturned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetNextLogArchiveExtent(pvarchivecontext.toCPointer<ByteVar>(), rgadextent.toCPointer<ByteVar>(), cdescriptors, pcdescriptorsreturned.toCPointer<ByteVar>())

public actual fun GetNotificationResourceManager(resourcemanagerhandle: HANDLE, transactionnotification: Long, notificationlength: UInt, dwmilliseconds: UInt, returnlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetNotificationResourceManager(resourcemanagerhandle.toCPointer<ByteVar>(), transactionnotification.toCPointer<ByteVar>(), notificationlength, dwmilliseconds, returnlength.toCPointer<ByteVar>())

public actual fun GetNotificationResourceManagerAsync(resourcemanagerhandle: HANDLE, transactionnotification: Long, transactionnotificationlength: UInt, returnlength: Long, lpoverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetNotificationResourceManagerAsync(resourcemanagerhandle.toCPointer<ByteVar>(), transactionnotification.toCPointer<ByteVar>(), transactionnotificationlength, returnlength.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>())

public actual fun GetShortPathNameA(lpszlongpath: PCSTR, lpszshortpath: PSTR, cchbuffer: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetShortPathNameA(lpszlongpath.toCPointer<ByteVar>(), lpszshortpath.toCPointer<ByteVar>(), cchbuffer)

public actual fun GetShortPathNameW(lpszlongpath: PCWSTR, lpszshortpath: PWSTR, cchbuffer: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetShortPathNameW(lpszlongpath.toCPointer<ByteVar>(), lpszshortpath.toCPointer<ByteVar>(), cchbuffer)

public actual fun GetTapeParameters(hdevice: HANDLE, dwoperation: GET_TAPE_DRIVE_PARAMETERS_OPERATION, lpdwsize: Long, lptapeinformation: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetTapeParameters(hdevice.toCPointer<ByteVar>(), dwoperation, lpdwsize.toCPointer<ByteVar>(), lptapeinformation.toCPointer<ByteVar>())

public actual fun GetTapePosition(hdevice: HANDLE, dwpositiontype: TAPE_POSITION_TYPE, lpdwpartition: Long, lpdwoffsetlow: Long, lpdwoffsethigh: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetTapePosition(hdevice.toCPointer<ByteVar>(), dwpositiontype, lpdwpartition.toCPointer<ByteVar>(), lpdwoffsetlow.toCPointer<ByteVar>(), lpdwoffsethigh.toCPointer<ByteVar>())

public actual fun GetTapeStatus(hdevice: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetTapeStatus(hdevice.toCPointer<ByteVar>())

public actual fun GetTempFileNameA(lppathname: PCSTR, lpprefixstring: PCSTR, uunique: UInt, lptempfilename: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetTempFileNameA(lppathname.toCPointer<ByteVar>(), lpprefixstring.toCPointer<ByteVar>(), uunique, lptempfilename.toCPointer<ByteVar>())

public actual fun GetTempFileNameW(lppathname: PCWSTR, lpprefixstring: PCWSTR, uunique: UInt, lptempfilename: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetTempFileNameW(lppathname.toCPointer<ByteVar>(), lpprefixstring.toCPointer<ByteVar>(), uunique, lptempfilename.toCPointer<ByteVar>())

public actual fun GetTempPath2A(bufferlength: UInt, buffer: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetTempPath2A(bufferlength, buffer.toCPointer<ByteVar>())

public actual fun GetTempPath2W(bufferlength: UInt, buffer: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetTempPath2W(bufferlength, buffer.toCPointer<ByteVar>())

public actual fun GetTempPathA(nbufferlength: UInt, lpbuffer: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetTempPathA(nbufferlength, lpbuffer.toCPointer<ByteVar>())

public actual fun GetTempPathW(nbufferlength: UInt, lpbuffer: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetTempPathW(nbufferlength, lpbuffer.toCPointer<ByteVar>())

public actual fun GetTransactionId(transactionhandle: HANDLE, transactionid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetTransactionId(transactionhandle.toCPointer<ByteVar>(), transactionid.toCPointer<ByteVar>())

public actual fun GetTransactionInformation(transactionhandle: HANDLE, outcome: Long, isolationlevel: Long, isolationflags: Long, timeout: Long, bufferlength: UInt, description: PWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetTransactionInformation(transactionhandle.toCPointer<ByteVar>(), outcome.toCPointer<ByteVar>(), isolationlevel.toCPointer<ByteVar>(), isolationflags.toCPointer<ByteVar>(), timeout.toCPointer<ByteVar>(), bufferlength, description.toCPointer<ByteVar>())

public actual fun GetTransactionManagerId(transactionmanagerhandle: HANDLE, transactionmanagerid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetTransactionManagerId(transactionmanagerhandle.toCPointer<ByteVar>(), transactionmanagerid.toCPointer<ByteVar>())

public actual fun GetVolumeInformationA(lprootpathname: PCSTR, lpvolumenamebuffer: PSTR, nvolumenamesize: UInt, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: PSTR, nfilesystemnamesize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetVolumeInformationA(lprootpathname.toCPointer<ByteVar>(), lpvolumenamebuffer.toCPointer<ByteVar>(), nvolumenamesize, lpvolumeserialnumber.toCPointer<ByteVar>(), lpmaximumcomponentlength.toCPointer<ByteVar>(), lpfilesystemflags.toCPointer<ByteVar>(), lpfilesystemnamebuffer.toCPointer<ByteVar>(), nfilesystemnamesize)

public actual fun GetVolumeInformationByHandleW(hfile: HANDLE, lpvolumenamebuffer: PWSTR, nvolumenamesize: UInt, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: PWSTR, nfilesystemnamesize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetVolumeInformationByHandleW(hfile.toCPointer<ByteVar>(), lpvolumenamebuffer.toCPointer<ByteVar>(), nvolumenamesize, lpvolumeserialnumber.toCPointer<ByteVar>(), lpmaximumcomponentlength.toCPointer<ByteVar>(), lpfilesystemflags.toCPointer<ByteVar>(), lpfilesystemnamebuffer.toCPointer<ByteVar>(), nfilesystemnamesize)

public actual fun GetVolumeInformationW(lprootpathname: PCWSTR, lpvolumenamebuffer: PWSTR, nvolumenamesize: UInt, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: PWSTR, nfilesystemnamesize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetVolumeInformationW(lprootpathname.toCPointer<ByteVar>(), lpvolumenamebuffer.toCPointer<ByteVar>(), nvolumenamesize, lpvolumeserialnumber.toCPointer<ByteVar>(), lpmaximumcomponentlength.toCPointer<ByteVar>(), lpfilesystemflags.toCPointer<ByteVar>(), lpfilesystemnamebuffer.toCPointer<ByteVar>(), nfilesystemnamesize)

public actual fun GetVolumeNameForVolumeMountPointA(lpszvolumemountpoint: PCSTR, lpszvolumename: PSTR, cchbufferlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetVolumeNameForVolumeMountPointA(lpszvolumemountpoint.toCPointer<ByteVar>(), lpszvolumename.toCPointer<ByteVar>(), cchbufferlength)

public actual fun GetVolumeNameForVolumeMountPointW(lpszvolumemountpoint: PCWSTR, lpszvolumename: PWSTR, cchbufferlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetVolumeNameForVolumeMountPointW(lpszvolumemountpoint.toCPointer<ByteVar>(), lpszvolumename.toCPointer<ByteVar>(), cchbufferlength)

public actual fun GetVolumePathNameA(lpszfilename: PCSTR, lpszvolumepathname: PSTR, cchbufferlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetVolumePathNameA(lpszfilename.toCPointer<ByteVar>(), lpszvolumepathname.toCPointer<ByteVar>(), cchbufferlength)

public actual fun GetVolumePathNameW(lpszfilename: PCWSTR, lpszvolumepathname: PWSTR, cchbufferlength: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetVolumePathNameW(lpszfilename.toCPointer<ByteVar>(), lpszvolumepathname.toCPointer<ByteVar>(), cchbufferlength)

public actual fun GetVolumePathNamesForVolumeNameA(lpszvolumename: PCSTR, lpszvolumepathnames: PSTR, cchbufferlength: UInt, lpcchreturnlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetVolumePathNamesForVolumeNameA(lpszvolumename.toCPointer<ByteVar>(), lpszvolumepathnames.toCPointer<ByteVar>(), cchbufferlength, lpcchreturnlength.toCPointer<ByteVar>())

public actual fun GetVolumePathNamesForVolumeNameW(lpszvolumename: PCWSTR, lpszvolumepathnames: PWSTR, cchbufferlength: UInt, lpcchreturnlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_GetVolumePathNamesForVolumeNameW(lpszvolumename.toCPointer<ByteVar>(), lpszvolumepathnames.toCPointer<ByteVar>(), cchbufferlength, lpcchreturnlength.toCPointer<ByteVar>())

public actual fun HandleLogFull(hlog: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_HandleLogFull(hlog.toCPointer<ByteVar>())

public actual fun InstallLogPolicy(hlog: HANDLE, ppolicy: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_InstallLogPolicy(hlog.toCPointer<ByteVar>(), ppolicy.toCPointer<ByteVar>())

public actual fun IsIoRingOpSupported(ioring: HIORING, op: IORING_OP_CODE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_IsIoRingOpSupported(ioring.toCPointer<ByteVar>(), op)

public actual fun LZClose(hfile: Int) {
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LZClose(hfile)
}

public actual fun LZCopy(hfsource: Int, hfdest: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LZCopy(hfsource, hfdest)

public actual fun LZDone() {
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LZDone()
}

public actual fun LZInit(hfsource: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LZInit(hfsource)

public actual fun LZOpenFileA(lpfilename: PCSTR, lpreopenbuf: Long, wstyle: LZOPENFILE_STYLE): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LZOpenFileA(lpfilename.toCPointer<ByteVar>(), lpreopenbuf.toCPointer<ByteVar>(), wstyle)

public actual fun LZOpenFileW(lpfilename: PCWSTR, lpreopenbuf: Long, wstyle: LZOPENFILE_STYLE): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LZOpenFileW(lpfilename.toCPointer<ByteVar>(), lpreopenbuf.toCPointer<ByteVar>(), wstyle)

public actual fun LZRead(hfile: Int, lpbuffer: PSTR, cbread: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LZRead(hfile, lpbuffer.toCPointer<ByteVar>(), cbread)

public actual fun LZSeek(hfile: Int, loffset: Int, iorigin: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LZSeek(hfile, loffset, iorigin)

public actual fun LZStart(): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LZStart()

public actual fun LocalFileTimeToFileTime(lplocalfiletime: Long, lpfiletime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LocalFileTimeToFileTime(lplocalfiletime.toCPointer<ByteVar>(), lpfiletime.toCPointer<ByteVar>())

public actual fun LockFile(hfile: HANDLE, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LockFile(hfile.toCPointer<ByteVar>(), dwfileoffsetlow, dwfileoffsethigh, nnumberofbytestolocklow, nnumberofbytestolockhigh)

public actual fun LockFileEx(hfile: HANDLE, dwflags: LOCK_FILE_FLAGS, dwreserved: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt, lpoverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LockFileEx(hfile.toCPointer<ByteVar>(), dwflags, dwreserved, nnumberofbytestolocklow, nnumberofbytestolockhigh, lpoverlapped.toCPointer<ByteVar>())

public actual fun LogTailAdvanceFailure(hlog: HANDLE, dwreason: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LogTailAdvanceFailure(hlog.toCPointer<ByteVar>(), dwreason)

public actual fun LsnBlockOffset(plsn: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LsnBlockOffset(plsn.toCPointer<ByteVar>())

public actual fun LsnContainer(plsn: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LsnContainer(plsn.toCPointer<ByteVar>())

public actual fun LsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): CLS_LSN =
    CLS_LSN()

public actual fun LsnEqual(plsn1: Long, plsn2: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LsnEqual(plsn1.toCPointer<ByteVar>(), plsn2.toCPointer<ByteVar>())

public actual fun LsnGreater(plsn1: Long, plsn2: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LsnGreater(plsn1.toCPointer<ByteVar>(), plsn2.toCPointer<ByteVar>())

public actual fun LsnIncrement(plsn: Long): CLS_LSN =
    CLS_LSN()

public actual fun LsnInvalid(plsn: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LsnInvalid(plsn.toCPointer<ByteVar>())

public actual fun LsnLess(plsn1: Long, plsn2: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LsnLess(plsn1.toCPointer<ByteVar>(), plsn2.toCPointer<ByteVar>())

public actual fun LsnNull(plsn: Long): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LsnNull(plsn.toCPointer<ByteVar>())

public actual fun LsnRecordSequence(plsn: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_LsnRecordSequence(plsn.toCPointer<ByteVar>())

public actual fun MoveFileA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_MoveFileA(lpexistingfilename.toCPointer<ByteVar>(), lpnewfilename.toCPointer<ByteVar>())

public actual fun MoveFileExA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, dwflags: MOVE_FILE_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_MoveFileExA(lpexistingfilename.toCPointer<ByteVar>(), lpnewfilename.toCPointer<ByteVar>(), dwflags)

public actual fun MoveFileExW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, dwflags: MOVE_FILE_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_MoveFileExW(lpexistingfilename.toCPointer<ByteVar>(), lpnewfilename.toCPointer<ByteVar>(), dwflags)

public actual fun MoveFileFromAppW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_MoveFileFromAppW(lpexistingfilename.toCPointer<ByteVar>(), lpnewfilename.toCPointer<ByteVar>())

public actual fun MoveFileTransactedA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS, htransaction: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_MoveFileTransactedA(lpexistingfilename.toCPointer<ByteVar>(), lpnewfilename.toCPointer<ByteVar>(), lpprogressroutine.toLong().toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), dwflags, htransaction.toCPointer<ByteVar>())

public actual fun MoveFileTransactedW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS, htransaction: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_MoveFileTransactedW(lpexistingfilename.toCPointer<ByteVar>(), lpnewfilename.toCPointer<ByteVar>(), lpprogressroutine.toLong().toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), dwflags, htransaction.toCPointer<ByteVar>())

public actual fun MoveFileW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_MoveFileW(lpexistingfilename.toCPointer<ByteVar>(), lpnewfilename.toCPointer<ByteVar>())

public actual fun MoveFileWithProgressA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_MoveFileWithProgressA(lpexistingfilename.toCPointer<ByteVar>(), lpnewfilename.toCPointer<ByteVar>(), lpprogressroutine.toLong().toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), dwflags)

public actual fun MoveFileWithProgressW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_MoveFileWithProgressW(lpexistingfilename.toCPointer<ByteVar>(), lpnewfilename.toCPointer<ByteVar>(), lpprogressroutine.toLong().toCPointer<ByteVar>(), lpdata.toCPointer<ByteVar>(), dwflags)

public actual fun NetConnectionEnum(servername: PCWSTR, qualifier: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_NetConnectionEnum(servername.toCPointer<ByteVar>(), qualifier.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resume_handle.toCPointer<ByteVar>())

public actual fun NetFileClose(servername: PCWSTR, fileid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_NetFileClose(servername.toCPointer<ByteVar>(), fileid)

public actual fun NetFileEnum(servername: PCWSTR, basepath: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_NetFileEnum(servername.toCPointer<ByteVar>(), basepath.toCPointer<ByteVar>(), username.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resume_handle.toCPointer<ByteVar>())

public actual fun NetFileGetInfo(servername: PCWSTR, fileid: UInt, level: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_NetFileGetInfo(servername.toCPointer<ByteVar>(), fileid, level, bufptr.toCPointer<ByteVar>())

public actual fun NetServerAliasAdd(servername: PCWSTR, level: UInt, buf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_NetServerAliasAdd(servername.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>())

public actual fun NetServerAliasDel(servername: PCWSTR, level: UInt, buf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_NetServerAliasDel(servername.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>())

public actual fun NetServerAliasEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_NetServerAliasEnum(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resumehandle.toCPointer<ByteVar>())

public actual fun NetSessionDel(servername: PCWSTR, uncclientname: PCWSTR, username: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_NetSessionDel(servername.toCPointer<ByteVar>(), uncclientname.toCPointer<ByteVar>(), username.toCPointer<ByteVar>())

public actual fun NetSessionEnum(servername: PCWSTR, uncclientname: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_NetSessionEnum(servername.toCPointer<ByteVar>(), uncclientname.toCPointer<ByteVar>(), username.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resume_handle.toCPointer<ByteVar>())

public actual fun NetSessionGetInfo(servername: PCWSTR, uncclientname: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_NetSessionGetInfo(servername.toCPointer<ByteVar>(), uncclientname.toCPointer<ByteVar>(), username.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>())

public actual fun NetShareAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_NetShareAdd(servername.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), parm_err.toCPointer<ByteVar>())

public actual fun NetShareCheck(servername: PCWSTR, device: PCWSTR, type: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_NetShareCheck(servername.toCPointer<ByteVar>(), device.toCPointer<ByteVar>(), type.toCPointer<ByteVar>())

public actual fun NetShareDel(servername: PCWSTR, netname: PCWSTR, reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_NetShareDel(servername.toCPointer<ByteVar>(), netname.toCPointer<ByteVar>(), reserved)

public actual fun NetShareDelEx(servername: PCWSTR, level: UInt, buf: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_NetShareDelEx(servername.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>())

public actual fun NetShareDelSticky(servername: PCWSTR, netname: PCWSTR, reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_NetShareDelSticky(servername.toCPointer<ByteVar>(), netname.toCPointer<ByteVar>(), reserved)

public actual fun NetShareEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_NetShareEnum(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resume_handle.toCPointer<ByteVar>())

public actual fun NetShareEnumSticky(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_NetShareEnumSticky(servername.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>(), prefmaxlen, entriesread.toCPointer<ByteVar>(), totalentries.toCPointer<ByteVar>(), resume_handle.toCPointer<ByteVar>())

public actual fun NetShareGetInfo(servername: PCWSTR, netname: PCWSTR, level: UInt, bufptr: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_NetShareGetInfo(servername.toCPointer<ByteVar>(), netname.toCPointer<ByteVar>(), level, bufptr.toCPointer<ByteVar>())

public actual fun NetShareSetInfo(servername: PCWSTR, netname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_NetShareSetInfo(servername.toCPointer<ByteVar>(), netname.toCPointer<ByteVar>(), level, buf.toCPointer<ByteVar>(), parm_err.toCPointer<ByteVar>())

public actual fun NetStatisticsGet(servername: Long, service: Long, level: UInt, options: UInt, buffer: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_NetStatisticsGet(servername.toCPointer<ByteVar>(), service.toCPointer<ByteVar>(), level, options, buffer.toCPointer<ByteVar>())

public actual fun OpenEncryptedFileRawA(lpfilename: PCSTR, ulflags: UInt, pvcontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_OpenEncryptedFileRawA(lpfilename.toCPointer<ByteVar>(), ulflags, pvcontext.toCPointer<ByteVar>())

public actual fun OpenEncryptedFileRawW(lpfilename: PCWSTR, ulflags: UInt, pvcontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_OpenEncryptedFileRawW(lpfilename.toCPointer<ByteVar>(), ulflags, pvcontext.toCPointer<ByteVar>())

public actual fun OpenEnlistment(dwdesiredaccess: UInt, resourcemanagerhandle: HANDLE, enlistmentid: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_OpenEnlistment(dwdesiredaccess, resourcemanagerhandle.toCPointer<ByteVar>(), enlistmentid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun OpenFile(lpfilename: PCSTR, lpreopenbuff: Long, ustyle: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_OpenFile(lpfilename.toCPointer<ByteVar>(), lpreopenbuff.toCPointer<ByteVar>(), ustyle)

public actual fun OpenFileById(hvolumehint: HANDLE, lpfileid: Long, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_OpenFileById(hvolumehint.toCPointer<ByteVar>(), lpfileid.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, lpsecurityattributes.toCPointer<ByteVar>(), dwflagsandattributes)?.toLong() ?: 0L

public actual fun OpenResourceManager(dwdesiredaccess: UInt, tmhandle: HANDLE, resourcemanagerid: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_OpenResourceManager(dwdesiredaccess, tmhandle.toCPointer<ByteVar>(), resourcemanagerid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun OpenTransaction(dwdesiredaccess: UInt, transactionid: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_OpenTransaction(dwdesiredaccess, transactionid.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun OpenTransactionManager(logfilename: PCWSTR, desiredaccess: UInt, openoptions: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_OpenTransactionManager(logfilename.toCPointer<ByteVar>(), desiredaccess, openoptions)?.toLong() ?: 0L

public actual fun OpenTransactionManagerById(transactionmanagerid: Long, desiredaccess: UInt, openoptions: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_OpenTransactionManagerById(transactionmanagerid.toCPointer<ByteVar>(), desiredaccess, openoptions)?.toLong() ?: 0L

public actual fun PopIoRingCompletion(ioring: HIORING, cqe: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_PopIoRingCompletion(ioring.toCPointer<ByteVar>(), cqe.toCPointer<ByteVar>())

public actual fun PrePrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_PrePrepareComplete(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun PrePrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_PrePrepareEnlistment(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun PrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_PrepareComplete(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun PrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_PrepareEnlistment(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun PrepareLogArchive(hlog: HANDLE, pszbaselogfilename: PWSTR, clen: UInt, plsnlow: Long, plsnhigh: Long, pcactuallength: Long, poffbaselogfiledata: Long, pcbbaselogfilelength: Long, plsnbase: Long, plsnlast: Long, plsncurrentarchivetail: Long, ppvarchivecontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_PrepareLogArchive(hlog.toCPointer<ByteVar>(), pszbaselogfilename.toCPointer<ByteVar>(), clen, plsnlow.toCPointer<ByteVar>(), plsnhigh.toCPointer<ByteVar>(), pcactuallength.toCPointer<ByteVar>(), poffbaselogfiledata.toCPointer<ByteVar>(), pcbbaselogfilelength.toCPointer<ByteVar>(), plsnbase.toCPointer<ByteVar>(), plsnlast.toCPointer<ByteVar>(), plsncurrentarchivetail.toCPointer<ByteVar>(), ppvarchivecontext.toCPointer<ByteVar>())

public actual fun PrepareTape(hdevice: HANDLE, dwoperation: PREPARE_TAPE_OPERATION, bimmediate: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_PrepareTape(hdevice.toCPointer<ByteVar>(), dwoperation, bimmediate)

public actual fun QueryDosDeviceA(lpdevicename: PCSTR, lptargetpath: PSTR, ucchmax: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_QueryDosDeviceA(lpdevicename.toCPointer<ByteVar>(), lptargetpath.toCPointer<ByteVar>(), ucchmax)

public actual fun QueryDosDeviceW(lpdevicename: PCWSTR, lptargetpath: PWSTR, ucchmax: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_QueryDosDeviceW(lpdevicename.toCPointer<ByteVar>(), lptargetpath.toCPointer<ByteVar>(), ucchmax)

public actual fun QueryIoRingCapabilities(capabilities: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_QueryIoRingCapabilities(capabilities.toCPointer<ByteVar>())

public actual fun QueryLogPolicy(hlog: HANDLE, epolicytype: CLFS_MGMT_POLICY_TYPE, ppolicybuffer: Long, pcbpolicybuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_QueryLogPolicy(hlog.toCPointer<ByteVar>(), epolicytype, ppolicybuffer.toCPointer<ByteVar>(), pcbpolicybuffer.toCPointer<ByteVar>())

public actual fun QueryRecoveryAgentsOnEncryptedFile(lpfilename: PCWSTR, precoveryagents: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_QueryRecoveryAgentsOnEncryptedFile(lpfilename.toCPointer<ByteVar>(), precoveryagents.toCPointer<ByteVar>())

public actual fun QueryUsersOnEncryptedFile(lpfilename: PCWSTR, pusers: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_QueryUsersOnEncryptedFile(lpfilename.toCPointer<ByteVar>(), pusers.toCPointer<ByteVar>())

public actual fun ReOpenFile(horiginalfile: HANDLE, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_ReOpenFile(horiginalfile.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, dwflagsandattributes)?.toLong() ?: 0L

public actual fun ReadDirectoryChangesExW(hdirectory: HANDLE, lpbuffer: Long, nbufferlength: UInt, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE, lpbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE, readdirectorynotifyinformationclass: READ_DIRECTORY_NOTIFY_INFORMATION_CLASS): BOOL =
    0

public actual fun ReadDirectoryChangesW(hdirectory: HANDLE, lpbuffer: Long, nbufferlength: UInt, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE, lpbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE): BOOL =
    0

public actual fun ReadEncryptedFileRaw(pfexportcallback: PFE_EXPORT_FUNC, pvcallbackcontext: Long, pvcontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_ReadEncryptedFileRaw(pfexportcallback.toLong().toCPointer<ByteVar>(), pvcallbackcontext.toCPointer<ByteVar>(), pvcontext.toCPointer<ByteVar>())

public actual fun ReadFile(hfile: HANDLE, lpbuffer: Long, nnumberofbytestoread: UInt, lpnumberofbytesread: Long, lpoverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_ReadFile(hfile.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nnumberofbytestoread, lpnumberofbytesread.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>())

public actual fun ReadFileEx(hfile: HANDLE, lpbuffer: Long, nnumberofbytestoread: UInt, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE): BOOL =
    0

public actual fun ReadFileScatter(hfile: HANDLE, asegmentarray: Long, nnumberofbytestoread: UInt, lpreserved: Long, lpoverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_ReadFileScatter(hfile.toCPointer<ByteVar>(), asegmentarray.toCPointer<ByteVar>(), nnumberofbytestoread, lpreserved.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>())

public actual fun ReadLogArchiveMetadata(pvarchivecontext: Long, cboffset: UInt, cbbytestoread: UInt, pbreadbuffer: Long, pcbbytesread: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_ReadLogArchiveMetadata(pvarchivecontext.toCPointer<ByteVar>(), cboffset, cbbytestoread, pbreadbuffer.toCPointer<ByteVar>(), pcbbytesread.toCPointer<ByteVar>())

public actual fun ReadLogNotification(hlog: HANDLE, pnotification: Long, lpoverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_ReadLogNotification(hlog.toCPointer<ByteVar>(), pnotification.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>())

public actual fun ReadLogRecord(pvmarshal: Long, plsnfirst: Long, econtextmode: CLFS_CONTEXT_MODE, ppvreadbuffer: Long, pcbreadbuffer: Long, perecordtype: Long, plsnundonext: Long, plsnprevious: Long, ppvreadcontext: Long, poverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_ReadLogRecord(pvmarshal.toCPointer<ByteVar>(), plsnfirst.toCPointer<ByteVar>(), econtextmode, ppvreadbuffer.toCPointer<ByteVar>(), pcbreadbuffer.toCPointer<ByteVar>(), perecordtype.toCPointer<ByteVar>(), plsnundonext.toCPointer<ByteVar>(), plsnprevious.toCPointer<ByteVar>(), ppvreadcontext.toCPointer<ByteVar>(), poverlapped.toCPointer<ByteVar>())

public actual fun ReadLogRestartArea(pvmarshal: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsn: Long, ppvcontext: Long, poverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_ReadLogRestartArea(pvmarshal.toCPointer<ByteVar>(), ppvrestartbuffer.toCPointer<ByteVar>(), pcbrestartbuffer.toCPointer<ByteVar>(), plsn.toCPointer<ByteVar>(), ppvcontext.toCPointer<ByteVar>(), poverlapped.toCPointer<ByteVar>())

public actual fun ReadNextLogRecord(pvreadcontext: Long, ppvbuffer: Long, pcbbuffer: Long, perecordtype: Long, plsnuser: Long, plsnundonext: Long, plsnprevious: Long, plsnrecord: Long, poverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_ReadNextLogRecord(pvreadcontext.toCPointer<ByteVar>(), ppvbuffer.toCPointer<ByteVar>(), pcbbuffer.toCPointer<ByteVar>(), perecordtype.toCPointer<ByteVar>(), plsnuser.toCPointer<ByteVar>(), plsnundonext.toCPointer<ByteVar>(), plsnprevious.toCPointer<ByteVar>(), plsnrecord.toCPointer<ByteVar>(), poverlapped.toCPointer<ByteVar>())

public actual fun ReadOnlyEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_ReadOnlyEnlistment(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun ReadPreviousLogRestartArea(pvreadcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsnrestart: Long, poverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_ReadPreviousLogRestartArea(pvreadcontext.toCPointer<ByteVar>(), ppvrestartbuffer.toCPointer<ByteVar>(), pcbrestartbuffer.toCPointer<ByteVar>(), plsnrestart.toCPointer<ByteVar>(), poverlapped.toCPointer<ByteVar>())

public actual fun RecoverEnlistment(enlistmenthandle: HANDLE, enlistmentkey: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_RecoverEnlistment(enlistmenthandle.toCPointer<ByteVar>(), enlistmentkey.toCPointer<ByteVar>())

public actual fun RecoverResourceManager(resourcemanagerhandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_RecoverResourceManager(resourcemanagerhandle.toCPointer<ByteVar>())

public actual fun RecoverTransactionManager(transactionmanagerhandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_RecoverTransactionManager(transactionmanagerhandle.toCPointer<ByteVar>())

public actual fun RegisterForLogWriteNotification(hlog: HANDLE, cbthreshold: UInt, fenable: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_RegisterForLogWriteNotification(hlog.toCPointer<ByteVar>(), cbthreshold, fenable)

public actual fun RegisterManageableLogClient(hlog: HANDLE, pcallbacks: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_RegisterManageableLogClient(hlog.toCPointer<ByteVar>(), pcallbacks.toCPointer<ByteVar>())

public actual fun RemoveDirectoryA(lppathname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_RemoveDirectoryA(lppathname.toCPointer<ByteVar>())

public actual fun RemoveDirectoryFromAppW(lppathname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_RemoveDirectoryFromAppW(lppathname.toCPointer<ByteVar>())

public actual fun RemoveDirectoryTransactedA(lppathname: PCSTR, htransaction: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_RemoveDirectoryTransactedA(lppathname.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>())

public actual fun RemoveDirectoryTransactedW(lppathname: PCWSTR, htransaction: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_RemoveDirectoryTransactedW(lppathname.toCPointer<ByteVar>(), htransaction.toCPointer<ByteVar>())

public actual fun RemoveDirectoryW(lppathname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_RemoveDirectoryW(lppathname.toCPointer<ByteVar>())

public actual fun RemoveLogContainer(hlog: HANDLE, pwszcontainerpath: PCWSTR, fforce: BOOL, preserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_RemoveLogContainer(hlog.toCPointer<ByteVar>(), pwszcontainerpath.toCPointer<ByteVar>(), fforce, preserved.toCPointer<ByteVar>())

public actual fun RemoveLogContainerSet(hlog: HANDLE, ccontainer: UShort, rgwszcontainerpath: Long, fforce: BOOL, preserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_RemoveLogContainerSet(hlog.toCPointer<ByteVar>(), ccontainer, rgwszcontainerpath.toCPointer<ByteVar>(), fforce, preserved.toCPointer<ByteVar>())

public actual fun RemoveLogPolicy(hlog: HANDLE, epolicytype: CLFS_MGMT_POLICY_TYPE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_RemoveLogPolicy(hlog.toCPointer<ByteVar>(), epolicytype)

public actual fun RemoveUsersFromEncryptedFile(lpfilename: PCWSTR, phashes: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_RemoveUsersFromEncryptedFile(lpfilename.toCPointer<ByteVar>(), phashes.toCPointer<ByteVar>())

public actual fun RenameTransactionManager(logfilename: PCWSTR, existingtransactionmanagerguid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_RenameTransactionManager(logfilename.toCPointer<ByteVar>(), existingtransactionmanagerguid.toCPointer<ByteVar>())

public actual fun ReplaceFileA(lpreplacedfilename: PCSTR, lpreplacementfilename: PCSTR, lpbackupfilename: PCSTR, dwreplaceflags: REPLACE_FILE_FLAGS, lpexclude: Long, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_ReplaceFileA(lpreplacedfilename.toCPointer<ByteVar>(), lpreplacementfilename.toCPointer<ByteVar>(), lpbackupfilename.toCPointer<ByteVar>(), dwreplaceflags, lpexclude.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())

public actual fun ReplaceFileFromAppW(lpreplacedfilename: PCWSTR, lpreplacementfilename: PCWSTR, lpbackupfilename: PCWSTR, dwreplaceflags: UInt, lpexclude: Long, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_ReplaceFileFromAppW(lpreplacedfilename.toCPointer<ByteVar>(), lpreplacementfilename.toCPointer<ByteVar>(), lpbackupfilename.toCPointer<ByteVar>(), dwreplaceflags, lpexclude.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())

public actual fun ReplaceFileW(lpreplacedfilename: PCWSTR, lpreplacementfilename: PCWSTR, lpbackupfilename: PCWSTR, dwreplaceflags: REPLACE_FILE_FLAGS, lpexclude: Long, lpreserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_ReplaceFileW(lpreplacedfilename.toCPointer<ByteVar>(), lpreplacementfilename.toCPointer<ByteVar>(), lpbackupfilename.toCPointer<ByteVar>(), dwreplaceflags, lpexclude.toCPointer<ByteVar>(), lpreserved.toCPointer<ByteVar>())

public actual fun ReserveAndAppendLog(pvmarshal: Long, rgwriteentries: Long, cwriteentries: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: CLFS_FLAG, plsn: Long, poverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_ReserveAndAppendLog(pvmarshal.toCPointer<ByteVar>(), rgwriteentries.toCPointer<ByteVar>(), cwriteentries, plsnundonext.toCPointer<ByteVar>(), plsnprevious.toCPointer<ByteVar>(), creserverecords, rgcbreservation.toCPointer<ByteVar>(), fflags, plsn.toCPointer<ByteVar>(), poverlapped.toCPointer<ByteVar>())

public actual fun ReserveAndAppendLogAligned(pvmarshal: Long, rgwriteentries: Long, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: CLFS_FLAG, plsn: Long, poverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_ReserveAndAppendLogAligned(pvmarshal.toCPointer<ByteVar>(), rgwriteentries.toCPointer<ByteVar>(), cwriteentries, cbentryalignment, plsnundonext.toCPointer<ByteVar>(), plsnprevious.toCPointer<ByteVar>(), creserverecords, rgcbreservation.toCPointer<ByteVar>(), fflags, plsn.toCPointer<ByteVar>(), poverlapped.toCPointer<ByteVar>())

public actual fun RollbackComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_RollbackComplete(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun RollbackEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_RollbackEnlistment(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun RollbackTransaction(transactionhandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_RollbackTransaction(transactionhandle.toCPointer<ByteVar>())

public actual fun RollbackTransactionAsync(transactionhandle: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_RollbackTransactionAsync(transactionhandle.toCPointer<ByteVar>())

public actual fun RollforwardTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_RollforwardTransactionManager(transactionmanagerhandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun ScanLogContainers(pcxscan: Long, escanmode: UByte, preserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_ScanLogContainers(pcxscan.toCPointer<ByteVar>(), escanmode, preserved.toCPointer<ByteVar>())

public actual fun SearchPathA(lppath: PCSTR, lpfilename: PCSTR, lpextension: PCSTR, nbufferlength: UInt, lpbuffer: PSTR, lpfilepart: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SearchPathA(lppath.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>(), lpextension.toCPointer<ByteVar>(), nbufferlength, lpbuffer.toCPointer<ByteVar>(), lpfilepart.toCPointer<ByteVar>())

public actual fun SearchPathW(lppath: PCWSTR, lpfilename: PCWSTR, lpextension: PCWSTR, nbufferlength: UInt, lpbuffer: PWSTR, lpfilepart: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SearchPathW(lppath.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>(), lpextension.toCPointer<ByteVar>(), nbufferlength, lpbuffer.toCPointer<ByteVar>(), lpfilepart.toCPointer<ByteVar>())

public actual fun SetEncryptedFileMetadata(lpfilename: PCWSTR, pboldmetadata: Long, pbnewmetadata: Long, pownerhash: Long, dwoperation: UInt, pcertificatesadded: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetEncryptedFileMetadata(lpfilename.toCPointer<ByteVar>(), pboldmetadata.toCPointer<ByteVar>(), pbnewmetadata.toCPointer<ByteVar>(), pownerhash.toCPointer<ByteVar>(), dwoperation, pcertificatesadded.toCPointer<ByteVar>())

public actual fun SetEndOfFile(hfile: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetEndOfFile(hfile.toCPointer<ByteVar>())

public actual fun SetEndOfLog(hlog: HANDLE, plsnend: Long, lpoverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetEndOfLog(hlog.toCPointer<ByteVar>(), plsnend.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>())

public actual fun SetEnlistmentRecoveryInformation(enlistmenthandle: HANDLE, buffersize: UInt, buffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetEnlistmentRecoveryInformation(enlistmenthandle.toCPointer<ByteVar>(), buffersize, buffer.toCPointer<ByteVar>())

public actual fun SetFileApisToANSI() {
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetFileApisToANSI()
}

public actual fun SetFileApisToOEM() {
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetFileApisToOEM()
}

public actual fun SetFileAttributesA(lpfilename: PCSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetFileAttributesA(lpfilename.toCPointer<ByteVar>(), dwfileattributes)

public actual fun SetFileAttributesFromAppW(lpfilename: PCWSTR, dwfileattributes: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetFileAttributesFromAppW(lpfilename.toCPointer<ByteVar>(), dwfileattributes)

public actual fun SetFileAttributesTransactedA(lpfilename: PCSTR, dwfileattributes: UInt, htransaction: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetFileAttributesTransactedA(lpfilename.toCPointer<ByteVar>(), dwfileattributes, htransaction.toCPointer<ByteVar>())

public actual fun SetFileAttributesTransactedW(lpfilename: PCWSTR, dwfileattributes: UInt, htransaction: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetFileAttributesTransactedW(lpfilename.toCPointer<ByteVar>(), dwfileattributes, htransaction.toCPointer<ByteVar>())

public actual fun SetFileAttributesW(lpfilename: PCWSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetFileAttributesW(lpfilename.toCPointer<ByteVar>(), dwfileattributes)

public actual fun SetFileBandwidthReservation(hfile: HANDLE, nperiodmilliseconds: UInt, nbytesperperiod: UInt, bdiscardable: BOOL, lptransfersize: Long, lpnumoutstandingrequests: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetFileBandwidthReservation(hfile.toCPointer<ByteVar>(), nperiodmilliseconds, nbytesperperiod, bdiscardable, lptransfersize.toCPointer<ByteVar>(), lpnumoutstandingrequests.toCPointer<ByteVar>())

public actual fun SetFileCompletionNotificationModes(filehandle: HANDLE, flags: UByte): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetFileCompletionNotificationModes(filehandle.toCPointer<ByteVar>(), flags)

public actual fun SetFileInformationByHandle(hfile: HANDLE, fileinformationclass: FILE_INFO_BY_HANDLE_CLASS, lpfileinformation: Long, dwbuffersize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetFileInformationByHandle(hfile.toCPointer<ByteVar>(), fileinformationclass, lpfileinformation.toCPointer<ByteVar>(), dwbuffersize)

public actual fun SetFileIoOverlappedRange(filehandle: HANDLE, overlappedrangestart: Long, length: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetFileIoOverlappedRange(filehandle.toCPointer<ByteVar>(), overlappedrangestart.toCPointer<ByteVar>(), length)

public actual fun SetFilePointer(hfile: HANDLE, ldistancetomove: Int, lpdistancetomovehigh: Long, dwmovemethod: SET_FILE_POINTER_MOVE_METHOD): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetFilePointer(hfile.toCPointer<ByteVar>(), ldistancetomove, lpdistancetomovehigh.toCPointer<ByteVar>(), dwmovemethod)

public actual fun SetFilePointerEx(hfile: HANDLE, lidistancetomove: Long, lpnewfilepointer: Long, dwmovemethod: SET_FILE_POINTER_MOVE_METHOD): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetFilePointerEx(hfile.toCPointer<ByteVar>(), lidistancetomove, lpnewfilepointer.toCPointer<ByteVar>(), dwmovemethod)

public actual fun SetFileShortNameA(hfile: HANDLE, lpshortname: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetFileShortNameA(hfile.toCPointer<ByteVar>(), lpshortname.toCPointer<ByteVar>())

public actual fun SetFileShortNameW(hfile: HANDLE, lpshortname: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetFileShortNameW(hfile.toCPointer<ByteVar>(), lpshortname.toCPointer<ByteVar>())

public actual fun SetFileTime(hfile: HANDLE, lpcreationtime: Long, lplastaccesstime: Long, lplastwritetime: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetFileTime(hfile.toCPointer<ByteVar>(), lpcreationtime.toCPointer<ByteVar>(), lplastaccesstime.toCPointer<ByteVar>(), lplastwritetime.toCPointer<ByteVar>())

public actual fun SetFileValidData(hfile: HANDLE, validdatalength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetFileValidData(hfile.toCPointer<ByteVar>(), validdatalength)

public actual fun SetIoRingCompletionEvent(ioring: HIORING, hevent: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetIoRingCompletionEvent(ioring.toCPointer<ByteVar>(), hevent.toCPointer<ByteVar>())

public actual fun SetLogArchiveMode(hlog: HANDLE, emode: CLFS_LOG_ARCHIVE_MODE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetLogArchiveMode(hlog.toCPointer<ByteVar>(), emode)

public actual fun SetLogArchiveTail(hlog: HANDLE, plsnarchivetail: Long, preserved: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetLogArchiveTail(hlog.toCPointer<ByteVar>(), plsnarchivetail.toCPointer<ByteVar>(), preserved.toCPointer<ByteVar>())

public actual fun SetLogFileSizeWithPolicy(hlog: HANDLE, pdesiredsize: Long, presultingsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetLogFileSizeWithPolicy(hlog.toCPointer<ByteVar>(), pdesiredsize.toCPointer<ByteVar>(), presultingsize.toCPointer<ByteVar>())

public actual fun SetResourceManagerCompletionPort(resourcemanagerhandle: HANDLE, iocompletionporthandle: HANDLE, completionkey: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetResourceManagerCompletionPort(resourcemanagerhandle.toCPointer<ByteVar>(), iocompletionporthandle.toCPointer<ByteVar>(), completionkey)

public actual fun SetSearchPathMode(flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetSearchPathMode(flags)

public actual fun SetTapeParameters(hdevice: HANDLE, dwoperation: TAPE_INFORMATION_TYPE, lptapeinformation: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetTapeParameters(hdevice.toCPointer<ByteVar>(), dwoperation, lptapeinformation.toCPointer<ByteVar>())

public actual fun SetTapePosition(hdevice: HANDLE, dwpositionmethod: TAPE_POSITION_METHOD, dwpartition: UInt, dwoffsetlow: UInt, dwoffsethigh: UInt, bimmediate: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetTapePosition(hdevice.toCPointer<ByteVar>(), dwpositionmethod, dwpartition, dwoffsetlow, dwoffsethigh, bimmediate)

public actual fun SetTransactionInformation(transactionhandle: HANDLE, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetTransactionInformation(transactionhandle.toCPointer<ByteVar>(), isolationlevel, isolationflags, timeout, description.toCPointer<ByteVar>())

public actual fun SetUserFileEncryptionKey(pencryptioncertificate: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetUserFileEncryptionKey(pencryptioncertificate.toCPointer<ByteVar>())

public actual fun SetUserFileEncryptionKeyEx(pencryptioncertificate: Long, dwcapabilities: UInt, dwflags: UInt, pvreserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetUserFileEncryptionKeyEx(pencryptioncertificate.toCPointer<ByteVar>(), dwcapabilities, dwflags, pvreserved.toCPointer<ByteVar>())

public actual fun SetVolumeLabelA(lprootpathname: PCSTR, lpvolumename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetVolumeLabelA(lprootpathname.toCPointer<ByteVar>(), lpvolumename.toCPointer<ByteVar>())

public actual fun SetVolumeLabelW(lprootpathname: PCWSTR, lpvolumename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetVolumeLabelW(lprootpathname.toCPointer<ByteVar>(), lpvolumename.toCPointer<ByteVar>())

public actual fun SetVolumeMountPointA(lpszvolumemountpoint: PCSTR, lpszvolumename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetVolumeMountPointA(lpszvolumemountpoint.toCPointer<ByteVar>(), lpszvolumename.toCPointer<ByteVar>())

public actual fun SetVolumeMountPointW(lpszvolumemountpoint: PCWSTR, lpszvolumename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SetVolumeMountPointW(lpszvolumemountpoint.toCPointer<ByteVar>(), lpszvolumename.toCPointer<ByteVar>())

public actual fun SinglePhaseReject(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SinglePhaseReject(enlistmenthandle.toCPointer<ByteVar>(), tmvirtualclock.toCPointer<ByteVar>())

public actual fun SubmitIoRing(ioring: HIORING, waitoperations: UInt, milliseconds: UInt, submittedentries: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_SubmitIoRing(ioring.toCPointer<ByteVar>(), waitoperations, milliseconds, submittedentries.toCPointer<ByteVar>())

public actual fun TerminateLogArchive(pvarchivecontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_TerminateLogArchive(pvarchivecontext.toCPointer<ByteVar>())

public actual fun TerminateReadLog(pvcursorcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_TerminateReadLog(pvcursorcontext.toCPointer<ByteVar>())

public actual fun TruncateLog(pvmarshal: Long, plsnend: Long, lpoverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_TruncateLog(pvmarshal.toCPointer<ByteVar>(), plsnend.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>())

public actual fun TxfGetThreadMiniVersionForCreate(miniversion: Long) {
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_TxfGetThreadMiniVersionForCreate(miniversion.toCPointer<ByteVar>())
}

public actual fun TxfLogCreateFileReadContext(logpath: PCWSTR, beginninglsn: CLS_LSN, endinglsn: CLS_LSN, txffileid: Long, txflogcontext: Long): BOOL =
    0

public actual fun TxfLogCreateRangeReadContext(logpath: PCWSTR, beginninglsn: CLS_LSN, endinglsn: CLS_LSN, beginningvirtualclock: Long, endingvirtualclock: Long, recordtypemask: UInt, txflogcontext: Long): BOOL =
    0

public actual fun TxfLogDestroyReadContext(txflogcontext: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_TxfLogDestroyReadContext(txflogcontext.toCPointer<ByteVar>())

public actual fun TxfLogReadRecords(txflogcontext: Long, bufferlength: UInt, buffer: Long, bytesused: Long, recordcount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_TxfLogReadRecords(txflogcontext.toCPointer<ByteVar>(), bufferlength, buffer.toCPointer<ByteVar>(), bytesused.toCPointer<ByteVar>(), recordcount.toCPointer<ByteVar>())

public actual fun TxfLogRecordGetFileName(recordbuffer: Long, recordbufferlengthinbytes: UInt, namebuffer: PWSTR, namebufferlengthinbytes: Long, txfid: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_TxfLogRecordGetFileName(recordbuffer.toCPointer<ByteVar>(), recordbufferlengthinbytes, namebuffer.toCPointer<ByteVar>(), namebufferlengthinbytes.toCPointer<ByteVar>(), txfid.toCPointer<ByteVar>())

public actual fun TxfLogRecordGetGenericType(recordbuffer: Long, recordbufferlengthinbytes: UInt, generictype: Long, virtualclock: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_TxfLogRecordGetGenericType(recordbuffer.toCPointer<ByteVar>(), recordbufferlengthinbytes, generictype.toCPointer<ByteVar>(), virtualclock.toCPointer<ByteVar>())

public actual fun TxfReadMetadataInfo(filehandle: HANDLE, txffileid: Long, lastlsn: Long, transactionstate: Long, lockingtransaction: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_TxfReadMetadataInfo(filehandle.toCPointer<ByteVar>(), txffileid.toCPointer<ByteVar>(), lastlsn.toCPointer<ByteVar>(), transactionstate.toCPointer<ByteVar>(), lockingtransaction.toCPointer<ByteVar>())

public actual fun TxfSetThreadMiniVersionForCreate(miniversion: UShort) {
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_TxfSetThreadMiniVersionForCreate(miniversion)
}

public actual fun UnlockFile(hfile: HANDLE, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_UnlockFile(hfile.toCPointer<ByteVar>(), dwfileoffsetlow, dwfileoffsethigh, nnumberofbytestounlocklow, nnumberofbytestounlockhigh)

public actual fun UnlockFileEx(hfile: HANDLE, dwreserved: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt, lpoverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_UnlockFileEx(hfile.toCPointer<ByteVar>(), dwreserved, nnumberofbytestounlocklow, nnumberofbytestounlockhigh, lpoverlapped.toCPointer<ByteVar>())

public actual fun ValidateLog(pszlogfilename: PCWSTR, psalogfile: Long, pinfobuffer: Long, pcbbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_ValidateLog(pszlogfilename.toCPointer<ByteVar>(), psalogfile.toCPointer<ByteVar>(), pinfobuffer.toCPointer<ByteVar>(), pcbbuffer.toCPointer<ByteVar>())

public actual fun VerFindFileA(uflags: VER_FIND_FILE_FLAGS, szfilename: PCSTR, szwindir: PCSTR, szappdir: PCSTR, szcurdir: PSTR, pucurdirlen: Long, szdestdir: PSTR, pudestdirlen: Long): VER_FIND_FILE_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_VerFindFileA(uflags, szfilename.toCPointer<ByteVar>(), szwindir.toCPointer<ByteVar>(), szappdir.toCPointer<ByteVar>(), szcurdir.toCPointer<ByteVar>(), pucurdirlen.toCPointer<ByteVar>(), szdestdir.toCPointer<ByteVar>(), pudestdirlen.toCPointer<ByteVar>())

public actual fun VerFindFileW(uflags: VER_FIND_FILE_FLAGS, szfilename: PCWSTR, szwindir: PCWSTR, szappdir: PCWSTR, szcurdir: PWSTR, pucurdirlen: Long, szdestdir: PWSTR, pudestdirlen: Long): VER_FIND_FILE_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_VerFindFileW(uflags, szfilename.toCPointer<ByteVar>(), szwindir.toCPointer<ByteVar>(), szappdir.toCPointer<ByteVar>(), szcurdir.toCPointer<ByteVar>(), pucurdirlen.toCPointer<ByteVar>(), szdestdir.toCPointer<ByteVar>(), pudestdirlen.toCPointer<ByteVar>())

public actual fun VerInstallFileA(uflags: VER_INSTALL_FILE_FLAGS, szsrcfilename: PCSTR, szdestfilename: PCSTR, szsrcdir: PCSTR, szdestdir: PCSTR, szcurdir: PCSTR, sztmpfile: PSTR, putmpfilelen: Long): VER_INSTALL_FILE_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_VerInstallFileA(uflags, szsrcfilename.toCPointer<ByteVar>(), szdestfilename.toCPointer<ByteVar>(), szsrcdir.toCPointer<ByteVar>(), szdestdir.toCPointer<ByteVar>(), szcurdir.toCPointer<ByteVar>(), sztmpfile.toCPointer<ByteVar>(), putmpfilelen.toCPointer<ByteVar>())

public actual fun VerInstallFileW(uflags: VER_INSTALL_FILE_FLAGS, szsrcfilename: PCWSTR, szdestfilename: PCWSTR, szsrcdir: PCWSTR, szdestdir: PCWSTR, szcurdir: PCWSTR, sztmpfile: PWSTR, putmpfilelen: Long): VER_INSTALL_FILE_STATUS =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_VerInstallFileW(uflags, szsrcfilename.toCPointer<ByteVar>(), szdestfilename.toCPointer<ByteVar>(), szsrcdir.toCPointer<ByteVar>(), szdestdir.toCPointer<ByteVar>(), szcurdir.toCPointer<ByteVar>(), sztmpfile.toCPointer<ByteVar>(), putmpfilelen.toCPointer<ByteVar>())

public actual fun VerLanguageNameA(wlang: UInt, szlang: PSTR, cchlang: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_VerLanguageNameA(wlang, szlang.toCPointer<ByteVar>(), cchlang)

public actual fun VerLanguageNameW(wlang: UInt, szlang: PWSTR, cchlang: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_VerLanguageNameW(wlang, szlang.toCPointer<ByteVar>(), cchlang)

public actual fun VerQueryValueA(pblock: Long, lpsubblock: PCSTR, lplpbuffer: Long, pulen: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_VerQueryValueA(pblock.toCPointer<ByteVar>(), lpsubblock.toCPointer<ByteVar>(), lplpbuffer.toCPointer<ByteVar>(), pulen.toCPointer<ByteVar>())

public actual fun VerQueryValueW(pblock: Long, lpsubblock: PCWSTR, lplpbuffer: Long, pulen: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_VerQueryValueW(pblock.toCPointer<ByteVar>(), lpsubblock.toCPointer<ByteVar>(), lplpbuffer.toCPointer<ByteVar>(), pulen.toCPointer<ByteVar>())

public actual fun WofEnumEntries(volumename: PCWSTR, provider: UInt, enumproc: WofEnumEntryProc, userdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_WofEnumEntries(volumename.toCPointer<ByteVar>(), provider, enumproc.toLong().toCPointer<ByteVar>(), userdata.toCPointer<ByteVar>())

public actual fun WofFileEnumFiles(volumename: PCWSTR, algorithm: UInt, enumproc: WofEnumFilesProc, userdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_WofFileEnumFiles(volumename.toCPointer<ByteVar>(), algorithm, enumproc.toLong().toCPointer<ByteVar>(), userdata.toCPointer<ByteVar>())

public actual fun WofGetDriverVersion(fileorvolumehandle: HANDLE, provider: UInt, wofversion: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_WofGetDriverVersion(fileorvolumehandle.toCPointer<ByteVar>(), provider, wofversion.toCPointer<ByteVar>())

public actual fun WofIsExternalFile(filepath: PCWSTR, isexternalfile: Long, provider: Long, externalfileinfo: Long, bufferlength: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_WofIsExternalFile(filepath.toCPointer<ByteVar>(), isexternalfile.toCPointer<ByteVar>(), provider.toCPointer<ByteVar>(), externalfileinfo.toCPointer<ByteVar>(), bufferlength.toCPointer<ByteVar>())

public actual fun WofSetFileDataLocation(filehandle: HANDLE, provider: UInt, externalfileinfo: Long, length: UInt): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_WofSetFileDataLocation(filehandle.toCPointer<ByteVar>(), provider, externalfileinfo.toCPointer<ByteVar>(), length)

public actual fun WofShouldCompressBinaries(volume: PCWSTR, algorithm: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_WofShouldCompressBinaries(volume.toCPointer<ByteVar>(), algorithm.toCPointer<ByteVar>())

public actual fun WofWimAddEntry(volumename: PCWSTR, wimpath: PCWSTR, wimtype: UInt, wimindex: UInt, datasourceid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_WofWimAddEntry(volumename.toCPointer<ByteVar>(), wimpath.toCPointer<ByteVar>(), wimtype, wimindex, datasourceid.toCPointer<ByteVar>())

public actual fun WofWimEnumFiles(volumename: PCWSTR, datasourceid: Long, enumproc: WofEnumFilesProc, userdata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_WofWimEnumFiles(volumename.toCPointer<ByteVar>(), datasourceid, enumproc.toLong().toCPointer<ByteVar>(), userdata.toCPointer<ByteVar>())

public actual fun WofWimRemoveEntry(volumename: PCWSTR, datasourceid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_WofWimRemoveEntry(volumename.toCPointer<ByteVar>(), datasourceid)

public actual fun WofWimSuspendEntry(volumename: PCWSTR, datasourceid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_WofWimSuspendEntry(volumename.toCPointer<ByteVar>(), datasourceid)

public actual fun WofWimUpdateEntry(volumename: PCWSTR, datasourceid: Long, newwimpath: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_WofWimUpdateEntry(volumename.toCPointer<ByteVar>(), datasourceid, newwimpath.toCPointer<ByteVar>())

public actual fun Wow64DisableWow64FsRedirection(oldvalue: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_Wow64DisableWow64FsRedirection(oldvalue.toCPointer<ByteVar>())

public actual fun Wow64EnableWow64FsRedirection(wow64fsenableredirection: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_Wow64EnableWow64FsRedirection(wow64fsenableredirection)

public actual fun Wow64RevertWow64FsRedirection(olvalue: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_Wow64RevertWow64FsRedirection(olvalue.toCPointer<ByteVar>())

public actual fun WriteEncryptedFileRaw(pfimportcallback: PFE_IMPORT_FUNC, pvcallbackcontext: Long, pvcontext: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_WriteEncryptedFileRaw(pfimportcallback.toLong().toCPointer<ByteVar>(), pvcallbackcontext.toCPointer<ByteVar>(), pvcontext.toCPointer<ByteVar>())

public actual fun WriteFile(hfile: HANDLE, lpbuffer: Long, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: Long, lpoverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_WriteFile(hfile.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), nnumberofbytestowrite, lpnumberofbyteswritten.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>())

public actual fun WriteFileEx(hfile: HANDLE, lpbuffer: Long, nnumberofbytestowrite: UInt, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE): BOOL =
    0

public actual fun WriteFileGather(hfile: HANDLE, asegmentarray: Long, nnumberofbytestowrite: UInt, lpreserved: Long, lpoverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_WriteFileGather(hfile.toCPointer<ByteVar>(), asegmentarray.toCPointer<ByteVar>(), nnumberofbytestowrite, lpreserved.toCPointer<ByteVar>(), lpoverlapped.toCPointer<ByteVar>())

public actual fun WriteLogRestartArea(pvmarshal: Long, pvrestartbuffer: Long, cbrestartbuffer: UInt, plsnbase: Long, fflags: CLFS_FLAG, pcbwritten: Long, plsnnext: Long, poverlapped: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_WriteLogRestartArea(pvmarshal.toCPointer<ByteVar>(), pvrestartbuffer.toCPointer<ByteVar>(), cbrestartbuffer, plsnbase.toCPointer<ByteVar>(), fflags, pcbwritten.toCPointer<ByteVar>(), plsnnext.toCPointer<ByteVar>(), poverlapped.toCPointer<ByteVar>())

public actual fun WriteTapemark(hdevice: HANDLE, dwtapemarktype: TAPEMARK_TYPE, dwtapemarkcount: UInt, bimmediate: BOOL): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_WriteTapemark(hdevice.toCPointer<ByteVar>(), dwtapemarktype, dwtapemarkcount, bimmediate)
