@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.io.LpoverlappedCompletionRoutine
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun addLogContainer(hlog: Handle, pcbcontainer: COpaquePointer?, pwszcontainerpath: Pcwstr, preserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_addLogContainer(hlog?.value?.toCPointer<ByteVar>(), pcbcontainer?.value?.toCPointer<ByteVar>(), pwszcontainerpath?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun addLogContainerSet(hlog: Handle, ccontainer: UShort, pcbcontainer: COpaquePointer?, rgwszcontainerpath: COpaquePointer?, preserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_addLogContainerSet(hlog?.value?.toCPointer<ByteVar>(), ccontainer, pcbcontainer?.value?.toCPointer<ByteVar>(), rgwszcontainerpath?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun addUsersToEncryptedFile(lpfilename: Pcwstr, pencryptioncertificates: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_addUsersToEncryptedFile(lpfilename?.value?.toCPointer<ByteVar>(), pencryptioncertificates?.value?.toCPointer<ByteVar>())

public actual fun advanceLogBase(pvmarshal: COpaquePointer?, plsnbase: COpaquePointer?, fflags: UInt, poverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_advanceLogBase(pvmarshal?.value?.toCPointer<ByteVar>(), plsnbase?.value?.toCPointer<ByteVar>(), fflags, poverlapped?.value?.toCPointer<ByteVar>())

public actual fun alignReservedLog(pvmarshal: COpaquePointer?, creservedrecords: UInt, rgcbreservation: COpaquePointer?, pcbalignreservation: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_alignReservedLog(pvmarshal?.value?.toCPointer<ByteVar>(), creservedrecords, rgcbreservation?.value?.toCPointer<ByteVar>(), pcbalignreservation?.value?.toCPointer<ByteVar>())

public actual fun allocReservedLog(pvmarshal: COpaquePointer?, creservedrecords: UInt, pcbadjustment: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_allocReservedLog(pvmarshal?.value?.toCPointer<ByteVar>(), creservedrecords, pcbadjustment?.value?.toCPointer<ByteVar>())

public actual fun areFileApisANSI(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_areFileApisANSI()

public actual fun areShortNamesEnabled(handle: Handle, enabled: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_areShortNamesEnabled(handle?.value?.toCPointer<ByteVar>(), enabled?.value?.toCPointer<ByteVar>())

public actual fun backupRead(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, lpnumberofbytesread: COpaquePointer?, babort: Bool, bprocesssecurity: Bool, lpcontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_backupRead(hfile?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nnumberofbytestoread, lpnumberofbytesread?.value?.toCPointer<ByteVar>(), babort, bprocesssecurity, lpcontext?.value?.toCPointer<ByteVar>())

public actual fun backupSeek(hfile: Handle, dwlowbytestoseek: UInt, dwhighbytestoseek: UInt, lpdwlowbyteseeked: COpaquePointer?, lpdwhighbyteseeked: COpaquePointer?, lpcontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_backupSeek(hfile?.value?.toCPointer<ByteVar>(), dwlowbytestoseek, dwhighbytestoseek, lpdwlowbyteseeked?.value?.toCPointer<ByteVar>(), lpdwhighbyteseeked?.value?.toCPointer<ByteVar>(), lpcontext?.value?.toCPointer<ByteVar>())

public actual fun backupWrite(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: COpaquePointer?, babort: Bool, bprocesssecurity: Bool, lpcontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_backupWrite(hfile?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nnumberofbytestowrite, lpnumberofbyteswritten?.value?.toCPointer<ByteVar>(), babort, bprocesssecurity, lpcontext?.value?.toCPointer<ByteVar>())

public actual fun buildIoRingCancelRequest(ioring: Hioring, file: IoringHandleRef, optocancel: ULong, userdata: ULong): Hresult =
    0

public actual fun buildIoRingFlushFile(ioring: Hioring, fileref: IoringHandleRef, flushmode: FileFlushMode, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    0

public actual fun buildIoRingReadFile(ioring: Hioring, fileref: IoringHandleRef, dataref: IoringBufferRef, numberofbytestoread: UInt, fileoffset: ULong, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    0

public actual fun buildIoRingRegisterBuffers(ioring: Hioring, count: UInt, buffers: COpaquePointer?, userdata: ULong): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_buildIoRingRegisterBuffers(ioring?.value?.toCPointer<ByteVar>(), count, buffers?.value?.toCPointer<ByteVar>(), userdata)

public actual fun buildIoRingRegisterFileHandles(ioring: Hioring, count: UInt, handles: COpaquePointer?, userdata: ULong): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_buildIoRingRegisterFileHandles(ioring?.value?.toCPointer<ByteVar>(), count, handles?.value?.toCPointer<ByteVar>(), userdata)

public actual fun buildIoRingWriteFile(ioring: Hioring, fileref: IoringHandleRef, bufferref: IoringBufferRef, numberofbytestowrite: UInt, fileoffset: ULong, writeflags: FileWriteFlags, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    0

public actual fun checkNameLegalDOS8Dot3A(lpname: Pcstr, lpoemname: Pstr, oemnamesize: UInt, pbnamecontainsspaces: COpaquePointer?, pbnamelegal: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_checkNameLegalDOS8Dot3A(lpname?.value?.toCPointer<ByteVar>(), lpoemname?.value?.toCPointer<ByteVar>(), oemnamesize, pbnamecontainsspaces?.value?.toCPointer<ByteVar>(), pbnamelegal?.value?.toCPointer<ByteVar>())

public actual fun checkNameLegalDOS8Dot3W(lpname: Pcwstr, lpoemname: Pstr, oemnamesize: UInt, pbnamecontainsspaces: COpaquePointer?, pbnamelegal: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_checkNameLegalDOS8Dot3W(lpname?.value?.toCPointer<ByteVar>(), lpoemname?.value?.toCPointer<ByteVar>(), oemnamesize, pbnamecontainsspaces?.value?.toCPointer<ByteVar>(), pbnamelegal?.value?.toCPointer<ByteVar>())

public actual fun closeAndResetLogFile(hlog: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_closeAndResetLogFile(hlog?.value?.toCPointer<ByteVar>())

public actual fun closeEncryptedFileRaw(pvcontext: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_closeEncryptedFileRaw(pvcontext?.value?.toCPointer<ByteVar>())
}

public actual fun closeIoRing(ioring: Hioring): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_closeIoRing(ioring?.value?.toCPointer<ByteVar>())

public actual fun commitComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_commitComplete(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun commitEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_commitEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun commitTransaction(transactionhandle: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_commitTransaction(transactionhandle?.value?.toCPointer<ByteVar>())

public actual fun commitTransactionAsync(transactionhandle: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_commitTransactionAsync(transactionhandle?.value?.toCPointer<ByteVar>())

public actual fun compareFileTime(lpfiletime1: COpaquePointer?, lpfiletime2: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_compareFileTime(lpfiletime1?.value?.toCPointer<ByteVar>(), lpfiletime2?.value?.toCPointer<ByteVar>())

public actual fun copyFile2(pwszexistingfilename: Pcwstr, pwsznewfilename: Pcwstr, pextendedparameters: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_copyFile2(pwszexistingfilename?.value?.toCPointer<ByteVar>(), pwsznewfilename?.value?.toCPointer<ByteVar>(), pextendedparameters?.value?.toCPointer<ByteVar>())

public actual fun copyFileA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, bfailifexists: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_copyFileA(lpexistingfilename?.value?.toCPointer<ByteVar>(), lpnewfilename?.value?.toCPointer<ByteVar>(), bfailifexists)

public actual fun copyFileExA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, pbcancel: COpaquePointer?, dwcopyflags: CopyfileFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_copyFileExA(lpexistingfilename?.value?.toCPointer<ByteVar>(), lpnewfilename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), pbcancel?.value?.toCPointer<ByteVar>(), dwcopyflags)

public actual fun copyFileExW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, pbcancel: COpaquePointer?, dwcopyflags: CopyfileFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_copyFileExW(lpexistingfilename?.value?.toCPointer<ByteVar>(), lpnewfilename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), pbcancel?.value?.toCPointer<ByteVar>(), dwcopyflags)

public actual fun copyFileFromAppW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, bfailifexists: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_copyFileFromAppW(lpexistingfilename?.value?.toCPointer<ByteVar>(), lpnewfilename?.value?.toCPointer<ByteVar>(), bfailifexists)

public actual fun copyFileTransactedA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, pbcancel: COpaquePointer?, dwcopyflags: UInt, htransaction: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_copyFileTransactedA(lpexistingfilename?.value?.toCPointer<ByteVar>(), lpnewfilename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), pbcancel?.value?.toCPointer<ByteVar>(), dwcopyflags, htransaction?.value?.toCPointer<ByteVar>())

public actual fun copyFileTransactedW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, pbcancel: COpaquePointer?, dwcopyflags: UInt, htransaction: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_copyFileTransactedW(lpexistingfilename?.value?.toCPointer<ByteVar>(), lpnewfilename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), pbcancel?.value?.toCPointer<ByteVar>(), dwcopyflags, htransaction?.value?.toCPointer<ByteVar>())

public actual fun copyFileW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, bfailifexists: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_copyFileW(lpexistingfilename?.value?.toCPointer<ByteVar>(), lpnewfilename?.value?.toCPointer<ByteVar>(), bfailifexists)

public actual fun copyLZFile(hfsource: Int, hfdest: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_copyLZFile(hfsource, hfdest)

public actual fun createDirectoryA(lppathname: Pcstr, lpsecurityattributes: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createDirectoryA(lppathname?.value?.toCPointer<ByteVar>(), lpsecurityattributes?.value?.toCPointer<ByteVar>())

public actual fun createDirectoryExA(lptemplatedirectory: Pcstr, lpnewdirectory: Pcstr, lpsecurityattributes: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createDirectoryExA(lptemplatedirectory?.value?.toCPointer<ByteVar>(), lpnewdirectory?.value?.toCPointer<ByteVar>(), lpsecurityattributes?.value?.toCPointer<ByteVar>())

public actual fun createDirectoryExW(lptemplatedirectory: Pcwstr, lpnewdirectory: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createDirectoryExW(lptemplatedirectory?.value?.toCPointer<ByteVar>(), lpnewdirectory?.value?.toCPointer<ByteVar>(), lpsecurityattributes?.value?.toCPointer<ByteVar>())

public actual fun createDirectoryFromAppW(lppathname: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createDirectoryFromAppW(lppathname?.value?.toCPointer<ByteVar>(), lpsecurityattributes?.value?.toCPointer<ByteVar>())

public actual fun createDirectoryTransactedA(lptemplatedirectory: Pcstr, lpnewdirectory: Pcstr, lpsecurityattributes: COpaquePointer?, htransaction: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createDirectoryTransactedA(lptemplatedirectory?.value?.toCPointer<ByteVar>(), lpnewdirectory?.value?.toCPointer<ByteVar>(), lpsecurityattributes?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>())

public actual fun createDirectoryTransactedW(lptemplatedirectory: Pcwstr, lpnewdirectory: Pcwstr, lpsecurityattributes: COpaquePointer?, htransaction: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createDirectoryTransactedW(lptemplatedirectory?.value?.toCPointer<ByteVar>(), lpnewdirectory?.value?.toCPointer<ByteVar>(), lpsecurityattributes?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>())

public actual fun createDirectoryW(lppathname: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createDirectoryW(lppathname?.value?.toCPointer<ByteVar>(), lpsecurityattributes?.value?.toCPointer<ByteVar>())

public actual fun createEnlistment(lpenlistmentattributes: COpaquePointer?, resourcemanagerhandle: Handle, transactionhandle: Handle, notificationmask: UInt, createoptions: UInt, enlistmentkey: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createEnlistment(lpenlistmentattributes?.value?.toCPointer<ByteVar>(), resourcemanagerhandle?.value?.toCPointer<ByteVar>(), transactionhandle?.value?.toCPointer<ByteVar>(), notificationmask, createoptions, enlistmentkey?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createFile2(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, dwcreationdisposition: FileCreationDisposition, pcreateexparams: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createFile2(lpfilename?.value?.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, dwcreationdisposition, pcreateexparams?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createFile2FromAppW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationdisposition: UInt, pcreateexparams: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createFile2FromAppW(lpfilename?.value?.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, dwcreationdisposition, pcreateexparams?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createFileA(lpfilename: Pcstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createFileA(lpfilename?.value?.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, lpsecurityattributes?.value?.toCPointer<ByteVar>(), dwcreationdisposition, dwflagsandattributes, htemplatefile?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createFileFromAppW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createFileFromAppW(lpfilename?.value?.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, lpsecurityattributes?.value?.toCPointer<ByteVar>(), dwcreationdisposition, dwflagsandattributes, htemplatefile?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createFileTransactedA(lpfilename: Pcstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle, htransaction: Handle, pusminiversion: COpaquePointer?, lpextendedparameter: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createFileTransactedA(lpfilename?.value?.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, lpsecurityattributes?.value?.toCPointer<ByteVar>(), dwcreationdisposition, dwflagsandattributes, htemplatefile?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>(), pusminiversion?.value?.toCPointer<ByteVar>(), lpextendedparameter?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createFileTransactedW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle, htransaction: Handle, pusminiversion: COpaquePointer?, lpextendedparameter: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createFileTransactedW(lpfilename?.value?.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, lpsecurityattributes?.value?.toCPointer<ByteVar>(), dwcreationdisposition, dwflagsandattributes, htemplatefile?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>(), pusminiversion?.value?.toCPointer<ByteVar>(), lpextendedparameter?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createFileW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createFileW(lpfilename?.value?.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, lpsecurityattributes?.value?.toCPointer<ByteVar>(), dwcreationdisposition, dwflagsandattributes, htemplatefile?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createHardLinkA(lpfilename: Pcstr, lpexistingfilename: Pcstr, lpsecurityattributes: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createHardLinkA(lpfilename?.value?.toCPointer<ByteVar>(), lpexistingfilename?.value?.toCPointer<ByteVar>(), lpsecurityattributes?.value?.toCPointer<ByteVar>())

public actual fun createHardLinkTransactedA(lpfilename: Pcstr, lpexistingfilename: Pcstr, lpsecurityattributes: COpaquePointer?, htransaction: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createHardLinkTransactedA(lpfilename?.value?.toCPointer<ByteVar>(), lpexistingfilename?.value?.toCPointer<ByteVar>(), lpsecurityattributes?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>())

public actual fun createHardLinkTransactedW(lpfilename: Pcwstr, lpexistingfilename: Pcwstr, lpsecurityattributes: COpaquePointer?, htransaction: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createHardLinkTransactedW(lpfilename?.value?.toCPointer<ByteVar>(), lpexistingfilename?.value?.toCPointer<ByteVar>(), lpsecurityattributes?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>())

public actual fun createHardLinkW(lpfilename: Pcwstr, lpexistingfilename: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createHardLinkW(lpfilename?.value?.toCPointer<ByteVar>(), lpexistingfilename?.value?.toCPointer<ByteVar>(), lpsecurityattributes?.value?.toCPointer<ByteVar>())

public actual fun createIoRing(ioringversion: IoringVersion, flags: IoringCreateFlags, submissionqueuesize: UInt, completionqueuesize: UInt, h: COpaquePointer?): Hresult =
    0

public actual fun createLogContainerScanContext(hlog: Handle, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createLogContainerScanContext(hlog?.value?.toCPointer<ByteVar>(), cfromcontainer, ccontainers, escanmode, pcxscan?.value?.toCPointer<ByteVar>(), poverlapped?.value?.toCPointer<ByteVar>())

public actual fun createLogFile(pszlogfilename: Pcwstr, fdesiredaccess: UInt, dwsharemode: FileShareMode, psalogfile: COpaquePointer?, fcreatedisposition: FileCreationDisposition, fflagsandattributes: FileFlagsAndAttributes): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createLogFile(pszlogfilename?.value?.toCPointer<ByteVar>(), fdesiredaccess, dwsharemode, psalogfile?.value?.toCPointer<ByteVar>(), fcreatedisposition, fflagsandattributes)?.let { COpaquePointer(it.toLong()) }

public actual fun createLogMarshallingArea(hlog: Handle, pfnallocbuffer: ClfsBlockAllocation, pfnfreebuffer: ClfsBlockDeallocation, pvblockalloccontext: COpaquePointer?, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshal: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createLogMarshallingArea(hlog?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvblockalloccontext?.value?.toCPointer<ByteVar>(), cbmarshallingbuffer, cmaxwritebuffers, cmaxreadbuffers, ppvmarshal?.value?.toCPointer<ByteVar>())

public actual fun createResourceManager(lpresourcemanagerattributes: COpaquePointer?, resourcemanagerid: COpaquePointer?, createoptions: UInt, tmhandle: Handle, description: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createResourceManager(lpresourcemanagerattributes?.value?.toCPointer<ByteVar>(), resourcemanagerid?.value?.toCPointer<ByteVar>(), createoptions, tmhandle?.value?.toCPointer<ByteVar>(), description?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createSymbolicLinkA(lpsymlinkfilename: Pcstr, lptargetfilename: Pcstr, dwflags: SymbolicLinkFlags): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createSymbolicLinkA(lpsymlinkfilename?.value?.toCPointer<ByteVar>(), lptargetfilename?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun createSymbolicLinkTransactedA(lpsymlinkfilename: Pcstr, lptargetfilename: Pcstr, dwflags: SymbolicLinkFlags, htransaction: Handle): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createSymbolicLinkTransactedA(lpsymlinkfilename?.value?.toCPointer<ByteVar>(), lptargetfilename?.value?.toCPointer<ByteVar>(), dwflags, htransaction?.value?.toCPointer<ByteVar>())

public actual fun createSymbolicLinkTransactedW(lpsymlinkfilename: Pcwstr, lptargetfilename: Pcwstr, dwflags: SymbolicLinkFlags, htransaction: Handle): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createSymbolicLinkTransactedW(lpsymlinkfilename?.value?.toCPointer<ByteVar>(), lptargetfilename?.value?.toCPointer<ByteVar>(), dwflags, htransaction?.value?.toCPointer<ByteVar>())

public actual fun createSymbolicLinkW(lpsymlinkfilename: Pcwstr, lptargetfilename: Pcwstr, dwflags: SymbolicLinkFlags): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createSymbolicLinkW(lpsymlinkfilename?.value?.toCPointer<ByteVar>(), lptargetfilename?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun createTapePartition(hdevice: Handle, dwpartitionmethod: CreateTapePartitionMethod, dwcount: UInt, dwsize: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createTapePartition(hdevice?.value?.toCPointer<ByteVar>(), dwpartitionmethod, dwcount, dwsize)

public actual fun createTransaction(lptransactionattributes: COpaquePointer?, uow: COpaquePointer?, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createTransaction(lptransactionattributes?.value?.toCPointer<ByteVar>(), uow?.value?.toCPointer<ByteVar>(), createoptions, isolationlevel, isolationflags, timeout, description?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createTransactionManager(lptransactionattributes: COpaquePointer?, logfilename: Pcwstr, createoptions: UInt, commitstrength: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_createTransactionManager(lptransactionattributes?.value?.toCPointer<ByteVar>(), logfilename?.value?.toCPointer<ByteVar>(), createoptions, commitstrength)?.let { COpaquePointer(it.toLong()) }

public actual fun decryptFileA(lpfilename: Pcstr, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_decryptFileA(lpfilename?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun decryptFileW(lpfilename: Pcwstr, dwreserved: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_decryptFileW(lpfilename?.value?.toCPointer<ByteVar>(), dwreserved)

public actual fun defineDosDeviceA(dwflags: DefineDosDeviceFlags, lpdevicename: Pcstr, lptargetpath: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_defineDosDeviceA(dwflags, lpdevicename?.value?.toCPointer<ByteVar>(), lptargetpath?.value?.toCPointer<ByteVar>())

public actual fun defineDosDeviceW(dwflags: DefineDosDeviceFlags, lpdevicename: Pcwstr, lptargetpath: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_defineDosDeviceW(dwflags, lpdevicename?.value?.toCPointer<ByteVar>(), lptargetpath?.value?.toCPointer<ByteVar>())

public actual fun deleteFileA(lpfilename: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_deleteFileA(lpfilename?.value?.toCPointer<ByteVar>())

public actual fun deleteFileFromAppW(lpfilename: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_deleteFileFromAppW(lpfilename?.value?.toCPointer<ByteVar>())

public actual fun deleteFileTransactedA(lpfilename: Pcstr, htransaction: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_deleteFileTransactedA(lpfilename?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>())

public actual fun deleteFileTransactedW(lpfilename: Pcwstr, htransaction: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_deleteFileTransactedW(lpfilename?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>())

public actual fun deleteFileW(lpfilename: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_deleteFileW(lpfilename?.value?.toCPointer<ByteVar>())

public actual fun deleteLogByHandle(hlog: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_deleteLogByHandle(hlog?.value?.toCPointer<ByteVar>())

public actual fun deleteLogFile(pszlogfilename: Pcwstr, pvreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_deleteLogFile(pszlogfilename?.value?.toCPointer<ByteVar>(), pvreserved?.value?.toCPointer<ByteVar>())

public actual fun deleteLogMarshallingArea(pvmarshal: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_deleteLogMarshallingArea(pvmarshal?.value?.toCPointer<ByteVar>())

public actual fun deleteVolumeMountPointA(lpszvolumemountpoint: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_deleteVolumeMountPointA(lpszvolumemountpoint?.value?.toCPointer<ByteVar>())

public actual fun deleteVolumeMountPointW(lpszvolumemountpoint: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_deleteVolumeMountPointW(lpszvolumemountpoint?.value?.toCPointer<ByteVar>())

public actual fun deregisterManageableLogClient(hlog: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_deregisterManageableLogClient(hlog?.value?.toCPointer<ByteVar>())

public actual fun duplicateEncryptionInfoFile(srcfilename: Pcwstr, dstfilename: Pcwstr, dwcreationdistribution: UInt, dwattributes: UInt, lpsecurityattributes: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_duplicateEncryptionInfoFile(srcfilename?.value?.toCPointer<ByteVar>(), dstfilename?.value?.toCPointer<ByteVar>(), dwcreationdistribution, dwattributes, lpsecurityattributes?.value?.toCPointer<ByteVar>())

public actual fun encryptFileA(lpfilename: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_encryptFileA(lpfilename?.value?.toCPointer<ByteVar>())

public actual fun encryptFileW(lpfilename: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_encryptFileW(lpfilename?.value?.toCPointer<ByteVar>())

public actual fun encryptionDisable(dirpath: Pcwstr, disable: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_encryptionDisable(dirpath?.value?.toCPointer<ByteVar>(), disable)

public actual fun eraseTape(hdevice: Handle, dwerasetype: EraseTapeType, bimmediate: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_eraseTape(hdevice?.value?.toCPointer<ByteVar>(), dwerasetype, bimmediate)

public actual fun fileEncryptionStatusA(lpfilename: Pcstr, lpstatus: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_fileEncryptionStatusA(lpfilename?.value?.toCPointer<ByteVar>(), lpstatus?.value?.toCPointer<ByteVar>())

public actual fun fileEncryptionStatusW(lpfilename: Pcwstr, lpstatus: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_fileEncryptionStatusW(lpfilename?.value?.toCPointer<ByteVar>(), lpstatus?.value?.toCPointer<ByteVar>())

public actual fun fileTimeToLocalFileTime(lpfiletime: COpaquePointer?, lplocalfiletime: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_fileTimeToLocalFileTime(lpfiletime?.value?.toCPointer<ByteVar>(), lplocalfiletime?.value?.toCPointer<ByteVar>())

public actual fun findClose(hfindfile: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findClose(hfindfile?.value?.toCPointer<ByteVar>())

public actual fun findCloseChangeNotification(hchangehandle: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findCloseChangeNotification(hchangehandle?.value?.toCPointer<ByteVar>())

public actual fun findFirstChangeNotificationA(lppathname: Pcstr, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findFirstChangeNotificationA(lppathname?.value?.toCPointer<ByteVar>(), bwatchsubtree, dwnotifyfilter)?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstChangeNotificationW(lppathname: Pcwstr, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findFirstChangeNotificationW(lppathname?.value?.toCPointer<ByteVar>(), bwatchsubtree, dwnotifyfilter)?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstFileA(lpfilename: Pcstr, lpfindfiledata: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findFirstFileA(lpfilename?.value?.toCPointer<ByteVar>(), lpfindfiledata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstFileExA(lpfilename: Pcstr, finfolevelid: FindexInfoLevels, lpfindfiledata: COpaquePointer?, fsearchop: FindexSearchOps, lpsearchfilter: COpaquePointer?, dwadditionalflags: FindFirstExFlags): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findFirstFileExA(lpfilename?.value?.toCPointer<ByteVar>(), finfolevelid, lpfindfiledata?.value?.toCPointer<ByteVar>(), fsearchop, lpsearchfilter?.value?.toCPointer<ByteVar>(), dwadditionalflags)?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstFileExFromAppW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: COpaquePointer?, fsearchop: FindexSearchOps, lpsearchfilter: COpaquePointer?, dwadditionalflags: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findFirstFileExFromAppW(lpfilename?.value?.toCPointer<ByteVar>(), finfolevelid, lpfindfiledata?.value?.toCPointer<ByteVar>(), fsearchop, lpsearchfilter?.value?.toCPointer<ByteVar>(), dwadditionalflags)?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstFileExW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: COpaquePointer?, fsearchop: FindexSearchOps, lpsearchfilter: COpaquePointer?, dwadditionalflags: FindFirstExFlags): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findFirstFileExW(lpfilename?.value?.toCPointer<ByteVar>(), finfolevelid, lpfindfiledata?.value?.toCPointer<ByteVar>(), fsearchop, lpsearchfilter?.value?.toCPointer<ByteVar>(), dwadditionalflags)?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstFileNameTransactedW(lpfilename: Pcwstr, dwflags: UInt, stringlength: COpaquePointer?, linkname: Pwstr, htransaction: Handle): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findFirstFileNameTransactedW(lpfilename?.value?.toCPointer<ByteVar>(), dwflags, stringlength?.value?.toCPointer<ByteVar>(), linkname?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstFileNameW(lpfilename: Pcwstr, dwflags: UInt, stringlength: COpaquePointer?, linkname: Pwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findFirstFileNameW(lpfilename?.value?.toCPointer<ByteVar>(), dwflags, stringlength?.value?.toCPointer<ByteVar>(), linkname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstFileTransactedA(lpfilename: Pcstr, finfolevelid: FindexInfoLevels, lpfindfiledata: COpaquePointer?, fsearchop: FindexSearchOps, lpsearchfilter: COpaquePointer?, dwadditionalflags: UInt, htransaction: Handle): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findFirstFileTransactedA(lpfilename?.value?.toCPointer<ByteVar>(), finfolevelid, lpfindfiledata?.value?.toCPointer<ByteVar>(), fsearchop, lpsearchfilter?.value?.toCPointer<ByteVar>(), dwadditionalflags, htransaction?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstFileTransactedW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: COpaquePointer?, fsearchop: FindexSearchOps, lpsearchfilter: COpaquePointer?, dwadditionalflags: UInt, htransaction: Handle): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findFirstFileTransactedW(lpfilename?.value?.toCPointer<ByteVar>(), finfolevelid, lpfindfiledata?.value?.toCPointer<ByteVar>(), fsearchop, lpsearchfilter?.value?.toCPointer<ByteVar>(), dwadditionalflags, htransaction?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstFileW(lpfilename: Pcwstr, lpfindfiledata: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findFirstFileW(lpfilename?.value?.toCPointer<ByteVar>(), lpfindfiledata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstStreamTransactedW(lpfilename: Pcwstr, infolevel: StreamInfoLevels, lpfindstreamdata: COpaquePointer?, dwflags: UInt, htransaction: Handle): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findFirstStreamTransactedW(lpfilename?.value?.toCPointer<ByteVar>(), infolevel, lpfindstreamdata?.value?.toCPointer<ByteVar>(), dwflags, htransaction?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstStreamW(lpfilename: Pcwstr, infolevel: StreamInfoLevels, lpfindstreamdata: COpaquePointer?, dwflags: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findFirstStreamW(lpfilename?.value?.toCPointer<ByteVar>(), infolevel, lpfindstreamdata?.value?.toCPointer<ByteVar>(), dwflags)?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstVolumeA(lpszvolumename: Pstr, cchbufferlength: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findFirstVolumeA(lpszvolumename?.value?.toCPointer<ByteVar>(), cchbufferlength)?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstVolumeMountPointA(lpszrootpathname: Pcstr, lpszvolumemountpoint: Pstr, cchbufferlength: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findFirstVolumeMountPointA(lpszrootpathname?.value?.toCPointer<ByteVar>(), lpszvolumemountpoint?.value?.toCPointer<ByteVar>(), cchbufferlength)?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstVolumeMountPointW(lpszrootpathname: Pcwstr, lpszvolumemountpoint: Pwstr, cchbufferlength: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findFirstVolumeMountPointW(lpszrootpathname?.value?.toCPointer<ByteVar>(), lpszvolumemountpoint?.value?.toCPointer<ByteVar>(), cchbufferlength)?.let { COpaquePointer(it.toLong()) }

public actual fun findFirstVolumeW(lpszvolumename: Pwstr, cchbufferlength: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findFirstVolumeW(lpszvolumename?.value?.toCPointer<ByteVar>(), cchbufferlength)?.let { COpaquePointer(it.toLong()) }

public actual fun findNextChangeNotification(hchangehandle: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findNextChangeNotification(hchangehandle?.value?.toCPointer<ByteVar>())

public actual fun findNextFileA(hfindfile: Handle, lpfindfiledata: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findNextFileA(hfindfile?.value?.toCPointer<ByteVar>(), lpfindfiledata?.value?.toCPointer<ByteVar>())

public actual fun findNextFileNameW(hfindstream: Handle, stringlength: COpaquePointer?, linkname: Pwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findNextFileNameW(hfindstream?.value?.toCPointer<ByteVar>(), stringlength?.value?.toCPointer<ByteVar>(), linkname?.value?.toCPointer<ByteVar>())

public actual fun findNextFileW(hfindfile: Handle, lpfindfiledata: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findNextFileW(hfindfile?.value?.toCPointer<ByteVar>(), lpfindfiledata?.value?.toCPointer<ByteVar>())

public actual fun findNextStreamW(hfindstream: Handle, lpfindstreamdata: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findNextStreamW(hfindstream?.value?.toCPointer<ByteVar>(), lpfindstreamdata?.value?.toCPointer<ByteVar>())

public actual fun findNextVolumeA(hfindvolume: Handle, lpszvolumename: Pstr, cchbufferlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findNextVolumeA(hfindvolume?.value?.toCPointer<ByteVar>(), lpszvolumename?.value?.toCPointer<ByteVar>(), cchbufferlength)

public actual fun findNextVolumeMountPointA(hfindvolumemountpoint: Handle, lpszvolumemountpoint: Pstr, cchbufferlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findNextVolumeMountPointA(hfindvolumemountpoint?.value?.toCPointer<ByteVar>(), lpszvolumemountpoint?.value?.toCPointer<ByteVar>(), cchbufferlength)

public actual fun findNextVolumeMountPointW(hfindvolumemountpoint: Handle, lpszvolumemountpoint: Pwstr, cchbufferlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findNextVolumeMountPointW(hfindvolumemountpoint?.value?.toCPointer<ByteVar>(), lpszvolumemountpoint?.value?.toCPointer<ByteVar>(), cchbufferlength)

public actual fun findNextVolumeW(hfindvolume: Handle, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findNextVolumeW(hfindvolume?.value?.toCPointer<ByteVar>(), lpszvolumename?.value?.toCPointer<ByteVar>(), cchbufferlength)

public actual fun findVolumeClose(hfindvolume: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findVolumeClose(hfindvolume?.value?.toCPointer<ByteVar>())

public actual fun findVolumeMountPointClose(hfindvolumemountpoint: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_findVolumeMountPointClose(hfindvolumemountpoint?.value?.toCPointer<ByteVar>())

public actual fun flushFileBuffers(hfile: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_flushFileBuffers(hfile?.value?.toCPointer<ByteVar>())

public actual fun flushLogBuffers(pvmarshal: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_flushLogBuffers(pvmarshal?.value?.toCPointer<ByteVar>(), poverlapped?.value?.toCPointer<ByteVar>())

public actual fun flushLogToLsn(pvmarshalcontext: COpaquePointer?, plsnflush: COpaquePointer?, plsnlastflushed: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_flushLogToLsn(pvmarshalcontext?.value?.toCPointer<ByteVar>(), plsnflush?.value?.toCPointer<ByteVar>(), plsnlastflushed?.value?.toCPointer<ByteVar>(), poverlapped?.value?.toCPointer<ByteVar>())

public actual fun freeEncryptedFileMetadata(pbmetadata: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_freeEncryptedFileMetadata(pbmetadata?.value?.toCPointer<ByteVar>())
}

public actual fun freeEncryptionCertificateHashList(pusers: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_freeEncryptionCertificateHashList(pusers?.value?.toCPointer<ByteVar>())
}

public actual fun freeReservedLog(pvmarshal: COpaquePointer?, creservedrecords: UInt, pcbadjustment: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_freeReservedLog(pvmarshal?.value?.toCPointer<ByteVar>(), creservedrecords, pcbadjustment?.value?.toCPointer<ByteVar>())

public actual fun getBinaryTypeA(lpapplicationname: Pcstr, lpbinarytype: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getBinaryTypeA(lpapplicationname?.value?.toCPointer<ByteVar>(), lpbinarytype?.value?.toCPointer<ByteVar>())

public actual fun getBinaryTypeW(lpapplicationname: Pcwstr, lpbinarytype: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getBinaryTypeW(lpapplicationname?.value?.toCPointer<ByteVar>(), lpbinarytype?.value?.toCPointer<ByteVar>())

public actual fun getCompressedFileSizeA(lpfilename: Pcstr, lpfilesizehigh: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getCompressedFileSizeA(lpfilename?.value?.toCPointer<ByteVar>(), lpfilesizehigh?.value?.toCPointer<ByteVar>())

public actual fun getCompressedFileSizeTransactedA(lpfilename: Pcstr, lpfilesizehigh: COpaquePointer?, htransaction: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getCompressedFileSizeTransactedA(lpfilename?.value?.toCPointer<ByteVar>(), lpfilesizehigh?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>())

public actual fun getCompressedFileSizeTransactedW(lpfilename: Pcwstr, lpfilesizehigh: COpaquePointer?, htransaction: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getCompressedFileSizeTransactedW(lpfilename?.value?.toCPointer<ByteVar>(), lpfilesizehigh?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>())

public actual fun getCompressedFileSizeW(lpfilename: Pcwstr, lpfilesizehigh: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getCompressedFileSizeW(lpfilename?.value?.toCPointer<ByteVar>(), lpfilesizehigh?.value?.toCPointer<ByteVar>())

public actual fun getCurrentClockTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getCurrentClockTransactionManager(transactionmanagerhandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun getDiskFreeSpaceA(lprootpathname: Pcstr, lpsectorspercluster: COpaquePointer?, lpbytespersector: COpaquePointer?, lpnumberoffreeclusters: COpaquePointer?, lptotalnumberofclusters: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceA(lprootpathname?.value?.toCPointer<ByteVar>(), lpsectorspercluster?.value?.toCPointer<ByteVar>(), lpbytespersector?.value?.toCPointer<ByteVar>(), lpnumberoffreeclusters?.value?.toCPointer<ByteVar>(), lptotalnumberofclusters?.value?.toCPointer<ByteVar>())

public actual fun getDiskFreeSpaceExA(lpdirectoryname: Pcstr, lpfreebytesavailabletocaller: COpaquePointer?, lptotalnumberofbytes: COpaquePointer?, lptotalnumberoffreebytes: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceExA(lpdirectoryname?.value?.toCPointer<ByteVar>(), lpfreebytesavailabletocaller?.value?.toCPointer<ByteVar>(), lptotalnumberofbytes?.value?.toCPointer<ByteVar>(), lptotalnumberoffreebytes?.value?.toCPointer<ByteVar>())

public actual fun getDiskFreeSpaceExW(lpdirectoryname: Pcwstr, lpfreebytesavailabletocaller: COpaquePointer?, lptotalnumberofbytes: COpaquePointer?, lptotalnumberoffreebytes: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceExW(lpdirectoryname?.value?.toCPointer<ByteVar>(), lpfreebytesavailabletocaller?.value?.toCPointer<ByteVar>(), lptotalnumberofbytes?.value?.toCPointer<ByteVar>(), lptotalnumberoffreebytes?.value?.toCPointer<ByteVar>())

public actual fun getDiskFreeSpaceW(lprootpathname: Pcwstr, lpsectorspercluster: COpaquePointer?, lpbytespersector: COpaquePointer?, lpnumberoffreeclusters: COpaquePointer?, lptotalnumberofclusters: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceW(lprootpathname?.value?.toCPointer<ByteVar>(), lpsectorspercluster?.value?.toCPointer<ByteVar>(), lpbytespersector?.value?.toCPointer<ByteVar>(), lpnumberoffreeclusters?.value?.toCPointer<ByteVar>(), lptotalnumberofclusters?.value?.toCPointer<ByteVar>())

public actual fun getDiskSpaceInformationA(rootpath: Pcstr, diskspaceinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getDiskSpaceInformationA(rootpath?.value?.toCPointer<ByteVar>(), diskspaceinfo?.value?.toCPointer<ByteVar>())

public actual fun getDiskSpaceInformationW(rootpath: Pcwstr, diskspaceinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getDiskSpaceInformationW(rootpath?.value?.toCPointer<ByteVar>(), diskspaceinfo?.value?.toCPointer<ByteVar>())

public actual fun getDriveTypeA(lprootpathname: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getDriveTypeA(lprootpathname?.value?.toCPointer<ByteVar>())

public actual fun getDriveTypeW(lprootpathname: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getDriveTypeW(lprootpathname?.value?.toCPointer<ByteVar>())

public actual fun getEncryptedFileMetadata(lpfilename: Pcwstr, pcbmetadata: COpaquePointer?, ppbmetadata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getEncryptedFileMetadata(lpfilename?.value?.toCPointer<ByteVar>(), pcbmetadata?.value?.toCPointer<ByteVar>(), ppbmetadata?.value?.toCPointer<ByteVar>())

public actual fun getEnlistmentId(enlistmenthandle: Handle, enlistmentid: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getEnlistmentId(enlistmenthandle?.value?.toCPointer<ByteVar>(), enlistmentid?.value?.toCPointer<ByteVar>())

public actual fun getEnlistmentRecoveryInformation(enlistmenthandle: Handle, buffersize: UInt, buffer: COpaquePointer?, bufferused: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getEnlistmentRecoveryInformation(enlistmenthandle?.value?.toCPointer<ByteVar>(), buffersize, buffer?.value?.toCPointer<ByteVar>(), bufferused?.value?.toCPointer<ByteVar>())

public actual fun getExpandedNameA(lpszsource: Pcstr, lpszbuffer: Pstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getExpandedNameA(lpszsource?.value?.toCPointer<ByteVar>(), lpszbuffer?.value?.toCPointer<ByteVar>())

public actual fun getExpandedNameW(lpszsource: Pcwstr, lpszbuffer: Pwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getExpandedNameW(lpszsource?.value?.toCPointer<ByteVar>(), lpszbuffer?.value?.toCPointer<ByteVar>())

public actual fun getFileAttributesA(lpfilename: Pcstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileAttributesA(lpfilename?.value?.toCPointer<ByteVar>())

public actual fun getFileAttributesExA(lpfilename: Pcstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileAttributesExA(lpfilename?.value?.toCPointer<ByteVar>(), finfolevelid, lpfileinformation?.value?.toCPointer<ByteVar>())

public actual fun getFileAttributesExFromAppW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileAttributesExFromAppW(lpfilename?.value?.toCPointer<ByteVar>(), finfolevelid, lpfileinformation?.value?.toCPointer<ByteVar>())

public actual fun getFileAttributesExW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileAttributesExW(lpfilename?.value?.toCPointer<ByteVar>(), finfolevelid, lpfileinformation?.value?.toCPointer<ByteVar>())

public actual fun getFileAttributesTransactedA(lpfilename: Pcstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?, htransaction: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileAttributesTransactedA(lpfilename?.value?.toCPointer<ByteVar>(), finfolevelid, lpfileinformation?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>())

public actual fun getFileAttributesTransactedW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?, htransaction: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileAttributesTransactedW(lpfilename?.value?.toCPointer<ByteVar>(), finfolevelid, lpfileinformation?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>())

public actual fun getFileAttributesW(lpfilename: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileAttributesW(lpfilename?.value?.toCPointer<ByteVar>())

public actual fun getFileBandwidthReservation(hfile: Handle, lpperiodmilliseconds: COpaquePointer?, lpbytesperperiod: COpaquePointer?, pdiscardable: COpaquePointer?, lptransfersize: COpaquePointer?, lpnumoutstandingrequests: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileBandwidthReservation(hfile?.value?.toCPointer<ByteVar>(), lpperiodmilliseconds?.value?.toCPointer<ByteVar>(), lpbytesperperiod?.value?.toCPointer<ByteVar>(), pdiscardable?.value?.toCPointer<ByteVar>(), lptransfersize?.value?.toCPointer<ByteVar>(), lpnumoutstandingrequests?.value?.toCPointer<ByteVar>())

public actual fun getFileInformationByHandle(hfile: Handle, lpfileinformation: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileInformationByHandle(hfile?.value?.toCPointer<ByteVar>(), lpfileinformation?.value?.toCPointer<ByteVar>())

public actual fun getFileInformationByHandleEx(hfile: Handle, fileinformationclass: FileInfoByHandleClass, lpfileinformation: COpaquePointer?, dwbuffersize: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileInformationByHandleEx(hfile?.value?.toCPointer<ByteVar>(), fileinformationclass, lpfileinformation?.value?.toCPointer<ByteVar>(), dwbuffersize)

public actual fun getFileSize(hfile: Handle, lpfilesizehigh: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileSize(hfile?.value?.toCPointer<ByteVar>(), lpfilesizehigh?.value?.toCPointer<ByteVar>())

public actual fun getFileSizeEx(hfile: Handle, lpfilesize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileSizeEx(hfile?.value?.toCPointer<ByteVar>(), lpfilesize?.value?.toCPointer<ByteVar>())

public actual fun getFileTime(hfile: Handle, lpcreationtime: COpaquePointer?, lplastaccesstime: COpaquePointer?, lplastwritetime: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileTime(hfile?.value?.toCPointer<ByteVar>(), lpcreationtime?.value?.toCPointer<ByteVar>(), lplastaccesstime?.value?.toCPointer<ByteVar>(), lplastwritetime?.value?.toCPointer<ByteVar>())

public actual fun getFileType(hfile: Handle): FileType =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileType(hfile?.value?.toCPointer<ByteVar>())

public actual fun getFileVersionInfoA(lptstrfilename: Pcstr, dwhandle: UInt, dwlen: UInt, lpdata: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileVersionInfoA(lptstrfilename?.value?.toCPointer<ByteVar>(), dwhandle, dwlen, lpdata?.value?.toCPointer<ByteVar>())

public actual fun getFileVersionInfoExA(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcstr, dwhandle: UInt, dwlen: UInt, lpdata: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileVersionInfoExA(dwflags, lpwstrfilename?.value?.toCPointer<ByteVar>(), dwhandle, dwlen, lpdata?.value?.toCPointer<ByteVar>())

public actual fun getFileVersionInfoExW(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcwstr, dwhandle: UInt, dwlen: UInt, lpdata: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileVersionInfoExW(dwflags, lpwstrfilename?.value?.toCPointer<ByteVar>(), dwhandle, dwlen, lpdata?.value?.toCPointer<ByteVar>())

public actual fun getFileVersionInfoSizeA(lptstrfilename: Pcstr, lpdwhandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeA(lptstrfilename?.value?.toCPointer<ByteVar>(), lpdwhandle?.value?.toCPointer<ByteVar>())

public actual fun getFileVersionInfoSizeExA(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcstr, lpdwhandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeExA(dwflags, lpwstrfilename?.value?.toCPointer<ByteVar>(), lpdwhandle?.value?.toCPointer<ByteVar>())

public actual fun getFileVersionInfoSizeExW(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcwstr, lpdwhandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeExW(dwflags, lpwstrfilename?.value?.toCPointer<ByteVar>(), lpdwhandle?.value?.toCPointer<ByteVar>())

public actual fun getFileVersionInfoSizeW(lptstrfilename: Pcwstr, lpdwhandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeW(lptstrfilename?.value?.toCPointer<ByteVar>(), lpdwhandle?.value?.toCPointer<ByteVar>())

public actual fun getFileVersionInfoW(lptstrfilename: Pcwstr, dwhandle: UInt, dwlen: UInt, lpdata: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFileVersionInfoW(lptstrfilename?.value?.toCPointer<ByteVar>(), dwhandle, dwlen, lpdata?.value?.toCPointer<ByteVar>())

public actual fun getFinalPathNameByHandleA(hfile: Handle, lpszfilepath: Pstr, cchfilepath: UInt, dwflags: GetfinalpathnamebyhandleFlags): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFinalPathNameByHandleA(hfile?.value?.toCPointer<ByteVar>(), lpszfilepath?.value?.toCPointer<ByteVar>(), cchfilepath, dwflags)

public actual fun getFinalPathNameByHandleW(hfile: Handle, lpszfilepath: Pwstr, cchfilepath: UInt, dwflags: GetfinalpathnamebyhandleFlags): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFinalPathNameByHandleW(hfile?.value?.toCPointer<ByteVar>(), lpszfilepath?.value?.toCPointer<ByteVar>(), cchfilepath, dwflags)

public actual fun getFullPathNameA(lpfilename: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFullPathNameA(lpfilename?.value?.toCPointer<ByteVar>(), nbufferlength, lpbuffer?.value?.toCPointer<ByteVar>(), lpfilepart?.value?.toCPointer<ByteVar>())

public actual fun getFullPathNameTransactedA(lpfilename: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: COpaquePointer?, htransaction: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFullPathNameTransactedA(lpfilename?.value?.toCPointer<ByteVar>(), nbufferlength, lpbuffer?.value?.toCPointer<ByteVar>(), lpfilepart?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>())

public actual fun getFullPathNameTransactedW(lpfilename: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: COpaquePointer?, htransaction: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFullPathNameTransactedW(lpfilename?.value?.toCPointer<ByteVar>(), nbufferlength, lpbuffer?.value?.toCPointer<ByteVar>(), lpfilepart?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>())

public actual fun getFullPathNameW(lpfilename: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getFullPathNameW(lpfilename?.value?.toCPointer<ByteVar>(), nbufferlength, lpbuffer?.value?.toCPointer<ByteVar>(), lpfilepart?.value?.toCPointer<ByteVar>())

public actual fun getIoRingInfo(ioring: Hioring, info: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getIoRingInfo(ioring?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun getLogContainerName(hlog: Handle, cidlogicalcontainer: UInt, pwstrcontainername: Pcwstr, clencontainername: UInt, pcactuallencontainername: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getLogContainerName(hlog?.value?.toCPointer<ByteVar>(), cidlogicalcontainer, pwstrcontainername?.value?.toCPointer<ByteVar>(), clencontainername, pcactuallencontainername?.value?.toCPointer<ByteVar>())

public actual fun getLogFileInformation(hlog: Handle, pinfobuffer: COpaquePointer?, cbbuffer: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getLogFileInformation(hlog?.value?.toCPointer<ByteVar>(), pinfobuffer?.value?.toCPointer<ByteVar>(), cbbuffer?.value?.toCPointer<ByteVar>())

public actual fun getLogIoStatistics(hlog: Handle, pvstatsbuffer: COpaquePointer?, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getLogIoStatistics(hlog?.value?.toCPointer<ByteVar>(), pvstatsbuffer?.value?.toCPointer<ByteVar>(), cbstatsbuffer, estatsclass, pcbstatswritten?.value?.toCPointer<ByteVar>())

public actual fun getLogReservationInfo(pvmarshal: COpaquePointer?, pcbrecordnumber: COpaquePointer?, pcbuserreservation: COpaquePointer?, pcbcommitreservation: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getLogReservationInfo(pvmarshal?.value?.toCPointer<ByteVar>(), pcbrecordnumber?.value?.toCPointer<ByteVar>(), pcbuserreservation?.value?.toCPointer<ByteVar>(), pcbcommitreservation?.value?.toCPointer<ByteVar>())

public actual fun getLogicalDriveStringsA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getLogicalDriveStringsA(nbufferlength, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun getLogicalDriveStringsW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getLogicalDriveStringsW(nbufferlength, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun getLogicalDrives(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getLogicalDrives()

public actual fun getLongPathNameA(lpszshortpath: Pcstr, lpszlongpath: Pstr, cchbuffer: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getLongPathNameA(lpszshortpath?.value?.toCPointer<ByteVar>(), lpszlongpath?.value?.toCPointer<ByteVar>(), cchbuffer)

public actual fun getLongPathNameTransactedA(lpszshortpath: Pcstr, lpszlongpath: Pstr, cchbuffer: UInt, htransaction: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getLongPathNameTransactedA(lpszshortpath?.value?.toCPointer<ByteVar>(), lpszlongpath?.value?.toCPointer<ByteVar>(), cchbuffer, htransaction?.value?.toCPointer<ByteVar>())

public actual fun getLongPathNameTransactedW(lpszshortpath: Pcwstr, lpszlongpath: Pwstr, cchbuffer: UInt, htransaction: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getLongPathNameTransactedW(lpszshortpath?.value?.toCPointer<ByteVar>(), lpszlongpath?.value?.toCPointer<ByteVar>(), cchbuffer, htransaction?.value?.toCPointer<ByteVar>())

public actual fun getLongPathNameW(lpszshortpath: Pcwstr, lpszlongpath: Pwstr, cchbuffer: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getLongPathNameW(lpszshortpath?.value?.toCPointer<ByteVar>(), lpszlongpath?.value?.toCPointer<ByteVar>(), cchbuffer)

public actual fun getNextLogArchiveExtent(pvarchivecontext: COpaquePointer?, rgadextent: COpaquePointer?, cdescriptors: UInt, pcdescriptorsreturned: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getNextLogArchiveExtent(pvarchivecontext?.value?.toCPointer<ByteVar>(), rgadextent?.value?.toCPointer<ByteVar>(), cdescriptors, pcdescriptorsreturned?.value?.toCPointer<ByteVar>())

public actual fun getNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: COpaquePointer?, notificationlength: UInt, dwmilliseconds: UInt, returnlength: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getNotificationResourceManager(resourcemanagerhandle?.value?.toCPointer<ByteVar>(), transactionnotification?.value?.toCPointer<ByteVar>(), notificationlength, dwmilliseconds, returnlength?.value?.toCPointer<ByteVar>())

public actual fun getNotificationResourceManagerAsync(resourcemanagerhandle: Handle, transactionnotification: COpaquePointer?, transactionnotificationlength: UInt, returnlength: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getNotificationResourceManagerAsync(resourcemanagerhandle?.value?.toCPointer<ByteVar>(), transactionnotification?.value?.toCPointer<ByteVar>(), transactionnotificationlength, returnlength?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun getShortPathNameA(lpszlongpath: Pcstr, lpszshortpath: Pstr, cchbuffer: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getShortPathNameA(lpszlongpath?.value?.toCPointer<ByteVar>(), lpszshortpath?.value?.toCPointer<ByteVar>(), cchbuffer)

public actual fun getShortPathNameW(lpszlongpath: Pcwstr, lpszshortpath: Pwstr, cchbuffer: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getShortPathNameW(lpszlongpath?.value?.toCPointer<ByteVar>(), lpszshortpath?.value?.toCPointer<ByteVar>(), cchbuffer)

public actual fun getTapeParameters(hdevice: Handle, dwoperation: GetTapeDriveParametersOperation, lpdwsize: COpaquePointer?, lptapeinformation: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getTapeParameters(hdevice?.value?.toCPointer<ByteVar>(), dwoperation, lpdwsize?.value?.toCPointer<ByteVar>(), lptapeinformation?.value?.toCPointer<ByteVar>())

public actual fun getTapePosition(hdevice: Handle, dwpositiontype: TapePositionType, lpdwpartition: COpaquePointer?, lpdwoffsetlow: COpaquePointer?, lpdwoffsethigh: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getTapePosition(hdevice?.value?.toCPointer<ByteVar>(), dwpositiontype, lpdwpartition?.value?.toCPointer<ByteVar>(), lpdwoffsetlow?.value?.toCPointer<ByteVar>(), lpdwoffsethigh?.value?.toCPointer<ByteVar>())

public actual fun getTapeStatus(hdevice: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getTapeStatus(hdevice?.value?.toCPointer<ByteVar>())

public actual fun getTempFileNameA(lppathname: Pcstr, lpprefixstring: Pcstr, uunique: UInt, lptempfilename: Pstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getTempFileNameA(lppathname?.value?.toCPointer<ByteVar>(), lpprefixstring?.value?.toCPointer<ByteVar>(), uunique, lptempfilename?.value?.toCPointer<ByteVar>())

public actual fun getTempFileNameW(lppathname: Pcwstr, lpprefixstring: Pcwstr, uunique: UInt, lptempfilename: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getTempFileNameW(lppathname?.value?.toCPointer<ByteVar>(), lpprefixstring?.value?.toCPointer<ByteVar>(), uunique, lptempfilename?.value?.toCPointer<ByteVar>())

public actual fun getTempPath2A(bufferlength: UInt, buffer: Pstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getTempPath2A(bufferlength, buffer?.value?.toCPointer<ByteVar>())

public actual fun getTempPath2W(bufferlength: UInt, buffer: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getTempPath2W(bufferlength, buffer?.value?.toCPointer<ByteVar>())

public actual fun getTempPathA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getTempPathA(nbufferlength, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun getTempPathW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getTempPathW(nbufferlength, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun getTransactionId(transactionhandle: Handle, transactionid: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getTransactionId(transactionhandle?.value?.toCPointer<ByteVar>(), transactionid?.value?.toCPointer<ByteVar>())

public actual fun getTransactionInformation(transactionhandle: Handle, outcome: COpaquePointer?, isolationlevel: COpaquePointer?, isolationflags: COpaquePointer?, timeout: COpaquePointer?, bufferlength: UInt, description: Pwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getTransactionInformation(transactionhandle?.value?.toCPointer<ByteVar>(), outcome?.value?.toCPointer<ByteVar>(), isolationlevel?.value?.toCPointer<ByteVar>(), isolationflags?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>(), bufferlength, description?.value?.toCPointer<ByteVar>())

public actual fun getTransactionManagerId(transactionmanagerhandle: Handle, transactionmanagerid: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getTransactionManagerId(transactionmanagerhandle?.value?.toCPointer<ByteVar>(), transactionmanagerid?.value?.toCPointer<ByteVar>())

public actual fun getVolumeInformationA(lprootpathname: Pcstr, lpvolumenamebuffer: Pstr, nvolumenamesize: UInt, lpvolumeserialnumber: COpaquePointer?, lpmaximumcomponentlength: COpaquePointer?, lpfilesystemflags: COpaquePointer?, lpfilesystemnamebuffer: Pstr, nfilesystemnamesize: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getVolumeInformationA(lprootpathname?.value?.toCPointer<ByteVar>(), lpvolumenamebuffer?.value?.toCPointer<ByteVar>(), nvolumenamesize, lpvolumeserialnumber?.value?.toCPointer<ByteVar>(), lpmaximumcomponentlength?.value?.toCPointer<ByteVar>(), lpfilesystemflags?.value?.toCPointer<ByteVar>(), lpfilesystemnamebuffer?.value?.toCPointer<ByteVar>(), nfilesystemnamesize)

public actual fun getVolumeInformationByHandleW(hfile: Handle, lpvolumenamebuffer: Pwstr, nvolumenamesize: UInt, lpvolumeserialnumber: COpaquePointer?, lpmaximumcomponentlength: COpaquePointer?, lpfilesystemflags: COpaquePointer?, lpfilesystemnamebuffer: Pwstr, nfilesystemnamesize: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getVolumeInformationByHandleW(hfile?.value?.toCPointer<ByteVar>(), lpvolumenamebuffer?.value?.toCPointer<ByteVar>(), nvolumenamesize, lpvolumeserialnumber?.value?.toCPointer<ByteVar>(), lpmaximumcomponentlength?.value?.toCPointer<ByteVar>(), lpfilesystemflags?.value?.toCPointer<ByteVar>(), lpfilesystemnamebuffer?.value?.toCPointer<ByteVar>(), nfilesystemnamesize)

public actual fun getVolumeInformationW(lprootpathname: Pcwstr, lpvolumenamebuffer: Pwstr, nvolumenamesize: UInt, lpvolumeserialnumber: COpaquePointer?, lpmaximumcomponentlength: COpaquePointer?, lpfilesystemflags: COpaquePointer?, lpfilesystemnamebuffer: Pwstr, nfilesystemnamesize: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getVolumeInformationW(lprootpathname?.value?.toCPointer<ByteVar>(), lpvolumenamebuffer?.value?.toCPointer<ByteVar>(), nvolumenamesize, lpvolumeserialnumber?.value?.toCPointer<ByteVar>(), lpmaximumcomponentlength?.value?.toCPointer<ByteVar>(), lpfilesystemflags?.value?.toCPointer<ByteVar>(), lpfilesystemnamebuffer?.value?.toCPointer<ByteVar>(), nfilesystemnamesize)

public actual fun getVolumeNameForVolumeMountPointA(lpszvolumemountpoint: Pcstr, lpszvolumename: Pstr, cchbufferlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getVolumeNameForVolumeMountPointA(lpszvolumemountpoint?.value?.toCPointer<ByteVar>(), lpszvolumename?.value?.toCPointer<ByteVar>(), cchbufferlength)

public actual fun getVolumeNameForVolumeMountPointW(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getVolumeNameForVolumeMountPointW(lpszvolumemountpoint?.value?.toCPointer<ByteVar>(), lpszvolumename?.value?.toCPointer<ByteVar>(), cchbufferlength)

public actual fun getVolumePathNameA(lpszfilename: Pcstr, lpszvolumepathname: Pstr, cchbufferlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getVolumePathNameA(lpszfilename?.value?.toCPointer<ByteVar>(), lpszvolumepathname?.value?.toCPointer<ByteVar>(), cchbufferlength)

public actual fun getVolumePathNameW(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, cchbufferlength: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getVolumePathNameW(lpszfilename?.value?.toCPointer<ByteVar>(), lpszvolumepathname?.value?.toCPointer<ByteVar>(), cchbufferlength)

public actual fun getVolumePathNamesForVolumeNameA(lpszvolumename: Pcstr, lpszvolumepathnames: Pstr, cchbufferlength: UInt, lpcchreturnlength: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getVolumePathNamesForVolumeNameA(lpszvolumename?.value?.toCPointer<ByteVar>(), lpszvolumepathnames?.value?.toCPointer<ByteVar>(), cchbufferlength, lpcchreturnlength?.value?.toCPointer<ByteVar>())

public actual fun getVolumePathNamesForVolumeNameW(lpszvolumename: Pcwstr, lpszvolumepathnames: Pwstr, cchbufferlength: UInt, lpcchreturnlength: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_getVolumePathNamesForVolumeNameW(lpszvolumename?.value?.toCPointer<ByteVar>(), lpszvolumepathnames?.value?.toCPointer<ByteVar>(), cchbufferlength, lpcchreturnlength?.value?.toCPointer<ByteVar>())

public actual fun handleLogFull(hlog: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_handleLogFull(hlog?.value?.toCPointer<ByteVar>())

public actual fun installLogPolicy(hlog: Handle, ppolicy: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_installLogPolicy(hlog?.value?.toCPointer<ByteVar>(), ppolicy?.value?.toCPointer<ByteVar>())

public actual fun isIoRingOpSupported(ioring: Hioring, op: IoringOpCode): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_isIoRingOpSupported(ioring?.value?.toCPointer<ByteVar>(), op)

public actual fun lZClose(hfile: Int) {
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_lZClose(hfile)
}

public actual fun lZCopy(hfsource: Int, hfdest: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_lZCopy(hfsource, hfdest)

public actual fun lZDone() {
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_lZDone()
}

public actual fun lZInit(hfsource: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_lZInit(hfsource)

public actual fun lZOpenFileA(lpfilename: Pcstr, lpreopenbuf: COpaquePointer?, wstyle: LzopenfileStyle): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_lZOpenFileA(lpfilename?.value?.toCPointer<ByteVar>(), lpreopenbuf?.value?.toCPointer<ByteVar>(), wstyle)

public actual fun lZOpenFileW(lpfilename: Pcwstr, lpreopenbuf: COpaquePointer?, wstyle: LzopenfileStyle): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_lZOpenFileW(lpfilename?.value?.toCPointer<ByteVar>(), lpreopenbuf?.value?.toCPointer<ByteVar>(), wstyle)

public actual fun lZRead(hfile: Int, lpbuffer: Pstr, cbread: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_lZRead(hfile, lpbuffer?.value?.toCPointer<ByteVar>(), cbread)

public actual fun lZSeek(hfile: Int, loffset: Int, iorigin: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_lZSeek(hfile, loffset, iorigin)

public actual fun lZStart(): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_lZStart()

public actual fun localFileTimeToFileTime(lplocalfiletime: COpaquePointer?, lpfiletime: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_localFileTimeToFileTime(lplocalfiletime?.value?.toCPointer<ByteVar>(), lpfiletime?.value?.toCPointer<ByteVar>())

public actual fun lockFile(hfile: Handle, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_lockFile(hfile?.value?.toCPointer<ByteVar>(), dwfileoffsetlow, dwfileoffsethigh, nnumberofbytestolocklow, nnumberofbytestolockhigh)

public actual fun lockFileEx(hfile: Handle, dwflags: LockFileFlags, dwreserved: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt, lpoverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_lockFileEx(hfile?.value?.toCPointer<ByteVar>(), dwflags, dwreserved, nnumberofbytestolocklow, nnumberofbytestolockhigh, lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun logTailAdvanceFailure(hlog: Handle, dwreason: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_logTailAdvanceFailure(hlog?.value?.toCPointer<ByteVar>(), dwreason)

public actual fun lsnBlockOffset(plsn: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_lsnBlockOffset(plsn?.value?.toCPointer<ByteVar>())

public actual fun lsnContainer(plsn: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_lsnContainer(plsn?.value?.toCPointer<ByteVar>())

public actual fun lsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn =
    ClsLsn()

public actual fun lsnEqual(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_lsnEqual(plsn1?.value?.toCPointer<ByteVar>(), plsn2?.value?.toCPointer<ByteVar>())

public actual fun lsnGreater(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_lsnGreater(plsn1?.value?.toCPointer<ByteVar>(), plsn2?.value?.toCPointer<ByteVar>())

public actual fun lsnIncrement(plsn: COpaquePointer?): ClsLsn =
    ClsLsn()

public actual fun lsnInvalid(plsn: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_lsnInvalid(plsn?.value?.toCPointer<ByteVar>())

public actual fun lsnLess(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_lsnLess(plsn1?.value?.toCPointer<ByteVar>(), plsn2?.value?.toCPointer<ByteVar>())

public actual fun lsnNull(plsn: COpaquePointer?): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_lsnNull(plsn?.value?.toCPointer<ByteVar>())

public actual fun lsnRecordSequence(plsn: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_lsnRecordSequence(plsn?.value?.toCPointer<ByteVar>())

public actual fun moveFileA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_moveFileA(lpexistingfilename?.value?.toCPointer<ByteVar>(), lpnewfilename?.value?.toCPointer<ByteVar>())

public actual fun moveFileExA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, dwflags: MoveFileFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_moveFileExA(lpexistingfilename?.value?.toCPointer<ByteVar>(), lpnewfilename?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun moveFileExW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: MoveFileFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_moveFileExW(lpexistingfilename?.value?.toCPointer<ByteVar>(), lpnewfilename?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun moveFileFromAppW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_moveFileFromAppW(lpexistingfilename?.value?.toCPointer<ByteVar>(), lpnewfilename?.value?.toCPointer<ByteVar>())

public actual fun moveFileTransactedA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, dwflags: MoveFileFlags, htransaction: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_moveFileTransactedA(lpexistingfilename?.value?.toCPointer<ByteVar>(), lpnewfilename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), dwflags, htransaction?.value?.toCPointer<ByteVar>())

public actual fun moveFileTransactedW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, dwflags: MoveFileFlags, htransaction: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_moveFileTransactedW(lpexistingfilename?.value?.toCPointer<ByteVar>(), lpnewfilename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), dwflags, htransaction?.value?.toCPointer<ByteVar>())

public actual fun moveFileW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_moveFileW(lpexistingfilename?.value?.toCPointer<ByteVar>(), lpnewfilename?.value?.toCPointer<ByteVar>())

public actual fun moveFileWithProgressA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, dwflags: MoveFileFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_moveFileWithProgressA(lpexistingfilename?.value?.toCPointer<ByteVar>(), lpnewfilename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun moveFileWithProgressW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, dwflags: MoveFileFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_moveFileWithProgressW(lpexistingfilename?.value?.toCPointer<ByteVar>(), lpnewfilename?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpdata?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun netConnectionEnum(servername: Pcwstr, qualifier: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_netConnectionEnum(servername?.value?.toCPointer<ByteVar>(), qualifier?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumeHandle?.value?.toCPointer<ByteVar>())

public actual fun netFileClose(servername: Pcwstr, fileid: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_netFileClose(servername?.value?.toCPointer<ByteVar>(), fileid)

public actual fun netFileEnum(servername: Pcwstr, basepath: Pcwstr, username: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_netFileEnum(servername?.value?.toCPointer<ByteVar>(), basepath?.value?.toCPointer<ByteVar>(), username?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumeHandle?.value?.toCPointer<ByteVar>())

public actual fun netFileGetInfo(servername: Pcwstr, fileid: UInt, level: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_netFileGetInfo(servername?.value?.toCPointer<ByteVar>(), fileid, level, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netServerAliasAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_netServerAliasAdd(servername?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>())

public actual fun netServerAliasDel(servername: Pcwstr, level: UInt, buf: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_netServerAliasDel(servername?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>())

public actual fun netServerAliasEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_netServerAliasEnum(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumehandle?.value?.toCPointer<ByteVar>())

public actual fun netSessionDel(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_netSessionDel(servername?.value?.toCPointer<ByteVar>(), uncclientname?.value?.toCPointer<ByteVar>(), username?.value?.toCPointer<ByteVar>())

public actual fun netSessionEnum(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_netSessionEnum(servername?.value?.toCPointer<ByteVar>(), uncclientname?.value?.toCPointer<ByteVar>(), username?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumeHandle?.value?.toCPointer<ByteVar>())

public actual fun netSessionGetInfo(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_netSessionGetInfo(servername?.value?.toCPointer<ByteVar>(), uncclientname?.value?.toCPointer<ByteVar>(), username?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netShareAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_netShareAdd(servername?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), parmErr?.value?.toCPointer<ByteVar>())

public actual fun netShareCheck(servername: Pcwstr, device: Pcwstr, type: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_netShareCheck(servername?.value?.toCPointer<ByteVar>(), device?.value?.toCPointer<ByteVar>(), type?.value?.toCPointer<ByteVar>())

public actual fun netShareDel(servername: Pcwstr, netname: Pcwstr, reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_netShareDel(servername?.value?.toCPointer<ByteVar>(), netname?.value?.toCPointer<ByteVar>(), reserved)

public actual fun netShareDelEx(servername: Pcwstr, level: UInt, buf: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_netShareDelEx(servername?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>())

public actual fun netShareDelSticky(servername: Pcwstr, netname: Pcwstr, reserved: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_netShareDelSticky(servername?.value?.toCPointer<ByteVar>(), netname?.value?.toCPointer<ByteVar>(), reserved)

public actual fun netShareEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_netShareEnum(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumeHandle?.value?.toCPointer<ByteVar>())

public actual fun netShareEnumSticky(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_netShareEnumSticky(servername?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>(), prefmaxlen, entriesread?.value?.toCPointer<ByteVar>(), totalentries?.value?.toCPointer<ByteVar>(), resumeHandle?.value?.toCPointer<ByteVar>())

public actual fun netShareGetInfo(servername: Pcwstr, netname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_netShareGetInfo(servername?.value?.toCPointer<ByteVar>(), netname?.value?.toCPointer<ByteVar>(), level, bufptr?.value?.toCPointer<ByteVar>())

public actual fun netShareSetInfo(servername: Pcwstr, netname: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_netShareSetInfo(servername?.value?.toCPointer<ByteVar>(), netname?.value?.toCPointer<ByteVar>(), level, buf?.value?.toCPointer<ByteVar>(), parmErr?.value?.toCPointer<ByteVar>())

public actual fun netStatisticsGet(servername: COpaquePointer?, service: COpaquePointer?, level: UInt, options: UInt, buffer: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_netStatisticsGet(servername?.value?.toCPointer<ByteVar>(), service?.value?.toCPointer<ByteVar>(), level, options, buffer?.value?.toCPointer<ByteVar>())

public actual fun openEncryptedFileRawA(lpfilename: Pcstr, ulflags: UInt, pvcontext: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_openEncryptedFileRawA(lpfilename?.value?.toCPointer<ByteVar>(), ulflags, pvcontext?.value?.toCPointer<ByteVar>())

public actual fun openEncryptedFileRawW(lpfilename: Pcwstr, ulflags: UInt, pvcontext: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_openEncryptedFileRawW(lpfilename?.value?.toCPointer<ByteVar>(), ulflags, pvcontext?.value?.toCPointer<ByteVar>())

public actual fun openEnlistment(dwdesiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentid: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_openEnlistment(dwdesiredaccess, resourcemanagerhandle?.value?.toCPointer<ByteVar>(), enlistmentid?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openFile(lpfilename: Pcstr, lpreopenbuff: COpaquePointer?, ustyle: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_openFile(lpfilename?.value?.toCPointer<ByteVar>(), lpreopenbuff?.value?.toCPointer<ByteVar>(), ustyle)

public actual fun openFileById(hvolumehint: Handle, lpfileid: COpaquePointer?, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: COpaquePointer?, dwflagsandattributes: FileFlagsAndAttributes): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_openFileById(hvolumehint?.value?.toCPointer<ByteVar>(), lpfileid?.value?.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, lpsecurityattributes?.value?.toCPointer<ByteVar>(), dwflagsandattributes)?.let { COpaquePointer(it.toLong()) }

public actual fun openResourceManager(dwdesiredaccess: UInt, tmhandle: Handle, resourcemanagerid: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_openResourceManager(dwdesiredaccess, tmhandle?.value?.toCPointer<ByteVar>(), resourcemanagerid?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openTransaction(dwdesiredaccess: UInt, transactionid: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_openTransaction(dwdesiredaccess, transactionid?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openTransactionManager(logfilename: Pcwstr, desiredaccess: UInt, openoptions: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_openTransactionManager(logfilename?.value?.toCPointer<ByteVar>(), desiredaccess, openoptions)?.let { COpaquePointer(it.toLong()) }

public actual fun openTransactionManagerById(transactionmanagerid: COpaquePointer?, desiredaccess: UInt, openoptions: UInt): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_openTransactionManagerById(transactionmanagerid?.value?.toCPointer<ByteVar>(), desiredaccess, openoptions)?.let { COpaquePointer(it.toLong()) }

public actual fun popIoRingCompletion(ioring: Hioring, cqe: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_popIoRingCompletion(ioring?.value?.toCPointer<ByteVar>(), cqe?.value?.toCPointer<ByteVar>())

public actual fun prePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_prePrepareComplete(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun prePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_prePrepareEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun prepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_prepareComplete(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun prepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_prepareEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun prepareLogArchive(hlog: Handle, pszbaselogfilename: Pwstr, clen: UInt, plsnlow: COpaquePointer?, plsnhigh: COpaquePointer?, pcactuallength: COpaquePointer?, poffbaselogfiledata: COpaquePointer?, pcbbaselogfilelength: COpaquePointer?, plsnbase: COpaquePointer?, plsnlast: COpaquePointer?, plsncurrentarchivetail: COpaquePointer?, ppvarchivecontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_prepareLogArchive(hlog?.value?.toCPointer<ByteVar>(), pszbaselogfilename?.value?.toCPointer<ByteVar>(), clen, plsnlow?.value?.toCPointer<ByteVar>(), plsnhigh?.value?.toCPointer<ByteVar>(), pcactuallength?.value?.toCPointer<ByteVar>(), poffbaselogfiledata?.value?.toCPointer<ByteVar>(), pcbbaselogfilelength?.value?.toCPointer<ByteVar>(), plsnbase?.value?.toCPointer<ByteVar>(), plsnlast?.value?.toCPointer<ByteVar>(), plsncurrentarchivetail?.value?.toCPointer<ByteVar>(), ppvarchivecontext?.value?.toCPointer<ByteVar>())

public actual fun prepareTape(hdevice: Handle, dwoperation: PrepareTapeOperation, bimmediate: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_prepareTape(hdevice?.value?.toCPointer<ByteVar>(), dwoperation, bimmediate)

public actual fun queryDosDeviceA(lpdevicename: Pcstr, lptargetpath: Pstr, ucchmax: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_queryDosDeviceA(lpdevicename?.value?.toCPointer<ByteVar>(), lptargetpath?.value?.toCPointer<ByteVar>(), ucchmax)

public actual fun queryDosDeviceW(lpdevicename: Pcwstr, lptargetpath: Pwstr, ucchmax: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_queryDosDeviceW(lpdevicename?.value?.toCPointer<ByteVar>(), lptargetpath?.value?.toCPointer<ByteVar>(), ucchmax)

public actual fun queryIoRingCapabilities(capabilities: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_queryIoRingCapabilities(capabilities?.value?.toCPointer<ByteVar>())

public actual fun queryLogPolicy(hlog: Handle, epolicytype: ClfsMgmtPolicyType, ppolicybuffer: COpaquePointer?, pcbpolicybuffer: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_queryLogPolicy(hlog?.value?.toCPointer<ByteVar>(), epolicytype, ppolicybuffer?.value?.toCPointer<ByteVar>(), pcbpolicybuffer?.value?.toCPointer<ByteVar>())

public actual fun queryRecoveryAgentsOnEncryptedFile(lpfilename: Pcwstr, precoveryagents: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_queryRecoveryAgentsOnEncryptedFile(lpfilename?.value?.toCPointer<ByteVar>(), precoveryagents?.value?.toCPointer<ByteVar>())

public actual fun queryUsersOnEncryptedFile(lpfilename: Pcwstr, pusers: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_queryUsersOnEncryptedFile(lpfilename?.value?.toCPointer<ByteVar>(), pusers?.value?.toCPointer<ByteVar>())

public actual fun reOpenFile(horiginalfile: Handle, dwdesiredaccess: UInt, dwsharemode: FileShareMode, dwflagsandattributes: FileFlagsAndAttributes): Handle =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_reOpenFile(horiginalfile?.value?.toCPointer<ByteVar>(), dwdesiredaccess, dwsharemode, dwflagsandattributes)?.let { COpaquePointer(it.toLong()) }

public actual fun readDirectoryChangesExW(hdirectory: Handle, lpbuffer: COpaquePointer?, nbufferlength: UInt, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange, lpbytesreturned: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpoverlappedCompletionRoutine, readdirectorynotifyinformationclass: ReadDirectoryNotifyInformationClass): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_readDirectoryChangesExW(hdirectory?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nbufferlength, bwatchsubtree, dwnotifyfilter, lpbytesreturned?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), readdirectorynotifyinformationclass)

public actual fun readDirectoryChangesW(hdirectory: Handle, lpbuffer: COpaquePointer?, nbufferlength: UInt, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange, lpbytesreturned: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_readDirectoryChangesW(hdirectory?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nbufferlength, bwatchsubtree, dwnotifyfilter, lpbytesreturned?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun readEncryptedFileRaw(pfexportcallback: PfeExportFunc, pvcallbackcontext: COpaquePointer?, pvcontext: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_readEncryptedFileRaw(0L.toCPointer<ByteVar>(), pvcallbackcontext?.value?.toCPointer<ByteVar>(), pvcontext?.value?.toCPointer<ByteVar>())

public actual fun readFile(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, lpnumberofbytesread: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_readFile(hfile?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nnumberofbytestoread, lpnumberofbytesread?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun readFileEx(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_readFileEx(hfile?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nnumberofbytestoread, lpoverlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun readFileScatter(hfile: Handle, asegmentarray: COpaquePointer?, nnumberofbytestoread: UInt, lpreserved: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_readFileScatter(hfile?.value?.toCPointer<ByteVar>(), asegmentarray?.value?.toCPointer<ByteVar>(), nnumberofbytestoread, lpreserved?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun readLogArchiveMetadata(pvarchivecontext: COpaquePointer?, cboffset: UInt, cbbytestoread: UInt, pbreadbuffer: COpaquePointer?, pcbbytesread: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_readLogArchiveMetadata(pvarchivecontext?.value?.toCPointer<ByteVar>(), cboffset, cbbytestoread, pbreadbuffer?.value?.toCPointer<ByteVar>(), pcbbytesread?.value?.toCPointer<ByteVar>())

public actual fun readLogNotification(hlog: Handle, pnotification: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_readLogNotification(hlog?.value?.toCPointer<ByteVar>(), pnotification?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun readLogRecord(pvmarshal: COpaquePointer?, plsnfirst: COpaquePointer?, econtextmode: ClfsContextMode, ppvreadbuffer: COpaquePointer?, pcbreadbuffer: COpaquePointer?, perecordtype: COpaquePointer?, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, ppvreadcontext: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_readLogRecord(pvmarshal?.value?.toCPointer<ByteVar>(), plsnfirst?.value?.toCPointer<ByteVar>(), econtextmode, ppvreadbuffer?.value?.toCPointer<ByteVar>(), pcbreadbuffer?.value?.toCPointer<ByteVar>(), perecordtype?.value?.toCPointer<ByteVar>(), plsnundonext?.value?.toCPointer<ByteVar>(), plsnprevious?.value?.toCPointer<ByteVar>(), ppvreadcontext?.value?.toCPointer<ByteVar>(), poverlapped?.value?.toCPointer<ByteVar>())

public actual fun readLogRestartArea(pvmarshal: COpaquePointer?, ppvrestartbuffer: COpaquePointer?, pcbrestartbuffer: COpaquePointer?, plsn: COpaquePointer?, ppvcontext: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_readLogRestartArea(pvmarshal?.value?.toCPointer<ByteVar>(), ppvrestartbuffer?.value?.toCPointer<ByteVar>(), pcbrestartbuffer?.value?.toCPointer<ByteVar>(), plsn?.value?.toCPointer<ByteVar>(), ppvcontext?.value?.toCPointer<ByteVar>(), poverlapped?.value?.toCPointer<ByteVar>())

public actual fun readNextLogRecord(pvreadcontext: COpaquePointer?, ppvbuffer: COpaquePointer?, pcbbuffer: COpaquePointer?, perecordtype: COpaquePointer?, plsnuser: COpaquePointer?, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, plsnrecord: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_readNextLogRecord(pvreadcontext?.value?.toCPointer<ByteVar>(), ppvbuffer?.value?.toCPointer<ByteVar>(), pcbbuffer?.value?.toCPointer<ByteVar>(), perecordtype?.value?.toCPointer<ByteVar>(), plsnuser?.value?.toCPointer<ByteVar>(), plsnundonext?.value?.toCPointer<ByteVar>(), plsnprevious?.value?.toCPointer<ByteVar>(), plsnrecord?.value?.toCPointer<ByteVar>(), poverlapped?.value?.toCPointer<ByteVar>())

public actual fun readOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_readOnlyEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun readPreviousLogRestartArea(pvreadcontext: COpaquePointer?, ppvrestartbuffer: COpaquePointer?, pcbrestartbuffer: COpaquePointer?, plsnrestart: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_readPreviousLogRestartArea(pvreadcontext?.value?.toCPointer<ByteVar>(), ppvrestartbuffer?.value?.toCPointer<ByteVar>(), pcbrestartbuffer?.value?.toCPointer<ByteVar>(), plsnrestart?.value?.toCPointer<ByteVar>(), poverlapped?.value?.toCPointer<ByteVar>())

public actual fun recoverEnlistment(enlistmenthandle: Handle, enlistmentkey: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_recoverEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), enlistmentkey?.value?.toCPointer<ByteVar>())

public actual fun recoverResourceManager(resourcemanagerhandle: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_recoverResourceManager(resourcemanagerhandle?.value?.toCPointer<ByteVar>())

public actual fun recoverTransactionManager(transactionmanagerhandle: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_recoverTransactionManager(transactionmanagerhandle?.value?.toCPointer<ByteVar>())

public actual fun registerForLogWriteNotification(hlog: Handle, cbthreshold: UInt, fenable: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_registerForLogWriteNotification(hlog?.value?.toCPointer<ByteVar>(), cbthreshold, fenable)

public actual fun registerManageableLogClient(hlog: Handle, pcallbacks: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_registerManageableLogClient(hlog?.value?.toCPointer<ByteVar>(), pcallbacks?.value?.toCPointer<ByteVar>())

public actual fun removeDirectoryA(lppathname: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_removeDirectoryA(lppathname?.value?.toCPointer<ByteVar>())

public actual fun removeDirectoryFromAppW(lppathname: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_removeDirectoryFromAppW(lppathname?.value?.toCPointer<ByteVar>())

public actual fun removeDirectoryTransactedA(lppathname: Pcstr, htransaction: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_removeDirectoryTransactedA(lppathname?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>())

public actual fun removeDirectoryTransactedW(lppathname: Pcwstr, htransaction: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_removeDirectoryTransactedW(lppathname?.value?.toCPointer<ByteVar>(), htransaction?.value?.toCPointer<ByteVar>())

public actual fun removeDirectoryW(lppathname: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_removeDirectoryW(lppathname?.value?.toCPointer<ByteVar>())

public actual fun removeLogContainer(hlog: Handle, pwszcontainerpath: Pcwstr, fforce: Bool, preserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_removeLogContainer(hlog?.value?.toCPointer<ByteVar>(), pwszcontainerpath?.value?.toCPointer<ByteVar>(), fforce, preserved?.value?.toCPointer<ByteVar>())

public actual fun removeLogContainerSet(hlog: Handle, ccontainer: UShort, rgwszcontainerpath: COpaquePointer?, fforce: Bool, preserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_removeLogContainerSet(hlog?.value?.toCPointer<ByteVar>(), ccontainer, rgwszcontainerpath?.value?.toCPointer<ByteVar>(), fforce, preserved?.value?.toCPointer<ByteVar>())

public actual fun removeLogPolicy(hlog: Handle, epolicytype: ClfsMgmtPolicyType): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_removeLogPolicy(hlog?.value?.toCPointer<ByteVar>(), epolicytype)

public actual fun removeUsersFromEncryptedFile(lpfilename: Pcwstr, phashes: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_removeUsersFromEncryptedFile(lpfilename?.value?.toCPointer<ByteVar>(), phashes?.value?.toCPointer<ByteVar>())

public actual fun renameTransactionManager(logfilename: Pcwstr, existingtransactionmanagerguid: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_renameTransactionManager(logfilename?.value?.toCPointer<ByteVar>(), existingtransactionmanagerguid?.value?.toCPointer<ByteVar>())

public actual fun replaceFileA(lpreplacedfilename: Pcstr, lpreplacementfilename: Pcstr, lpbackupfilename: Pcstr, dwreplaceflags: ReplaceFileFlags, lpexclude: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_replaceFileA(lpreplacedfilename?.value?.toCPointer<ByteVar>(), lpreplacementfilename?.value?.toCPointer<ByteVar>(), lpbackupfilename?.value?.toCPointer<ByteVar>(), dwreplaceflags, lpexclude?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())

public actual fun replaceFileFromAppW(lpreplacedfilename: Pcwstr, lpreplacementfilename: Pcwstr, lpbackupfilename: Pcwstr, dwreplaceflags: UInt, lpexclude: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_replaceFileFromAppW(lpreplacedfilename?.value?.toCPointer<ByteVar>(), lpreplacementfilename?.value?.toCPointer<ByteVar>(), lpbackupfilename?.value?.toCPointer<ByteVar>(), dwreplaceflags, lpexclude?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())

public actual fun replaceFileW(lpreplacedfilename: Pcwstr, lpreplacementfilename: Pcwstr, lpbackupfilename: Pcwstr, dwreplaceflags: ReplaceFileFlags, lpexclude: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_replaceFileW(lpreplacedfilename?.value?.toCPointer<ByteVar>(), lpreplacementfilename?.value?.toCPointer<ByteVar>(), lpbackupfilename?.value?.toCPointer<ByteVar>(), dwreplaceflags, lpexclude?.value?.toCPointer<ByteVar>(), lpreserved?.value?.toCPointer<ByteVar>())

public actual fun reserveAndAppendLog(pvmarshal: COpaquePointer?, rgwriteentries: COpaquePointer?, cwriteentries: UInt, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, creserverecords: UInt, rgcbreservation: COpaquePointer?, fflags: ClfsFlag, plsn: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_reserveAndAppendLog(pvmarshal?.value?.toCPointer<ByteVar>(), rgwriteentries?.value?.toCPointer<ByteVar>(), cwriteentries, plsnundonext?.value?.toCPointer<ByteVar>(), plsnprevious?.value?.toCPointer<ByteVar>(), creserverecords, rgcbreservation?.value?.toCPointer<ByteVar>(), fflags, plsn?.value?.toCPointer<ByteVar>(), poverlapped?.value?.toCPointer<ByteVar>())

public actual fun reserveAndAppendLogAligned(pvmarshal: COpaquePointer?, rgwriteentries: COpaquePointer?, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, creserverecords: UInt, rgcbreservation: COpaquePointer?, fflags: ClfsFlag, plsn: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_reserveAndAppendLogAligned(pvmarshal?.value?.toCPointer<ByteVar>(), rgwriteentries?.value?.toCPointer<ByteVar>(), cwriteentries, cbentryalignment, plsnundonext?.value?.toCPointer<ByteVar>(), plsnprevious?.value?.toCPointer<ByteVar>(), creserverecords, rgcbreservation?.value?.toCPointer<ByteVar>(), fflags, plsn?.value?.toCPointer<ByteVar>(), poverlapped?.value?.toCPointer<ByteVar>())

public actual fun rollbackComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_rollbackComplete(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun rollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_rollbackEnlistment(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun rollbackTransaction(transactionhandle: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_rollbackTransaction(transactionhandle?.value?.toCPointer<ByteVar>())

public actual fun rollbackTransactionAsync(transactionhandle: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_rollbackTransactionAsync(transactionhandle?.value?.toCPointer<ByteVar>())

public actual fun rollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_rollforwardTransactionManager(transactionmanagerhandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun scanLogContainers(pcxscan: COpaquePointer?, escanmode: UByte, preserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_scanLogContainers(pcxscan?.value?.toCPointer<ByteVar>(), escanmode, preserved?.value?.toCPointer<ByteVar>())

public actual fun searchPathA(lppath: Pcstr, lpfilename: Pcstr, lpextension: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_searchPathA(lppath?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), lpextension?.value?.toCPointer<ByteVar>(), nbufferlength, lpbuffer?.value?.toCPointer<ByteVar>(), lpfilepart?.value?.toCPointer<ByteVar>())

public actual fun searchPathW(lppath: Pcwstr, lpfilename: Pcwstr, lpextension: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_searchPathW(lppath?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), lpextension?.value?.toCPointer<ByteVar>(), nbufferlength, lpbuffer?.value?.toCPointer<ByteVar>(), lpfilepart?.value?.toCPointer<ByteVar>())

public actual fun setEncryptedFileMetadata(lpfilename: Pcwstr, pboldmetadata: COpaquePointer?, pbnewmetadata: COpaquePointer?, pownerhash: COpaquePointer?, dwoperation: UInt, pcertificatesadded: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setEncryptedFileMetadata(lpfilename?.value?.toCPointer<ByteVar>(), pboldmetadata?.value?.toCPointer<ByteVar>(), pbnewmetadata?.value?.toCPointer<ByteVar>(), pownerhash?.value?.toCPointer<ByteVar>(), dwoperation, pcertificatesadded?.value?.toCPointer<ByteVar>())

public actual fun setEndOfFile(hfile: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setEndOfFile(hfile?.value?.toCPointer<ByteVar>())

public actual fun setEndOfLog(hlog: Handle, plsnend: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setEndOfLog(hlog?.value?.toCPointer<ByteVar>(), plsnend?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun setEnlistmentRecoveryInformation(enlistmenthandle: Handle, buffersize: UInt, buffer: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setEnlistmentRecoveryInformation(enlistmenthandle?.value?.toCPointer<ByteVar>(), buffersize, buffer?.value?.toCPointer<ByteVar>())

public actual fun setFileApisToANSI() {
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setFileApisToANSI()
}

public actual fun setFileApisToOEM() {
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setFileApisToOEM()
}

public actual fun setFileAttributesA(lpfilename: Pcstr, dwfileattributes: FileFlagsAndAttributes): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setFileAttributesA(lpfilename?.value?.toCPointer<ByteVar>(), dwfileattributes)

public actual fun setFileAttributesFromAppW(lpfilename: Pcwstr, dwfileattributes: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setFileAttributesFromAppW(lpfilename?.value?.toCPointer<ByteVar>(), dwfileattributes)

public actual fun setFileAttributesTransactedA(lpfilename: Pcstr, dwfileattributes: UInt, htransaction: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setFileAttributesTransactedA(lpfilename?.value?.toCPointer<ByteVar>(), dwfileattributes, htransaction?.value?.toCPointer<ByteVar>())

public actual fun setFileAttributesTransactedW(lpfilename: Pcwstr, dwfileattributes: UInt, htransaction: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setFileAttributesTransactedW(lpfilename?.value?.toCPointer<ByteVar>(), dwfileattributes, htransaction?.value?.toCPointer<ByteVar>())

public actual fun setFileAttributesW(lpfilename: Pcwstr, dwfileattributes: FileFlagsAndAttributes): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setFileAttributesW(lpfilename?.value?.toCPointer<ByteVar>(), dwfileattributes)

public actual fun setFileBandwidthReservation(hfile: Handle, nperiodmilliseconds: UInt, nbytesperperiod: UInt, bdiscardable: Bool, lptransfersize: COpaquePointer?, lpnumoutstandingrequests: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setFileBandwidthReservation(hfile?.value?.toCPointer<ByteVar>(), nperiodmilliseconds, nbytesperperiod, bdiscardable, lptransfersize?.value?.toCPointer<ByteVar>(), lpnumoutstandingrequests?.value?.toCPointer<ByteVar>())

public actual fun setFileCompletionNotificationModes(filehandle: Handle, flags: UByte): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setFileCompletionNotificationModes(filehandle?.value?.toCPointer<ByteVar>(), flags)

public actual fun setFileInformationByHandle(hfile: Handle, fileinformationclass: FileInfoByHandleClass, lpfileinformation: COpaquePointer?, dwbuffersize: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setFileInformationByHandle(hfile?.value?.toCPointer<ByteVar>(), fileinformationclass, lpfileinformation?.value?.toCPointer<ByteVar>(), dwbuffersize)

public actual fun setFileIoOverlappedRange(filehandle: Handle, overlappedrangestart: COpaquePointer?, length: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setFileIoOverlappedRange(filehandle?.value?.toCPointer<ByteVar>(), overlappedrangestart?.value?.toCPointer<ByteVar>(), length)

public actual fun setFilePointer(hfile: Handle, ldistancetomove: Int, lpdistancetomovehigh: COpaquePointer?, dwmovemethod: SetFilePointerMoveMethod): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setFilePointer(hfile?.value?.toCPointer<ByteVar>(), ldistancetomove, lpdistancetomovehigh?.value?.toCPointer<ByteVar>(), dwmovemethod)

public actual fun setFilePointerEx(hfile: Handle, lidistancetomove: Long, lpnewfilepointer: COpaquePointer?, dwmovemethod: SetFilePointerMoveMethod): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setFilePointerEx(hfile?.value?.toCPointer<ByteVar>(), lidistancetomove, lpnewfilepointer?.value?.toCPointer<ByteVar>(), dwmovemethod)

public actual fun setFileShortNameA(hfile: Handle, lpshortname: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setFileShortNameA(hfile?.value?.toCPointer<ByteVar>(), lpshortname?.value?.toCPointer<ByteVar>())

public actual fun setFileShortNameW(hfile: Handle, lpshortname: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setFileShortNameW(hfile?.value?.toCPointer<ByteVar>(), lpshortname?.value?.toCPointer<ByteVar>())

public actual fun setFileTime(hfile: Handle, lpcreationtime: COpaquePointer?, lplastaccesstime: COpaquePointer?, lplastwritetime: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setFileTime(hfile?.value?.toCPointer<ByteVar>(), lpcreationtime?.value?.toCPointer<ByteVar>(), lplastaccesstime?.value?.toCPointer<ByteVar>(), lplastwritetime?.value?.toCPointer<ByteVar>())

public actual fun setFileValidData(hfile: Handle, validdatalength: Long): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setFileValidData(hfile?.value?.toCPointer<ByteVar>(), validdatalength)

public actual fun setIoRingCompletionEvent(ioring: Hioring, hevent: Handle): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setIoRingCompletionEvent(ioring?.value?.toCPointer<ByteVar>(), hevent?.value?.toCPointer<ByteVar>())

public actual fun setLogArchiveMode(hlog: Handle, emode: ClfsLogArchiveMode): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setLogArchiveMode(hlog?.value?.toCPointer<ByteVar>(), emode)

public actual fun setLogArchiveTail(hlog: Handle, plsnarchivetail: COpaquePointer?, preserved: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setLogArchiveTail(hlog?.value?.toCPointer<ByteVar>(), plsnarchivetail?.value?.toCPointer<ByteVar>(), preserved?.value?.toCPointer<ByteVar>())

public actual fun setLogFileSizeWithPolicy(hlog: Handle, pdesiredsize: COpaquePointer?, presultingsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setLogFileSizeWithPolicy(hlog?.value?.toCPointer<ByteVar>(), pdesiredsize?.value?.toCPointer<ByteVar>(), presultingsize?.value?.toCPointer<ByteVar>())

public actual fun setResourceManagerCompletionPort(resourcemanagerhandle: Handle, iocompletionporthandle: Handle, completionkey: ULong): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setResourceManagerCompletionPort(resourcemanagerhandle?.value?.toCPointer<ByteVar>(), iocompletionporthandle?.value?.toCPointer<ByteVar>(), completionkey)

public actual fun setSearchPathMode(flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setSearchPathMode(flags)

public actual fun setTapeParameters(hdevice: Handle, dwoperation: TapeInformationType, lptapeinformation: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setTapeParameters(hdevice?.value?.toCPointer<ByteVar>(), dwoperation, lptapeinformation?.value?.toCPointer<ByteVar>())

public actual fun setTapePosition(hdevice: Handle, dwpositionmethod: TapePositionMethod, dwpartition: UInt, dwoffsetlow: UInt, dwoffsethigh: UInt, bimmediate: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setTapePosition(hdevice?.value?.toCPointer<ByteVar>(), dwpositionmethod, dwpartition, dwoffsetlow, dwoffsethigh, bimmediate)

public actual fun setTransactionInformation(transactionhandle: Handle, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setTransactionInformation(transactionhandle?.value?.toCPointer<ByteVar>(), isolationlevel, isolationflags, timeout, description?.value?.toCPointer<ByteVar>())

public actual fun setUserFileEncryptionKey(pencryptioncertificate: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setUserFileEncryptionKey(pencryptioncertificate?.value?.toCPointer<ByteVar>())

public actual fun setUserFileEncryptionKeyEx(pencryptioncertificate: COpaquePointer?, dwcapabilities: UInt, dwflags: UInt, pvreserved: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setUserFileEncryptionKeyEx(pencryptioncertificate?.value?.toCPointer<ByteVar>(), dwcapabilities, dwflags, pvreserved?.value?.toCPointer<ByteVar>())

public actual fun setVolumeLabelA(lprootpathname: Pcstr, lpvolumename: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setVolumeLabelA(lprootpathname?.value?.toCPointer<ByteVar>(), lpvolumename?.value?.toCPointer<ByteVar>())

public actual fun setVolumeLabelW(lprootpathname: Pcwstr, lpvolumename: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setVolumeLabelW(lprootpathname?.value?.toCPointer<ByteVar>(), lpvolumename?.value?.toCPointer<ByteVar>())

public actual fun setVolumeMountPointA(lpszvolumemountpoint: Pcstr, lpszvolumename: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setVolumeMountPointA(lpszvolumemountpoint?.value?.toCPointer<ByteVar>(), lpszvolumename?.value?.toCPointer<ByteVar>())

public actual fun setVolumeMountPointW(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_setVolumeMountPointW(lpszvolumemountpoint?.value?.toCPointer<ByteVar>(), lpszvolumename?.value?.toCPointer<ByteVar>())

public actual fun singlePhaseReject(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_singlePhaseReject(enlistmenthandle?.value?.toCPointer<ByteVar>(), tmvirtualclock?.value?.toCPointer<ByteVar>())

public actual fun submitIoRing(ioring: Hioring, waitoperations: UInt, milliseconds: UInt, submittedentries: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_submitIoRing(ioring?.value?.toCPointer<ByteVar>(), waitoperations, milliseconds, submittedentries?.value?.toCPointer<ByteVar>())

public actual fun terminateLogArchive(pvarchivecontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_terminateLogArchive(pvarchivecontext?.value?.toCPointer<ByteVar>())

public actual fun terminateReadLog(pvcursorcontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_terminateReadLog(pvcursorcontext?.value?.toCPointer<ByteVar>())

public actual fun truncateLog(pvmarshal: COpaquePointer?, plsnend: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_truncateLog(pvmarshal?.value?.toCPointer<ByteVar>(), plsnend?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun txfGetThreadMiniVersionForCreate(miniversion: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_txfGetThreadMiniVersionForCreate(miniversion?.value?.toCPointer<ByteVar>())
}

public actual fun txfLogCreateFileReadContext(logpath: Pcwstr, beginninglsn: ClsLsn, endinglsn: ClsLsn, txffileid: COpaquePointer?, txflogcontext: COpaquePointer?): Bool =
    0

public actual fun txfLogCreateRangeReadContext(logpath: Pcwstr, beginninglsn: ClsLsn, endinglsn: ClsLsn, beginningvirtualclock: COpaquePointer?, endingvirtualclock: COpaquePointer?, recordtypemask: UInt, txflogcontext: COpaquePointer?): Bool =
    0

public actual fun txfLogDestroyReadContext(txflogcontext: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_txfLogDestroyReadContext(txflogcontext?.value?.toCPointer<ByteVar>())

public actual fun txfLogReadRecords(txflogcontext: COpaquePointer?, bufferlength: UInt, buffer: COpaquePointer?, bytesused: COpaquePointer?, recordcount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_txfLogReadRecords(txflogcontext?.value?.toCPointer<ByteVar>(), bufferlength, buffer?.value?.toCPointer<ByteVar>(), bytesused?.value?.toCPointer<ByteVar>(), recordcount?.value?.toCPointer<ByteVar>())

public actual fun txfLogRecordGetFileName(recordbuffer: COpaquePointer?, recordbufferlengthinbytes: UInt, namebuffer: Pwstr, namebufferlengthinbytes: COpaquePointer?, txfid: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_txfLogRecordGetFileName(recordbuffer?.value?.toCPointer<ByteVar>(), recordbufferlengthinbytes, namebuffer?.value?.toCPointer<ByteVar>(), namebufferlengthinbytes?.value?.toCPointer<ByteVar>(), txfid?.value?.toCPointer<ByteVar>())

public actual fun txfLogRecordGetGenericType(recordbuffer: COpaquePointer?, recordbufferlengthinbytes: UInt, generictype: COpaquePointer?, virtualclock: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_txfLogRecordGetGenericType(recordbuffer?.value?.toCPointer<ByteVar>(), recordbufferlengthinbytes, generictype?.value?.toCPointer<ByteVar>(), virtualclock?.value?.toCPointer<ByteVar>())

public actual fun txfReadMetadataInfo(filehandle: Handle, txffileid: COpaquePointer?, lastlsn: COpaquePointer?, transactionstate: COpaquePointer?, lockingtransaction: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_txfReadMetadataInfo(filehandle?.value?.toCPointer<ByteVar>(), txffileid?.value?.toCPointer<ByteVar>(), lastlsn?.value?.toCPointer<ByteVar>(), transactionstate?.value?.toCPointer<ByteVar>(), lockingtransaction?.value?.toCPointer<ByteVar>())

public actual fun txfSetThreadMiniVersionForCreate(miniversion: UShort) {
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_txfSetThreadMiniVersionForCreate(miniversion)
}

public actual fun unlockFile(hfile: Handle, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_unlockFile(hfile?.value?.toCPointer<ByteVar>(), dwfileoffsetlow, dwfileoffsethigh, nnumberofbytestounlocklow, nnumberofbytestounlockhigh)

public actual fun unlockFileEx(hfile: Handle, dwreserved: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt, lpoverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_unlockFileEx(hfile?.value?.toCPointer<ByteVar>(), dwreserved, nnumberofbytestounlocklow, nnumberofbytestounlockhigh, lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun validateLog(pszlogfilename: Pcwstr, psalogfile: COpaquePointer?, pinfobuffer: COpaquePointer?, pcbbuffer: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_validateLog(pszlogfilename?.value?.toCPointer<ByteVar>(), psalogfile?.value?.toCPointer<ByteVar>(), pinfobuffer?.value?.toCPointer<ByteVar>(), pcbbuffer?.value?.toCPointer<ByteVar>())

public actual fun verFindFileA(uflags: VerFindFileFlags, szfilename: Pcstr, szwindir: Pcstr, szappdir: Pcstr, szcurdir: Pstr, pucurdirlen: COpaquePointer?, szdestdir: Pstr, pudestdirlen: COpaquePointer?): VerFindFileStatus =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_verFindFileA(uflags, szfilename?.value?.toCPointer<ByteVar>(), szwindir?.value?.toCPointer<ByteVar>(), szappdir?.value?.toCPointer<ByteVar>(), szcurdir?.value?.toCPointer<ByteVar>(), pucurdirlen?.value?.toCPointer<ByteVar>(), szdestdir?.value?.toCPointer<ByteVar>(), pudestdirlen?.value?.toCPointer<ByteVar>())

public actual fun verFindFileW(uflags: VerFindFileFlags, szfilename: Pcwstr, szwindir: Pcwstr, szappdir: Pcwstr, szcurdir: Pwstr, pucurdirlen: COpaquePointer?, szdestdir: Pwstr, pudestdirlen: COpaquePointer?): VerFindFileStatus =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_verFindFileW(uflags, szfilename?.value?.toCPointer<ByteVar>(), szwindir?.value?.toCPointer<ByteVar>(), szappdir?.value?.toCPointer<ByteVar>(), szcurdir?.value?.toCPointer<ByteVar>(), pucurdirlen?.value?.toCPointer<ByteVar>(), szdestdir?.value?.toCPointer<ByteVar>(), pudestdirlen?.value?.toCPointer<ByteVar>())

public actual fun verInstallFileA(uflags: VerInstallFileFlags, szsrcfilename: Pcstr, szdestfilename: Pcstr, szsrcdir: Pcstr, szdestdir: Pcstr, szcurdir: Pcstr, sztmpfile: Pstr, putmpfilelen: COpaquePointer?): VerInstallFileStatus =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_verInstallFileA(uflags, szsrcfilename?.value?.toCPointer<ByteVar>(), szdestfilename?.value?.toCPointer<ByteVar>(), szsrcdir?.value?.toCPointer<ByteVar>(), szdestdir?.value?.toCPointer<ByteVar>(), szcurdir?.value?.toCPointer<ByteVar>(), sztmpfile?.value?.toCPointer<ByteVar>(), putmpfilelen?.value?.toCPointer<ByteVar>())

public actual fun verInstallFileW(uflags: VerInstallFileFlags, szsrcfilename: Pcwstr, szdestfilename: Pcwstr, szsrcdir: Pcwstr, szdestdir: Pcwstr, szcurdir: Pcwstr, sztmpfile: Pwstr, putmpfilelen: COpaquePointer?): VerInstallFileStatus =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_verInstallFileW(uflags, szsrcfilename?.value?.toCPointer<ByteVar>(), szdestfilename?.value?.toCPointer<ByteVar>(), szsrcdir?.value?.toCPointer<ByteVar>(), szdestdir?.value?.toCPointer<ByteVar>(), szcurdir?.value?.toCPointer<ByteVar>(), sztmpfile?.value?.toCPointer<ByteVar>(), putmpfilelen?.value?.toCPointer<ByteVar>())

public actual fun verLanguageNameA(wlang: UInt, szlang: Pstr, cchlang: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_verLanguageNameA(wlang, szlang?.value?.toCPointer<ByteVar>(), cchlang)

public actual fun verLanguageNameW(wlang: UInt, szlang: Pwstr, cchlang: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_verLanguageNameW(wlang, szlang?.value?.toCPointer<ByteVar>(), cchlang)

public actual fun verQueryValueA(pblock: COpaquePointer?, lpsubblock: Pcstr, lplpbuffer: COpaquePointer?, pulen: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_verQueryValueA(pblock?.value?.toCPointer<ByteVar>(), lpsubblock?.value?.toCPointer<ByteVar>(), lplpbuffer?.value?.toCPointer<ByteVar>(), pulen?.value?.toCPointer<ByteVar>())

public actual fun verQueryValueW(pblock: COpaquePointer?, lpsubblock: Pcwstr, lplpbuffer: COpaquePointer?, pulen: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_verQueryValueW(pblock?.value?.toCPointer<ByteVar>(), lpsubblock?.value?.toCPointer<ByteVar>(), lplpbuffer?.value?.toCPointer<ByteVar>(), pulen?.value?.toCPointer<ByteVar>())

public actual fun wofEnumEntries(volumename: Pcwstr, provider: UInt, enumproc: WofEnumEntryProc, userdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_wofEnumEntries(volumename?.value?.toCPointer<ByteVar>(), provider, 0L.toCPointer<ByteVar>(), userdata?.value?.toCPointer<ByteVar>())

public actual fun wofFileEnumFiles(volumename: Pcwstr, algorithm: UInt, enumproc: WofEnumFilesProc, userdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_wofFileEnumFiles(volumename?.value?.toCPointer<ByteVar>(), algorithm, 0L.toCPointer<ByteVar>(), userdata?.value?.toCPointer<ByteVar>())

public actual fun wofGetDriverVersion(fileorvolumehandle: Handle, provider: UInt, wofversion: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_wofGetDriverVersion(fileorvolumehandle?.value?.toCPointer<ByteVar>(), provider, wofversion?.value?.toCPointer<ByteVar>())

public actual fun wofIsExternalFile(filepath: Pcwstr, isexternalfile: COpaquePointer?, provider: COpaquePointer?, externalfileinfo: COpaquePointer?, bufferlength: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_wofIsExternalFile(filepath?.value?.toCPointer<ByteVar>(), isexternalfile?.value?.toCPointer<ByteVar>(), provider?.value?.toCPointer<ByteVar>(), externalfileinfo?.value?.toCPointer<ByteVar>(), bufferlength?.value?.toCPointer<ByteVar>())

public actual fun wofSetFileDataLocation(filehandle: Handle, provider: UInt, externalfileinfo: COpaquePointer?, length: UInt): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_wofSetFileDataLocation(filehandle?.value?.toCPointer<ByteVar>(), provider, externalfileinfo?.value?.toCPointer<ByteVar>(), length)

public actual fun wofShouldCompressBinaries(volume: Pcwstr, algorithm: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_wofShouldCompressBinaries(volume?.value?.toCPointer<ByteVar>(), algorithm?.value?.toCPointer<ByteVar>())

public actual fun wofWimAddEntry(volumename: Pcwstr, wimpath: Pcwstr, wimtype: UInt, wimindex: UInt, datasourceid: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_wofWimAddEntry(volumename?.value?.toCPointer<ByteVar>(), wimpath?.value?.toCPointer<ByteVar>(), wimtype, wimindex, datasourceid?.value?.toCPointer<ByteVar>())

public actual fun wofWimEnumFiles(volumename: Pcwstr, datasourceid: Long, enumproc: WofEnumFilesProc, userdata: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_wofWimEnumFiles(volumename?.value?.toCPointer<ByteVar>(), datasourceid, 0L.toCPointer<ByteVar>(), userdata?.value?.toCPointer<ByteVar>())

public actual fun wofWimRemoveEntry(volumename: Pcwstr, datasourceid: Long): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_wofWimRemoveEntry(volumename?.value?.toCPointer<ByteVar>(), datasourceid)

public actual fun wofWimSuspendEntry(volumename: Pcwstr, datasourceid: Long): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_wofWimSuspendEntry(volumename?.value?.toCPointer<ByteVar>(), datasourceid)

public actual fun wofWimUpdateEntry(volumename: Pcwstr, datasourceid: Long, newwimpath: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_wofWimUpdateEntry(volumename?.value?.toCPointer<ByteVar>(), datasourceid, newwimpath?.value?.toCPointer<ByteVar>())

public actual fun wow64DisableWow64FsRedirection(oldvalue: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_wow64DisableWow64FsRedirection(oldvalue?.value?.toCPointer<ByteVar>())

public actual fun wow64EnableWow64FsRedirection(wow64fsenableredirection: Boolean): Boolean =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_wow64EnableWow64FsRedirection(wow64fsenableredirection)

public actual fun wow64RevertWow64FsRedirection(olvalue: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_wow64RevertWow64FsRedirection(olvalue?.value?.toCPointer<ByteVar>())

public actual fun writeEncryptedFileRaw(pfimportcallback: PfeImportFunc, pvcallbackcontext: COpaquePointer?, pvcontext: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_writeEncryptedFileRaw(0L.toCPointer<ByteVar>(), pvcallbackcontext?.value?.toCPointer<ByteVar>(), pvcontext?.value?.toCPointer<ByteVar>())

public actual fun writeFile(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_writeFile(hfile?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nnumberofbytestowrite, lpnumberofbyteswritten?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun writeFileEx(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestowrite: UInt, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_writeFileEx(hfile?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), nnumberofbytestowrite, lpoverlapped?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun writeFileGather(hfile: Handle, asegmentarray: COpaquePointer?, nnumberofbytestowrite: UInt, lpreserved: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_writeFileGather(hfile?.value?.toCPointer<ByteVar>(), asegmentarray?.value?.toCPointer<ByteVar>(), nnumberofbytestowrite, lpreserved?.value?.toCPointer<ByteVar>(), lpoverlapped?.value?.toCPointer<ByteVar>())

public actual fun writeLogRestartArea(pvmarshal: COpaquePointer?, pvrestartbuffer: COpaquePointer?, cbrestartbuffer: UInt, plsnbase: COpaquePointer?, fflags: ClfsFlag, pcbwritten: COpaquePointer?, plsnnext: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_writeLogRestartArea(pvmarshal?.value?.toCPointer<ByteVar>(), pvrestartbuffer?.value?.toCPointer<ByteVar>(), cbrestartbuffer, plsnbase?.value?.toCPointer<ByteVar>(), fflags, pcbwritten?.value?.toCPointer<ByteVar>(), plsnnext?.value?.toCPointer<ByteVar>(), poverlapped?.value?.toCPointer<ByteVar>())

public actual fun writeTapemark(hdevice: Handle, dwtapemarktype: TapemarkType, dwtapemarkcount: UInt, bimmediate: Bool): UInt =
    io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.cinterop.windowssys_windows_win32_storage_filesystem_writeTapemark(hdevice?.value?.toCPointer<ByteVar>(), dwtapemarktype, dwtapemarkcount, bimmediate)
