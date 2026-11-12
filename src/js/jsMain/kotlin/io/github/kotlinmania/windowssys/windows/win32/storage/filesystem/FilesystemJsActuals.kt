@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.io.LpoverlappedCompletionRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

private val windowsWin32StorageFilesystemNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun addLogContainer(hlog: Handle, pcbcontainer: ConstPtr<ULong>, pwszcontainerpath: Pcwstr, preserved: MutPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemAddLogContainer(hlog.rawAddress.toString(), pcbcontainer.rawAddress.toString(), pwszcontainerpath.rawAddress.toString(), preserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addLogContainerSet(hlog: Handle, ccontainer: UShort, pcbcontainer: ConstPtr<ULong>, rgwszcontainerpath: ConstPtr<Pcwstr>, preserved: MutPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemAddLogContainerSet(hlog.rawAddress.toString(), ccontainer.toInt(), pcbcontainer.rawAddress.toString(), rgwszcontainerpath.rawAddress.toString(), preserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addUsersToEncryptedFile(lpfilename: Pcwstr, pencryptioncertificates: ConstPtr<EncryptionCertificateList>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemAddUsersToEncryptedFile(lpfilename.rawAddress.toString(), pencryptioncertificates.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun advanceLogBase(pvmarshal: MutPtr<CVoid>, plsnbase: MutPtr<ClsLsn>, fflags: UInt, poverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemAdvanceLogBase(pvmarshal.rawAddress.toString(), plsnbase.rawAddress.toString(), fflags.toInt(), poverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alignReservedLog(pvmarshal: MutPtr<CVoid>, creservedrecords: UInt, rgcbreservation: MutPtr<Long>, pcbalignreservation: MutPtr<Long>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemAlignReservedLog(pvmarshal.rawAddress.toString(), creservedrecords.toInt(), rgcbreservation.rawAddress.toString(), pcbalignreservation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun allocReservedLog(pvmarshal: MutPtr<CVoid>, creservedrecords: UInt, pcbadjustment: MutPtr<Long>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemAllocReservedLog(pvmarshal.rawAddress.toString(), creservedrecords.toInt(), pcbadjustment.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun areFileApisANSI(): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemAreFileApisANSI() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun areShortNamesEnabled(handle: Handle, enabled: MutPtr<Bool>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemAreShortNamesEnabled(handle.rawAddress.toString(), enabled.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backupRead(hfile: Handle, lpbuffer: MutPtr<UByte>, nnumberofbytestoread: UInt, lpnumberofbytesread: MutPtr<UInt>, babort: Bool, bprocesssecurity: Bool, lpcontext: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemBackupRead(hfile.rawAddress.toString(), lpbuffer.rawAddress.toString(), nnumberofbytestoread.toInt(), lpnumberofbytesread.rawAddress.toString(), babort, bprocesssecurity, lpcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backupSeek(hfile: Handle, dwlowbytestoseek: UInt, dwhighbytestoseek: UInt, lpdwlowbyteseeked: MutPtr<UInt>, lpdwhighbyteseeked: MutPtr<UInt>, lpcontext: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemBackupSeek(hfile.rawAddress.toString(), dwlowbytestoseek.toInt(), dwhighbytestoseek.toInt(), lpdwlowbyteseeked.rawAddress.toString(), lpdwhighbyteseeked.rawAddress.toString(), lpcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backupWrite(hfile: Handle, lpbuffer: ConstPtr<UByte>, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: MutPtr<UInt>, babort: Bool, bprocesssecurity: Bool, lpcontext: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemBackupWrite(hfile.rawAddress.toString(), lpbuffer.rawAddress.toString(), nnumberofbytestowrite.toInt(), lpnumberofbyteswritten.rawAddress.toString(), babort, bprocesssecurity, lpcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildIoRingCancelRequest(ioring: Hioring, file: IoringHandleRef, optocancel: ULong, userdata: ULong): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildIoRingFlushFile(ioring: Hioring, fileref: IoringHandleRef, flushmode: FileFlushMode, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildIoRingReadFile(ioring: Hioring, fileref: IoringHandleRef, dataref: IoringBufferRef, numberofbytestoread: UInt, fileoffset: ULong, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildIoRingRegisterBuffers(ioring: Hioring, count: UInt, buffers: ConstPtr<IoringBufferInfo>, userdata: ULong): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemBuildIoRingRegisterBuffers(ioring.rawAddress.toString(), count.toInt(), buffers.rawAddress.toString(), userdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildIoRingRegisterFileHandles(ioring: Hioring, count: UInt, handles: ConstPtr<Handle>, userdata: ULong): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemBuildIoRingRegisterFileHandles(ioring.rawAddress.toString(), count.toInt(), handles.rawAddress.toString(), userdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun buildIoRingWriteFile(ioring: Hioring, fileref: IoringHandleRef, bufferref: IoringBufferRef, numberofbytestowrite: UInt, fileoffset: ULong, writeflags: FileWriteFlags, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkNameLegalDOS8Dot3A(lpname: Pcstr, lpoemname: Pstr, oemnamesize: UInt, pbnamecontainsspaces: MutPtr<Bool>, pbnamelegal: MutPtr<Bool>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCheckNameLegalDOS8Dot3A(lpname.rawAddress.toString(), lpoemname.rawAddress.toString(), oemnamesize.toInt(), pbnamecontainsspaces.rawAddress.toString(), pbnamelegal.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun checkNameLegalDOS8Dot3W(lpname: Pcwstr, lpoemname: Pstr, oemnamesize: UInt, pbnamecontainsspaces: MutPtr<Bool>, pbnamelegal: MutPtr<Bool>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCheckNameLegalDOS8Dot3W(lpname.rawAddress.toString(), lpoemname.rawAddress.toString(), oemnamesize.toInt(), pbnamecontainsspaces.rawAddress.toString(), pbnamelegal.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeAndResetLogFile(hlog: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCloseAndResetLogFile(hlog.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeEncryptedFileRaw(pvcontext: ConstPtr<CVoid>) {
    if (windowsWin32StorageFilesystemNapiAddon != null) {
        windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCloseEncryptedFileRaw(pvcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun closeIoRing(ioring: Hioring): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCloseIoRing(ioring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCommitComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCommitEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitTransaction(transactionhandle: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCommitTransaction(transactionhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitTransactionAsync(transactionhandle: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCommitTransactionAsync(transactionhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun compareFileTime(lpfiletime1: ConstPtr<Filetime>, lpfiletime2: ConstPtr<Filetime>): Int =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCompareFileTime(lpfiletime1.rawAddress.toString(), lpfiletime2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFile2(pwszexistingfilename: Pcwstr, pwsznewfilename: Pcwstr, pextendedparameters: ConstPtr<Copyfile2ExtendedParameters>): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCopyFile2(pwszexistingfilename.rawAddress.toString(), pwsznewfilename.rawAddress.toString(), pextendedparameters.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, bfailifexists: Bool): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCopyFileA(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), bfailifexists) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileExA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, pbcancel: MutPtr<Bool>, dwcopyflags: CopyfileFlags): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCopyFileExA(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), 0L.toString(), lpdata.rawAddress.toString(), pbcancel.rawAddress.toString(), dwcopyflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileExW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, pbcancel: MutPtr<Bool>, dwcopyflags: CopyfileFlags): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCopyFileExW(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), 0L.toString(), lpdata.rawAddress.toString(), pbcancel.rawAddress.toString(), dwcopyflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileFromAppW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, bfailifexists: Bool): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCopyFileFromAppW(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), bfailifexists) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileTransactedA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, pbcancel: ConstPtr<Bool>, dwcopyflags: UInt, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCopyFileTransactedA(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), 0L.toString(), lpdata.rawAddress.toString(), pbcancel.rawAddress.toString(), dwcopyflags.toInt(), htransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileTransactedW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, pbcancel: ConstPtr<Bool>, dwcopyflags: UInt, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCopyFileTransactedW(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), 0L.toString(), lpdata.rawAddress.toString(), pbcancel.rawAddress.toString(), dwcopyflags.toInt(), htransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyFileW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, bfailifexists: Bool): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCopyFileW(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), bfailifexists) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyLZFile(hfsource: Int, hfdest: Int): Int =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCopyLZFile(hfsource, hfdest) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryA(lppathname: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateDirectoryA(lppathname.rawAddress.toString(), lpsecurityattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryExA(lptemplatedirectory: Pcstr, lpnewdirectory: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateDirectoryExA(lptemplatedirectory.rawAddress.toString(), lpnewdirectory.rawAddress.toString(), lpsecurityattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryExW(lptemplatedirectory: Pcwstr, lpnewdirectory: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateDirectoryExW(lptemplatedirectory.rawAddress.toString(), lpnewdirectory.rawAddress.toString(), lpsecurityattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryFromAppW(lppathname: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateDirectoryFromAppW(lppathname.rawAddress.toString(), lpsecurityattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryTransactedA(lptemplatedirectory: Pcstr, lpnewdirectory: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateDirectoryTransactedA(lptemplatedirectory.rawAddress.toString(), lpnewdirectory.rawAddress.toString(), lpsecurityattributes.rawAddress.toString(), htransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryTransactedW(lptemplatedirectory: Pcwstr, lpnewdirectory: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateDirectoryTransactedW(lptemplatedirectory.rawAddress.toString(), lpnewdirectory.rawAddress.toString(), lpsecurityattributes.rawAddress.toString(), htransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDirectoryW(lppathname: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateDirectoryW(lppathname.rawAddress.toString(), lpsecurityattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEnlistment(lpenlistmentattributes: MutPtr<SecurityAttributes>, resourcemanagerhandle: Handle, transactionhandle: Handle, notificationmask: UInt, createoptions: UInt, enlistmentkey: MutPtr<CVoid>): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateEnlistment(lpenlistmentattributes.rawAddress.toString(), resourcemanagerhandle.rawAddress.toString(), transactionhandle.rawAddress.toString(), notificationmask.toInt(), createoptions.toInt(), enlistmentkey.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFile2(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, dwcreationdisposition: FileCreationDisposition, pcreateexparams: ConstPtr<Createfile2ExtendedParameters>): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateFile2(lpfilename.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationdisposition.toInt(), pcreateexparams.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFile2FromAppW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationdisposition: UInt, pcreateexparams: ConstPtr<Createfile2ExtendedParameters>): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateFile2FromAppW(lpfilename.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationdisposition.toInt(), pcreateexparams.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileA(lpfilename: Pcstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateFileA(lpfilename.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress.toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileFromAppW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateFileFromAppW(lpfilename.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress.toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileTransactedA(lpfilename: Pcstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle, htransaction: Handle, pusminiversion: ConstPtr<TxfsMiniversion>, lpextendedparameter: ConstPtr<CVoid>): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateFileTransactedA(lpfilename.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress.toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.rawAddress.toString(), htransaction.rawAddress.toString(), pusminiversion.rawAddress.toString(), lpextendedparameter.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileTransactedW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle, htransaction: Handle, pusminiversion: ConstPtr<TxfsMiniversion>, lpextendedparameter: ConstPtr<CVoid>): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateFileTransactedW(lpfilename.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress.toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.rawAddress.toString(), htransaction.rawAddress.toString(), pusminiversion.rawAddress.toString(), lpextendedparameter.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFileW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateFileW(lpfilename.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress.toString(), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createHardLinkA(lpfilename: Pcstr, lpexistingfilename: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateHardLinkA(lpfilename.rawAddress.toString(), lpexistingfilename.rawAddress.toString(), lpsecurityattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createHardLinkTransactedA(lpfilename: Pcstr, lpexistingfilename: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateHardLinkTransactedA(lpfilename.rawAddress.toString(), lpexistingfilename.rawAddress.toString(), lpsecurityattributes.rawAddress.toString(), htransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createHardLinkTransactedW(lpfilename: Pcwstr, lpexistingfilename: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateHardLinkTransactedW(lpfilename.rawAddress.toString(), lpexistingfilename.rawAddress.toString(), lpsecurityattributes.rawAddress.toString(), htransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createHardLinkW(lpfilename: Pcwstr, lpexistingfilename: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateHardLinkW(lpfilename.rawAddress.toString(), lpexistingfilename.rawAddress.toString(), lpsecurityattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createIoRing(ioringversion: IoringVersion, flags: IoringCreateFlags, submissionqueuesize: UInt, completionqueuesize: UInt, h: MutPtr<Hioring>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createLogContainerScanContext(hlog: Handle, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: MutPtr<ClsScanContext>, poverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateLogContainerScanContext(hlog.rawAddress.toString(), cfromcontainer.toInt(), ccontainers.toInt(), escanmode.toInt(), pcxscan.rawAddress.toString(), poverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createLogFile(pszlogfilename: Pcwstr, fdesiredaccess: UInt, dwsharemode: FileShareMode, psalogfile: MutPtr<SecurityAttributes>, fcreatedisposition: FileCreationDisposition, fflagsandattributes: FileFlagsAndAttributes): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateLogFile(pszlogfilename.rawAddress.toString(), fdesiredaccess.toInt(), dwsharemode.toInt(), psalogfile.rawAddress.toString(), fcreatedisposition.toInt(), fflagsandattributes.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createLogMarshallingArea(hlog: Handle, pfnallocbuffer: ClfsBlockAllocation, pfnfreebuffer: ClfsBlockDeallocation, pvblockalloccontext: MutPtr<CVoid>, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshal: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateLogMarshallingArea(hlog.rawAddress.toString(), 0L.toString(), 0L.toString(), pvblockalloccontext.rawAddress.toString(), cbmarshallingbuffer.toInt(), cmaxwritebuffers.toInt(), cmaxreadbuffers.toInt(), ppvmarshal.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createResourceManager(lpresourcemanagerattributes: MutPtr<SecurityAttributes>, resourcemanagerid: MutPtr<Guid>, createoptions: UInt, tmhandle: Handle, description: Pcwstr): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateResourceManager(lpresourcemanagerattributes.rawAddress.toString(), resourcemanagerid.rawAddress.toString(), createoptions.toInt(), tmhandle.rawAddress.toString(), description.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSymbolicLinkA(lpsymlinkfilename: Pcstr, lptargetfilename: Pcstr, dwflags: SymbolicLinkFlags): Boolean =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateSymbolicLinkA(lpsymlinkfilename.rawAddress.toString(), lptargetfilename.rawAddress.toString(), dwflags.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSymbolicLinkTransactedA(lpsymlinkfilename: Pcstr, lptargetfilename: Pcstr, dwflags: SymbolicLinkFlags, htransaction: Handle): Boolean =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateSymbolicLinkTransactedA(lpsymlinkfilename.rawAddress.toString(), lptargetfilename.rawAddress.toString(), dwflags.toInt(), htransaction.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSymbolicLinkTransactedW(lpsymlinkfilename: Pcwstr, lptargetfilename: Pcwstr, dwflags: SymbolicLinkFlags, htransaction: Handle): Boolean =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateSymbolicLinkTransactedW(lpsymlinkfilename.rawAddress.toString(), lptargetfilename.rawAddress.toString(), dwflags.toInt(), htransaction.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSymbolicLinkW(lpsymlinkfilename: Pcwstr, lptargetfilename: Pcwstr, dwflags: SymbolicLinkFlags): Boolean =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateSymbolicLinkW(lpsymlinkfilename.rawAddress.toString(), lptargetfilename.rawAddress.toString(), dwflags.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTapePartition(hdevice: Handle, dwpartitionmethod: CreateTapePartitionMethod, dwcount: UInt, dwsize: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateTapePartition(hdevice.rawAddress.toString(), dwpartitionmethod.toInt(), dwcount.toInt(), dwsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTransaction(lptransactionattributes: MutPtr<SecurityAttributes>, uow: MutPtr<Guid>, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: Pcwstr): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateTransaction(lptransactionattributes.rawAddress.toString(), uow.rawAddress.toString(), createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), timeout.toInt(), description.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTransactionManager(lptransactionattributes: MutPtr<SecurityAttributes>, logfilename: Pcwstr, createoptions: UInt, commitstrength: UInt): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemCreateTransactionManager(lptransactionattributes.rawAddress.toString(), logfilename.rawAddress.toString(), createoptions.toInt(), commitstrength.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decryptFileA(lpfilename: Pcstr, dwreserved: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemDecryptFileA(lpfilename.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decryptFileW(lpfilename: Pcwstr, dwreserved: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemDecryptFileW(lpfilename.rawAddress.toString(), dwreserved.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defineDosDeviceA(dwflags: DefineDosDeviceFlags, lpdevicename: Pcstr, lptargetpath: Pcstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemDefineDosDeviceA(dwflags.toInt(), lpdevicename.rawAddress.toString(), lptargetpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defineDosDeviceW(dwflags: DefineDosDeviceFlags, lpdevicename: Pcwstr, lptargetpath: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemDefineDosDeviceW(dwflags.toInt(), lpdevicename.rawAddress.toString(), lptargetpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFileA(lpfilename: Pcstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemDeleteFileA(lpfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFileFromAppW(lpfilename: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemDeleteFileFromAppW(lpfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFileTransactedA(lpfilename: Pcstr, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemDeleteFileTransactedA(lpfilename.rawAddress.toString(), htransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFileTransactedW(lpfilename: Pcwstr, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemDeleteFileTransactedW(lpfilename.rawAddress.toString(), htransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteFileW(lpfilename: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemDeleteFileW(lpfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteLogByHandle(hlog: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemDeleteLogByHandle(hlog.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteLogFile(pszlogfilename: Pcwstr, pvreserved: MutPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemDeleteLogFile(pszlogfilename.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteLogMarshallingArea(pvmarshal: MutPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemDeleteLogMarshallingArea(pvmarshal.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteVolumeMountPointA(lpszvolumemountpoint: Pcstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemDeleteVolumeMountPointA(lpszvolumemountpoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteVolumeMountPointW(lpszvolumemountpoint: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemDeleteVolumeMountPointW(lpszvolumemountpoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deregisterManageableLogClient(hlog: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemDeregisterManageableLogClient(hlog.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplicateEncryptionInfoFile(srcfilename: Pcwstr, dstfilename: Pcwstr, dwcreationdistribution: UInt, dwattributes: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemDuplicateEncryptionInfoFile(srcfilename.rawAddress.toString(), dstfilename.rawAddress.toString(), dwcreationdistribution.toInt(), dwattributes.toInt(), lpsecurityattributes.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encryptFileA(lpfilename: Pcstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemEncryptFileA(lpfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encryptFileW(lpfilename: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemEncryptFileW(lpfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encryptionDisable(dirpath: Pcwstr, disable: Bool): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemEncryptionDisable(dirpath.rawAddress.toString(), disable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun eraseTape(hdevice: Handle, dwerasetype: EraseTapeType, bimmediate: Bool): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemEraseTape(hdevice.rawAddress.toString(), dwerasetype.toInt(), bimmediate) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileEncryptionStatusA(lpfilename: Pcstr, lpstatus: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFileEncryptionStatusA(lpfilename.rawAddress.toString(), lpstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileEncryptionStatusW(lpfilename: Pcwstr, lpstatus: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFileEncryptionStatusW(lpfilename.rawAddress.toString(), lpstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fileTimeToLocalFileTime(lpfiletime: ConstPtr<Filetime>, lplocalfiletime: MutPtr<Filetime>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFileTimeToLocalFileTime(lpfiletime.rawAddress.toString(), lplocalfiletime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findClose(hfindfile: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindClose(hfindfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findCloseChangeNotification(hchangehandle: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindCloseChangeNotification(hchangehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstChangeNotificationA(lppathname: Pcstr, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindFirstChangeNotificationA(lppathname.rawAddress.toString(), bwatchsubtree, dwnotifyfilter.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstChangeNotificationW(lppathname: Pcwstr, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindFirstChangeNotificationW(lppathname.rawAddress.toString(), bwatchsubtree, dwnotifyfilter.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileA(lpfilename: Pcstr, lpfindfiledata: MutPtr<Win32FindDataa>): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindFirstFileA(lpfilename.rawAddress.toString(), lpfindfiledata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileExA(lpfilename: Pcstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr<CVoid>, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr<CVoid>, dwadditionalflags: FindFirstExFlags): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindFirstFileExA(lpfilename.rawAddress.toString(), finfolevelid, lpfindfiledata.rawAddress.toString(), fsearchop, lpsearchfilter.rawAddress.toString(), dwadditionalflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileExFromAppW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr<CVoid>, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr<CVoid>, dwadditionalflags: UInt): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindFirstFileExFromAppW(lpfilename.rawAddress.toString(), finfolevelid, lpfindfiledata.rawAddress.toString(), fsearchop, lpsearchfilter.rawAddress.toString(), dwadditionalflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileExW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr<CVoid>, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr<CVoid>, dwadditionalflags: FindFirstExFlags): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindFirstFileExW(lpfilename.rawAddress.toString(), finfolevelid, lpfindfiledata.rawAddress.toString(), fsearchop, lpsearchfilter.rawAddress.toString(), dwadditionalflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileNameTransactedW(lpfilename: Pcwstr, dwflags: UInt, stringlength: MutPtr<UInt>, linkname: Pwstr, htransaction: Handle): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindFirstFileNameTransactedW(lpfilename.rawAddress.toString(), dwflags.toInt(), stringlength.rawAddress.toString(), linkname.rawAddress.toString(), htransaction.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileNameW(lpfilename: Pcwstr, dwflags: UInt, stringlength: MutPtr<UInt>, linkname: Pwstr): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindFirstFileNameW(lpfilename.rawAddress.toString(), dwflags.toInt(), stringlength.rawAddress.toString(), linkname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileTransactedA(lpfilename: Pcstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr<CVoid>, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr<CVoid>, dwadditionalflags: UInt, htransaction: Handle): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindFirstFileTransactedA(lpfilename.rawAddress.toString(), finfolevelid, lpfindfiledata.rawAddress.toString(), fsearchop, lpsearchfilter.rawAddress.toString(), dwadditionalflags.toInt(), htransaction.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileTransactedW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr<CVoid>, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr<CVoid>, dwadditionalflags: UInt, htransaction: Handle): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindFirstFileTransactedW(lpfilename.rawAddress.toString(), finfolevelid, lpfindfiledata.rawAddress.toString(), fsearchop, lpsearchfilter.rawAddress.toString(), dwadditionalflags.toInt(), htransaction.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstFileW(lpfilename: Pcwstr, lpfindfiledata: MutPtr<Win32FindDataw>): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindFirstFileW(lpfilename.rawAddress.toString(), lpfindfiledata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstStreamTransactedW(lpfilename: Pcwstr, infolevel: StreamInfoLevels, lpfindstreamdata: MutPtr<CVoid>, dwflags: UInt, htransaction: Handle): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindFirstStreamTransactedW(lpfilename.rawAddress.toString(), infolevel, lpfindstreamdata.rawAddress.toString(), dwflags.toInt(), htransaction.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstStreamW(lpfilename: Pcwstr, infolevel: StreamInfoLevels, lpfindstreamdata: MutPtr<CVoid>, dwflags: UInt): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindFirstStreamW(lpfilename.rawAddress.toString(), infolevel, lpfindstreamdata.rawAddress.toString(), dwflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstVolumeA(lpszvolumename: Pstr, cchbufferlength: UInt): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindFirstVolumeA(lpszvolumename.rawAddress.toString(), cchbufferlength.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstVolumeMountPointA(lpszrootpathname: Pcstr, lpszvolumemountpoint: Pstr, cchbufferlength: UInt): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindFirstVolumeMountPointA(lpszrootpathname.rawAddress.toString(), lpszvolumemountpoint.rawAddress.toString(), cchbufferlength.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstVolumeMountPointW(lpszrootpathname: Pcwstr, lpszvolumemountpoint: Pwstr, cchbufferlength: UInt): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindFirstVolumeMountPointW(lpszrootpathname.rawAddress.toString(), lpszvolumemountpoint.rawAddress.toString(), cchbufferlength.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstVolumeW(lpszvolumename: Pwstr, cchbufferlength: UInt): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindFirstVolumeW(lpszvolumename.rawAddress.toString(), cchbufferlength.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextChangeNotification(hchangehandle: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindNextChangeNotification(hchangehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextFileA(hfindfile: Handle, lpfindfiledata: MutPtr<Win32FindDataa>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindNextFileA(hfindfile.rawAddress.toString(), lpfindfiledata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextFileNameW(hfindstream: Handle, stringlength: MutPtr<UInt>, linkname: Pwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindNextFileNameW(hfindstream.rawAddress.toString(), stringlength.rawAddress.toString(), linkname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextFileW(hfindfile: Handle, lpfindfiledata: MutPtr<Win32FindDataw>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindNextFileW(hfindfile.rawAddress.toString(), lpfindfiledata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextStreamW(hfindstream: Handle, lpfindstreamdata: MutPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindNextStreamW(hfindstream.rawAddress.toString(), lpfindstreamdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextVolumeA(hfindvolume: Handle, lpszvolumename: Pstr, cchbufferlength: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindNextVolumeA(hfindvolume.rawAddress.toString(), lpszvolumename.rawAddress.toString(), cchbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextVolumeMountPointA(hfindvolumemountpoint: Handle, lpszvolumemountpoint: Pstr, cchbufferlength: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindNextVolumeMountPointA(hfindvolumemountpoint.rawAddress.toString(), lpszvolumemountpoint.rawAddress.toString(), cchbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextVolumeMountPointW(hfindvolumemountpoint: Handle, lpszvolumemountpoint: Pwstr, cchbufferlength: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindNextVolumeMountPointW(hfindvolumemountpoint.rawAddress.toString(), lpszvolumemountpoint.rawAddress.toString(), cchbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextVolumeW(hfindvolume: Handle, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindNextVolumeW(hfindvolume.rawAddress.toString(), lpszvolumename.rawAddress.toString(), cchbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findVolumeClose(hfindvolume: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindVolumeClose(hfindvolume.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findVolumeMountPointClose(hfindvolumemountpoint: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFindVolumeMountPointClose(hfindvolumemountpoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushFileBuffers(hfile: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFlushFileBuffers(hfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushLogBuffers(pvmarshal: ConstPtr<CVoid>, poverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFlushLogBuffers(pvmarshal.rawAddress.toString(), poverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flushLogToLsn(pvmarshalcontext: MutPtr<CVoid>, plsnflush: MutPtr<ClsLsn>, plsnlastflushed: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFlushLogToLsn(pvmarshalcontext.rawAddress.toString(), plsnflush.rawAddress.toString(), plsnlastflushed.rawAddress.toString(), poverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeEncryptedFileMetadata(pbmetadata: ConstPtr<UByte>) {
    if (windowsWin32StorageFilesystemNapiAddon != null) {
        windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFreeEncryptedFileMetadata(pbmetadata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeEncryptionCertificateHashList(pusers: ConstPtr<EncryptionCertificateHashList>) {
    if (windowsWin32StorageFilesystemNapiAddon != null) {
        windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFreeEncryptionCertificateHashList(pusers.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeReservedLog(pvmarshal: MutPtr<CVoid>, creservedrecords: UInt, pcbadjustment: MutPtr<Long>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemFreeReservedLog(pvmarshal.rawAddress.toString(), creservedrecords.toInt(), pcbadjustment.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBinaryTypeA(lpapplicationname: Pcstr, lpbinarytype: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetBinaryTypeA(lpapplicationname.rawAddress.toString(), lpbinarytype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBinaryTypeW(lpapplicationname: Pcwstr, lpbinarytype: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetBinaryTypeW(lpapplicationname.rawAddress.toString(), lpbinarytype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCompressedFileSizeA(lpfilename: Pcstr, lpfilesizehigh: MutPtr<UInt>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetCompressedFileSizeA(lpfilename.rawAddress.toString(), lpfilesizehigh.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCompressedFileSizeTransactedA(lpfilename: Pcstr, lpfilesizehigh: MutPtr<UInt>, htransaction: Handle): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetCompressedFileSizeTransactedA(lpfilename.rawAddress.toString(), lpfilesizehigh.rawAddress.toString(), htransaction.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCompressedFileSizeTransactedW(lpfilename: Pcwstr, lpfilesizehigh: MutPtr<UInt>, htransaction: Handle): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetCompressedFileSizeTransactedW(lpfilename.rawAddress.toString(), lpfilesizehigh.rawAddress.toString(), htransaction.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCompressedFileSizeW(lpfilename: Pcwstr, lpfilesizehigh: MutPtr<UInt>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetCompressedFileSizeW(lpfilename.rawAddress.toString(), lpfilesizehigh.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentClockTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetCurrentClockTransactionManager(transactionmanagerhandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskFreeSpaceA(lprootpathname: Pcstr, lpsectorspercluster: MutPtr<UInt>, lpbytespersector: MutPtr<UInt>, lpnumberoffreeclusters: MutPtr<UInt>, lptotalnumberofclusters: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceA(lprootpathname.rawAddress.toString(), lpsectorspercluster.rawAddress.toString(), lpbytespersector.rawAddress.toString(), lpnumberoffreeclusters.rawAddress.toString(), lptotalnumberofclusters.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskFreeSpaceExA(lpdirectoryname: Pcstr, lpfreebytesavailabletocaller: MutPtr<ULong>, lptotalnumberofbytes: MutPtr<ULong>, lptotalnumberoffreebytes: MutPtr<ULong>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceExA(lpdirectoryname.rawAddress.toString(), lpfreebytesavailabletocaller.rawAddress.toString(), lptotalnumberofbytes.rawAddress.toString(), lptotalnumberoffreebytes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskFreeSpaceExW(lpdirectoryname: Pcwstr, lpfreebytesavailabletocaller: MutPtr<ULong>, lptotalnumberofbytes: MutPtr<ULong>, lptotalnumberoffreebytes: MutPtr<ULong>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceExW(lpdirectoryname.rawAddress.toString(), lpfreebytesavailabletocaller.rawAddress.toString(), lptotalnumberofbytes.rawAddress.toString(), lptotalnumberoffreebytes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskFreeSpaceW(lprootpathname: Pcwstr, lpsectorspercluster: MutPtr<UInt>, lpbytespersector: MutPtr<UInt>, lpnumberoffreeclusters: MutPtr<UInt>, lptotalnumberofclusters: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceW(lprootpathname.rawAddress.toString(), lpsectorspercluster.rawAddress.toString(), lpbytespersector.rawAddress.toString(), lpnumberoffreeclusters.rawAddress.toString(), lptotalnumberofclusters.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskSpaceInformationA(rootpath: Pcstr, diskspaceinfo: MutPtr<DiskSpaceInformation>): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetDiskSpaceInformationA(rootpath.rawAddress.toString(), diskspaceinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskSpaceInformationW(rootpath: Pcwstr, diskspaceinfo: MutPtr<DiskSpaceInformation>): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetDiskSpaceInformationW(rootpath.rawAddress.toString(), diskspaceinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDriveTypeA(lprootpathname: Pcstr): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetDriveTypeA(lprootpathname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDriveTypeW(lprootpathname: Pcwstr): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetDriveTypeW(lprootpathname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEncryptedFileMetadata(lpfilename: Pcwstr, pcbmetadata: MutPtr<UInt>, ppbmetadata: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetEncryptedFileMetadata(lpfilename.rawAddress.toString(), pcbmetadata.rawAddress.toString(), ppbmetadata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnlistmentId(enlistmenthandle: Handle, enlistmentid: MutPtr<Guid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetEnlistmentId(enlistmenthandle.rawAddress.toString(), enlistmentid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnlistmentRecoveryInformation(enlistmenthandle: Handle, buffersize: UInt, buffer: MutPtr<CVoid>, bufferused: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetEnlistmentRecoveryInformation(enlistmenthandle.rawAddress.toString(), buffersize.toInt(), buffer.rawAddress.toString(), bufferused.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExpandedNameA(lpszsource: Pcstr, lpszbuffer: Pstr): Int =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetExpandedNameA(lpszsource.rawAddress.toString(), lpszbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getExpandedNameW(lpszsource: Pcwstr, lpszbuffer: Pwstr): Int =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetExpandedNameW(lpszsource.rawAddress.toString(), lpszbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesA(lpfilename: Pcstr): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileAttributesA(lpfilename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesExA(lpfilename: Pcstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileAttributesExA(lpfilename.rawAddress.toString(), finfolevelid, lpfileinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesExFromAppW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileAttributesExFromAppW(lpfilename.rawAddress.toString(), finfolevelid, lpfileinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesExW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileAttributesExW(lpfilename.rawAddress.toString(), finfolevelid, lpfileinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesTransactedA(lpfilename: Pcstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr<CVoid>, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileAttributesTransactedA(lpfilename.rawAddress.toString(), finfolevelid, lpfileinformation.rawAddress.toString(), htransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesTransactedW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr<CVoid>, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileAttributesTransactedW(lpfilename.rawAddress.toString(), finfolevelid, lpfileinformation.rawAddress.toString(), htransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileAttributesW(lpfilename: Pcwstr): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileAttributesW(lpfilename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileBandwidthReservation(hfile: Handle, lpperiodmilliseconds: MutPtr<UInt>, lpbytesperperiod: MutPtr<UInt>, pdiscardable: MutPtr<Bool>, lptransfersize: MutPtr<UInt>, lpnumoutstandingrequests: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileBandwidthReservation(hfile.rawAddress.toString(), lpperiodmilliseconds.rawAddress.toString(), lpbytesperperiod.rawAddress.toString(), pdiscardable.rawAddress.toString(), lptransfersize.rawAddress.toString(), lpnumoutstandingrequests.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileInformationByHandle(hfile: Handle, lpfileinformation: MutPtr<ByHandleFileInformation>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileInformationByHandle(hfile.rawAddress.toString(), lpfileinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileInformationByHandleEx(hfile: Handle, fileinformationclass: FileInfoByHandleClass, lpfileinformation: MutPtr<CVoid>, dwbuffersize: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileInformationByHandleEx(hfile.rawAddress.toString(), fileinformationclass, lpfileinformation.rawAddress.toString(), dwbuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileSize(hfile: Handle, lpfilesizehigh: MutPtr<UInt>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileSize(hfile.rawAddress.toString(), lpfilesizehigh.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileSizeEx(hfile: Handle, lpfilesize: MutPtr<Long>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileSizeEx(hfile.rawAddress.toString(), lpfilesize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileTime(hfile: Handle, lpcreationtime: MutPtr<Filetime>, lplastaccesstime: MutPtr<Filetime>, lplastwritetime: MutPtr<Filetime>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileTime(hfile.rawAddress.toString(), lpcreationtime.rawAddress.toString(), lplastaccesstime.rawAddress.toString(), lplastwritetime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileType(hfile: Handle): FileType =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileType(hfile.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoA(lptstrfilename: Pcstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoA(lptstrfilename.rawAddress.toString(), dwhandle.toInt(), dwlen.toInt(), lpdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoExA(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoExA(dwflags.toInt(), lpwstrfilename.rawAddress.toString(), dwhandle.toInt(), dwlen.toInt(), lpdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoExW(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcwstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoExW(dwflags.toInt(), lpwstrfilename.rawAddress.toString(), dwhandle.toInt(), dwlen.toInt(), lpdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoSizeA(lptstrfilename: Pcstr, lpdwhandle: MutPtr<UInt>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeA(lptstrfilename.rawAddress.toString(), lpdwhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoSizeExA(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcstr, lpdwhandle: MutPtr<UInt>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeExA(dwflags.toInt(), lpwstrfilename.rawAddress.toString(), lpdwhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoSizeExW(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcwstr, lpdwhandle: MutPtr<UInt>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeExW(dwflags.toInt(), lpwstrfilename.rawAddress.toString(), lpdwhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoSizeW(lptstrfilename: Pcwstr, lpdwhandle: MutPtr<UInt>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeW(lptstrfilename.rawAddress.toString(), lpdwhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileVersionInfoW(lptstrfilename: Pcwstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoW(lptstrfilename.rawAddress.toString(), dwhandle.toInt(), dwlen.toInt(), lpdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFinalPathNameByHandleA(hfile: Handle, lpszfilepath: Pstr, cchfilepath: UInt, dwflags: GetfinalpathnamebyhandleFlags): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFinalPathNameByHandleA(hfile.rawAddress.toString(), lpszfilepath.rawAddress.toString(), cchfilepath.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFinalPathNameByHandleW(hfile: Handle, lpszfilepath: Pwstr, cchfilepath: UInt, dwflags: GetfinalpathnamebyhandleFlags): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFinalPathNameByHandleW(hfile.rawAddress.toString(), lpszfilepath.rawAddress.toString(), cchfilepath.toInt(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFullPathNameA(lpfilename: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: MutPtr<Pstr>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFullPathNameA(lpfilename.rawAddress.toString(), nbufferlength.toInt(), lpbuffer.rawAddress.toString(), lpfilepart.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFullPathNameTransactedA(lpfilename: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: MutPtr<Pstr>, htransaction: Handle): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFullPathNameTransactedA(lpfilename.rawAddress.toString(), nbufferlength.toInt(), lpbuffer.rawAddress.toString(), lpfilepart.rawAddress.toString(), htransaction.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFullPathNameTransactedW(lpfilename: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: MutPtr<Pwstr>, htransaction: Handle): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFullPathNameTransactedW(lpfilename.rawAddress.toString(), nbufferlength.toInt(), lpbuffer.rawAddress.toString(), lpfilepart.rawAddress.toString(), htransaction.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFullPathNameW(lpfilename: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: MutPtr<Pwstr>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetFullPathNameW(lpfilename.rawAddress.toString(), nbufferlength.toInt(), lpbuffer.rawAddress.toString(), lpfilepart.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getIoRingInfo(ioring: Hioring, info: MutPtr<IoringInfo>): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetIoRingInfo(ioring.rawAddress.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogContainerName(hlog: Handle, cidlogicalcontainer: UInt, pwstrcontainername: Pcwstr, clencontainername: UInt, pcactuallencontainername: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetLogContainerName(hlog.rawAddress.toString(), cidlogicalcontainer.toInt(), pwstrcontainername.rawAddress.toString(), clencontainername.toInt(), pcactuallencontainername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogFileInformation(hlog: Handle, pinfobuffer: MutPtr<ClsInformation>, cbbuffer: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetLogFileInformation(hlog.rawAddress.toString(), pinfobuffer.rawAddress.toString(), cbbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogIoStatistics(hlog: Handle, pvstatsbuffer: MutPtr<CVoid>, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetLogIoStatistics(hlog.rawAddress.toString(), pvstatsbuffer.rawAddress.toString(), cbstatsbuffer.toInt(), estatsclass, pcbstatswritten.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogReservationInfo(pvmarshal: ConstPtr<CVoid>, pcbrecordnumber: MutPtr<UInt>, pcbuserreservation: MutPtr<Long>, pcbcommitreservation: MutPtr<Long>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetLogReservationInfo(pvmarshal.rawAddress.toString(), pcbrecordnumber.rawAddress.toString(), pcbuserreservation.rawAddress.toString(), pcbcommitreservation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogicalDriveStringsA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetLogicalDriveStringsA(nbufferlength.toInt(), lpbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogicalDriveStringsW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetLogicalDriveStringsW(nbufferlength.toInt(), lpbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLogicalDrives(): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetLogicalDrives() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLongPathNameA(lpszshortpath: Pcstr, lpszlongpath: Pstr, cchbuffer: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetLongPathNameA(lpszshortpath.rawAddress.toString(), lpszlongpath.rawAddress.toString(), cchbuffer.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLongPathNameTransactedA(lpszshortpath: Pcstr, lpszlongpath: Pstr, cchbuffer: UInt, htransaction: Handle): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetLongPathNameTransactedA(lpszshortpath.rawAddress.toString(), lpszlongpath.rawAddress.toString(), cchbuffer.toInt(), htransaction.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLongPathNameTransactedW(lpszshortpath: Pcwstr, lpszlongpath: Pwstr, cchbuffer: UInt, htransaction: Handle): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetLongPathNameTransactedW(lpszshortpath.rawAddress.toString(), lpszlongpath.rawAddress.toString(), cchbuffer.toInt(), htransaction.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLongPathNameW(lpszshortpath: Pcwstr, lpszlongpath: Pwstr, cchbuffer: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetLongPathNameW(lpszshortpath.rawAddress.toString(), lpszlongpath.rawAddress.toString(), cchbuffer.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNextLogArchiveExtent(pvarchivecontext: MutPtr<CVoid>, rgadextent: MutPtr<ClsArchiveDescriptor>, cdescriptors: UInt, pcdescriptorsreturned: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetNextLogArchiveExtent(pvarchivecontext.rawAddress.toString(), rgadextent.rawAddress.toString(), cdescriptors.toInt(), pcdescriptorsreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: MutPtr<TransactionNotification>, notificationlength: UInt, dwmilliseconds: UInt, returnlength: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetNotificationResourceManager(resourcemanagerhandle.rawAddress.toString(), transactionnotification.rawAddress.toString(), notificationlength.toInt(), dwmilliseconds.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNotificationResourceManagerAsync(resourcemanagerhandle: Handle, transactionnotification: MutPtr<TransactionNotification>, transactionnotificationlength: UInt, returnlength: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetNotificationResourceManagerAsync(resourcemanagerhandle.rawAddress.toString(), transactionnotification.rawAddress.toString(), transactionnotificationlength.toInt(), returnlength.rawAddress.toString(), lpoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getShortPathNameA(lpszlongpath: Pcstr, lpszshortpath: Pstr, cchbuffer: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetShortPathNameA(lpszlongpath.rawAddress.toString(), lpszshortpath.rawAddress.toString(), cchbuffer.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getShortPathNameW(lpszlongpath: Pcwstr, lpszshortpath: Pwstr, cchbuffer: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetShortPathNameW(lpszlongpath.rawAddress.toString(), lpszshortpath.rawAddress.toString(), cchbuffer.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTapeParameters(hdevice: Handle, dwoperation: GetTapeDriveParametersOperation, lpdwsize: MutPtr<UInt>, lptapeinformation: MutPtr<CVoid>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetTapeParameters(hdevice.rawAddress.toString(), dwoperation.toInt(), lpdwsize.rawAddress.toString(), lptapeinformation.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTapePosition(hdevice: Handle, dwpositiontype: TapePositionType, lpdwpartition: MutPtr<UInt>, lpdwoffsetlow: MutPtr<UInt>, lpdwoffsethigh: MutPtr<UInt>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetTapePosition(hdevice.rawAddress.toString(), dwpositiontype.toInt(), lpdwpartition.rawAddress.toString(), lpdwoffsetlow.rawAddress.toString(), lpdwoffsethigh.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTapeStatus(hdevice: Handle): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetTapeStatus(hdevice.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTempFileNameA(lppathname: Pcstr, lpprefixstring: Pcstr, uunique: UInt, lptempfilename: Pstr): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetTempFileNameA(lppathname.rawAddress.toString(), lpprefixstring.rawAddress.toString(), uunique.toInt(), lptempfilename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTempFileNameW(lppathname: Pcwstr, lpprefixstring: Pcwstr, uunique: UInt, lptempfilename: Pwstr): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetTempFileNameW(lppathname.rawAddress.toString(), lpprefixstring.rawAddress.toString(), uunique.toInt(), lptempfilename.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTempPath2A(bufferlength: UInt, buffer: Pstr): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetTempPath2A(bufferlength.toInt(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTempPath2W(bufferlength: UInt, buffer: Pwstr): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetTempPath2W(bufferlength.toInt(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTempPathA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetTempPathA(nbufferlength.toInt(), lpbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTempPathW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetTempPathW(nbufferlength.toInt(), lpbuffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTransactionId(transactionhandle: Handle, transactionid: MutPtr<Guid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetTransactionId(transactionhandle.rawAddress.toString(), transactionid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTransactionInformation(transactionhandle: Handle, outcome: MutPtr<UInt>, isolationlevel: MutPtr<UInt>, isolationflags: MutPtr<UInt>, timeout: MutPtr<UInt>, bufferlength: UInt, description: Pwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetTransactionInformation(transactionhandle.rawAddress.toString(), outcome.rawAddress.toString(), isolationlevel.rawAddress.toString(), isolationflags.rawAddress.toString(), timeout.rawAddress.toString(), bufferlength.toInt(), description.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTransactionManagerId(transactionmanagerhandle: Handle, transactionmanagerid: MutPtr<Guid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetTransactionManagerId(transactionmanagerhandle.rawAddress.toString(), transactionmanagerid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumeInformationA(lprootpathname: Pcstr, lpvolumenamebuffer: Pstr, nvolumenamesize: UInt, lpvolumeserialnumber: MutPtr<UInt>, lpmaximumcomponentlength: MutPtr<UInt>, lpfilesystemflags: MutPtr<UInt>, lpfilesystemnamebuffer: Pstr, nfilesystemnamesize: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetVolumeInformationA(lprootpathname.rawAddress.toString(), lpvolumenamebuffer.rawAddress.toString(), nvolumenamesize.toInt(), lpvolumeserialnumber.rawAddress.toString(), lpmaximumcomponentlength.rawAddress.toString(), lpfilesystemflags.rawAddress.toString(), lpfilesystemnamebuffer.rawAddress.toString(), nfilesystemnamesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumeInformationByHandleW(hfile: Handle, lpvolumenamebuffer: Pwstr, nvolumenamesize: UInt, lpvolumeserialnumber: MutPtr<UInt>, lpmaximumcomponentlength: MutPtr<UInt>, lpfilesystemflags: MutPtr<UInt>, lpfilesystemnamebuffer: Pwstr, nfilesystemnamesize: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetVolumeInformationByHandleW(hfile.rawAddress.toString(), lpvolumenamebuffer.rawAddress.toString(), nvolumenamesize.toInt(), lpvolumeserialnumber.rawAddress.toString(), lpmaximumcomponentlength.rawAddress.toString(), lpfilesystemflags.rawAddress.toString(), lpfilesystemnamebuffer.rawAddress.toString(), nfilesystemnamesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumeInformationW(lprootpathname: Pcwstr, lpvolumenamebuffer: Pwstr, nvolumenamesize: UInt, lpvolumeserialnumber: MutPtr<UInt>, lpmaximumcomponentlength: MutPtr<UInt>, lpfilesystemflags: MutPtr<UInt>, lpfilesystemnamebuffer: Pwstr, nfilesystemnamesize: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetVolumeInformationW(lprootpathname.rawAddress.toString(), lpvolumenamebuffer.rawAddress.toString(), nvolumenamesize.toInt(), lpvolumeserialnumber.rawAddress.toString(), lpmaximumcomponentlength.rawAddress.toString(), lpfilesystemflags.rawAddress.toString(), lpfilesystemnamebuffer.rawAddress.toString(), nfilesystemnamesize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumeNameForVolumeMountPointA(lpszvolumemountpoint: Pcstr, lpszvolumename: Pstr, cchbufferlength: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetVolumeNameForVolumeMountPointA(lpszvolumemountpoint.rawAddress.toString(), lpszvolumename.rawAddress.toString(), cchbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumeNameForVolumeMountPointW(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetVolumeNameForVolumeMountPointW(lpszvolumemountpoint.rawAddress.toString(), lpszvolumename.rawAddress.toString(), cchbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumePathNameA(lpszfilename: Pcstr, lpszvolumepathname: Pstr, cchbufferlength: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetVolumePathNameA(lpszfilename.rawAddress.toString(), lpszvolumepathname.rawAddress.toString(), cchbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumePathNameW(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, cchbufferlength: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetVolumePathNameW(lpszfilename.rawAddress.toString(), lpszvolumepathname.rawAddress.toString(), cchbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumePathNamesForVolumeNameA(lpszvolumename: Pcstr, lpszvolumepathnames: Pstr, cchbufferlength: UInt, lpcchreturnlength: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetVolumePathNamesForVolumeNameA(lpszvolumename.rawAddress.toString(), lpszvolumepathnames.rawAddress.toString(), cchbufferlength.toInt(), lpcchreturnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getVolumePathNamesForVolumeNameW(lpszvolumename: Pcwstr, lpszvolumepathnames: Pwstr, cchbufferlength: UInt, lpcchreturnlength: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemGetVolumePathNamesForVolumeNameW(lpszvolumename.rawAddress.toString(), lpszvolumepathnames.rawAddress.toString(), cchbufferlength.toInt(), lpcchreturnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun handleLogFull(hlog: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemHandleLogFull(hlog.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun installLogPolicy(hlog: Handle, ppolicy: MutPtr<ClfsMgmtPolicy>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemInstallLogPolicy(hlog.rawAddress.toString(), ppolicy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isIoRingOpSupported(ioring: Hioring, op: IoringOpCode): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemIsIoRingOpSupported(ioring.rawAddress.toString(), op) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZClose(hfile: Int) {
    if (windowsWin32StorageFilesystemNapiAddon != null) {
        windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLZClose(hfile)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lZCopy(hfsource: Int, hfdest: Int): Int =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLZCopy(hfsource, hfdest) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZDone() {
    if (windowsWin32StorageFilesystemNapiAddon != null) {
        windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLZDone()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun lZInit(hfsource: Int): Int =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLZInit(hfsource) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZOpenFileA(lpfilename: Pcstr, lpreopenbuf: MutPtr<Ofstruct>, wstyle: LzopenfileStyle): Int =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLZOpenFileA(lpfilename.rawAddress.toString(), lpreopenbuf.rawAddress.toString(), wstyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZOpenFileW(lpfilename: Pcwstr, lpreopenbuf: MutPtr<Ofstruct>, wstyle: LzopenfileStyle): Int =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLZOpenFileW(lpfilename.rawAddress.toString(), lpreopenbuf.rawAddress.toString(), wstyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZRead(hfile: Int, lpbuffer: Pstr, cbread: Int): Int =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLZRead(hfile, lpbuffer.rawAddress.toString(), cbread) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZSeek(hfile: Int, loffset: Int, iorigin: Int): Int =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLZSeek(hfile, loffset, iorigin) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lZStart(): Int =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLZStart() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun localFileTimeToFileTime(lplocalfiletime: ConstPtr<Filetime>, lpfiletime: MutPtr<Filetime>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLocalFileTimeToFileTime(lplocalfiletime.rawAddress.toString(), lpfiletime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockFile(hfile: Handle, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLockFile(hfile.rawAddress.toString(), dwfileoffsetlow.toInt(), dwfileoffsethigh.toInt(), nnumberofbytestolocklow.toInt(), nnumberofbytestolockhigh.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockFileEx(hfile: Handle, dwflags: LockFileFlags, dwreserved: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt, lpoverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLockFileEx(hfile.rawAddress.toString(), dwflags.toInt(), dwreserved.toInt(), nnumberofbytestolocklow.toInt(), nnumberofbytestolockhigh.toInt(), lpoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logTailAdvanceFailure(hlog: Handle, dwreason: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLogTailAdvanceFailure(hlog.rawAddress.toString(), dwreason.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnBlockOffset(plsn: ConstPtr<ClsLsn>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLsnBlockOffset(plsn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnContainer(plsn: ConstPtr<ClsLsn>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLsnContainer(plsn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnEqual(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLsnEqual(plsn1.rawAddress.toString(), plsn2.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnGreater(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLsnGreater(plsn1.rawAddress.toString(), plsn2.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnIncrement(plsn: ConstPtr<ClsLsn>): ClsLsn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnInvalid(plsn: ConstPtr<ClsLsn>): Boolean =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLsnInvalid(plsn.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnLess(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLsnLess(plsn1.rawAddress.toString(), plsn2.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnNull(plsn: ConstPtr<ClsLsn>): Boolean =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLsnNull(plsn.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsnRecordSequence(plsn: ConstPtr<ClsLsn>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemLsnRecordSequence(plsn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemMoveFileA(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileExA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, dwflags: MoveFileFlags): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemMoveFileExA(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileExW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: MoveFileFlags): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemMoveFileExW(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileFromAppW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemMoveFileFromAppW(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileTransactedA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, dwflags: MoveFileFlags, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemMoveFileTransactedA(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), 0L.toString(), lpdata.rawAddress.toString(), dwflags.toInt(), htransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileTransactedW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, dwflags: MoveFileFlags, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemMoveFileTransactedW(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), 0L.toString(), lpdata.rawAddress.toString(), dwflags.toInt(), htransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemMoveFileW(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileWithProgressA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, dwflags: MoveFileFlags): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemMoveFileWithProgressA(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), 0L.toString(), lpdata.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveFileWithProgressW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, dwflags: MoveFileFlags): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemMoveFileWithProgressW(lpexistingfilename.rawAddress.toString(), lpnewfilename.rawAddress.toString(), 0L.toString(), lpdata.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netConnectionEnum(servername: Pcwstr, qualifier: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemNetConnectionEnum(servername.rawAddress.toString(), qualifier.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netFileClose(servername: Pcwstr, fileid: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemNetFileClose(servername.rawAddress.toString(), fileid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netFileEnum(servername: Pcwstr, basepath: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<ULong>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemNetFileEnum(servername.rawAddress.toString(), basepath.rawAddress.toString(), username.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netFileGetInfo(servername: Pcwstr, fileid: UInt, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemNetFileGetInfo(servername.rawAddress.toString(), fileid.toInt(), level.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerAliasAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemNetServerAliasAdd(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerAliasDel(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemNetServerAliasDel(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netServerAliasEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemNetServerAliasEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumehandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netSessionDel(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemNetSessionDel(servername.rawAddress.toString(), uncclientname.rawAddress.toString(), username.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netSessionEnum(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemNetSessionEnum(servername.rawAddress.toString(), uncclientname.rawAddress.toString(), username.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netSessionGetInfo(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemNetSessionGetInfo(servername.rawAddress.toString(), uncclientname.rawAddress.toString(), username.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemNetShareAdd(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareCheck(servername: Pcwstr, device: Pcwstr, type: MutPtr<UInt>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemNetShareCheck(servername.rawAddress.toString(), device.rawAddress.toString(), type.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareDel(servername: Pcwstr, netname: Pcwstr, reserved: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemNetShareDel(servername.rawAddress.toString(), netname.rawAddress.toString(), reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareDelEx(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemNetShareDelEx(servername.rawAddress.toString(), level.toInt(), buf.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareDelSticky(servername: Pcwstr, netname: Pcwstr, reserved: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemNetShareDelSticky(servername.rawAddress.toString(), netname.rawAddress.toString(), reserved.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemNetShareEnum(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareEnumSticky(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemNetShareEnumSticky(servername.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString(), prefmaxlen.toInt(), entriesread.rawAddress.toString(), totalentries.rawAddress.toString(), resumeHandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareGetInfo(servername: Pcwstr, netname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemNetShareGetInfo(servername.rawAddress.toString(), netname.rawAddress.toString(), level.toInt(), bufptr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netShareSetInfo(servername: Pcwstr, netname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemNetShareSetInfo(servername.rawAddress.toString(), netname.rawAddress.toString(), level.toInt(), buf.rawAddress.toString(), parmErr.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun netStatisticsGet(servername: ConstPtr<Byte>, service: ConstPtr<Byte>, level: UInt, options: UInt, buffer: MutPtr<MutPtr<UByte>>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemNetStatisticsGet(servername.rawAddress.toString(), service.rawAddress.toString(), level.toInt(), options.toInt(), buffer.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openEncryptedFileRawA(lpfilename: Pcstr, ulflags: UInt, pvcontext: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemOpenEncryptedFileRawA(lpfilename.rawAddress.toString(), ulflags.toInt(), pvcontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openEncryptedFileRawW(lpfilename: Pcwstr, ulflags: UInt, pvcontext: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemOpenEncryptedFileRawW(lpfilename.rawAddress.toString(), ulflags.toInt(), pvcontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openEnlistment(dwdesiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentid: MutPtr<Guid>): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemOpenEnlistment(dwdesiredaccess.toInt(), resourcemanagerhandle.rawAddress.toString(), enlistmentid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openFile(lpfilename: Pcstr, lpreopenbuff: MutPtr<Ofstruct>, ustyle: UInt): Int =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemOpenFile(lpfilename.rawAddress.toString(), lpreopenbuff.rawAddress.toString(), ustyle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openFileById(hvolumehint: Handle, lpfileid: ConstPtr<FileIdDescriptor>, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwflagsandattributes: FileFlagsAndAttributes): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemOpenFileById(hvolumehint.rawAddress.toString(), lpfileid.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress.toString(), dwflagsandattributes.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openResourceManager(dwdesiredaccess: UInt, tmhandle: Handle, resourcemanagerid: MutPtr<Guid>): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemOpenResourceManager(dwdesiredaccess.toInt(), tmhandle.rawAddress.toString(), resourcemanagerid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTransaction(dwdesiredaccess: UInt, transactionid: MutPtr<Guid>): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemOpenTransaction(dwdesiredaccess.toInt(), transactionid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTransactionManager(logfilename: Pcwstr, desiredaccess: UInt, openoptions: UInt): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemOpenTransactionManager(logfilename.rawAddress.toString(), desiredaccess.toInt(), openoptions.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openTransactionManagerById(transactionmanagerid: ConstPtr<Guid>, desiredaccess: UInt, openoptions: UInt): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemOpenTransactionManagerById(transactionmanagerid.rawAddress.toString(), desiredaccess.toInt(), openoptions.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun popIoRingCompletion(ioring: Hioring, cqe: MutPtr<IoringCqe>): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemPopIoRingCompletion(ioring.rawAddress.toString(), cqe.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemPrePrepareComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemPrePrepareEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prepareComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemPrepareComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemPrepareEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prepareLogArchive(hlog: Handle, pszbaselogfilename: Pwstr, clen: UInt, plsnlow: ConstPtr<ClsLsn>, plsnhigh: ConstPtr<ClsLsn>, pcactuallength: MutPtr<UInt>, poffbaselogfiledata: MutPtr<ULong>, pcbbaselogfilelength: MutPtr<ULong>, plsnbase: MutPtr<ClsLsn>, plsnlast: MutPtr<ClsLsn>, plsncurrentarchivetail: MutPtr<ClsLsn>, ppvarchivecontext: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemPrepareLogArchive(hlog.rawAddress.toString(), pszbaselogfilename.rawAddress.toString(), clen.toInt(), plsnlow.rawAddress.toString(), plsnhigh.rawAddress.toString(), pcactuallength.rawAddress.toString(), poffbaselogfiledata.rawAddress.toString(), pcbbaselogfilelength.rawAddress.toString(), plsnbase.rawAddress.toString(), plsnlast.rawAddress.toString(), plsncurrentarchivetail.rawAddress.toString(), ppvarchivecontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun prepareTape(hdevice: Handle, dwoperation: PrepareTapeOperation, bimmediate: Bool): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemPrepareTape(hdevice.rawAddress.toString(), dwoperation.toInt(), bimmediate) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryDosDeviceA(lpdevicename: Pcstr, lptargetpath: Pstr, ucchmax: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemQueryDosDeviceA(lpdevicename.rawAddress.toString(), lptargetpath.rawAddress.toString(), ucchmax.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryDosDeviceW(lpdevicename: Pcwstr, lptargetpath: Pwstr, ucchmax: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemQueryDosDeviceW(lpdevicename.rawAddress.toString(), lptargetpath.rawAddress.toString(), ucchmax.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryIoRingCapabilities(capabilities: MutPtr<IoringCapabilities>): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemQueryIoRingCapabilities(capabilities.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryLogPolicy(hlog: Handle, epolicytype: ClfsMgmtPolicyType, ppolicybuffer: MutPtr<ClfsMgmtPolicy>, pcbpolicybuffer: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemQueryLogPolicy(hlog.rawAddress.toString(), epolicytype, ppolicybuffer.rawAddress.toString(), pcbpolicybuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryRecoveryAgentsOnEncryptedFile(lpfilename: Pcwstr, precoveryagents: MutPtr<MutPtr<EncryptionCertificateHashList>>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemQueryRecoveryAgentsOnEncryptedFile(lpfilename.rawAddress.toString(), precoveryagents.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryUsersOnEncryptedFile(lpfilename: Pcwstr, pusers: MutPtr<MutPtr<EncryptionCertificateHashList>>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemQueryUsersOnEncryptedFile(lpfilename.rawAddress.toString(), pusers.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reOpenFile(horiginalfile: Handle, dwdesiredaccess: UInt, dwsharemode: FileShareMode, dwflagsandattributes: FileFlagsAndAttributes): Handle =
    if (windowsWin32StorageFilesystemNapiAddon != null) MutPtr((windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemReOpenFile(horiginalfile.rawAddress.toString(), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwflagsandattributes.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readDirectoryChangesExW(hdirectory: Handle, lpbuffer: MutPtr<CVoid>, nbufferlength: UInt, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange, lpbytesreturned: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpoverlappedCompletionRoutine, readdirectorynotifyinformationclass: ReadDirectoryNotifyInformationClass): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemReadDirectoryChangesExW(hdirectory.rawAddress.toString(), lpbuffer.rawAddress.toString(), nbufferlength.toInt(), bwatchsubtree, dwnotifyfilter.toInt(), lpbytesreturned.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString(), readdirectorynotifyinformationclass) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readDirectoryChangesW(hdirectory: Handle, lpbuffer: MutPtr<CVoid>, nbufferlength: UInt, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange, lpbytesreturned: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemReadDirectoryChangesW(hdirectory.rawAddress.toString(), lpbuffer.rawAddress.toString(), nbufferlength.toInt(), bwatchsubtree, dwnotifyfilter.toInt(), lpbytesreturned.rawAddress.toString(), lpoverlapped.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readEncryptedFileRaw(pfexportcallback: PfeExportFunc, pvcallbackcontext: ConstPtr<CVoid>, pvcontext: ConstPtr<CVoid>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemReadEncryptedFileRaw(0L.toString(), pvcallbackcontext.rawAddress.toString(), pvcontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readFile(hfile: Handle, lpbuffer: MutPtr<UByte>, nnumberofbytestoread: UInt, lpnumberofbytesread: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemReadFile(hfile.rawAddress.toString(), lpbuffer.rawAddress.toString(), nnumberofbytestoread.toInt(), lpnumberofbytesread.rawAddress.toString(), lpoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readFileEx(hfile: Handle, lpbuffer: MutPtr<UByte>, nnumberofbytestoread: UInt, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemReadFileEx(hfile.rawAddress.toString(), lpbuffer.rawAddress.toString(), nnumberofbytestoread.toInt(), lpoverlapped.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readFileScatter(hfile: Handle, asegmentarray: ConstPtr<FileSegmentElement>, nnumberofbytestoread: UInt, lpreserved: ConstPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemReadFileScatter(hfile.rawAddress.toString(), asegmentarray.rawAddress.toString(), nnumberofbytestoread.toInt(), lpreserved.rawAddress.toString(), lpoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readLogArchiveMetadata(pvarchivecontext: MutPtr<CVoid>, cboffset: UInt, cbbytestoread: UInt, pbreadbuffer: MutPtr<UByte>, pcbbytesread: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemReadLogArchiveMetadata(pvarchivecontext.rawAddress.toString(), cboffset.toInt(), cbbytestoread.toInt(), pbreadbuffer.rawAddress.toString(), pcbbytesread.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readLogNotification(hlog: Handle, pnotification: MutPtr<ClfsMgmtNotification>, lpoverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemReadLogNotification(hlog.rawAddress.toString(), pnotification.rawAddress.toString(), lpoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readLogRecord(pvmarshal: MutPtr<CVoid>, plsnfirst: MutPtr<ClsLsn>, econtextmode: ClfsContextMode, ppvreadbuffer: MutPtr<MutPtr<CVoid>>, pcbreadbuffer: MutPtr<UInt>, perecordtype: MutPtr<UByte>, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, ppvreadcontext: MutPtr<MutPtr<CVoid>>, poverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemReadLogRecord(pvmarshal.rawAddress.toString(), plsnfirst.rawAddress.toString(), econtextmode, ppvreadbuffer.rawAddress.toString(), pcbreadbuffer.rawAddress.toString(), perecordtype.rawAddress.toString(), plsnundonext.rawAddress.toString(), plsnprevious.rawAddress.toString(), ppvreadcontext.rawAddress.toString(), poverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readLogRestartArea(pvmarshal: MutPtr<CVoid>, ppvrestartbuffer: MutPtr<MutPtr<CVoid>>, pcbrestartbuffer: MutPtr<UInt>, plsn: MutPtr<ClsLsn>, ppvcontext: MutPtr<MutPtr<CVoid>>, poverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemReadLogRestartArea(pvmarshal.rawAddress.toString(), ppvrestartbuffer.rawAddress.toString(), pcbrestartbuffer.rawAddress.toString(), plsn.rawAddress.toString(), ppvcontext.rawAddress.toString(), poverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readNextLogRecord(pvreadcontext: MutPtr<CVoid>, ppvbuffer: MutPtr<MutPtr<CVoid>>, pcbbuffer: MutPtr<UInt>, perecordtype: MutPtr<UByte>, plsnuser: MutPtr<ClsLsn>, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, plsnrecord: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemReadNextLogRecord(pvreadcontext.rawAddress.toString(), ppvbuffer.rawAddress.toString(), pcbbuffer.rawAddress.toString(), perecordtype.rawAddress.toString(), plsnuser.rawAddress.toString(), plsnundonext.rawAddress.toString(), plsnprevious.rawAddress.toString(), plsnrecord.rawAddress.toString(), poverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemReadOnlyEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readPreviousLogRestartArea(pvreadcontext: MutPtr<CVoid>, ppvrestartbuffer: MutPtr<MutPtr<CVoid>>, pcbrestartbuffer: MutPtr<UInt>, plsnrestart: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemReadPreviousLogRestartArea(pvreadcontext.rawAddress.toString(), ppvrestartbuffer.rawAddress.toString(), pcbrestartbuffer.rawAddress.toString(), plsnrestart.rawAddress.toString(), poverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recoverEnlistment(enlistmenthandle: Handle, enlistmentkey: MutPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemRecoverEnlistment(enlistmenthandle.rawAddress.toString(), enlistmentkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recoverResourceManager(resourcemanagerhandle: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemRecoverResourceManager(resourcemanagerhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recoverTransactionManager(transactionmanagerhandle: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemRecoverTransactionManager(transactionmanagerhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerForLogWriteNotification(hlog: Handle, cbthreshold: UInt, fenable: Bool): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemRegisterForLogWriteNotification(hlog.rawAddress.toString(), cbthreshold.toInt(), fenable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerManageableLogClient(hlog: Handle, pcallbacks: MutPtr<LogManagementCallbacks>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemRegisterManageableLogClient(hlog.rawAddress.toString(), pcallbacks.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeDirectoryA(lppathname: Pcstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemRemoveDirectoryA(lppathname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeDirectoryFromAppW(lppathname: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemRemoveDirectoryFromAppW(lppathname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeDirectoryTransactedA(lppathname: Pcstr, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemRemoveDirectoryTransactedA(lppathname.rawAddress.toString(), htransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeDirectoryTransactedW(lppathname: Pcwstr, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemRemoveDirectoryTransactedW(lppathname.rawAddress.toString(), htransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeDirectoryW(lppathname: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemRemoveDirectoryW(lppathname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeLogContainer(hlog: Handle, pwszcontainerpath: Pcwstr, fforce: Bool, preserved: MutPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemRemoveLogContainer(hlog.rawAddress.toString(), pwszcontainerpath.rawAddress.toString(), fforce, preserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeLogContainerSet(hlog: Handle, ccontainer: UShort, rgwszcontainerpath: ConstPtr<Pcwstr>, fforce: Bool, preserved: MutPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemRemoveLogContainerSet(hlog.rawAddress.toString(), ccontainer.toInt(), rgwszcontainerpath.rawAddress.toString(), fforce, preserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeLogPolicy(hlog: Handle, epolicytype: ClfsMgmtPolicyType): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemRemoveLogPolicy(hlog.rawAddress.toString(), epolicytype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeUsersFromEncryptedFile(lpfilename: Pcwstr, phashes: ConstPtr<EncryptionCertificateHashList>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemRemoveUsersFromEncryptedFile(lpfilename.rawAddress.toString(), phashes.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun renameTransactionManager(logfilename: Pcwstr, existingtransactionmanagerguid: MutPtr<Guid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemRenameTransactionManager(logfilename.rawAddress.toString(), existingtransactionmanagerguid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replaceFileA(lpreplacedfilename: Pcstr, lpreplacementfilename: Pcstr, lpbackupfilename: Pcstr, dwreplaceflags: ReplaceFileFlags, lpexclude: ConstPtr<CVoid>, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemReplaceFileA(lpreplacedfilename.rawAddress.toString(), lpreplacementfilename.rawAddress.toString(), lpbackupfilename.rawAddress.toString(), dwreplaceflags.toInt(), lpexclude.rawAddress.toString(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replaceFileFromAppW(lpreplacedfilename: Pcwstr, lpreplacementfilename: Pcwstr, lpbackupfilename: Pcwstr, dwreplaceflags: UInt, lpexclude: ConstPtr<CVoid>, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemReplaceFileFromAppW(lpreplacedfilename.rawAddress.toString(), lpreplacementfilename.rawAddress.toString(), lpbackupfilename.rawAddress.toString(), dwreplaceflags.toInt(), lpexclude.rawAddress.toString(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun replaceFileW(lpreplacedfilename: Pcwstr, lpreplacementfilename: Pcwstr, lpbackupfilename: Pcwstr, dwreplaceflags: ReplaceFileFlags, lpexclude: ConstPtr<CVoid>, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemReplaceFileW(lpreplacedfilename.rawAddress.toString(), lpreplacementfilename.rawAddress.toString(), lpbackupfilename.rawAddress.toString(), dwreplaceflags.toInt(), lpexclude.rawAddress.toString(), lpreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reserveAndAppendLog(pvmarshal: MutPtr<CVoid>, rgwriteentries: MutPtr<ClsWriteEntry>, cwriteentries: UInt, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, creserverecords: UInt, rgcbreservation: MutPtr<Long>, fflags: ClfsFlag, plsn: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemReserveAndAppendLog(pvmarshal.rawAddress.toString(), rgwriteentries.rawAddress.toString(), cwriteentries.toInt(), plsnundonext.rawAddress.toString(), plsnprevious.rawAddress.toString(), creserverecords.toInt(), rgcbreservation.rawAddress.toString(), fflags.toInt(), plsn.rawAddress.toString(), poverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reserveAndAppendLogAligned(pvmarshal: MutPtr<CVoid>, rgwriteentries: MutPtr<ClsWriteEntry>, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, creserverecords: UInt, rgcbreservation: MutPtr<Long>, fflags: ClfsFlag, plsn: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemReserveAndAppendLogAligned(pvmarshal.rawAddress.toString(), rgwriteentries.rawAddress.toString(), cwriteentries.toInt(), cbentryalignment.toInt(), plsnundonext.rawAddress.toString(), plsnprevious.rawAddress.toString(), creserverecords.toInt(), rgcbreservation.rawAddress.toString(), fflags.toInt(), plsn.rawAddress.toString(), poverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rollbackComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemRollbackComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemRollbackEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rollbackTransaction(transactionhandle: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemRollbackTransaction(transactionhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rollbackTransactionAsync(transactionhandle: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemRollbackTransactionAsync(transactionhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemRollforwardTransactionManager(transactionmanagerhandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scanLogContainers(pcxscan: MutPtr<ClsScanContext>, escanmode: UByte, preserved: MutPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemScanLogContainers(pcxscan.rawAddress.toString(), escanmode.toInt(), preserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun searchPathA(lppath: Pcstr, lpfilename: Pcstr, lpextension: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: MutPtr<Pstr>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSearchPathA(lppath.rawAddress.toString(), lpfilename.rawAddress.toString(), lpextension.rawAddress.toString(), nbufferlength.toInt(), lpbuffer.rawAddress.toString(), lpfilepart.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun searchPathW(lppath: Pcwstr, lpfilename: Pcwstr, lpextension: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: MutPtr<Pwstr>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSearchPathW(lppath.rawAddress.toString(), lpfilename.rawAddress.toString(), lpextension.rawAddress.toString(), nbufferlength.toInt(), lpbuffer.rawAddress.toString(), lpfilepart.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEncryptedFileMetadata(lpfilename: Pcwstr, pboldmetadata: ConstPtr<UByte>, pbnewmetadata: ConstPtr<UByte>, pownerhash: ConstPtr<EncryptionCertificateHash>, dwoperation: UInt, pcertificatesadded: ConstPtr<EncryptionCertificateHashList>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetEncryptedFileMetadata(lpfilename.rawAddress.toString(), pboldmetadata.rawAddress.toString(), pbnewmetadata.rawAddress.toString(), pownerhash.rawAddress.toString(), dwoperation.toInt(), pcertificatesadded.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEndOfFile(hfile: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetEndOfFile(hfile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEndOfLog(hlog: Handle, plsnend: MutPtr<ClsLsn>, lpoverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetEndOfLog(hlog.rawAddress.toString(), plsnend.rawAddress.toString(), lpoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnlistmentRecoveryInformation(enlistmenthandle: Handle, buffersize: UInt, buffer: MutPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetEnlistmentRecoveryInformation(enlistmenthandle.rawAddress.toString(), buffersize.toInt(), buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileApisToANSI() {
    if (windowsWin32StorageFilesystemNapiAddon != null) {
        windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetFileApisToANSI()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setFileApisToOEM() {
    if (windowsWin32StorageFilesystemNapiAddon != null) {
        windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetFileApisToOEM()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setFileAttributesA(lpfilename: Pcstr, dwfileattributes: FileFlagsAndAttributes): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetFileAttributesA(lpfilename.rawAddress.toString(), dwfileattributes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileAttributesFromAppW(lpfilename: Pcwstr, dwfileattributes: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetFileAttributesFromAppW(lpfilename.rawAddress.toString(), dwfileattributes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileAttributesTransactedA(lpfilename: Pcstr, dwfileattributes: UInt, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetFileAttributesTransactedA(lpfilename.rawAddress.toString(), dwfileattributes.toInt(), htransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileAttributesTransactedW(lpfilename: Pcwstr, dwfileattributes: UInt, htransaction: Handle): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetFileAttributesTransactedW(lpfilename.rawAddress.toString(), dwfileattributes.toInt(), htransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileAttributesW(lpfilename: Pcwstr, dwfileattributes: FileFlagsAndAttributes): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetFileAttributesW(lpfilename.rawAddress.toString(), dwfileattributes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileBandwidthReservation(hfile: Handle, nperiodmilliseconds: UInt, nbytesperperiod: UInt, bdiscardable: Bool, lptransfersize: MutPtr<UInt>, lpnumoutstandingrequests: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetFileBandwidthReservation(hfile.rawAddress.toString(), nperiodmilliseconds.toInt(), nbytesperperiod.toInt(), bdiscardable, lptransfersize.rawAddress.toString(), lpnumoutstandingrequests.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileCompletionNotificationModes(filehandle: Handle, flags: UByte): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetFileCompletionNotificationModes(filehandle.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileInformationByHandle(hfile: Handle, fileinformationclass: FileInfoByHandleClass, lpfileinformation: ConstPtr<CVoid>, dwbuffersize: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetFileInformationByHandle(hfile.rawAddress.toString(), fileinformationclass, lpfileinformation.rawAddress.toString(), dwbuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileIoOverlappedRange(filehandle: Handle, overlappedrangestart: ConstPtr<UByte>, length: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetFileIoOverlappedRange(filehandle.rawAddress.toString(), overlappedrangestart.rawAddress.toString(), length.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFilePointer(hfile: Handle, ldistancetomove: Int, lpdistancetomovehigh: MutPtr<Int>, dwmovemethod: SetFilePointerMoveMethod): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetFilePointer(hfile.rawAddress.toString(), ldistancetomove, lpdistancetomovehigh.rawAddress.toString(), dwmovemethod.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFilePointerEx(hfile: Handle, lidistancetomove: Long, lpnewfilepointer: MutPtr<Long>, dwmovemethod: SetFilePointerMoveMethod): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetFilePointerEx(hfile.rawAddress.toString(), lidistancetomove.toString(), lpnewfilepointer.rawAddress.toString(), dwmovemethod.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileShortNameA(hfile: Handle, lpshortname: Pcstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetFileShortNameA(hfile.rawAddress.toString(), lpshortname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileShortNameW(hfile: Handle, lpshortname: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetFileShortNameW(hfile.rawAddress.toString(), lpshortname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileTime(hfile: Handle, lpcreationtime: ConstPtr<Filetime>, lplastaccesstime: ConstPtr<Filetime>, lplastwritetime: ConstPtr<Filetime>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetFileTime(hfile.rawAddress.toString(), lpcreationtime.rawAddress.toString(), lplastaccesstime.rawAddress.toString(), lplastwritetime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setFileValidData(hfile: Handle, validdatalength: Long): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetFileValidData(hfile.rawAddress.toString(), validdatalength.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setIoRingCompletionEvent(ioring: Hioring, hevent: Handle): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetIoRingCompletionEvent(ioring.rawAddress.toString(), hevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLogArchiveMode(hlog: Handle, emode: ClfsLogArchiveMode): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetLogArchiveMode(hlog.rawAddress.toString(), emode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLogArchiveTail(hlog: Handle, plsnarchivetail: MutPtr<ClsLsn>, preserved: MutPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetLogArchiveTail(hlog.rawAddress.toString(), plsnarchivetail.rawAddress.toString(), preserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLogFileSizeWithPolicy(hlog: Handle, pdesiredsize: ConstPtr<ULong>, presultingsize: MutPtr<ULong>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetLogFileSizeWithPolicy(hlog.rawAddress.toString(), pdesiredsize.rawAddress.toString(), presultingsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setResourceManagerCompletionPort(resourcemanagerhandle: Handle, iocompletionporthandle: Handle, completionkey: ULong): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetResourceManagerCompletionPort(resourcemanagerhandle.rawAddress.toString(), iocompletionporthandle.rawAddress.toString(), completionkey.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSearchPathMode(flags: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetSearchPathMode(flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTapeParameters(hdevice: Handle, dwoperation: TapeInformationType, lptapeinformation: ConstPtr<CVoid>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetTapeParameters(hdevice.rawAddress.toString(), dwoperation.toInt(), lptapeinformation.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTapePosition(hdevice: Handle, dwpositionmethod: TapePositionMethod, dwpartition: UInt, dwoffsetlow: UInt, dwoffsethigh: UInt, bimmediate: Bool): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetTapePosition(hdevice.rawAddress.toString(), dwpositionmethod.toInt(), dwpartition.toInt(), dwoffsetlow.toInt(), dwoffsethigh.toInt(), bimmediate) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTransactionInformation(transactionhandle: Handle, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetTransactionInformation(transactionhandle.rawAddress.toString(), isolationlevel.toInt(), isolationflags.toInt(), timeout.toInt(), description.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserFileEncryptionKey(pencryptioncertificate: ConstPtr<EncryptionCertificate>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetUserFileEncryptionKey(pencryptioncertificate.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUserFileEncryptionKeyEx(pencryptioncertificate: ConstPtr<EncryptionCertificate>, dwcapabilities: UInt, dwflags: UInt, pvreserved: ConstPtr<CVoid>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetUserFileEncryptionKeyEx(pencryptioncertificate.rawAddress.toString(), dwcapabilities.toInt(), dwflags.toInt(), pvreserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVolumeLabelA(lprootpathname: Pcstr, lpvolumename: Pcstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetVolumeLabelA(lprootpathname.rawAddress.toString(), lpvolumename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVolumeLabelW(lprootpathname: Pcwstr, lpvolumename: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetVolumeLabelW(lprootpathname.rawAddress.toString(), lpvolumename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVolumeMountPointA(lpszvolumemountpoint: Pcstr, lpszvolumename: Pcstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetVolumeMountPointA(lpszvolumemountpoint.rawAddress.toString(), lpszvolumename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setVolumeMountPointW(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pcwstr): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSetVolumeMountPointW(lpszvolumemountpoint.rawAddress.toString(), lpszvolumename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun singlePhaseReject(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSinglePhaseReject(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun submitIoRing(ioring: Hioring, waitoperations: UInt, milliseconds: UInt, submittedentries: MutPtr<UInt>): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemSubmitIoRing(ioring.rawAddress.toString(), waitoperations.toInt(), milliseconds.toInt(), submittedentries.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateLogArchive(pvarchivecontext: MutPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemTerminateLogArchive(pvarchivecontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun terminateReadLog(pvcursorcontext: MutPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemTerminateReadLog(pvcursorcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun truncateLog(pvmarshal: ConstPtr<CVoid>, plsnend: ConstPtr<ClsLsn>, lpoverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemTruncateLog(pvmarshal.rawAddress.toString(), plsnend.rawAddress.toString(), lpoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfGetThreadMiniVersionForCreate(miniversion: MutPtr<UShort>) {
    if (windowsWin32StorageFilesystemNapiAddon != null) {
        windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemTxfGetThreadMiniVersionForCreate(miniversion.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun txfLogCreateFileReadContext(logpath: Pcwstr, beginninglsn: ClsLsn, endinglsn: ClsLsn, txffileid: ConstPtr<TxfId>, txflogcontext: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfLogCreateRangeReadContext(logpath: Pcwstr, beginninglsn: ClsLsn, endinglsn: ClsLsn, beginningvirtualclock: ConstPtr<Long>, endingvirtualclock: ConstPtr<Long>, recordtypemask: UInt, txflogcontext: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfLogDestroyReadContext(txflogcontext: ConstPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemTxfLogDestroyReadContext(txflogcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfLogReadRecords(txflogcontext: ConstPtr<CVoid>, bufferlength: UInt, buffer: MutPtr<CVoid>, bytesused: MutPtr<UInt>, recordcount: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemTxfLogReadRecords(txflogcontext.rawAddress.toString(), bufferlength.toInt(), buffer.rawAddress.toString(), bytesused.rawAddress.toString(), recordcount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfLogRecordGetFileName(recordbuffer: ConstPtr<CVoid>, recordbufferlengthinbytes: UInt, namebuffer: Pwstr, namebufferlengthinbytes: MutPtr<UInt>, txfid: MutPtr<TxfId>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemTxfLogRecordGetFileName(recordbuffer.rawAddress.toString(), recordbufferlengthinbytes.toInt(), namebuffer.rawAddress.toString(), namebufferlengthinbytes.rawAddress.toString(), txfid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfLogRecordGetGenericType(recordbuffer: ConstPtr<CVoid>, recordbufferlengthinbytes: UInt, generictype: MutPtr<UInt>, virtualclock: MutPtr<Long>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemTxfLogRecordGetGenericType(recordbuffer.rawAddress.toString(), recordbufferlengthinbytes.toInt(), generictype.rawAddress.toString(), virtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfReadMetadataInfo(filehandle: Handle, txffileid: MutPtr<TxfId>, lastlsn: MutPtr<ClsLsn>, transactionstate: MutPtr<UInt>, lockingtransaction: MutPtr<Guid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemTxfReadMetadataInfo(filehandle.rawAddress.toString(), txffileid.rawAddress.toString(), lastlsn.rawAddress.toString(), transactionstate.rawAddress.toString(), lockingtransaction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun txfSetThreadMiniVersionForCreate(miniversion: UShort) {
    if (windowsWin32StorageFilesystemNapiAddon != null) {
        windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemTxfSetThreadMiniVersionForCreate(miniversion.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unlockFile(hfile: Handle, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemUnlockFile(hfile.rawAddress.toString(), dwfileoffsetlow.toInt(), dwfileoffsethigh.toInt(), nnumberofbytestounlocklow.toInt(), nnumberofbytestounlockhigh.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockFileEx(hfile: Handle, dwreserved: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt, lpoverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemUnlockFileEx(hfile.rawAddress.toString(), dwreserved.toInt(), nnumberofbytestounlocklow.toInt(), nnumberofbytestounlockhigh.toInt(), lpoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun validateLog(pszlogfilename: Pcwstr, psalogfile: MutPtr<SecurityAttributes>, pinfobuffer: MutPtr<ClsInformation>, pcbbuffer: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemValidateLog(pszlogfilename.rawAddress.toString(), psalogfile.rawAddress.toString(), pinfobuffer.rawAddress.toString(), pcbbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verFindFileA(uflags: VerFindFileFlags, szfilename: Pcstr, szwindir: Pcstr, szappdir: Pcstr, szcurdir: Pstr, pucurdirlen: MutPtr<UInt>, szdestdir: Pstr, pudestdirlen: MutPtr<UInt>): VerFindFileStatus =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemVerFindFileA(uflags.toInt(), szfilename.rawAddress.toString(), szwindir.rawAddress.toString(), szappdir.rawAddress.toString(), szcurdir.rawAddress.toString(), pucurdirlen.rawAddress.toString(), szdestdir.rawAddress.toString(), pudestdirlen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verFindFileW(uflags: VerFindFileFlags, szfilename: Pcwstr, szwindir: Pcwstr, szappdir: Pcwstr, szcurdir: Pwstr, pucurdirlen: MutPtr<UInt>, szdestdir: Pwstr, pudestdirlen: MutPtr<UInt>): VerFindFileStatus =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemVerFindFileW(uflags.toInt(), szfilename.rawAddress.toString(), szwindir.rawAddress.toString(), szappdir.rawAddress.toString(), szcurdir.rawAddress.toString(), pucurdirlen.rawAddress.toString(), szdestdir.rawAddress.toString(), pudestdirlen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verInstallFileA(uflags: VerInstallFileFlags, szsrcfilename: Pcstr, szdestfilename: Pcstr, szsrcdir: Pcstr, szdestdir: Pcstr, szcurdir: Pcstr, sztmpfile: Pstr, putmpfilelen: MutPtr<UInt>): VerInstallFileStatus =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemVerInstallFileA(uflags.toInt(), szsrcfilename.rawAddress.toString(), szdestfilename.rawAddress.toString(), szsrcdir.rawAddress.toString(), szdestdir.rawAddress.toString(), szcurdir.rawAddress.toString(), sztmpfile.rawAddress.toString(), putmpfilelen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verInstallFileW(uflags: VerInstallFileFlags, szsrcfilename: Pcwstr, szdestfilename: Pcwstr, szsrcdir: Pcwstr, szdestdir: Pcwstr, szcurdir: Pcwstr, sztmpfile: Pwstr, putmpfilelen: MutPtr<UInt>): VerInstallFileStatus =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemVerInstallFileW(uflags.toInt(), szsrcfilename.rawAddress.toString(), szdestfilename.rawAddress.toString(), szsrcdir.rawAddress.toString(), szdestdir.rawAddress.toString(), szcurdir.rawAddress.toString(), sztmpfile.rawAddress.toString(), putmpfilelen.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verLanguageNameA(wlang: UInt, szlang: Pstr, cchlang: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemVerLanguageNameA(wlang.toInt(), szlang.rawAddress.toString(), cchlang.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verLanguageNameW(wlang: UInt, szlang: Pwstr, cchlang: UInt): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemVerLanguageNameW(wlang.toInt(), szlang.rawAddress.toString(), cchlang.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verQueryValueA(pblock: ConstPtr<CVoid>, lpsubblock: Pcstr, lplpbuffer: MutPtr<MutPtr<CVoid>>, pulen: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemVerQueryValueA(pblock.rawAddress.toString(), lpsubblock.rawAddress.toString(), lplpbuffer.rawAddress.toString(), pulen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verQueryValueW(pblock: ConstPtr<CVoid>, lpsubblock: Pcwstr, lplpbuffer: MutPtr<MutPtr<CVoid>>, pulen: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemVerQueryValueW(pblock.rawAddress.toString(), lpsubblock.rawAddress.toString(), lplpbuffer.rawAddress.toString(), pulen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofEnumEntries(volumename: Pcwstr, provider: UInt, enumproc: WofEnumEntryProc, userdata: ConstPtr<CVoid>): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemWofEnumEntries(volumename.rawAddress.toString(), provider.toInt(), 0L.toString(), userdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofFileEnumFiles(volumename: Pcwstr, algorithm: UInt, enumproc: WofEnumFilesProc, userdata: ConstPtr<CVoid>): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemWofFileEnumFiles(volumename.rawAddress.toString(), algorithm.toInt(), 0L.toString(), userdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofGetDriverVersion(fileorvolumehandle: Handle, provider: UInt, wofversion: MutPtr<UInt>): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemWofGetDriverVersion(fileorvolumehandle.rawAddress.toString(), provider.toInt(), wofversion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofIsExternalFile(filepath: Pcwstr, isexternalfile: MutPtr<Bool>, provider: MutPtr<UInt>, externalfileinfo: MutPtr<CVoid>, bufferlength: MutPtr<UInt>): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemWofIsExternalFile(filepath.rawAddress.toString(), isexternalfile.rawAddress.toString(), provider.rawAddress.toString(), externalfileinfo.rawAddress.toString(), bufferlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofSetFileDataLocation(filehandle: Handle, provider: UInt, externalfileinfo: ConstPtr<CVoid>, length: UInt): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemWofSetFileDataLocation(filehandle.rawAddress.toString(), provider.toInt(), externalfileinfo.rawAddress.toString(), length.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofShouldCompressBinaries(volume: Pcwstr, algorithm: MutPtr<UInt>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemWofShouldCompressBinaries(volume.rawAddress.toString(), algorithm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofWimAddEntry(volumename: Pcwstr, wimpath: Pcwstr, wimtype: UInt, wimindex: UInt, datasourceid: MutPtr<Long>): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemWofWimAddEntry(volumename.rawAddress.toString(), wimpath.rawAddress.toString(), wimtype.toInt(), wimindex.toInt(), datasourceid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofWimEnumFiles(volumename: Pcwstr, datasourceid: Long, enumproc: WofEnumFilesProc, userdata: ConstPtr<CVoid>): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemWofWimEnumFiles(volumename.rawAddress.toString(), datasourceid.toString(), 0L.toString(), userdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofWimRemoveEntry(volumename: Pcwstr, datasourceid: Long): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemWofWimRemoveEntry(volumename.rawAddress.toString(), datasourceid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofWimSuspendEntry(volumename: Pcwstr, datasourceid: Long): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemWofWimSuspendEntry(volumename.rawAddress.toString(), datasourceid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wofWimUpdateEntry(volumename: Pcwstr, datasourceid: Long, newwimpath: Pcwstr): Hresult =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemWofWimUpdateEntry(volumename.rawAddress.toString(), datasourceid.toString(), newwimpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64DisableWow64FsRedirection(oldvalue: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemWow64DisableWow64FsRedirection(oldvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64EnableWow64FsRedirection(wow64fsenableredirection: Boolean): Boolean =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemWow64EnableWow64FsRedirection(wow64fsenableredirection) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wow64RevertWow64FsRedirection(olvalue: ConstPtr<CVoid>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemWow64RevertWow64FsRedirection(olvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeEncryptedFileRaw(pfimportcallback: PfeImportFunc, pvcallbackcontext: ConstPtr<CVoid>, pvcontext: ConstPtr<CVoid>): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemWriteEncryptedFileRaw(0L.toString(), pvcallbackcontext.rawAddress.toString(), pvcontext.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeFile(hfile: Handle, lpbuffer: ConstPtr<UByte>, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemWriteFile(hfile.rawAddress.toString(), lpbuffer.rawAddress.toString(), nnumberofbytestowrite.toInt(), lpnumberofbyteswritten.rawAddress.toString(), lpoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeFileEx(hfile: Handle, lpbuffer: ConstPtr<UByte>, nnumberofbytestowrite: UInt, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemWriteFileEx(hfile.rawAddress.toString(), lpbuffer.rawAddress.toString(), nnumberofbytestowrite.toInt(), lpoverlapped.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeFileGather(hfile: Handle, asegmentarray: ConstPtr<FileSegmentElement>, nnumberofbytestowrite: UInt, lpreserved: ConstPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemWriteFileGather(hfile.rawAddress.toString(), asegmentarray.rawAddress.toString(), nnumberofbytestowrite.toInt(), lpreserved.rawAddress.toString(), lpoverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeLogRestartArea(pvmarshal: MutPtr<CVoid>, pvrestartbuffer: MutPtr<CVoid>, cbrestartbuffer: UInt, plsnbase: MutPtr<ClsLsn>, fflags: ClfsFlag, pcbwritten: MutPtr<UInt>, plsnnext: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemWriteLogRestartArea(pvmarshal.rawAddress.toString(), pvrestartbuffer.rawAddress.toString(), cbrestartbuffer.toInt(), plsnbase.rawAddress.toString(), fflags.toInt(), pcbwritten.rawAddress.toString(), plsnnext.rawAddress.toString(), poverlapped.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeTapemark(hdevice: Handle, dwtapemarktype: TapemarkType, dwtapemarkcount: UInt, bimmediate: Bool): UInt =
    if (windowsWin32StorageFilesystemNapiAddon != null) (windowsWin32StorageFilesystemNapiAddon.windowssysWindowsWin32StorageFilesystemWriteTapemark(hdevice.rawAddress.toString(), dwtapemarktype.toInt(), dwtapemarkcount.toInt(), bimmediate) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
