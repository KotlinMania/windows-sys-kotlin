@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun addLogContainer(hlog: Handle, pcbcontainer: ConstPtr<ULong>, pwszcontainerpath: Pcwstr, preserved: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemAddLogContainer")

public actual fun addLogContainerSet(hlog: Handle, ccontainer: UShort, pcbcontainer: ConstPtr<ULong>, rgwszcontainerpath: ConstPtr<Pcwstr>, preserved: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemAddLogContainerSet")

public actual fun addUsersToEncryptedFile(lpfilename: Pcwstr, pencryptioncertificates: ConstPtr<EncryptionCertificateList>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemAddUsersToEncryptedFile")

public actual fun advanceLogBase(pvmarshal: MutPtr<CVoid>, plsnbase: MutPtr<ClsLsn>, fflags: UInt, poverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemAdvanceLogBase")

public actual fun alignReservedLog(pvmarshal: MutPtr<CVoid>, creservedrecords: UInt, rgcbreservation: MutPtr<Long>, pcbalignreservation: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemAlignReservedLog")

public actual fun allocReservedLog(pvmarshal: MutPtr<CVoid>, creservedrecords: UInt, pcbadjustment: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemAllocReservedLog")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageFilesystemAreFileApisANSI")
private external fun wasiWindowssysWindowsWin32StorageFilesystemAreFileApisANSI(): Int

public actual fun areFileApisANSI(): Bool =
    wasiWindowssysWindowsWin32StorageFilesystemAreFileApisANSI().toInt()

public actual fun areShortNamesEnabled(handle: Handle, enabled: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemAreShortNamesEnabled")

public actual fun backupRead(hfile: Handle, lpbuffer: MutPtr<UByte>, nnumberofbytestoread: UInt, lpnumberofbytesread: MutPtr<UInt>, babort: Bool, bprocesssecurity: Bool, lpcontext: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemBackupRead")

public actual fun backupSeek(hfile: Handle, dwlowbytestoseek: UInt, dwhighbytestoseek: UInt, lpdwlowbyteseeked: MutPtr<UInt>, lpdwhighbyteseeked: MutPtr<UInt>, lpcontext: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemBackupSeek")

public actual fun backupWrite(hfile: Handle, lpbuffer: ConstPtr<UByte>, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: MutPtr<UInt>, babort: Bool, bprocesssecurity: Bool, lpcontext: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemBackupWrite")

public actual fun buildIoRingCancelRequest(ioring: Hioring, file: IoringHandleRef, optocancel: ULong, userdata: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemBuildIoRingCancelRequest")

public actual fun buildIoRingFlushFile(ioring: Hioring, fileref: IoringHandleRef, flushmode: FileFlushMode, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemBuildIoRingFlushFile")

public actual fun buildIoRingReadFile(ioring: Hioring, fileref: IoringHandleRef, dataref: IoringBufferRef, numberofbytestoread: UInt, fileoffset: ULong, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemBuildIoRingReadFile")

public actual fun buildIoRingRegisterBuffers(ioring: Hioring, count: UInt, buffers: ConstPtr<IoringBufferInfo>, userdata: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemBuildIoRingRegisterBuffers")

public actual fun buildIoRingRegisterFileHandles(ioring: Hioring, count: UInt, handles: ConstPtr<Handle>, userdata: ULong): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemBuildIoRingRegisterFileHandles")

public actual fun buildIoRingWriteFile(ioring: Hioring, fileref: IoringHandleRef, bufferref: IoringBufferRef, numberofbytestowrite: UInt, fileoffset: ULong, writeflags: FileWriteFlags, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemBuildIoRingWriteFile")

public actual fun checkNameLegalDOS8Dot3A(lpname: Pcstr, lpoemname: Pstr, oemnamesize: UInt, pbnamecontainsspaces: MutPtr<Bool>, pbnamelegal: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCheckNameLegalDOS8Dot3A")

public actual fun checkNameLegalDOS8Dot3W(lpname: Pcwstr, lpoemname: Pstr, oemnamesize: UInt, pbnamecontainsspaces: MutPtr<Bool>, pbnamelegal: MutPtr<Bool>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCheckNameLegalDOS8Dot3W")

public actual fun closeAndResetLogFile(hlog: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCloseAndResetLogFile")

public actual fun closeEncryptedFileRaw(pvcontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCloseEncryptedFileRaw")

public actual fun closeIoRing(ioring: Hioring): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCloseIoRing")

public actual fun commitComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCommitComplete")

public actual fun commitEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCommitEnlistment")

public actual fun commitTransaction(transactionhandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCommitTransaction")

public actual fun commitTransactionAsync(transactionhandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCommitTransactionAsync")

public actual fun compareFileTime(lpfiletime1: ConstPtr<Filetime>, lpfiletime2: ConstPtr<Filetime>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCompareFileTime")

public actual fun copyFile2(pwszexistingfilename: Pcwstr, pwsznewfilename: Pcwstr, pextendedparameters: ConstPtr<Copyfile2ExtendedParameters>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCopyFile2")

public actual fun copyFileA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, bfailifexists: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCopyFileA")

public actual fun copyFileExA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, pbcancel: MutPtr<Bool>, dwcopyflags: CopyfileFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCopyFileExA")

public actual fun copyFileExW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, pbcancel: MutPtr<Bool>, dwcopyflags: CopyfileFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCopyFileExW")

public actual fun copyFileFromAppW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, bfailifexists: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCopyFileFromAppW")

public actual fun copyFileTransactedA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, pbcancel: ConstPtr<Bool>, dwcopyflags: UInt, htransaction: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCopyFileTransactedA")

public actual fun copyFileTransactedW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, pbcancel: ConstPtr<Bool>, dwcopyflags: UInt, htransaction: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCopyFileTransactedW")

public actual fun copyFileW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, bfailifexists: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCopyFileW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageFilesystemCopyLZFile")
private external fun wasiWindowssysWindowsWin32StorageFilesystemCopyLZFile(hfsource: Int, hfdest: Int): Int

public actual fun copyLZFile(hfsource: Int, hfdest: Int): Int =
    wasiWindowssysWindowsWin32StorageFilesystemCopyLZFile(hfsource, hfdest).toInt()

public actual fun createDirectoryA(lppathname: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateDirectoryA")

public actual fun createDirectoryExA(lptemplatedirectory: Pcstr, lpnewdirectory: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateDirectoryExA")

public actual fun createDirectoryExW(lptemplatedirectory: Pcwstr, lpnewdirectory: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateDirectoryExW")

public actual fun createDirectoryFromAppW(lppathname: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateDirectoryFromAppW")

public actual fun createDirectoryTransactedA(lptemplatedirectory: Pcstr, lpnewdirectory: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, htransaction: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateDirectoryTransactedA")

public actual fun createDirectoryTransactedW(lptemplatedirectory: Pcwstr, lpnewdirectory: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, htransaction: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateDirectoryTransactedW")

public actual fun createDirectoryW(lppathname: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateDirectoryW")

public actual fun createEnlistment(lpenlistmentattributes: MutPtr<SecurityAttributes>, resourcemanagerhandle: Handle, transactionhandle: Handle, notificationmask: UInt, createoptions: UInt, enlistmentkey: MutPtr<CVoid>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateEnlistment")

public actual fun createFile2(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, dwcreationdisposition: FileCreationDisposition, pcreateexparams: ConstPtr<Createfile2ExtendedParameters>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateFile2")

public actual fun createFile2FromAppW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationdisposition: UInt, pcreateexparams: ConstPtr<Createfile2ExtendedParameters>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateFile2FromAppW")

public actual fun createFileA(lpfilename: Pcstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateFileA")

public actual fun createFileFromAppW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateFileFromAppW")

public actual fun createFileTransactedA(lpfilename: Pcstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle, htransaction: Handle, pusminiversion: ConstPtr<TxfsMiniversion>, lpextendedparameter: ConstPtr<CVoid>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateFileTransactedA")

public actual fun createFileTransactedW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle, htransaction: Handle, pusminiversion: ConstPtr<TxfsMiniversion>, lpextendedparameter: ConstPtr<CVoid>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateFileTransactedW")

public actual fun createFileW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateFileW")

public actual fun createHardLinkA(lpfilename: Pcstr, lpexistingfilename: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateHardLinkA")

public actual fun createHardLinkTransactedA(lpfilename: Pcstr, lpexistingfilename: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, htransaction: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateHardLinkTransactedA")

public actual fun createHardLinkTransactedW(lpfilename: Pcwstr, lpexistingfilename: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, htransaction: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateHardLinkTransactedW")

public actual fun createHardLinkW(lpfilename: Pcwstr, lpexistingfilename: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateHardLinkW")

public actual fun createIoRing(ioringversion: IoringVersion, flags: IoringCreateFlags, submissionqueuesize: UInt, completionqueuesize: UInt, h: MutPtr<Hioring>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateIoRing")

public actual fun createLogContainerScanContext(hlog: Handle, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: MutPtr<ClsScanContext>, poverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateLogContainerScanContext")

public actual fun createLogFile(pszlogfilename: Pcwstr, fdesiredaccess: UInt, dwsharemode: FileShareMode, psalogfile: MutPtr<SecurityAttributes>, fcreatedisposition: FileCreationDisposition, fflagsandattributes: FileFlagsAndAttributes): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateLogFile")

public actual fun createLogMarshallingArea(hlog: Handle, pfnallocbuffer: ClfsBlockAllocation, pfnfreebuffer: ClfsBlockDeallocation, pvblockalloccontext: MutPtr<CVoid>, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshal: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateLogMarshallingArea")

public actual fun createResourceManager(lpresourcemanagerattributes: MutPtr<SecurityAttributes>, resourcemanagerid: MutPtr<Guid>, createoptions: UInt, tmhandle: Handle, description: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateResourceManager")

public actual fun createSymbolicLinkA(lpsymlinkfilename: Pcstr, lptargetfilename: Pcstr, dwflags: SymbolicLinkFlags): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateSymbolicLinkA")

public actual fun createSymbolicLinkTransactedA(lpsymlinkfilename: Pcstr, lptargetfilename: Pcstr, dwflags: SymbolicLinkFlags, htransaction: Handle): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateSymbolicLinkTransactedA")

public actual fun createSymbolicLinkTransactedW(lpsymlinkfilename: Pcwstr, lptargetfilename: Pcwstr, dwflags: SymbolicLinkFlags, htransaction: Handle): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateSymbolicLinkTransactedW")

public actual fun createSymbolicLinkW(lpsymlinkfilename: Pcwstr, lptargetfilename: Pcwstr, dwflags: SymbolicLinkFlags): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateSymbolicLinkW")

public actual fun createTapePartition(hdevice: Handle, dwpartitionmethod: CreateTapePartitionMethod, dwcount: UInt, dwsize: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateTapePartition")

public actual fun createTransaction(lptransactionattributes: MutPtr<SecurityAttributes>, uow: MutPtr<Guid>, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateTransaction")

public actual fun createTransactionManager(lptransactionattributes: MutPtr<SecurityAttributes>, logfilename: Pcwstr, createoptions: UInt, commitstrength: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemCreateTransactionManager")

public actual fun decryptFileA(lpfilename: Pcstr, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemDecryptFileA")

public actual fun decryptFileW(lpfilename: Pcwstr, dwreserved: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemDecryptFileW")

public actual fun defineDosDeviceA(dwflags: DefineDosDeviceFlags, lpdevicename: Pcstr, lptargetpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemDefineDosDeviceA")

public actual fun defineDosDeviceW(dwflags: DefineDosDeviceFlags, lpdevicename: Pcwstr, lptargetpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemDefineDosDeviceW")

public actual fun deleteFileA(lpfilename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemDeleteFileA")

public actual fun deleteFileFromAppW(lpfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemDeleteFileFromAppW")

public actual fun deleteFileTransactedA(lpfilename: Pcstr, htransaction: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemDeleteFileTransactedA")

public actual fun deleteFileTransactedW(lpfilename: Pcwstr, htransaction: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemDeleteFileTransactedW")

public actual fun deleteFileW(lpfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemDeleteFileW")

public actual fun deleteLogByHandle(hlog: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemDeleteLogByHandle")

public actual fun deleteLogFile(pszlogfilename: Pcwstr, pvreserved: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemDeleteLogFile")

public actual fun deleteLogMarshallingArea(pvmarshal: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemDeleteLogMarshallingArea")

public actual fun deleteVolumeMountPointA(lpszvolumemountpoint: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemDeleteVolumeMountPointA")

public actual fun deleteVolumeMountPointW(lpszvolumemountpoint: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemDeleteVolumeMountPointW")

public actual fun deregisterManageableLogClient(hlog: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemDeregisterManageableLogClient")

public actual fun duplicateEncryptionInfoFile(srcfilename: Pcwstr, dstfilename: Pcwstr, dwcreationdistribution: UInt, dwattributes: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemDuplicateEncryptionInfoFile")

public actual fun encryptFileA(lpfilename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemEncryptFileA")

public actual fun encryptFileW(lpfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemEncryptFileW")

public actual fun encryptionDisable(dirpath: Pcwstr, disable: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemEncryptionDisable")

public actual fun eraseTape(hdevice: Handle, dwerasetype: EraseTapeType, bimmediate: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemEraseTape")

public actual fun fileEncryptionStatusA(lpfilename: Pcstr, lpstatus: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFileEncryptionStatusA")

public actual fun fileEncryptionStatusW(lpfilename: Pcwstr, lpstatus: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFileEncryptionStatusW")

public actual fun fileTimeToLocalFileTime(lpfiletime: ConstPtr<Filetime>, lplocalfiletime: MutPtr<Filetime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFileTimeToLocalFileTime")

public actual fun findClose(hfindfile: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindClose")

public actual fun findCloseChangeNotification(hchangehandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindCloseChangeNotification")

public actual fun findFirstChangeNotificationA(lppathname: Pcstr, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindFirstChangeNotificationA")

public actual fun findFirstChangeNotificationW(lppathname: Pcwstr, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindFirstChangeNotificationW")

public actual fun findFirstFileA(lpfilename: Pcstr, lpfindfiledata: MutPtr<Win32FindDataa>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindFirstFileA")

public actual fun findFirstFileExA(lpfilename: Pcstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr<CVoid>, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr<CVoid>, dwadditionalflags: FindFirstExFlags): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindFirstFileExA")

public actual fun findFirstFileExFromAppW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr<CVoid>, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr<CVoid>, dwadditionalflags: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindFirstFileExFromAppW")

public actual fun findFirstFileExW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr<CVoid>, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr<CVoid>, dwadditionalflags: FindFirstExFlags): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindFirstFileExW")

public actual fun findFirstFileNameTransactedW(lpfilename: Pcwstr, dwflags: UInt, stringlength: MutPtr<UInt>, linkname: Pwstr, htransaction: Handle): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindFirstFileNameTransactedW")

public actual fun findFirstFileNameW(lpfilename: Pcwstr, dwflags: UInt, stringlength: MutPtr<UInt>, linkname: Pwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindFirstFileNameW")

public actual fun findFirstFileTransactedA(lpfilename: Pcstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr<CVoid>, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr<CVoid>, dwadditionalflags: UInt, htransaction: Handle): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindFirstFileTransactedA")

public actual fun findFirstFileTransactedW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr<CVoid>, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr<CVoid>, dwadditionalflags: UInt, htransaction: Handle): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindFirstFileTransactedW")

public actual fun findFirstFileW(lpfilename: Pcwstr, lpfindfiledata: MutPtr<Win32FindDataw>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindFirstFileW")

public actual fun findFirstStreamTransactedW(lpfilename: Pcwstr, infolevel: StreamInfoLevels, lpfindstreamdata: MutPtr<CVoid>, dwflags: UInt, htransaction: Handle): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindFirstStreamTransactedW")

public actual fun findFirstStreamW(lpfilename: Pcwstr, infolevel: StreamInfoLevels, lpfindstreamdata: MutPtr<CVoid>, dwflags: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindFirstStreamW")

public actual fun findFirstVolumeA(lpszvolumename: Pstr, cchbufferlength: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindFirstVolumeA")

public actual fun findFirstVolumeMountPointA(lpszrootpathname: Pcstr, lpszvolumemountpoint: Pstr, cchbufferlength: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindFirstVolumeMountPointA")

public actual fun findFirstVolumeMountPointW(lpszrootpathname: Pcwstr, lpszvolumemountpoint: Pwstr, cchbufferlength: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindFirstVolumeMountPointW")

public actual fun findFirstVolumeW(lpszvolumename: Pwstr, cchbufferlength: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindFirstVolumeW")

public actual fun findNextChangeNotification(hchangehandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindNextChangeNotification")

public actual fun findNextFileA(hfindfile: Handle, lpfindfiledata: MutPtr<Win32FindDataa>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindNextFileA")

public actual fun findNextFileNameW(hfindstream: Handle, stringlength: MutPtr<UInt>, linkname: Pwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindNextFileNameW")

public actual fun findNextFileW(hfindfile: Handle, lpfindfiledata: MutPtr<Win32FindDataw>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindNextFileW")

public actual fun findNextStreamW(hfindstream: Handle, lpfindstreamdata: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindNextStreamW")

public actual fun findNextVolumeA(hfindvolume: Handle, lpszvolumename: Pstr, cchbufferlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindNextVolumeA")

public actual fun findNextVolumeMountPointA(hfindvolumemountpoint: Handle, lpszvolumemountpoint: Pstr, cchbufferlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindNextVolumeMountPointA")

public actual fun findNextVolumeMountPointW(hfindvolumemountpoint: Handle, lpszvolumemountpoint: Pwstr, cchbufferlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindNextVolumeMountPointW")

public actual fun findNextVolumeW(hfindvolume: Handle, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindNextVolumeW")

public actual fun findVolumeClose(hfindvolume: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindVolumeClose")

public actual fun findVolumeMountPointClose(hfindvolumemountpoint: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFindVolumeMountPointClose")

public actual fun flushFileBuffers(hfile: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFlushFileBuffers")

public actual fun flushLogBuffers(pvmarshal: ConstPtr<CVoid>, poverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFlushLogBuffers")

public actual fun flushLogToLsn(pvmarshalcontext: MutPtr<CVoid>, plsnflush: MutPtr<ClsLsn>, plsnlastflushed: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFlushLogToLsn")

public actual fun freeEncryptedFileMetadata(pbmetadata: ConstPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFreeEncryptedFileMetadata")

public actual fun freeEncryptionCertificateHashList(pusers: ConstPtr<EncryptionCertificateHashList>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFreeEncryptionCertificateHashList")

public actual fun freeReservedLog(pvmarshal: MutPtr<CVoid>, creservedrecords: UInt, pcbadjustment: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemFreeReservedLog")

public actual fun getBinaryTypeA(lpapplicationname: Pcstr, lpbinarytype: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetBinaryTypeA")

public actual fun getBinaryTypeW(lpapplicationname: Pcwstr, lpbinarytype: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetBinaryTypeW")

public actual fun getCompressedFileSizeA(lpfilename: Pcstr, lpfilesizehigh: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetCompressedFileSizeA")

public actual fun getCompressedFileSizeTransactedA(lpfilename: Pcstr, lpfilesizehigh: MutPtr<UInt>, htransaction: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetCompressedFileSizeTransactedA")

public actual fun getCompressedFileSizeTransactedW(lpfilename: Pcwstr, lpfilesizehigh: MutPtr<UInt>, htransaction: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetCompressedFileSizeTransactedW")

public actual fun getCompressedFileSizeW(lpfilename: Pcwstr, lpfilesizehigh: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetCompressedFileSizeW")

public actual fun getCurrentClockTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetCurrentClockTransactionManager")

public actual fun getDiskFreeSpaceA(lprootpathname: Pcstr, lpsectorspercluster: MutPtr<UInt>, lpbytespersector: MutPtr<UInt>, lpnumberoffreeclusters: MutPtr<UInt>, lptotalnumberofclusters: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceA")

public actual fun getDiskFreeSpaceExA(lpdirectoryname: Pcstr, lpfreebytesavailabletocaller: MutPtr<ULong>, lptotalnumberofbytes: MutPtr<ULong>, lptotalnumberoffreebytes: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceExA")

public actual fun getDiskFreeSpaceExW(lpdirectoryname: Pcwstr, lpfreebytesavailabletocaller: MutPtr<ULong>, lptotalnumberofbytes: MutPtr<ULong>, lptotalnumberoffreebytes: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceExW")

public actual fun getDiskFreeSpaceW(lprootpathname: Pcwstr, lpsectorspercluster: MutPtr<UInt>, lpbytespersector: MutPtr<UInt>, lpnumberoffreeclusters: MutPtr<UInt>, lptotalnumberofclusters: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceW")

public actual fun getDiskSpaceInformationA(rootpath: Pcstr, diskspaceinfo: MutPtr<DiskSpaceInformation>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetDiskSpaceInformationA")

public actual fun getDiskSpaceInformationW(rootpath: Pcwstr, diskspaceinfo: MutPtr<DiskSpaceInformation>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetDiskSpaceInformationW")

public actual fun getDriveTypeA(lprootpathname: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetDriveTypeA")

public actual fun getDriveTypeW(lprootpathname: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetDriveTypeW")

public actual fun getEncryptedFileMetadata(lpfilename: Pcwstr, pcbmetadata: MutPtr<UInt>, ppbmetadata: MutPtr<MutPtr<UByte>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetEncryptedFileMetadata")

public actual fun getEnlistmentId(enlistmenthandle: Handle, enlistmentid: MutPtr<Guid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetEnlistmentId")

public actual fun getEnlistmentRecoveryInformation(enlistmenthandle: Handle, buffersize: UInt, buffer: MutPtr<CVoid>, bufferused: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetEnlistmentRecoveryInformation")

public actual fun getExpandedNameA(lpszsource: Pcstr, lpszbuffer: Pstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetExpandedNameA")

public actual fun getExpandedNameW(lpszsource: Pcwstr, lpszbuffer: Pwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetExpandedNameW")

public actual fun getFileAttributesA(lpfilename: Pcstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileAttributesA")

public actual fun getFileAttributesExA(lpfilename: Pcstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileAttributesExA")

public actual fun getFileAttributesExFromAppW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileAttributesExFromAppW")

public actual fun getFileAttributesExW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileAttributesExW")

public actual fun getFileAttributesTransactedA(lpfilename: Pcstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr<CVoid>, htransaction: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileAttributesTransactedA")

public actual fun getFileAttributesTransactedW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr<CVoid>, htransaction: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileAttributesTransactedW")

public actual fun getFileAttributesW(lpfilename: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileAttributesW")

public actual fun getFileBandwidthReservation(hfile: Handle, lpperiodmilliseconds: MutPtr<UInt>, lpbytesperperiod: MutPtr<UInt>, pdiscardable: MutPtr<Bool>, lptransfersize: MutPtr<UInt>, lpnumoutstandingrequests: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileBandwidthReservation")

public actual fun getFileInformationByHandle(hfile: Handle, lpfileinformation: MutPtr<ByHandleFileInformation>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileInformationByHandle")

public actual fun getFileInformationByHandleEx(hfile: Handle, fileinformationclass: FileInfoByHandleClass, lpfileinformation: MutPtr<CVoid>, dwbuffersize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileInformationByHandleEx")

public actual fun getFileSize(hfile: Handle, lpfilesizehigh: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileSize")

public actual fun getFileSizeEx(hfile: Handle, lpfilesize: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileSizeEx")

public actual fun getFileTime(hfile: Handle, lpcreationtime: MutPtr<Filetime>, lplastaccesstime: MutPtr<Filetime>, lplastwritetime: MutPtr<Filetime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileTime")

public actual fun getFileType(hfile: Handle): FileType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileType")

public actual fun getFileVersionInfoA(lptstrfilename: Pcstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileVersionInfoA")

public actual fun getFileVersionInfoExA(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileVersionInfoExA")

public actual fun getFileVersionInfoExW(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcwstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileVersionInfoExW")

public actual fun getFileVersionInfoSizeA(lptstrfilename: Pcstr, lpdwhandle: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeA")

public actual fun getFileVersionInfoSizeExA(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcstr, lpdwhandle: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeExA")

public actual fun getFileVersionInfoSizeExW(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcwstr, lpdwhandle: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeExW")

public actual fun getFileVersionInfoSizeW(lptstrfilename: Pcwstr, lpdwhandle: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeW")

public actual fun getFileVersionInfoW(lptstrfilename: Pcwstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFileVersionInfoW")

public actual fun getFinalPathNameByHandleA(hfile: Handle, lpszfilepath: Pstr, cchfilepath: UInt, dwflags: GetfinalpathnamebyhandleFlags): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFinalPathNameByHandleA")

public actual fun getFinalPathNameByHandleW(hfile: Handle, lpszfilepath: Pwstr, cchfilepath: UInt, dwflags: GetfinalpathnamebyhandleFlags): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFinalPathNameByHandleW")

public actual fun getFullPathNameA(lpfilename: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: MutPtr<Pstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFullPathNameA")

public actual fun getFullPathNameTransactedA(lpfilename: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: MutPtr<Pstr>, htransaction: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFullPathNameTransactedA")

public actual fun getFullPathNameTransactedW(lpfilename: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: MutPtr<Pwstr>, htransaction: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFullPathNameTransactedW")

public actual fun getFullPathNameW(lpfilename: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: MutPtr<Pwstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetFullPathNameW")

public actual fun getIoRingInfo(ioring: Hioring, info: MutPtr<IoringInfo>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetIoRingInfo")

public actual fun getLogContainerName(hlog: Handle, cidlogicalcontainer: UInt, pwstrcontainername: Pcwstr, clencontainername: UInt, pcactuallencontainername: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetLogContainerName")

public actual fun getLogFileInformation(hlog: Handle, pinfobuffer: MutPtr<ClsInformation>, cbbuffer: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetLogFileInformation")

public actual fun getLogIoStatistics(hlog: Handle, pvstatsbuffer: MutPtr<CVoid>, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetLogIoStatistics")

public actual fun getLogReservationInfo(pvmarshal: ConstPtr<CVoid>, pcbrecordnumber: MutPtr<UInt>, pcbuserreservation: MutPtr<Long>, pcbcommitreservation: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetLogReservationInfo")

public actual fun getLogicalDriveStringsA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetLogicalDriveStringsA")

public actual fun getLogicalDriveStringsW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetLogicalDriveStringsW")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageFilesystemGetLogicalDrives")
private external fun wasiWindowssysWindowsWin32StorageFilesystemGetLogicalDrives(): Int

public actual fun getLogicalDrives(): UInt =
    wasiWindowssysWindowsWin32StorageFilesystemGetLogicalDrives().toUInt()

public actual fun getLongPathNameA(lpszshortpath: Pcstr, lpszlongpath: Pstr, cchbuffer: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetLongPathNameA")

public actual fun getLongPathNameTransactedA(lpszshortpath: Pcstr, lpszlongpath: Pstr, cchbuffer: UInt, htransaction: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetLongPathNameTransactedA")

public actual fun getLongPathNameTransactedW(lpszshortpath: Pcwstr, lpszlongpath: Pwstr, cchbuffer: UInt, htransaction: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetLongPathNameTransactedW")

public actual fun getLongPathNameW(lpszshortpath: Pcwstr, lpszlongpath: Pwstr, cchbuffer: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetLongPathNameW")

public actual fun getNextLogArchiveExtent(pvarchivecontext: MutPtr<CVoid>, rgadextent: MutPtr<ClsArchiveDescriptor>, cdescriptors: UInt, pcdescriptorsreturned: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetNextLogArchiveExtent")

public actual fun getNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: MutPtr<TransactionNotification>, notificationlength: UInt, dwmilliseconds: UInt, returnlength: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetNotificationResourceManager")

public actual fun getNotificationResourceManagerAsync(resourcemanagerhandle: Handle, transactionnotification: MutPtr<TransactionNotification>, transactionnotificationlength: UInt, returnlength: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetNotificationResourceManagerAsync")

public actual fun getShortPathNameA(lpszlongpath: Pcstr, lpszshortpath: Pstr, cchbuffer: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetShortPathNameA")

public actual fun getShortPathNameW(lpszlongpath: Pcwstr, lpszshortpath: Pwstr, cchbuffer: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetShortPathNameW")

public actual fun getTapeParameters(hdevice: Handle, dwoperation: GetTapeDriveParametersOperation, lpdwsize: MutPtr<UInt>, lptapeinformation: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetTapeParameters")

public actual fun getTapePosition(hdevice: Handle, dwpositiontype: TapePositionType, lpdwpartition: MutPtr<UInt>, lpdwoffsetlow: MutPtr<UInt>, lpdwoffsethigh: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetTapePosition")

public actual fun getTapeStatus(hdevice: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetTapeStatus")

public actual fun getTempFileNameA(lppathname: Pcstr, lpprefixstring: Pcstr, uunique: UInt, lptempfilename: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetTempFileNameA")

public actual fun getTempFileNameW(lppathname: Pcwstr, lpprefixstring: Pcwstr, uunique: UInt, lptempfilename: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetTempFileNameW")

public actual fun getTempPath2A(bufferlength: UInt, buffer: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetTempPath2A")

public actual fun getTempPath2W(bufferlength: UInt, buffer: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetTempPath2W")

public actual fun getTempPathA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetTempPathA")

public actual fun getTempPathW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetTempPathW")

public actual fun getTransactionId(transactionhandle: Handle, transactionid: MutPtr<Guid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetTransactionId")

public actual fun getTransactionInformation(transactionhandle: Handle, outcome: MutPtr<UInt>, isolationlevel: MutPtr<UInt>, isolationflags: MutPtr<UInt>, timeout: MutPtr<UInt>, bufferlength: UInt, description: Pwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetTransactionInformation")

public actual fun getTransactionManagerId(transactionmanagerhandle: Handle, transactionmanagerid: MutPtr<Guid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetTransactionManagerId")

public actual fun getVolumeInformationA(lprootpathname: Pcstr, lpvolumenamebuffer: Pstr, nvolumenamesize: UInt, lpvolumeserialnumber: MutPtr<UInt>, lpmaximumcomponentlength: MutPtr<UInt>, lpfilesystemflags: MutPtr<UInt>, lpfilesystemnamebuffer: Pstr, nfilesystemnamesize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetVolumeInformationA")

public actual fun getVolumeInformationByHandleW(hfile: Handle, lpvolumenamebuffer: Pwstr, nvolumenamesize: UInt, lpvolumeserialnumber: MutPtr<UInt>, lpmaximumcomponentlength: MutPtr<UInt>, lpfilesystemflags: MutPtr<UInt>, lpfilesystemnamebuffer: Pwstr, nfilesystemnamesize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetVolumeInformationByHandleW")

public actual fun getVolumeInformationW(lprootpathname: Pcwstr, lpvolumenamebuffer: Pwstr, nvolumenamesize: UInt, lpvolumeserialnumber: MutPtr<UInt>, lpmaximumcomponentlength: MutPtr<UInt>, lpfilesystemflags: MutPtr<UInt>, lpfilesystemnamebuffer: Pwstr, nfilesystemnamesize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetVolumeInformationW")

public actual fun getVolumeNameForVolumeMountPointA(lpszvolumemountpoint: Pcstr, lpszvolumename: Pstr, cchbufferlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetVolumeNameForVolumeMountPointA")

public actual fun getVolumeNameForVolumeMountPointW(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetVolumeNameForVolumeMountPointW")

public actual fun getVolumePathNameA(lpszfilename: Pcstr, lpszvolumepathname: Pstr, cchbufferlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetVolumePathNameA")

public actual fun getVolumePathNameW(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, cchbufferlength: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetVolumePathNameW")

public actual fun getVolumePathNamesForVolumeNameA(lpszvolumename: Pcstr, lpszvolumepathnames: Pstr, cchbufferlength: UInt, lpcchreturnlength: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetVolumePathNamesForVolumeNameA")

public actual fun getVolumePathNamesForVolumeNameW(lpszvolumename: Pcwstr, lpszvolumepathnames: Pwstr, cchbufferlength: UInt, lpcchreturnlength: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemGetVolumePathNamesForVolumeNameW")

public actual fun handleLogFull(hlog: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemHandleLogFull")

public actual fun installLogPolicy(hlog: Handle, ppolicy: MutPtr<ClfsMgmtPolicy>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemInstallLogPolicy")

public actual fun isIoRingOpSupported(ioring: Hioring, op: IoringOpCode): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemIsIoRingOpSupported")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageFilesystemLZClose")
private external fun wasiWindowssysWindowsWin32StorageFilesystemLZClose(hfile: Int): Unit

public actual fun lZClose(hfile: Int): Unit =
    wasiWindowssysWindowsWin32StorageFilesystemLZClose(hfile)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageFilesystemLZCopy")
private external fun wasiWindowssysWindowsWin32StorageFilesystemLZCopy(hfsource: Int, hfdest: Int): Int

public actual fun lZCopy(hfsource: Int, hfdest: Int): Int =
    wasiWindowssysWindowsWin32StorageFilesystemLZCopy(hfsource, hfdest).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageFilesystemLZDone")
private external fun wasiWindowssysWindowsWin32StorageFilesystemLZDone(): Unit

public actual fun lZDone(): Unit =
    wasiWindowssysWindowsWin32StorageFilesystemLZDone()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageFilesystemLZInit")
private external fun wasiWindowssysWindowsWin32StorageFilesystemLZInit(hfsource: Int): Int

public actual fun lZInit(hfsource: Int): Int =
    wasiWindowssysWindowsWin32StorageFilesystemLZInit(hfsource).toInt()

public actual fun lZOpenFileA(lpfilename: Pcstr, lpreopenbuf: MutPtr<Ofstruct>, wstyle: LzopenfileStyle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemLZOpenFileA")

public actual fun lZOpenFileW(lpfilename: Pcwstr, lpreopenbuf: MutPtr<Ofstruct>, wstyle: LzopenfileStyle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemLZOpenFileW")

public actual fun lZRead(hfile: Int, lpbuffer: Pstr, cbread: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemLZRead")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageFilesystemLZSeek")
private external fun wasiWindowssysWindowsWin32StorageFilesystemLZSeek(hfile: Int, loffset: Int, iorigin: Int): Int

public actual fun lZSeek(hfile: Int, loffset: Int, iorigin: Int): Int =
    wasiWindowssysWindowsWin32StorageFilesystemLZSeek(hfile, loffset, iorigin).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageFilesystemLZStart")
private external fun wasiWindowssysWindowsWin32StorageFilesystemLZStart(): Int

public actual fun lZStart(): Int =
    wasiWindowssysWindowsWin32StorageFilesystemLZStart().toInt()

public actual fun localFileTimeToFileTime(lplocalfiletime: ConstPtr<Filetime>, lpfiletime: MutPtr<Filetime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemLocalFileTimeToFileTime")

public actual fun lockFile(hfile: Handle, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemLockFile")

public actual fun lockFileEx(hfile: Handle, dwflags: LockFileFlags, dwreserved: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt, lpoverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemLockFileEx")

public actual fun logTailAdvanceFailure(hlog: Handle, dwreason: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemLogTailAdvanceFailure")

public actual fun lsnBlockOffset(plsn: ConstPtr<ClsLsn>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemLsnBlockOffset")

public actual fun lsnContainer(plsn: ConstPtr<ClsLsn>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemLsnContainer")

public actual fun lsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemLsnCreate")

public actual fun lsnEqual(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemLsnEqual")

public actual fun lsnGreater(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemLsnGreater")

public actual fun lsnIncrement(plsn: ConstPtr<ClsLsn>): ClsLsn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemLsnIncrement")

public actual fun lsnInvalid(plsn: ConstPtr<ClsLsn>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemLsnInvalid")

public actual fun lsnLess(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemLsnLess")

public actual fun lsnNull(plsn: ConstPtr<ClsLsn>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemLsnNull")

public actual fun lsnRecordSequence(plsn: ConstPtr<ClsLsn>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemLsnRecordSequence")

public actual fun moveFileA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemMoveFileA")

public actual fun moveFileExA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, dwflags: MoveFileFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemMoveFileExA")

public actual fun moveFileExW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: MoveFileFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemMoveFileExW")

public actual fun moveFileFromAppW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemMoveFileFromAppW")

public actual fun moveFileTransactedA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, dwflags: MoveFileFlags, htransaction: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemMoveFileTransactedA")

public actual fun moveFileTransactedW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, dwflags: MoveFileFlags, htransaction: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemMoveFileTransactedW")

public actual fun moveFileW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemMoveFileW")

public actual fun moveFileWithProgressA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, dwflags: MoveFileFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemMoveFileWithProgressA")

public actual fun moveFileWithProgressW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, dwflags: MoveFileFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemMoveFileWithProgressW")

public actual fun netConnectionEnum(servername: Pcwstr, qualifier: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemNetConnectionEnum")

public actual fun netFileClose(servername: Pcwstr, fileid: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemNetFileClose")

public actual fun netFileEnum(servername: Pcwstr, basepath: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<ULong>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemNetFileEnum")

public actual fun netFileGetInfo(servername: Pcwstr, fileid: UInt, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemNetFileGetInfo")

public actual fun netServerAliasAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemNetServerAliasAdd")

public actual fun netServerAliasDel(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemNetServerAliasDel")

public actual fun netServerAliasEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemNetServerAliasEnum")

public actual fun netSessionDel(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemNetSessionDel")

public actual fun netSessionEnum(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemNetSessionEnum")

public actual fun netSessionGetInfo(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemNetSessionGetInfo")

public actual fun netShareAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemNetShareAdd")

public actual fun netShareCheck(servername: Pcwstr, device: Pcwstr, type: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemNetShareCheck")

public actual fun netShareDel(servername: Pcwstr, netname: Pcwstr, reserved: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemNetShareDel")

public actual fun netShareDelEx(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemNetShareDelEx")

public actual fun netShareDelSticky(servername: Pcwstr, netname: Pcwstr, reserved: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemNetShareDelSticky")

public actual fun netShareEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemNetShareEnum")

public actual fun netShareEnumSticky(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemNetShareEnumSticky")

public actual fun netShareGetInfo(servername: Pcwstr, netname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemNetShareGetInfo")

public actual fun netShareSetInfo(servername: Pcwstr, netname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemNetShareSetInfo")

public actual fun netStatisticsGet(servername: ConstPtr<Byte>, service: ConstPtr<Byte>, level: UInt, options: UInt, buffer: MutPtr<MutPtr<UByte>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemNetStatisticsGet")

public actual fun openEncryptedFileRawA(lpfilename: Pcstr, ulflags: UInt, pvcontext: MutPtr<MutPtr<CVoid>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemOpenEncryptedFileRawA")

public actual fun openEncryptedFileRawW(lpfilename: Pcwstr, ulflags: UInt, pvcontext: MutPtr<MutPtr<CVoid>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemOpenEncryptedFileRawW")

public actual fun openEnlistment(dwdesiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentid: MutPtr<Guid>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemOpenEnlistment")

public actual fun openFile(lpfilename: Pcstr, lpreopenbuff: MutPtr<Ofstruct>, ustyle: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemOpenFile")

public actual fun openFileById(hvolumehint: Handle, lpfileid: ConstPtr<FileIdDescriptor>, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwflagsandattributes: FileFlagsAndAttributes): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemOpenFileById")

public actual fun openResourceManager(dwdesiredaccess: UInt, tmhandle: Handle, resourcemanagerid: MutPtr<Guid>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemOpenResourceManager")

public actual fun openTransaction(dwdesiredaccess: UInt, transactionid: MutPtr<Guid>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemOpenTransaction")

public actual fun openTransactionManager(logfilename: Pcwstr, desiredaccess: UInt, openoptions: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemOpenTransactionManager")

public actual fun openTransactionManagerById(transactionmanagerid: ConstPtr<Guid>, desiredaccess: UInt, openoptions: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemOpenTransactionManagerById")

public actual fun popIoRingCompletion(ioring: Hioring, cqe: MutPtr<IoringCqe>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemPopIoRingCompletion")

public actual fun prePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemPrePrepareComplete")

public actual fun prePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemPrePrepareEnlistment")

public actual fun prepareComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemPrepareComplete")

public actual fun prepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemPrepareEnlistment")

public actual fun prepareLogArchive(hlog: Handle, pszbaselogfilename: Pwstr, clen: UInt, plsnlow: ConstPtr<ClsLsn>, plsnhigh: ConstPtr<ClsLsn>, pcactuallength: MutPtr<UInt>, poffbaselogfiledata: MutPtr<ULong>, pcbbaselogfilelength: MutPtr<ULong>, plsnbase: MutPtr<ClsLsn>, plsnlast: MutPtr<ClsLsn>, plsncurrentarchivetail: MutPtr<ClsLsn>, ppvarchivecontext: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemPrepareLogArchive")

public actual fun prepareTape(hdevice: Handle, dwoperation: PrepareTapeOperation, bimmediate: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemPrepareTape")

public actual fun queryDosDeviceA(lpdevicename: Pcstr, lptargetpath: Pstr, ucchmax: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemQueryDosDeviceA")

public actual fun queryDosDeviceW(lpdevicename: Pcwstr, lptargetpath: Pwstr, ucchmax: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemQueryDosDeviceW")

public actual fun queryIoRingCapabilities(capabilities: MutPtr<IoringCapabilities>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemQueryIoRingCapabilities")

public actual fun queryLogPolicy(hlog: Handle, epolicytype: ClfsMgmtPolicyType, ppolicybuffer: MutPtr<ClfsMgmtPolicy>, pcbpolicybuffer: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemQueryLogPolicy")

public actual fun queryRecoveryAgentsOnEncryptedFile(lpfilename: Pcwstr, precoveryagents: MutPtr<MutPtr<EncryptionCertificateHashList>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemQueryRecoveryAgentsOnEncryptedFile")

public actual fun queryUsersOnEncryptedFile(lpfilename: Pcwstr, pusers: MutPtr<MutPtr<EncryptionCertificateHashList>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemQueryUsersOnEncryptedFile")

public actual fun reOpenFile(horiginalfile: Handle, dwdesiredaccess: UInt, dwsharemode: FileShareMode, dwflagsandattributes: FileFlagsAndAttributes): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemReOpenFile")

public actual fun readDirectoryChangesExW(hdirectory: Handle, lpbuffer: MutPtr<CVoid>, nbufferlength: UInt, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange, lpbytesreturned: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpoverlappedCompletionRoutine, readdirectorynotifyinformationclass: ReadDirectoryNotifyInformationClass): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemReadDirectoryChangesExW")

public actual fun readDirectoryChangesW(hdirectory: Handle, lpbuffer: MutPtr<CVoid>, nbufferlength: UInt, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange, lpbytesreturned: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemReadDirectoryChangesW")

public actual fun readEncryptedFileRaw(pfexportcallback: PfeExportFunc, pvcallbackcontext: ConstPtr<CVoid>, pvcontext: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemReadEncryptedFileRaw")

public actual fun readFile(hfile: Handle, lpbuffer: MutPtr<UByte>, nnumberofbytestoread: UInt, lpnumberofbytesread: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemReadFile")

public actual fun readFileEx(hfile: Handle, lpbuffer: MutPtr<UByte>, nnumberofbytestoread: UInt, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemReadFileEx")

public actual fun readFileScatter(hfile: Handle, asegmentarray: ConstPtr<FileSegmentElement>, nnumberofbytestoread: UInt, lpreserved: ConstPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemReadFileScatter")

public actual fun readLogArchiveMetadata(pvarchivecontext: MutPtr<CVoid>, cboffset: UInt, cbbytestoread: UInt, pbreadbuffer: MutPtr<UByte>, pcbbytesread: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemReadLogArchiveMetadata")

public actual fun readLogNotification(hlog: Handle, pnotification: MutPtr<ClfsMgmtNotification>, lpoverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemReadLogNotification")

public actual fun readLogRecord(pvmarshal: MutPtr<CVoid>, plsnfirst: MutPtr<ClsLsn>, econtextmode: ClfsContextMode, ppvreadbuffer: MutPtr<MutPtr<CVoid>>, pcbreadbuffer: MutPtr<UInt>, perecordtype: MutPtr<UByte>, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, ppvreadcontext: MutPtr<MutPtr<CVoid>>, poverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemReadLogRecord")

public actual fun readLogRestartArea(pvmarshal: MutPtr<CVoid>, ppvrestartbuffer: MutPtr<MutPtr<CVoid>>, pcbrestartbuffer: MutPtr<UInt>, plsn: MutPtr<ClsLsn>, ppvcontext: MutPtr<MutPtr<CVoid>>, poverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemReadLogRestartArea")

public actual fun readNextLogRecord(pvreadcontext: MutPtr<CVoid>, ppvbuffer: MutPtr<MutPtr<CVoid>>, pcbbuffer: MutPtr<UInt>, perecordtype: MutPtr<UByte>, plsnuser: MutPtr<ClsLsn>, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, plsnrecord: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemReadNextLogRecord")

public actual fun readOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemReadOnlyEnlistment")

public actual fun readPreviousLogRestartArea(pvreadcontext: MutPtr<CVoid>, ppvrestartbuffer: MutPtr<MutPtr<CVoid>>, pcbrestartbuffer: MutPtr<UInt>, plsnrestart: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemReadPreviousLogRestartArea")

public actual fun recoverEnlistment(enlistmenthandle: Handle, enlistmentkey: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemRecoverEnlistment")

public actual fun recoverResourceManager(resourcemanagerhandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemRecoverResourceManager")

public actual fun recoverTransactionManager(transactionmanagerhandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemRecoverTransactionManager")

public actual fun registerForLogWriteNotification(hlog: Handle, cbthreshold: UInt, fenable: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemRegisterForLogWriteNotification")

public actual fun registerManageableLogClient(hlog: Handle, pcallbacks: MutPtr<LogManagementCallbacks>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemRegisterManageableLogClient")

public actual fun removeDirectoryA(lppathname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemRemoveDirectoryA")

public actual fun removeDirectoryFromAppW(lppathname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemRemoveDirectoryFromAppW")

public actual fun removeDirectoryTransactedA(lppathname: Pcstr, htransaction: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemRemoveDirectoryTransactedA")

public actual fun removeDirectoryTransactedW(lppathname: Pcwstr, htransaction: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemRemoveDirectoryTransactedW")

public actual fun removeDirectoryW(lppathname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemRemoveDirectoryW")

public actual fun removeLogContainer(hlog: Handle, pwszcontainerpath: Pcwstr, fforce: Bool, preserved: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemRemoveLogContainer")

public actual fun removeLogContainerSet(hlog: Handle, ccontainer: UShort, rgwszcontainerpath: ConstPtr<Pcwstr>, fforce: Bool, preserved: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemRemoveLogContainerSet")

public actual fun removeLogPolicy(hlog: Handle, epolicytype: ClfsMgmtPolicyType): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemRemoveLogPolicy")

public actual fun removeUsersFromEncryptedFile(lpfilename: Pcwstr, phashes: ConstPtr<EncryptionCertificateHashList>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemRemoveUsersFromEncryptedFile")

public actual fun renameTransactionManager(logfilename: Pcwstr, existingtransactionmanagerguid: MutPtr<Guid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemRenameTransactionManager")

public actual fun replaceFileA(lpreplacedfilename: Pcstr, lpreplacementfilename: Pcstr, lpbackupfilename: Pcstr, dwreplaceflags: ReplaceFileFlags, lpexclude: ConstPtr<CVoid>, lpreserved: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemReplaceFileA")

public actual fun replaceFileFromAppW(lpreplacedfilename: Pcwstr, lpreplacementfilename: Pcwstr, lpbackupfilename: Pcwstr, dwreplaceflags: UInt, lpexclude: ConstPtr<CVoid>, lpreserved: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemReplaceFileFromAppW")

public actual fun replaceFileW(lpreplacedfilename: Pcwstr, lpreplacementfilename: Pcwstr, lpbackupfilename: Pcwstr, dwreplaceflags: ReplaceFileFlags, lpexclude: ConstPtr<CVoid>, lpreserved: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemReplaceFileW")

public actual fun reserveAndAppendLog(pvmarshal: MutPtr<CVoid>, rgwriteentries: MutPtr<ClsWriteEntry>, cwriteentries: UInt, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, creserverecords: UInt, rgcbreservation: MutPtr<Long>, fflags: ClfsFlag, plsn: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemReserveAndAppendLog")

public actual fun reserveAndAppendLogAligned(pvmarshal: MutPtr<CVoid>, rgwriteentries: MutPtr<ClsWriteEntry>, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, creserverecords: UInt, rgcbreservation: MutPtr<Long>, fflags: ClfsFlag, plsn: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemReserveAndAppendLogAligned")

public actual fun rollbackComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemRollbackComplete")

public actual fun rollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemRollbackEnlistment")

public actual fun rollbackTransaction(transactionhandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemRollbackTransaction")

public actual fun rollbackTransactionAsync(transactionhandle: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemRollbackTransactionAsync")

public actual fun rollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemRollforwardTransactionManager")

public actual fun scanLogContainers(pcxscan: MutPtr<ClsScanContext>, escanmode: UByte, preserved: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemScanLogContainers")

public actual fun searchPathA(lppath: Pcstr, lpfilename: Pcstr, lpextension: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: MutPtr<Pstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSearchPathA")

public actual fun searchPathW(lppath: Pcwstr, lpfilename: Pcwstr, lpextension: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: MutPtr<Pwstr>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSearchPathW")

public actual fun setEncryptedFileMetadata(lpfilename: Pcwstr, pboldmetadata: ConstPtr<UByte>, pbnewmetadata: ConstPtr<UByte>, pownerhash: ConstPtr<EncryptionCertificateHash>, dwoperation: UInt, pcertificatesadded: ConstPtr<EncryptionCertificateHashList>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetEncryptedFileMetadata")

public actual fun setEndOfFile(hfile: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetEndOfFile")

public actual fun setEndOfLog(hlog: Handle, plsnend: MutPtr<ClsLsn>, lpoverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetEndOfLog")

public actual fun setEnlistmentRecoveryInformation(enlistmenthandle: Handle, buffersize: UInt, buffer: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetEnlistmentRecoveryInformation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageFilesystemSetFileApisToANSI")
private external fun wasiWindowssysWindowsWin32StorageFilesystemSetFileApisToANSI(): Unit

public actual fun setFileApisToANSI(): Unit =
    wasiWindowssysWindowsWin32StorageFilesystemSetFileApisToANSI()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageFilesystemSetFileApisToOEM")
private external fun wasiWindowssysWindowsWin32StorageFilesystemSetFileApisToOEM(): Unit

public actual fun setFileApisToOEM(): Unit =
    wasiWindowssysWindowsWin32StorageFilesystemSetFileApisToOEM()

public actual fun setFileAttributesA(lpfilename: Pcstr, dwfileattributes: FileFlagsAndAttributes): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetFileAttributesA")

public actual fun setFileAttributesFromAppW(lpfilename: Pcwstr, dwfileattributes: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetFileAttributesFromAppW")

public actual fun setFileAttributesTransactedA(lpfilename: Pcstr, dwfileattributes: UInt, htransaction: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetFileAttributesTransactedA")

public actual fun setFileAttributesTransactedW(lpfilename: Pcwstr, dwfileattributes: UInt, htransaction: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetFileAttributesTransactedW")

public actual fun setFileAttributesW(lpfilename: Pcwstr, dwfileattributes: FileFlagsAndAttributes): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetFileAttributesW")

public actual fun setFileBandwidthReservation(hfile: Handle, nperiodmilliseconds: UInt, nbytesperperiod: UInt, bdiscardable: Bool, lptransfersize: MutPtr<UInt>, lpnumoutstandingrequests: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetFileBandwidthReservation")

public actual fun setFileCompletionNotificationModes(filehandle: Handle, flags: UByte): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetFileCompletionNotificationModes")

public actual fun setFileInformationByHandle(hfile: Handle, fileinformationclass: FileInfoByHandleClass, lpfileinformation: ConstPtr<CVoid>, dwbuffersize: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetFileInformationByHandle")

public actual fun setFileIoOverlappedRange(filehandle: Handle, overlappedrangestart: ConstPtr<UByte>, length: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetFileIoOverlappedRange")

public actual fun setFilePointer(hfile: Handle, ldistancetomove: Int, lpdistancetomovehigh: MutPtr<Int>, dwmovemethod: SetFilePointerMoveMethod): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetFilePointer")

public actual fun setFilePointerEx(hfile: Handle, lidistancetomove: Long, lpnewfilepointer: MutPtr<Long>, dwmovemethod: SetFilePointerMoveMethod): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetFilePointerEx")

public actual fun setFileShortNameA(hfile: Handle, lpshortname: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetFileShortNameA")

public actual fun setFileShortNameW(hfile: Handle, lpshortname: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetFileShortNameW")

public actual fun setFileTime(hfile: Handle, lpcreationtime: ConstPtr<Filetime>, lplastaccesstime: ConstPtr<Filetime>, lplastwritetime: ConstPtr<Filetime>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetFileTime")

public actual fun setFileValidData(hfile: Handle, validdatalength: Long): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetFileValidData")

public actual fun setIoRingCompletionEvent(ioring: Hioring, hevent: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetIoRingCompletionEvent")

public actual fun setLogArchiveMode(hlog: Handle, emode: ClfsLogArchiveMode): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetLogArchiveMode")

public actual fun setLogArchiveTail(hlog: Handle, plsnarchivetail: MutPtr<ClsLsn>, preserved: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetLogArchiveTail")

public actual fun setLogFileSizeWithPolicy(hlog: Handle, pdesiredsize: ConstPtr<ULong>, presultingsize: MutPtr<ULong>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetLogFileSizeWithPolicy")

public actual fun setResourceManagerCompletionPort(resourcemanagerhandle: Handle, iocompletionporthandle: Handle, completionkey: ULong): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetResourceManagerCompletionPort")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageFilesystemSetSearchPathMode")
private external fun wasiWindowssysWindowsWin32StorageFilesystemSetSearchPathMode(flags: Int): Int

public actual fun setSearchPathMode(flags: UInt): Bool =
    wasiWindowssysWindowsWin32StorageFilesystemSetSearchPathMode(flags.toInt()).toInt()

public actual fun setTapeParameters(hdevice: Handle, dwoperation: TapeInformationType, lptapeinformation: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetTapeParameters")

public actual fun setTapePosition(hdevice: Handle, dwpositionmethod: TapePositionMethod, dwpartition: UInt, dwoffsetlow: UInt, dwoffsethigh: UInt, bimmediate: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetTapePosition")

public actual fun setTransactionInformation(transactionhandle: Handle, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetTransactionInformation")

public actual fun setUserFileEncryptionKey(pencryptioncertificate: ConstPtr<EncryptionCertificate>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetUserFileEncryptionKey")

public actual fun setUserFileEncryptionKeyEx(pencryptioncertificate: ConstPtr<EncryptionCertificate>, dwcapabilities: UInt, dwflags: UInt, pvreserved: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetUserFileEncryptionKeyEx")

public actual fun setVolumeLabelA(lprootpathname: Pcstr, lpvolumename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetVolumeLabelA")

public actual fun setVolumeLabelW(lprootpathname: Pcwstr, lpvolumename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetVolumeLabelW")

public actual fun setVolumeMountPointA(lpszvolumemountpoint: Pcstr, lpszvolumename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetVolumeMountPointA")

public actual fun setVolumeMountPointW(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSetVolumeMountPointW")

public actual fun singlePhaseReject(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSinglePhaseReject")

public actual fun submitIoRing(ioring: Hioring, waitoperations: UInt, milliseconds: UInt, submittedentries: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemSubmitIoRing")

public actual fun terminateLogArchive(pvarchivecontext: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemTerminateLogArchive")

public actual fun terminateReadLog(pvcursorcontext: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemTerminateReadLog")

public actual fun truncateLog(pvmarshal: ConstPtr<CVoid>, plsnend: ConstPtr<ClsLsn>, lpoverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemTruncateLog")

public actual fun txfGetThreadMiniVersionForCreate(miniversion: MutPtr<UShort>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemTxfGetThreadMiniVersionForCreate")

public actual fun txfLogCreateFileReadContext(logpath: Pcwstr, beginninglsn: ClsLsn, endinglsn: ClsLsn, txffileid: ConstPtr<TxfId>, txflogcontext: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemTxfLogCreateFileReadContext")

public actual fun txfLogCreateRangeReadContext(logpath: Pcwstr, beginninglsn: ClsLsn, endinglsn: ClsLsn, beginningvirtualclock: ConstPtr<Long>, endingvirtualclock: ConstPtr<Long>, recordtypemask: UInt, txflogcontext: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemTxfLogCreateRangeReadContext")

public actual fun txfLogDestroyReadContext(txflogcontext: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemTxfLogDestroyReadContext")

public actual fun txfLogReadRecords(txflogcontext: ConstPtr<CVoid>, bufferlength: UInt, buffer: MutPtr<CVoid>, bytesused: MutPtr<UInt>, recordcount: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemTxfLogReadRecords")

public actual fun txfLogRecordGetFileName(recordbuffer: ConstPtr<CVoid>, recordbufferlengthinbytes: UInt, namebuffer: Pwstr, namebufferlengthinbytes: MutPtr<UInt>, txfid: MutPtr<TxfId>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemTxfLogRecordGetFileName")

public actual fun txfLogRecordGetGenericType(recordbuffer: ConstPtr<CVoid>, recordbufferlengthinbytes: UInt, generictype: MutPtr<UInt>, virtualclock: MutPtr<Long>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemTxfLogRecordGetGenericType")

public actual fun txfReadMetadataInfo(filehandle: Handle, txffileid: MutPtr<TxfId>, lastlsn: MutPtr<ClsLsn>, transactionstate: MutPtr<UInt>, lockingtransaction: MutPtr<Guid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemTxfReadMetadataInfo")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageFilesystemTxfSetThreadMiniVersionForCreate")
private external fun wasiWindowssysWindowsWin32StorageFilesystemTxfSetThreadMiniVersionForCreate(miniversion: Int): Unit

public actual fun txfSetThreadMiniVersionForCreate(miniversion: UShort): Unit =
    wasiWindowssysWindowsWin32StorageFilesystemTxfSetThreadMiniVersionForCreate(miniversion.toInt())

public actual fun unlockFile(hfile: Handle, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemUnlockFile")

public actual fun unlockFileEx(hfile: Handle, dwreserved: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt, lpoverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemUnlockFileEx")

public actual fun validateLog(pszlogfilename: Pcwstr, psalogfile: MutPtr<SecurityAttributes>, pinfobuffer: MutPtr<ClsInformation>, pcbbuffer: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemValidateLog")

public actual fun verFindFileA(uflags: VerFindFileFlags, szfilename: Pcstr, szwindir: Pcstr, szappdir: Pcstr, szcurdir: Pstr, pucurdirlen: MutPtr<UInt>, szdestdir: Pstr, pudestdirlen: MutPtr<UInt>): VerFindFileStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemVerFindFileA")

public actual fun verFindFileW(uflags: VerFindFileFlags, szfilename: Pcwstr, szwindir: Pcwstr, szappdir: Pcwstr, szcurdir: Pwstr, pucurdirlen: MutPtr<UInt>, szdestdir: Pwstr, pudestdirlen: MutPtr<UInt>): VerFindFileStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemVerFindFileW")

public actual fun verInstallFileA(uflags: VerInstallFileFlags, szsrcfilename: Pcstr, szdestfilename: Pcstr, szsrcdir: Pcstr, szdestdir: Pcstr, szcurdir: Pcstr, sztmpfile: Pstr, putmpfilelen: MutPtr<UInt>): VerInstallFileStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemVerInstallFileA")

public actual fun verInstallFileW(uflags: VerInstallFileFlags, szsrcfilename: Pcwstr, szdestfilename: Pcwstr, szsrcdir: Pcwstr, szdestdir: Pcwstr, szcurdir: Pcwstr, sztmpfile: Pwstr, putmpfilelen: MutPtr<UInt>): VerInstallFileStatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemVerInstallFileW")

public actual fun verLanguageNameA(wlang: UInt, szlang: Pstr, cchlang: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemVerLanguageNameA")

public actual fun verLanguageNameW(wlang: UInt, szlang: Pwstr, cchlang: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemVerLanguageNameW")

public actual fun verQueryValueA(pblock: ConstPtr<CVoid>, lpsubblock: Pcstr, lplpbuffer: MutPtr<MutPtr<CVoid>>, pulen: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemVerQueryValueA")

public actual fun verQueryValueW(pblock: ConstPtr<CVoid>, lpsubblock: Pcwstr, lplpbuffer: MutPtr<MutPtr<CVoid>>, pulen: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemVerQueryValueW")

public actual fun wofEnumEntries(volumename: Pcwstr, provider: UInt, enumproc: WofEnumEntryProc, userdata: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemWofEnumEntries")

public actual fun wofFileEnumFiles(volumename: Pcwstr, algorithm: UInt, enumproc: WofEnumFilesProc, userdata: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemWofFileEnumFiles")

public actual fun wofGetDriverVersion(fileorvolumehandle: Handle, provider: UInt, wofversion: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemWofGetDriverVersion")

public actual fun wofIsExternalFile(filepath: Pcwstr, isexternalfile: MutPtr<Bool>, provider: MutPtr<UInt>, externalfileinfo: MutPtr<CVoid>, bufferlength: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemWofIsExternalFile")

public actual fun wofSetFileDataLocation(filehandle: Handle, provider: UInt, externalfileinfo: ConstPtr<CVoid>, length: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemWofSetFileDataLocation")

public actual fun wofShouldCompressBinaries(volume: Pcwstr, algorithm: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemWofShouldCompressBinaries")

public actual fun wofWimAddEntry(volumename: Pcwstr, wimpath: Pcwstr, wimtype: UInt, wimindex: UInt, datasourceid: MutPtr<Long>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemWofWimAddEntry")

public actual fun wofWimEnumFiles(volumename: Pcwstr, datasourceid: Long, enumproc: WofEnumFilesProc, userdata: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemWofWimEnumFiles")

public actual fun wofWimRemoveEntry(volumename: Pcwstr, datasourceid: Long): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemWofWimRemoveEntry")

public actual fun wofWimSuspendEntry(volumename: Pcwstr, datasourceid: Long): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemWofWimSuspendEntry")

public actual fun wofWimUpdateEntry(volumename: Pcwstr, datasourceid: Long, newwimpath: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemWofWimUpdateEntry")

public actual fun wow64DisableWow64FsRedirection(oldvalue: MutPtr<MutPtr<CVoid>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemWow64DisableWow64FsRedirection")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageFilesystemWow64EnableWow64FsRedirection")
private external fun wasiWindowssysWindowsWin32StorageFilesystemWow64EnableWow64FsRedirection(wow64fsenableredirection: Int): Int

public actual fun wow64EnableWow64FsRedirection(wow64fsenableredirection: Boolean): Boolean =
    (wasiWindowssysWindowsWin32StorageFilesystemWow64EnableWow64FsRedirection(if (wow64fsenableredirection) 1 else 0) != 0)

public actual fun wow64RevertWow64FsRedirection(olvalue: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemWow64RevertWow64FsRedirection")

public actual fun writeEncryptedFileRaw(pfimportcallback: PfeImportFunc, pvcallbackcontext: ConstPtr<CVoid>, pvcontext: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemWriteEncryptedFileRaw")

public actual fun writeFile(hfile: Handle, lpbuffer: ConstPtr<UByte>, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemWriteFile")

public actual fun writeFileEx(hfile: Handle, lpbuffer: ConstPtr<UByte>, nnumberofbytestowrite: UInt, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemWriteFileEx")

public actual fun writeFileGather(hfile: Handle, asegmentarray: ConstPtr<FileSegmentElement>, nnumberofbytestowrite: UInt, lpreserved: ConstPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemWriteFileGather")

public actual fun writeLogRestartArea(pvmarshal: MutPtr<CVoid>, pvrestartbuffer: MutPtr<CVoid>, cbrestartbuffer: UInt, plsnbase: MutPtr<ClsLsn>, fflags: ClfsFlag, pcbwritten: MutPtr<UInt>, plsnnext: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemWriteLogRestartArea")

public actual fun writeTapemark(hdevice: Handle, dwtapemarktype: TapemarkType, dwtapemarkcount: UInt, bimmediate: Bool): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageFilesystemWriteTapemark")
