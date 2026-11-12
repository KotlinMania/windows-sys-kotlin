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

private object WindowsWin32StorageFilesystemJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32StorageFilesystemJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemAddLogContainer(hlog: Long, pcbcontainer: Long, pwszcontainerpath: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemAddLogContainerSet(hlog: Long, ccontainer: Short, pcbcontainer: Long, rgwszcontainerpath: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemAddUsersToEncryptedFile(lpfilename: Long, pencryptioncertificates: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemAdvanceLogBase(pvmarshal: Long, plsnbase: Long, fflags: Int, poverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemAlignReservedLog(pvmarshal: Long, creservedrecords: Int, rgcbreservation: Long, pcbalignreservation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemAllocReservedLog(pvmarshal: Long, creservedrecords: Int, pcbadjustment: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemAreFileApisANSI(): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemAreShortNamesEnabled(handle: Long, enabled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemBackupRead(hfile: Long, lpbuffer: Long, nnumberofbytestoread: Int, lpnumberofbytesread: Long, babort: Int, bprocesssecurity: Int, lpcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemBackupSeek(hfile: Long, dwlowbytestoseek: Int, dwhighbytestoseek: Int, lpdwlowbyteseeked: Long, lpdwhighbyteseeked: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemBackupWrite(hfile: Long, lpbuffer: Long, nnumberofbytestowrite: Int, lpnumberofbyteswritten: Long, babort: Int, bprocesssecurity: Int, lpcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemBuildIoRingRegisterBuffers(ioring: Long, count: Int, buffers: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemBuildIoRingRegisterFileHandles(ioring: Long, count: Int, handles: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCheckNameLegalDOS8Dot3A(lpname: Long, lpoemname: Long, oemnamesize: Int, pbnamecontainsspaces: Long, pbnamelegal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCheckNameLegalDOS8Dot3W(lpname: Long, lpoemname: Long, oemnamesize: Int, pbnamecontainsspaces: Long, pbnamelegal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCloseAndResetLogFile(hlog: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCloseEncryptedFileRaw(pvcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCloseIoRing(ioring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCommitComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCommitEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCommitTransaction(transactionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCommitTransactionAsync(transactionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCompareFileTime(lpfiletime1: Long, lpfiletime2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCopyFile2(pwszexistingfilename: Long, pwsznewfilename: Long, pextendedparameters: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCopyFileA(lpexistingfilename: Long, lpnewfilename: Long, bfailifexists: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCopyFileExA(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, pbcancel: Long, dwcopyflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCopyFileExW(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, pbcancel: Long, dwcopyflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCopyFileFromAppW(lpexistingfilename: Long, lpnewfilename: Long, bfailifexists: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCopyFileTransactedA(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, pbcancel: Long, dwcopyflags: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCopyFileTransactedW(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, pbcancel: Long, dwcopyflags: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCopyFileW(lpexistingfilename: Long, lpnewfilename: Long, bfailifexists: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCopyLZFile(hfsource: Int, hfdest: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateDirectoryA(lppathname: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateDirectoryExA(lptemplatedirectory: Long, lpnewdirectory: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateDirectoryExW(lptemplatedirectory: Long, lpnewdirectory: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateDirectoryFromAppW(lppathname: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateDirectoryTransactedA(lptemplatedirectory: Long, lpnewdirectory: Long, lpsecurityattributes: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateDirectoryTransactedW(lptemplatedirectory: Long, lpnewdirectory: Long, lpsecurityattributes: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateDirectoryW(lppathname: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateEnlistment(lpenlistmentattributes: Long, resourcemanagerhandle: Long, transactionhandle: Long, notificationmask: Int, createoptions: Int, enlistmentkey: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateFile2(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, dwcreationdisposition: Int, pcreateexparams: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateFile2FromAppW(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, dwcreationdisposition: Int, pcreateexparams: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateFileA(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwcreationdisposition: Int, dwflagsandattributes: Int, htemplatefile: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateFileFromAppW(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwcreationdisposition: Int, dwflagsandattributes: Int, htemplatefile: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateFileTransactedA(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwcreationdisposition: Int, dwflagsandattributes: Int, htemplatefile: Long, htransaction: Long, pusminiversion: Long, lpextendedparameter: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateFileTransactedW(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwcreationdisposition: Int, dwflagsandattributes: Int, htemplatefile: Long, htransaction: Long, pusminiversion: Long, lpextendedparameter: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateFileW(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwcreationdisposition: Int, dwflagsandattributes: Int, htemplatefile: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateHardLinkA(lpfilename: Long, lpexistingfilename: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateHardLinkTransactedA(lpfilename: Long, lpexistingfilename: Long, lpsecurityattributes: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateHardLinkTransactedW(lpfilename: Long, lpexistingfilename: Long, lpsecurityattributes: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateHardLinkW(lpfilename: Long, lpexistingfilename: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateLogContainerScanContext(hlog: Long, cfromcontainer: Int, ccontainers: Int, escanmode: Byte, pcxscan: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateLogFile(pszlogfilename: Long, fdesiredaccess: Int, dwsharemode: Int, psalogfile: Long, fcreatedisposition: Int, fflagsandattributes: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateLogMarshallingArea(hlog: Long, pfnallocbuffer: Long, pfnfreebuffer: Long, pvblockalloccontext: Long, cbmarshallingbuffer: Int, cmaxwritebuffers: Int, cmaxreadbuffers: Int, ppvmarshal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateResourceManager(lpresourcemanagerattributes: Long, resourcemanagerid: Long, createoptions: Int, tmhandle: Long, description: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateSymbolicLinkA(lpsymlinkfilename: Long, lptargetfilename: Long, dwflags: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateSymbolicLinkTransactedA(lpsymlinkfilename: Long, lptargetfilename: Long, dwflags: Int, htransaction: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateSymbolicLinkTransactedW(lpsymlinkfilename: Long, lptargetfilename: Long, dwflags: Int, htransaction: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateSymbolicLinkW(lpsymlinkfilename: Long, lptargetfilename: Long, dwflags: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateTapePartition(hdevice: Long, dwpartitionmethod: Int, dwcount: Int, dwsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateTransaction(lptransactionattributes: Long, uow: Long, createoptions: Int, isolationlevel: Int, isolationflags: Int, timeout: Int, description: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemCreateTransactionManager(lptransactionattributes: Long, logfilename: Long, createoptions: Int, commitstrength: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemDecryptFileA(lpfilename: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemDecryptFileW(lpfilename: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemDefineDosDeviceA(dwflags: Int, lpdevicename: Long, lptargetpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemDefineDosDeviceW(dwflags: Int, lpdevicename: Long, lptargetpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemDeleteFileA(lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemDeleteFileFromAppW(lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemDeleteFileTransactedA(lpfilename: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemDeleteFileTransactedW(lpfilename: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemDeleteFileW(lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemDeleteLogByHandle(hlog: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemDeleteLogFile(pszlogfilename: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemDeleteLogMarshallingArea(pvmarshal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemDeleteVolumeMountPointA(lpszvolumemountpoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemDeleteVolumeMountPointW(lpszvolumemountpoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemDeregisterManageableLogClient(hlog: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemDuplicateEncryptionInfoFile(srcfilename: Long, dstfilename: Long, dwcreationdistribution: Int, dwattributes: Int, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemEncryptFileA(lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemEncryptFileW(lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemEncryptionDisable(dirpath: Long, disable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemEraseTape(hdevice: Long, dwerasetype: Int, bimmediate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFileEncryptionStatusA(lpfilename: Long, lpstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFileEncryptionStatusW(lpfilename: Long, lpstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFileTimeToLocalFileTime(lpfiletime: Long, lplocalfiletime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindClose(hfindfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindCloseChangeNotification(hchangehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindFirstChangeNotificationA(lppathname: Long, bwatchsubtree: Int, dwnotifyfilter: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindFirstChangeNotificationW(lppathname: Long, bwatchsubtree: Int, dwnotifyfilter: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindFirstFileA(lpfilename: Long, lpfindfiledata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindFirstFileExA(lpfilename: Long, finfolevelid: Int, lpfindfiledata: Long, fsearchop: Int, lpsearchfilter: Long, dwadditionalflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindFirstFileExFromAppW(lpfilename: Long, finfolevelid: Int, lpfindfiledata: Long, fsearchop: Int, lpsearchfilter: Long, dwadditionalflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindFirstFileExW(lpfilename: Long, finfolevelid: Int, lpfindfiledata: Long, fsearchop: Int, lpsearchfilter: Long, dwadditionalflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindFirstFileNameTransactedW(lpfilename: Long, dwflags: Int, stringlength: Long, linkname: Long, htransaction: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindFirstFileNameW(lpfilename: Long, dwflags: Int, stringlength: Long, linkname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindFirstFileTransactedA(lpfilename: Long, finfolevelid: Int, lpfindfiledata: Long, fsearchop: Int, lpsearchfilter: Long, dwadditionalflags: Int, htransaction: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindFirstFileTransactedW(lpfilename: Long, finfolevelid: Int, lpfindfiledata: Long, fsearchop: Int, lpsearchfilter: Long, dwadditionalflags: Int, htransaction: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindFirstFileW(lpfilename: Long, lpfindfiledata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindFirstStreamTransactedW(lpfilename: Long, infolevel: Int, lpfindstreamdata: Long, dwflags: Int, htransaction: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindFirstStreamW(lpfilename: Long, infolevel: Int, lpfindstreamdata: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindFirstVolumeA(lpszvolumename: Long, cchbufferlength: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindFirstVolumeMountPointA(lpszrootpathname: Long, lpszvolumemountpoint: Long, cchbufferlength: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindFirstVolumeMountPointW(lpszrootpathname: Long, lpszvolumemountpoint: Long, cchbufferlength: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindFirstVolumeW(lpszvolumename: Long, cchbufferlength: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindNextChangeNotification(hchangehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindNextFileA(hfindfile: Long, lpfindfiledata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindNextFileNameW(hfindstream: Long, stringlength: Long, linkname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindNextFileW(hfindfile: Long, lpfindfiledata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindNextStreamW(hfindstream: Long, lpfindstreamdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindNextVolumeA(hfindvolume: Long, lpszvolumename: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindNextVolumeMountPointA(hfindvolumemountpoint: Long, lpszvolumemountpoint: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindNextVolumeMountPointW(hfindvolumemountpoint: Long, lpszvolumemountpoint: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindNextVolumeW(hfindvolume: Long, lpszvolumename: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindVolumeClose(hfindvolume: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFindVolumeMountPointClose(hfindvolumemountpoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFlushFileBuffers(hfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFlushLogBuffers(pvmarshal: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFlushLogToLsn(pvmarshalcontext: Long, plsnflush: Long, plsnlastflushed: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFreeEncryptedFileMetadata(pbmetadata: Long)

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFreeEncryptionCertificateHashList(pusers: Long)

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemFreeReservedLog(pvmarshal: Long, creservedrecords: Int, pcbadjustment: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetBinaryTypeA(lpapplicationname: Long, lpbinarytype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetBinaryTypeW(lpapplicationname: Long, lpbinarytype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetCompressedFileSizeA(lpfilename: Long, lpfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetCompressedFileSizeTransactedA(lpfilename: Long, lpfilesizehigh: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetCompressedFileSizeTransactedW(lpfilename: Long, lpfilesizehigh: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetCompressedFileSizeW(lpfilename: Long, lpfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetCurrentClockTransactionManager(transactionmanagerhandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceA(lprootpathname: Long, lpsectorspercluster: Long, lpbytespersector: Long, lpnumberoffreeclusters: Long, lptotalnumberofclusters: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceExA(lpdirectoryname: Long, lpfreebytesavailabletocaller: Long, lptotalnumberofbytes: Long, lptotalnumberoffreebytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceExW(lpdirectoryname: Long, lpfreebytesavailabletocaller: Long, lptotalnumberofbytes: Long, lptotalnumberoffreebytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceW(lprootpathname: Long, lpsectorspercluster: Long, lpbytespersector: Long, lpnumberoffreeclusters: Long, lptotalnumberofclusters: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetDiskSpaceInformationA(rootpath: Long, diskspaceinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetDiskSpaceInformationW(rootpath: Long, diskspaceinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetDriveTypeA(lprootpathname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetDriveTypeW(lprootpathname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetEncryptedFileMetadata(lpfilename: Long, pcbmetadata: Long, ppbmetadata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetEnlistmentId(enlistmenthandle: Long, enlistmentid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetEnlistmentRecoveryInformation(enlistmenthandle: Long, buffersize: Int, buffer: Long, bufferused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetExpandedNameA(lpszsource: Long, lpszbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetExpandedNameW(lpszsource: Long, lpszbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileAttributesA(lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileAttributesExA(lpfilename: Long, finfolevelid: Int, lpfileinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileAttributesExFromAppW(lpfilename: Long, finfolevelid: Int, lpfileinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileAttributesExW(lpfilename: Long, finfolevelid: Int, lpfileinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileAttributesTransactedA(lpfilename: Long, finfolevelid: Int, lpfileinformation: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileAttributesTransactedW(lpfilename: Long, finfolevelid: Int, lpfileinformation: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileAttributesW(lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileBandwidthReservation(hfile: Long, lpperiodmilliseconds: Long, lpbytesperperiod: Long, pdiscardable: Long, lptransfersize: Long, lpnumoutstandingrequests: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileInformationByHandle(hfile: Long, lpfileinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileInformationByHandleEx(hfile: Long, fileinformationclass: Int, lpfileinformation: Long, dwbuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileSize(hfile: Long, lpfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileSizeEx(hfile: Long, lpfilesize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileTime(hfile: Long, lpcreationtime: Long, lplastaccesstime: Long, lplastwritetime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileType(hfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileVersionInfoA(lptstrfilename: Long, dwhandle: Int, dwlen: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileVersionInfoExA(dwflags: Int, lpwstrfilename: Long, dwhandle: Int, dwlen: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileVersionInfoExW(dwflags: Int, lpwstrfilename: Long, dwhandle: Int, dwlen: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeA(lptstrfilename: Long, lpdwhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeExA(dwflags: Int, lpwstrfilename: Long, lpdwhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeExW(dwflags: Int, lpwstrfilename: Long, lpdwhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeW(lptstrfilename: Long, lpdwhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFileVersionInfoW(lptstrfilename: Long, dwhandle: Int, dwlen: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFinalPathNameByHandleA(hfile: Long, lpszfilepath: Long, cchfilepath: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFinalPathNameByHandleW(hfile: Long, lpszfilepath: Long, cchfilepath: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFullPathNameA(lpfilename: Long, nbufferlength: Int, lpbuffer: Long, lpfilepart: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFullPathNameTransactedA(lpfilename: Long, nbufferlength: Int, lpbuffer: Long, lpfilepart: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFullPathNameTransactedW(lpfilename: Long, nbufferlength: Int, lpbuffer: Long, lpfilepart: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetFullPathNameW(lpfilename: Long, nbufferlength: Int, lpbuffer: Long, lpfilepart: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetIoRingInfo(ioring: Long, info: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetLogContainerName(hlog: Long, cidlogicalcontainer: Int, pwstrcontainername: Long, clencontainername: Int, pcactuallencontainername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetLogFileInformation(hlog: Long, pinfobuffer: Long, cbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetLogIoStatistics(hlog: Long, pvstatsbuffer: Long, cbstatsbuffer: Int, estatsclass: Int, pcbstatswritten: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetLogReservationInfo(pvmarshal: Long, pcbrecordnumber: Long, pcbuserreservation: Long, pcbcommitreservation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetLogicalDriveStringsA(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetLogicalDriveStringsW(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetLogicalDrives(): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetLongPathNameA(lpszshortpath: Long, lpszlongpath: Long, cchbuffer: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetLongPathNameTransactedA(lpszshortpath: Long, lpszlongpath: Long, cchbuffer: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetLongPathNameTransactedW(lpszshortpath: Long, lpszlongpath: Long, cchbuffer: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetLongPathNameW(lpszshortpath: Long, lpszlongpath: Long, cchbuffer: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetNextLogArchiveExtent(pvarchivecontext: Long, rgadextent: Long, cdescriptors: Int, pcdescriptorsreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetNotificationResourceManager(resourcemanagerhandle: Long, transactionnotification: Long, notificationlength: Int, dwmilliseconds: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetNotificationResourceManagerAsync(resourcemanagerhandle: Long, transactionnotification: Long, transactionnotificationlength: Int, returnlength: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetShortPathNameA(lpszlongpath: Long, lpszshortpath: Long, cchbuffer: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetShortPathNameW(lpszlongpath: Long, lpszshortpath: Long, cchbuffer: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetTapeParameters(hdevice: Long, dwoperation: Int, lpdwsize: Long, lptapeinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetTapePosition(hdevice: Long, dwpositiontype: Int, lpdwpartition: Long, lpdwoffsetlow: Long, lpdwoffsethigh: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetTapeStatus(hdevice: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetTempFileNameA(lppathname: Long, lpprefixstring: Long, uunique: Int, lptempfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetTempFileNameW(lppathname: Long, lpprefixstring: Long, uunique: Int, lptempfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetTempPath2A(bufferlength: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetTempPath2W(bufferlength: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetTempPathA(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetTempPathW(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetTransactionId(transactionhandle: Long, transactionid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetTransactionInformation(transactionhandle: Long, outcome: Long, isolationlevel: Long, isolationflags: Long, timeout: Long, bufferlength: Int, description: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetTransactionManagerId(transactionmanagerhandle: Long, transactionmanagerid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetVolumeInformationA(lprootpathname: Long, lpvolumenamebuffer: Long, nvolumenamesize: Int, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: Long, nfilesystemnamesize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetVolumeInformationByHandleW(hfile: Long, lpvolumenamebuffer: Long, nvolumenamesize: Int, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: Long, nfilesystemnamesize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetVolumeInformationW(lprootpathname: Long, lpvolumenamebuffer: Long, nvolumenamesize: Int, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: Long, nfilesystemnamesize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetVolumeNameForVolumeMountPointA(lpszvolumemountpoint: Long, lpszvolumename: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetVolumeNameForVolumeMountPointW(lpszvolumemountpoint: Long, lpszvolumename: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetVolumePathNameA(lpszfilename: Long, lpszvolumepathname: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetVolumePathNameW(lpszfilename: Long, lpszvolumepathname: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetVolumePathNamesForVolumeNameA(lpszvolumename: Long, lpszvolumepathnames: Long, cchbufferlength: Int, lpcchreturnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemGetVolumePathNamesForVolumeNameW(lpszvolumename: Long, lpszvolumepathnames: Long, cchbufferlength: Int, lpcchreturnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemHandleLogFull(hlog: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemInstallLogPolicy(hlog: Long, ppolicy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemIsIoRingOpSupported(ioring: Long, op: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLZClose(hfile: Int)

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLZCopy(hfsource: Int, hfdest: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLZDone()

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLZInit(hfsource: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLZOpenFileA(lpfilename: Long, lpreopenbuf: Long, wstyle: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLZOpenFileW(lpfilename: Long, lpreopenbuf: Long, wstyle: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLZRead(hfile: Int, lpbuffer: Long, cbread: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLZSeek(hfile: Int, loffset: Int, iorigin: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLZStart(): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLocalFileTimeToFileTime(lplocalfiletime: Long, lpfiletime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLockFile(hfile: Long, dwfileoffsetlow: Int, dwfileoffsethigh: Int, nnumberofbytestolocklow: Int, nnumberofbytestolockhigh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLockFileEx(hfile: Long, dwflags: Int, dwreserved: Int, nnumberofbytestolocklow: Int, nnumberofbytestolockhigh: Int, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLogTailAdvanceFailure(hlog: Long, dwreason: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLsnBlockOffset(plsn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLsnContainer(plsn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLsnEqual(plsn1: Long, plsn2: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLsnGreater(plsn1: Long, plsn2: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLsnInvalid(plsn: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLsnLess(plsn1: Long, plsn2: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLsnNull(plsn: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemLsnRecordSequence(plsn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemMoveFileA(lpexistingfilename: Long, lpnewfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemMoveFileExA(lpexistingfilename: Long, lpnewfilename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemMoveFileExW(lpexistingfilename: Long, lpnewfilename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemMoveFileFromAppW(lpexistingfilename: Long, lpnewfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemMoveFileTransactedA(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, dwflags: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemMoveFileTransactedW(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, dwflags: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemMoveFileW(lpexistingfilename: Long, lpnewfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemMoveFileWithProgressA(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemMoveFileWithProgressW(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemNetConnectionEnum(servername: Long, qualifier: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemNetFileClose(servername: Long, fileid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemNetFileEnum(servername: Long, basepath: Long, username: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemNetFileGetInfo(servername: Long, fileid: Int, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemNetServerAliasAdd(servername: Long, level: Int, buf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemNetServerAliasDel(servername: Long, level: Int, buf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemNetServerAliasEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemNetSessionDel(servername: Long, uncclientname: Long, username: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemNetSessionEnum(servername: Long, uncclientname: Long, username: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemNetSessionGetInfo(servername: Long, uncclientname: Long, username: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemNetShareAdd(servername: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemNetShareCheck(servername: Long, device: Long, type: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemNetShareDel(servername: Long, netname: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemNetShareDelEx(servername: Long, level: Int, buf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemNetShareDelSticky(servername: Long, netname: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemNetShareEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemNetShareEnumSticky(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemNetShareGetInfo(servername: Long, netname: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemNetShareSetInfo(servername: Long, netname: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemNetStatisticsGet(servername: Long, service: Long, level: Int, options: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemOpenEncryptedFileRawA(lpfilename: Long, ulflags: Int, pvcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemOpenEncryptedFileRawW(lpfilename: Long, ulflags: Int, pvcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemOpenEnlistment(dwdesiredaccess: Int, resourcemanagerhandle: Long, enlistmentid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemOpenFile(lpfilename: Long, lpreopenbuff: Long, ustyle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemOpenFileById(hvolumehint: Long, lpfileid: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwflagsandattributes: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemOpenResourceManager(dwdesiredaccess: Int, tmhandle: Long, resourcemanagerid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemOpenTransaction(dwdesiredaccess: Int, transactionid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemOpenTransactionManager(logfilename: Long, desiredaccess: Int, openoptions: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemOpenTransactionManagerById(transactionmanagerid: Long, desiredaccess: Int, openoptions: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemPopIoRingCompletion(ioring: Long, cqe: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemPrePrepareComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemPrePrepareEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemPrepareComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemPrepareEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemPrepareLogArchive(hlog: Long, pszbaselogfilename: Long, clen: Int, plsnlow: Long, plsnhigh: Long, pcactuallength: Long, poffbaselogfiledata: Long, pcbbaselogfilelength: Long, plsnbase: Long, plsnlast: Long, plsncurrentarchivetail: Long, ppvarchivecontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemPrepareTape(hdevice: Long, dwoperation: Int, bimmediate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemQueryDosDeviceA(lpdevicename: Long, lptargetpath: Long, ucchmax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemQueryDosDeviceW(lpdevicename: Long, lptargetpath: Long, ucchmax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemQueryIoRingCapabilities(capabilities: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemQueryLogPolicy(hlog: Long, epolicytype: Int, ppolicybuffer: Long, pcbpolicybuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemQueryRecoveryAgentsOnEncryptedFile(lpfilename: Long, precoveryagents: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemQueryUsersOnEncryptedFile(lpfilename: Long, pusers: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemReOpenFile(horiginalfile: Long, dwdesiredaccess: Int, dwsharemode: Int, dwflagsandattributes: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemReadDirectoryChangesExW(hdirectory: Long, lpbuffer: Long, nbufferlength: Int, bwatchsubtree: Int, dwnotifyfilter: Int, lpbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: Long, readdirectorynotifyinformationclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemReadDirectoryChangesW(hdirectory: Long, lpbuffer: Long, nbufferlength: Int, bwatchsubtree: Int, dwnotifyfilter: Int, lpbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemReadEncryptedFileRaw(pfexportcallback: Long, pvcallbackcontext: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemReadFile(hfile: Long, lpbuffer: Long, nnumberofbytestoread: Int, lpnumberofbytesread: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemReadFileEx(hfile: Long, lpbuffer: Long, nnumberofbytestoread: Int, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemReadFileScatter(hfile: Long, asegmentarray: Long, nnumberofbytestoread: Int, lpreserved: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemReadLogArchiveMetadata(pvarchivecontext: Long, cboffset: Int, cbbytestoread: Int, pbreadbuffer: Long, pcbbytesread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemReadLogNotification(hlog: Long, pnotification: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemReadLogRecord(pvmarshal: Long, plsnfirst: Long, econtextmode: Int, ppvreadbuffer: Long, pcbreadbuffer: Long, perecordtype: Long, plsnundonext: Long, plsnprevious: Long, ppvreadcontext: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemReadLogRestartArea(pvmarshal: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsn: Long, ppvcontext: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemReadNextLogRecord(pvreadcontext: Long, ppvbuffer: Long, pcbbuffer: Long, perecordtype: Long, plsnuser: Long, plsnundonext: Long, plsnprevious: Long, plsnrecord: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemReadOnlyEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemReadPreviousLogRestartArea(pvreadcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsnrestart: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemRecoverEnlistment(enlistmenthandle: Long, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemRecoverResourceManager(resourcemanagerhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemRecoverTransactionManager(transactionmanagerhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemRegisterForLogWriteNotification(hlog: Long, cbthreshold: Int, fenable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemRegisterManageableLogClient(hlog: Long, pcallbacks: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemRemoveDirectoryA(lppathname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemRemoveDirectoryFromAppW(lppathname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemRemoveDirectoryTransactedA(lppathname: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemRemoveDirectoryTransactedW(lppathname: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemRemoveDirectoryW(lppathname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemRemoveLogContainer(hlog: Long, pwszcontainerpath: Long, fforce: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemRemoveLogContainerSet(hlog: Long, ccontainer: Short, rgwszcontainerpath: Long, fforce: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemRemoveLogPolicy(hlog: Long, epolicytype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemRemoveUsersFromEncryptedFile(lpfilename: Long, phashes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemReplaceFileA(lpreplacedfilename: Long, lpreplacementfilename: Long, lpbackupfilename: Long, dwreplaceflags: Int, lpexclude: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemReplaceFileFromAppW(lpreplacedfilename: Long, lpreplacementfilename: Long, lpbackupfilename: Long, dwreplaceflags: Int, lpexclude: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemReplaceFileW(lpreplacedfilename: Long, lpreplacementfilename: Long, lpbackupfilename: Long, dwreplaceflags: Int, lpexclude: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemReserveAndAppendLog(pvmarshal: Long, rgwriteentries: Long, cwriteentries: Int, plsnundonext: Long, plsnprevious: Long, creserverecords: Int, rgcbreservation: Long, fflags: Int, plsn: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemReserveAndAppendLogAligned(pvmarshal: Long, rgwriteentries: Long, cwriteentries: Int, cbentryalignment: Int, plsnundonext: Long, plsnprevious: Long, creserverecords: Int, rgcbreservation: Long, fflags: Int, plsn: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemRollbackComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemRollbackEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemRollbackTransaction(transactionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemRollbackTransactionAsync(transactionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemRollforwardTransactionManager(transactionmanagerhandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemScanLogContainers(pcxscan: Long, escanmode: Byte, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSearchPathA(lppath: Long, lpfilename: Long, lpextension: Long, nbufferlength: Int, lpbuffer: Long, lpfilepart: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSearchPathW(lppath: Long, lpfilename: Long, lpextension: Long, nbufferlength: Int, lpbuffer: Long, lpfilepart: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetEncryptedFileMetadata(lpfilename: Long, pboldmetadata: Long, pbnewmetadata: Long, pownerhash: Long, dwoperation: Int, pcertificatesadded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetEndOfFile(hfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetEndOfLog(hlog: Long, plsnend: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetEnlistmentRecoveryInformation(enlistmenthandle: Long, buffersize: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetFileApisToANSI()

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetFileApisToOEM()

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetFileAttributesA(lpfilename: Long, dwfileattributes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetFileAttributesFromAppW(lpfilename: Long, dwfileattributes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetFileAttributesTransactedA(lpfilename: Long, dwfileattributes: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetFileAttributesTransactedW(lpfilename: Long, dwfileattributes: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetFileAttributesW(lpfilename: Long, dwfileattributes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetFileBandwidthReservation(hfile: Long, nperiodmilliseconds: Int, nbytesperperiod: Int, bdiscardable: Int, lptransfersize: Long, lpnumoutstandingrequests: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetFileCompletionNotificationModes(filehandle: Long, flags: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetFileInformationByHandle(hfile: Long, fileinformationclass: Int, lpfileinformation: Long, dwbuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetFileIoOverlappedRange(filehandle: Long, overlappedrangestart: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetFilePointer(hfile: Long, ldistancetomove: Int, lpdistancetomovehigh: Long, dwmovemethod: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetFilePointerEx(hfile: Long, lidistancetomove: Long, lpnewfilepointer: Long, dwmovemethod: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetFileShortNameA(hfile: Long, lpshortname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetFileShortNameW(hfile: Long, lpshortname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetFileTime(hfile: Long, lpcreationtime: Long, lplastaccesstime: Long, lplastwritetime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetFileValidData(hfile: Long, validdatalength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetIoRingCompletionEvent(ioring: Long, hevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetLogArchiveMode(hlog: Long, emode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetLogArchiveTail(hlog: Long, plsnarchivetail: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetLogFileSizeWithPolicy(hlog: Long, pdesiredsize: Long, presultingsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetResourceManagerCompletionPort(resourcemanagerhandle: Long, iocompletionporthandle: Long, completionkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetSearchPathMode(flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetTapeParameters(hdevice: Long, dwoperation: Int, lptapeinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetTapePosition(hdevice: Long, dwpositionmethod: Int, dwpartition: Int, dwoffsetlow: Int, dwoffsethigh: Int, bimmediate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetTransactionInformation(transactionhandle: Long, isolationlevel: Int, isolationflags: Int, timeout: Int, description: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetUserFileEncryptionKey(pencryptioncertificate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetUserFileEncryptionKeyEx(pencryptioncertificate: Long, dwcapabilities: Int, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetVolumeLabelA(lprootpathname: Long, lpvolumename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetVolumeLabelW(lprootpathname: Long, lpvolumename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetVolumeMountPointA(lpszvolumemountpoint: Long, lpszvolumename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSetVolumeMountPointW(lpszvolumemountpoint: Long, lpszvolumename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSinglePhaseReject(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemSubmitIoRing(ioring: Long, waitoperations: Int, milliseconds: Int, submittedentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemTerminateLogArchive(pvarchivecontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemTerminateReadLog(pvcursorcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemTruncateLog(pvmarshal: Long, plsnend: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemTxfGetThreadMiniVersionForCreate(miniversion: Long)

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemTxfLogDestroyReadContext(txflogcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemTxfLogReadRecords(txflogcontext: Long, bufferlength: Int, buffer: Long, bytesused: Long, recordcount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemTxfLogRecordGetFileName(recordbuffer: Long, recordbufferlengthinbytes: Int, namebuffer: Long, namebufferlengthinbytes: Long, txfid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemTxfLogRecordGetGenericType(recordbuffer: Long, recordbufferlengthinbytes: Int, generictype: Long, virtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemTxfReadMetadataInfo(filehandle: Long, txffileid: Long, lastlsn: Long, transactionstate: Long, lockingtransaction: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemTxfSetThreadMiniVersionForCreate(miniversion: Short)

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemUnlockFile(hfile: Long, dwfileoffsetlow: Int, dwfileoffsethigh: Int, nnumberofbytestounlocklow: Int, nnumberofbytestounlockhigh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemUnlockFileEx(hfile: Long, dwreserved: Int, nnumberofbytestounlocklow: Int, nnumberofbytestounlockhigh: Int, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemValidateLog(pszlogfilename: Long, psalogfile: Long, pinfobuffer: Long, pcbbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemVerFindFileA(uflags: Int, szfilename: Long, szwindir: Long, szappdir: Long, szcurdir: Long, pucurdirlen: Long, szdestdir: Long, pudestdirlen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemVerFindFileW(uflags: Int, szfilename: Long, szwindir: Long, szappdir: Long, szcurdir: Long, pucurdirlen: Long, szdestdir: Long, pudestdirlen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemVerInstallFileA(uflags: Int, szsrcfilename: Long, szdestfilename: Long, szsrcdir: Long, szdestdir: Long, szcurdir: Long, sztmpfile: Long, putmpfilelen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemVerInstallFileW(uflags: Int, szsrcfilename: Long, szdestfilename: Long, szsrcdir: Long, szdestdir: Long, szcurdir: Long, sztmpfile: Long, putmpfilelen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemVerLanguageNameA(wlang: Int, szlang: Long, cchlang: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemVerLanguageNameW(wlang: Int, szlang: Long, cchlang: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemVerQueryValueA(pblock: Long, lpsubblock: Long, lplpbuffer: Long, pulen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemVerQueryValueW(pblock: Long, lpsubblock: Long, lplpbuffer: Long, pulen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemWofEnumEntries(volumename: Long, provider: Int, enumproc: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemWofFileEnumFiles(volumename: Long, algorithm: Int, enumproc: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemWofGetDriverVersion(fileorvolumehandle: Long, provider: Int, wofversion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemWofIsExternalFile(filepath: Long, isexternalfile: Long, provider: Long, externalfileinfo: Long, bufferlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemWofSetFileDataLocation(filehandle: Long, provider: Int, externalfileinfo: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemWofShouldCompressBinaries(volume: Long, algorithm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemWofWimAddEntry(volumename: Long, wimpath: Long, wimtype: Int, wimindex: Int, datasourceid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemWofWimEnumFiles(volumename: Long, datasourceid: Long, enumproc: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemWofWimRemoveEntry(volumename: Long, datasourceid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemWofWimSuspendEntry(volumename: Long, datasourceid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemWofWimUpdateEntry(volumename: Long, datasourceid: Long, newwimpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemWow64DisableWow64FsRedirection(oldvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemWow64EnableWow64FsRedirection(wow64fsenableredirection: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemWow64RevertWow64FsRedirection(olvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemWriteEncryptedFileRaw(pfimportcallback: Long, pvcallbackcontext: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemWriteFile(hfile: Long, lpbuffer: Long, nnumberofbytestowrite: Int, lpnumberofbyteswritten: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemWriteFileEx(hfile: Long, lpbuffer: Long, nnumberofbytestowrite: Int, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemWriteFileGather(hfile: Long, asegmentarray: Long, nnumberofbytestowrite: Int, lpreserved: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemWriteLogRestartArea(pvmarshal: Long, pvrestartbuffer: Long, cbrestartbuffer: Int, plsnbase: Long, fflags: Int, pcbwritten: Long, plsnnext: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilesystemWriteTapemark(hdevice: Long, dwtapemarktype: Int, dwtapemarkcount: Int, bimmediate: Int): Int
}

public actual fun addLogContainer(hlog: Handle, pcbcontainer: ConstPtr<ULong>, pwszcontainerpath: Pcwstr, preserved: MutPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemAddLogContainer(hlog.rawAddress, pcbcontainer.rawAddress, pwszcontainerpath.rawAddress, preserved.rawAddress)

public actual fun addLogContainerSet(hlog: Handle, ccontainer: UShort, pcbcontainer: ConstPtr<ULong>, rgwszcontainerpath: ConstPtr<Pcwstr>, preserved: MutPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemAddLogContainerSet(hlog.rawAddress, ccontainer.toShort(), pcbcontainer.rawAddress, rgwszcontainerpath.rawAddress, preserved.rawAddress)

public actual fun addUsersToEncryptedFile(lpfilename: Pcwstr, pencryptioncertificates: ConstPtr<EncryptionCertificateList>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemAddUsersToEncryptedFile(lpfilename.rawAddress, pencryptioncertificates.rawAddress).toUInt()

public actual fun advanceLogBase(pvmarshal: MutPtr<CVoid>, plsnbase: MutPtr<ClsLsn>, fflags: UInt, poverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemAdvanceLogBase(pvmarshal.rawAddress, plsnbase.rawAddress, fflags.toInt(), poverlapped.rawAddress)

public actual fun alignReservedLog(pvmarshal: MutPtr<CVoid>, creservedrecords: UInt, rgcbreservation: MutPtr<Long>, pcbalignreservation: MutPtr<Long>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemAlignReservedLog(pvmarshal.rawAddress, creservedrecords.toInt(), rgcbreservation.rawAddress, pcbalignreservation.rawAddress)

public actual fun allocReservedLog(pvmarshal: MutPtr<CVoid>, creservedrecords: UInt, pcbadjustment: MutPtr<Long>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemAllocReservedLog(pvmarshal.rawAddress, creservedrecords.toInt(), pcbadjustment.rawAddress)

public actual fun areFileApisANSI(): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemAreFileApisANSI()

public actual fun areShortNamesEnabled(handle: Handle, enabled: MutPtr<Bool>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemAreShortNamesEnabled(handle.rawAddress, enabled.rawAddress)

public actual fun backupRead(hfile: Handle, lpbuffer: MutPtr<UByte>, nnumberofbytestoread: UInt, lpnumberofbytesread: MutPtr<UInt>, babort: Bool, bprocesssecurity: Bool, lpcontext: MutPtr<MutPtr<CVoid>>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemBackupRead(hfile.rawAddress, lpbuffer.rawAddress, nnumberofbytestoread.toInt(), lpnumberofbytesread.rawAddress, babort, bprocesssecurity, lpcontext.rawAddress)

public actual fun backupSeek(hfile: Handle, dwlowbytestoseek: UInt, dwhighbytestoseek: UInt, lpdwlowbyteseeked: MutPtr<UInt>, lpdwhighbyteseeked: MutPtr<UInt>, lpcontext: MutPtr<MutPtr<CVoid>>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemBackupSeek(hfile.rawAddress, dwlowbytestoseek.toInt(), dwhighbytestoseek.toInt(), lpdwlowbyteseeked.rawAddress, lpdwhighbyteseeked.rawAddress, lpcontext.rawAddress)

public actual fun backupWrite(hfile: Handle, lpbuffer: ConstPtr<UByte>, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: MutPtr<UInt>, babort: Bool, bprocesssecurity: Bool, lpcontext: MutPtr<MutPtr<CVoid>>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemBackupWrite(hfile.rawAddress, lpbuffer.rawAddress, nnumberofbytestowrite.toInt(), lpnumberofbyteswritten.rawAddress, babort, bprocesssecurity, lpcontext.rawAddress)

public actual fun buildIoRingCancelRequest(ioring: Hioring, file: IoringHandleRef, optocancel: ULong, userdata: ULong): Hresult =
    0

public actual fun buildIoRingFlushFile(ioring: Hioring, fileref: IoringHandleRef, flushmode: FileFlushMode, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    0

public actual fun buildIoRingReadFile(ioring: Hioring, fileref: IoringHandleRef, dataref: IoringBufferRef, numberofbytestoread: UInt, fileoffset: ULong, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    0

public actual fun buildIoRingRegisterBuffers(ioring: Hioring, count: UInt, buffers: ConstPtr<IoringBufferInfo>, userdata: ULong): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemBuildIoRingRegisterBuffers(ioring.rawAddress, count.toInt(), buffers.rawAddress, userdata.toLong())

public actual fun buildIoRingRegisterFileHandles(ioring: Hioring, count: UInt, handles: ConstPtr<Handle>, userdata: ULong): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemBuildIoRingRegisterFileHandles(ioring.rawAddress, count.toInt(), handles.rawAddress, userdata.toLong())

public actual fun buildIoRingWriteFile(ioring: Hioring, fileref: IoringHandleRef, bufferref: IoringBufferRef, numberofbytestowrite: UInt, fileoffset: ULong, writeflags: FileWriteFlags, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    0

public actual fun checkNameLegalDOS8Dot3A(lpname: Pcstr, lpoemname: Pstr, oemnamesize: UInt, pbnamecontainsspaces: MutPtr<Bool>, pbnamelegal: MutPtr<Bool>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCheckNameLegalDOS8Dot3A(lpname.rawAddress, lpoemname.rawAddress, oemnamesize.toInt(), pbnamecontainsspaces.rawAddress, pbnamelegal.rawAddress)

public actual fun checkNameLegalDOS8Dot3W(lpname: Pcwstr, lpoemname: Pstr, oemnamesize: UInt, pbnamecontainsspaces: MutPtr<Bool>, pbnamelegal: MutPtr<Bool>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCheckNameLegalDOS8Dot3W(lpname.rawAddress, lpoemname.rawAddress, oemnamesize.toInt(), pbnamecontainsspaces.rawAddress, pbnamelegal.rawAddress)

public actual fun closeAndResetLogFile(hlog: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCloseAndResetLogFile(hlog.rawAddress)

public actual fun closeEncryptedFileRaw(pvcontext: ConstPtr<CVoid>) {
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCloseEncryptedFileRaw(pvcontext.rawAddress)
}

public actual fun closeIoRing(ioring: Hioring): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCloseIoRing(ioring.rawAddress)

public actual fun commitComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCommitComplete(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun commitEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCommitEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun commitTransaction(transactionhandle: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCommitTransaction(transactionhandle.rawAddress)

public actual fun commitTransactionAsync(transactionhandle: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCommitTransactionAsync(transactionhandle.rawAddress)

public actual fun compareFileTime(lpfiletime1: ConstPtr<Filetime>, lpfiletime2: ConstPtr<Filetime>): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCompareFileTime(lpfiletime1.rawAddress, lpfiletime2.rawAddress)

public actual fun copyFile2(pwszexistingfilename: Pcwstr, pwsznewfilename: Pcwstr, pextendedparameters: ConstPtr<Copyfile2ExtendedParameters>): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCopyFile2(pwszexistingfilename.rawAddress, pwsznewfilename.rawAddress, pextendedparameters.rawAddress)

public actual fun copyFileA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, bfailifexists: Bool): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCopyFileA(lpexistingfilename.rawAddress, lpnewfilename.rawAddress, bfailifexists)

public actual fun copyFileExA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, pbcancel: MutPtr<Bool>, dwcopyflags: CopyfileFlags): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCopyFileExA(lpexistingfilename.rawAddress, lpnewfilename.rawAddress, 0L, lpdata.rawAddress, pbcancel.rawAddress, dwcopyflags.toInt())

public actual fun copyFileExW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, pbcancel: MutPtr<Bool>, dwcopyflags: CopyfileFlags): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCopyFileExW(lpexistingfilename.rawAddress, lpnewfilename.rawAddress, 0L, lpdata.rawAddress, pbcancel.rawAddress, dwcopyflags.toInt())

public actual fun copyFileFromAppW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, bfailifexists: Bool): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCopyFileFromAppW(lpexistingfilename.rawAddress, lpnewfilename.rawAddress, bfailifexists)

public actual fun copyFileTransactedA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, pbcancel: ConstPtr<Bool>, dwcopyflags: UInt, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCopyFileTransactedA(lpexistingfilename.rawAddress, lpnewfilename.rawAddress, 0L, lpdata.rawAddress, pbcancel.rawAddress, dwcopyflags.toInt(), htransaction.rawAddress)

public actual fun copyFileTransactedW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, pbcancel: ConstPtr<Bool>, dwcopyflags: UInt, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCopyFileTransactedW(lpexistingfilename.rawAddress, lpnewfilename.rawAddress, 0L, lpdata.rawAddress, pbcancel.rawAddress, dwcopyflags.toInt(), htransaction.rawAddress)

public actual fun copyFileW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, bfailifexists: Bool): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCopyFileW(lpexistingfilename.rawAddress, lpnewfilename.rawAddress, bfailifexists)

public actual fun copyLZFile(hfsource: Int, hfdest: Int): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCopyLZFile(hfsource, hfdest)

public actual fun createDirectoryA(lppathname: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateDirectoryA(lppathname.rawAddress, lpsecurityattributes.rawAddress)

public actual fun createDirectoryExA(lptemplatedirectory: Pcstr, lpnewdirectory: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateDirectoryExA(lptemplatedirectory.rawAddress, lpnewdirectory.rawAddress, lpsecurityattributes.rawAddress)

public actual fun createDirectoryExW(lptemplatedirectory: Pcwstr, lpnewdirectory: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateDirectoryExW(lptemplatedirectory.rawAddress, lpnewdirectory.rawAddress, lpsecurityattributes.rawAddress)

public actual fun createDirectoryFromAppW(lppathname: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateDirectoryFromAppW(lppathname.rawAddress, lpsecurityattributes.rawAddress)

public actual fun createDirectoryTransactedA(lptemplatedirectory: Pcstr, lpnewdirectory: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateDirectoryTransactedA(lptemplatedirectory.rawAddress, lpnewdirectory.rawAddress, lpsecurityattributes.rawAddress, htransaction.rawAddress)

public actual fun createDirectoryTransactedW(lptemplatedirectory: Pcwstr, lpnewdirectory: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateDirectoryTransactedW(lptemplatedirectory.rawAddress, lpnewdirectory.rawAddress, lpsecurityattributes.rawAddress, htransaction.rawAddress)

public actual fun createDirectoryW(lppathname: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateDirectoryW(lppathname.rawAddress, lpsecurityattributes.rawAddress)

public actual fun createEnlistment(lpenlistmentattributes: MutPtr<SecurityAttributes>, resourcemanagerhandle: Handle, transactionhandle: Handle, notificationmask: UInt, createoptions: UInt, enlistmentkey: MutPtr<CVoid>): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateEnlistment(lpenlistmentattributes.rawAddress, resourcemanagerhandle.rawAddress, transactionhandle.rawAddress, notificationmask.toInt(), createoptions.toInt(), enlistmentkey.rawAddress))

public actual fun createFile2(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, dwcreationdisposition: FileCreationDisposition, pcreateexparams: ConstPtr<Createfile2ExtendedParameters>): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateFile2(lpfilename.rawAddress, dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationdisposition.toInt(), pcreateexparams.rawAddress))

public actual fun createFile2FromAppW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationdisposition: UInt, pcreateexparams: ConstPtr<Createfile2ExtendedParameters>): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateFile2FromAppW(lpfilename.rawAddress, dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationdisposition.toInt(), pcreateexparams.rawAddress))

public actual fun createFileA(lpfilename: Pcstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateFileA(lpfilename.rawAddress, dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress, dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.rawAddress))

public actual fun createFileFromAppW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateFileFromAppW(lpfilename.rawAddress, dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress, dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.rawAddress))

public actual fun createFileTransactedA(lpfilename: Pcstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle, htransaction: Handle, pusminiversion: ConstPtr<TxfsMiniversion>, lpextendedparameter: ConstPtr<CVoid>): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateFileTransactedA(lpfilename.rawAddress, dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress, dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.rawAddress, htransaction.rawAddress, pusminiversion.rawAddress, lpextendedparameter.rawAddress))

public actual fun createFileTransactedW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle, htransaction: Handle, pusminiversion: ConstPtr<TxfsMiniversion>, lpextendedparameter: ConstPtr<CVoid>): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateFileTransactedW(lpfilename.rawAddress, dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress, dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.rawAddress, htransaction.rawAddress, pusminiversion.rawAddress, lpextendedparameter.rawAddress))

public actual fun createFileW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateFileW(lpfilename.rawAddress, dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress, dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile.rawAddress))

public actual fun createHardLinkA(lpfilename: Pcstr, lpexistingfilename: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateHardLinkA(lpfilename.rawAddress, lpexistingfilename.rawAddress, lpsecurityattributes.rawAddress)

public actual fun createHardLinkTransactedA(lpfilename: Pcstr, lpexistingfilename: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateHardLinkTransactedA(lpfilename.rawAddress, lpexistingfilename.rawAddress, lpsecurityattributes.rawAddress, htransaction.rawAddress)

public actual fun createHardLinkTransactedW(lpfilename: Pcwstr, lpexistingfilename: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateHardLinkTransactedW(lpfilename.rawAddress, lpexistingfilename.rawAddress, lpsecurityattributes.rawAddress, htransaction.rawAddress)

public actual fun createHardLinkW(lpfilename: Pcwstr, lpexistingfilename: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateHardLinkW(lpfilename.rawAddress, lpexistingfilename.rawAddress, lpsecurityattributes.rawAddress)

public actual fun createIoRing(ioringversion: IoringVersion, flags: IoringCreateFlags, submissionqueuesize: UInt, completionqueuesize: UInt, h: MutPtr<Hioring>): Hresult =
    0

public actual fun createLogContainerScanContext(hlog: Handle, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: MutPtr<ClsScanContext>, poverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateLogContainerScanContext(hlog.rawAddress, cfromcontainer.toInt(), ccontainers.toInt(), escanmode.toByte(), pcxscan.rawAddress, poverlapped.rawAddress)

public actual fun createLogFile(pszlogfilename: Pcwstr, fdesiredaccess: UInt, dwsharemode: FileShareMode, psalogfile: MutPtr<SecurityAttributes>, fcreatedisposition: FileCreationDisposition, fflagsandattributes: FileFlagsAndAttributes): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateLogFile(pszlogfilename.rawAddress, fdesiredaccess.toInt(), dwsharemode.toInt(), psalogfile.rawAddress, fcreatedisposition.toInt(), fflagsandattributes.toInt()))

public actual fun createLogMarshallingArea(hlog: Handle, pfnallocbuffer: ClfsBlockAllocation, pfnfreebuffer: ClfsBlockDeallocation, pvblockalloccontext: MutPtr<CVoid>, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshal: MutPtr<MutPtr<CVoid>>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateLogMarshallingArea(hlog.rawAddress, 0L, 0L, pvblockalloccontext.rawAddress, cbmarshallingbuffer.toInt(), cmaxwritebuffers.toInt(), cmaxreadbuffers.toInt(), ppvmarshal.rawAddress)

public actual fun createResourceManager(lpresourcemanagerattributes: MutPtr<SecurityAttributes>, resourcemanagerid: MutPtr<Guid>, createoptions: UInt, tmhandle: Handle, description: Pcwstr): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateResourceManager(lpresourcemanagerattributes.rawAddress, resourcemanagerid.rawAddress, createoptions.toInt(), tmhandle.rawAddress, description.rawAddress))

public actual fun createSymbolicLinkA(lpsymlinkfilename: Pcstr, lptargetfilename: Pcstr, dwflags: SymbolicLinkFlags): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateSymbolicLinkA(lpsymlinkfilename.rawAddress, lptargetfilename.rawAddress, dwflags.toInt())

public actual fun createSymbolicLinkTransactedA(lpsymlinkfilename: Pcstr, lptargetfilename: Pcstr, dwflags: SymbolicLinkFlags, htransaction: Handle): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateSymbolicLinkTransactedA(lpsymlinkfilename.rawAddress, lptargetfilename.rawAddress, dwflags.toInt(), htransaction.rawAddress)

public actual fun createSymbolicLinkTransactedW(lpsymlinkfilename: Pcwstr, lptargetfilename: Pcwstr, dwflags: SymbolicLinkFlags, htransaction: Handle): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateSymbolicLinkTransactedW(lpsymlinkfilename.rawAddress, lptargetfilename.rawAddress, dwflags.toInt(), htransaction.rawAddress)

public actual fun createSymbolicLinkW(lpsymlinkfilename: Pcwstr, lptargetfilename: Pcwstr, dwflags: SymbolicLinkFlags): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateSymbolicLinkW(lpsymlinkfilename.rawAddress, lptargetfilename.rawAddress, dwflags.toInt())

public actual fun createTapePartition(hdevice: Handle, dwpartitionmethod: CreateTapePartitionMethod, dwcount: UInt, dwsize: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateTapePartition(hdevice.rawAddress, dwpartitionmethod.toInt(), dwcount.toInt(), dwsize.toInt()).toUInt()

public actual fun createTransaction(lptransactionattributes: MutPtr<SecurityAttributes>, uow: MutPtr<Guid>, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: Pcwstr): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateTransaction(lptransactionattributes.rawAddress, uow.rawAddress, createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), timeout.toInt(), description.rawAddress))

public actual fun createTransactionManager(lptransactionattributes: MutPtr<SecurityAttributes>, logfilename: Pcwstr, createoptions: UInt, commitstrength: UInt): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemCreateTransactionManager(lptransactionattributes.rawAddress, logfilename.rawAddress, createoptions.toInt(), commitstrength.toInt()))

public actual fun decryptFileA(lpfilename: Pcstr, dwreserved: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemDecryptFileA(lpfilename.rawAddress, dwreserved.toInt())

public actual fun decryptFileW(lpfilename: Pcwstr, dwreserved: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemDecryptFileW(lpfilename.rawAddress, dwreserved.toInt())

public actual fun defineDosDeviceA(dwflags: DefineDosDeviceFlags, lpdevicename: Pcstr, lptargetpath: Pcstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemDefineDosDeviceA(dwflags.toInt(), lpdevicename.rawAddress, lptargetpath.rawAddress)

public actual fun defineDosDeviceW(dwflags: DefineDosDeviceFlags, lpdevicename: Pcwstr, lptargetpath: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemDefineDosDeviceW(dwflags.toInt(), lpdevicename.rawAddress, lptargetpath.rawAddress)

public actual fun deleteFileA(lpfilename: Pcstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemDeleteFileA(lpfilename.rawAddress)

public actual fun deleteFileFromAppW(lpfilename: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemDeleteFileFromAppW(lpfilename.rawAddress)

public actual fun deleteFileTransactedA(lpfilename: Pcstr, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemDeleteFileTransactedA(lpfilename.rawAddress, htransaction.rawAddress)

public actual fun deleteFileTransactedW(lpfilename: Pcwstr, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemDeleteFileTransactedW(lpfilename.rawAddress, htransaction.rawAddress)

public actual fun deleteFileW(lpfilename: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemDeleteFileW(lpfilename.rawAddress)

public actual fun deleteLogByHandle(hlog: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemDeleteLogByHandle(hlog.rawAddress)

public actual fun deleteLogFile(pszlogfilename: Pcwstr, pvreserved: MutPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemDeleteLogFile(pszlogfilename.rawAddress, pvreserved.rawAddress)

public actual fun deleteLogMarshallingArea(pvmarshal: MutPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemDeleteLogMarshallingArea(pvmarshal.rawAddress)

public actual fun deleteVolumeMountPointA(lpszvolumemountpoint: Pcstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemDeleteVolumeMountPointA(lpszvolumemountpoint.rawAddress)

public actual fun deleteVolumeMountPointW(lpszvolumemountpoint: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemDeleteVolumeMountPointW(lpszvolumemountpoint.rawAddress)

public actual fun deregisterManageableLogClient(hlog: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemDeregisterManageableLogClient(hlog.rawAddress)

public actual fun duplicateEncryptionInfoFile(srcfilename: Pcwstr, dstfilename: Pcwstr, dwcreationdistribution: UInt, dwattributes: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemDuplicateEncryptionInfoFile(srcfilename.rawAddress, dstfilename.rawAddress, dwcreationdistribution.toInt(), dwattributes.toInt(), lpsecurityattributes.rawAddress).toUInt()

public actual fun encryptFileA(lpfilename: Pcstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemEncryptFileA(lpfilename.rawAddress)

public actual fun encryptFileW(lpfilename: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemEncryptFileW(lpfilename.rawAddress)

public actual fun encryptionDisable(dirpath: Pcwstr, disable: Bool): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemEncryptionDisable(dirpath.rawAddress, disable)

public actual fun eraseTape(hdevice: Handle, dwerasetype: EraseTapeType, bimmediate: Bool): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemEraseTape(hdevice.rawAddress, dwerasetype.toInt(), bimmediate).toUInt()

public actual fun fileEncryptionStatusA(lpfilename: Pcstr, lpstatus: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFileEncryptionStatusA(lpfilename.rawAddress, lpstatus.rawAddress)

public actual fun fileEncryptionStatusW(lpfilename: Pcwstr, lpstatus: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFileEncryptionStatusW(lpfilename.rawAddress, lpstatus.rawAddress)

public actual fun fileTimeToLocalFileTime(lpfiletime: ConstPtr<Filetime>, lplocalfiletime: MutPtr<Filetime>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFileTimeToLocalFileTime(lpfiletime.rawAddress, lplocalfiletime.rawAddress)

public actual fun findClose(hfindfile: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindClose(hfindfile.rawAddress)

public actual fun findCloseChangeNotification(hchangehandle: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindCloseChangeNotification(hchangehandle.rawAddress)

public actual fun findFirstChangeNotificationA(lppathname: Pcstr, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindFirstChangeNotificationA(lppathname.rawAddress, bwatchsubtree, dwnotifyfilter.toInt()))

public actual fun findFirstChangeNotificationW(lppathname: Pcwstr, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindFirstChangeNotificationW(lppathname.rawAddress, bwatchsubtree, dwnotifyfilter.toInt()))

public actual fun findFirstFileA(lpfilename: Pcstr, lpfindfiledata: MutPtr<Win32FindDataa>): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindFirstFileA(lpfilename.rawAddress, lpfindfiledata.rawAddress))

public actual fun findFirstFileExA(lpfilename: Pcstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr<CVoid>, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr<CVoid>, dwadditionalflags: FindFirstExFlags): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindFirstFileExA(lpfilename.rawAddress, finfolevelid, lpfindfiledata.rawAddress, fsearchop, lpsearchfilter.rawAddress, dwadditionalflags.toInt()))

public actual fun findFirstFileExFromAppW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr<CVoid>, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr<CVoid>, dwadditionalflags: UInt): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindFirstFileExFromAppW(lpfilename.rawAddress, finfolevelid, lpfindfiledata.rawAddress, fsearchop, lpsearchfilter.rawAddress, dwadditionalflags.toInt()))

public actual fun findFirstFileExW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr<CVoid>, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr<CVoid>, dwadditionalflags: FindFirstExFlags): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindFirstFileExW(lpfilename.rawAddress, finfolevelid, lpfindfiledata.rawAddress, fsearchop, lpsearchfilter.rawAddress, dwadditionalflags.toInt()))

public actual fun findFirstFileNameTransactedW(lpfilename: Pcwstr, dwflags: UInt, stringlength: MutPtr<UInt>, linkname: Pwstr, htransaction: Handle): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindFirstFileNameTransactedW(lpfilename.rawAddress, dwflags.toInt(), stringlength.rawAddress, linkname.rawAddress, htransaction.rawAddress))

public actual fun findFirstFileNameW(lpfilename: Pcwstr, dwflags: UInt, stringlength: MutPtr<UInt>, linkname: Pwstr): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindFirstFileNameW(lpfilename.rawAddress, dwflags.toInt(), stringlength.rawAddress, linkname.rawAddress))

public actual fun findFirstFileTransactedA(lpfilename: Pcstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr<CVoid>, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr<CVoid>, dwadditionalflags: UInt, htransaction: Handle): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindFirstFileTransactedA(lpfilename.rawAddress, finfolevelid, lpfindfiledata.rawAddress, fsearchop, lpsearchfilter.rawAddress, dwadditionalflags.toInt(), htransaction.rawAddress))

public actual fun findFirstFileTransactedW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr<CVoid>, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr<CVoid>, dwadditionalflags: UInt, htransaction: Handle): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindFirstFileTransactedW(lpfilename.rawAddress, finfolevelid, lpfindfiledata.rawAddress, fsearchop, lpsearchfilter.rawAddress, dwadditionalflags.toInt(), htransaction.rawAddress))

public actual fun findFirstFileW(lpfilename: Pcwstr, lpfindfiledata: MutPtr<Win32FindDataw>): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindFirstFileW(lpfilename.rawAddress, lpfindfiledata.rawAddress))

public actual fun findFirstStreamTransactedW(lpfilename: Pcwstr, infolevel: StreamInfoLevels, lpfindstreamdata: MutPtr<CVoid>, dwflags: UInt, htransaction: Handle): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindFirstStreamTransactedW(lpfilename.rawAddress, infolevel, lpfindstreamdata.rawAddress, dwflags.toInt(), htransaction.rawAddress))

public actual fun findFirstStreamW(lpfilename: Pcwstr, infolevel: StreamInfoLevels, lpfindstreamdata: MutPtr<CVoid>, dwflags: UInt): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindFirstStreamW(lpfilename.rawAddress, infolevel, lpfindstreamdata.rawAddress, dwflags.toInt()))

public actual fun findFirstVolumeA(lpszvolumename: Pstr, cchbufferlength: UInt): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindFirstVolumeA(lpszvolumename.rawAddress, cchbufferlength.toInt()))

public actual fun findFirstVolumeMountPointA(lpszrootpathname: Pcstr, lpszvolumemountpoint: Pstr, cchbufferlength: UInt): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindFirstVolumeMountPointA(lpszrootpathname.rawAddress, lpszvolumemountpoint.rawAddress, cchbufferlength.toInt()))

public actual fun findFirstVolumeMountPointW(lpszrootpathname: Pcwstr, lpszvolumemountpoint: Pwstr, cchbufferlength: UInt): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindFirstVolumeMountPointW(lpszrootpathname.rawAddress, lpszvolumemountpoint.rawAddress, cchbufferlength.toInt()))

public actual fun findFirstVolumeW(lpszvolumename: Pwstr, cchbufferlength: UInt): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindFirstVolumeW(lpszvolumename.rawAddress, cchbufferlength.toInt()))

public actual fun findNextChangeNotification(hchangehandle: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindNextChangeNotification(hchangehandle.rawAddress)

public actual fun findNextFileA(hfindfile: Handle, lpfindfiledata: MutPtr<Win32FindDataa>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindNextFileA(hfindfile.rawAddress, lpfindfiledata.rawAddress)

public actual fun findNextFileNameW(hfindstream: Handle, stringlength: MutPtr<UInt>, linkname: Pwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindNextFileNameW(hfindstream.rawAddress, stringlength.rawAddress, linkname.rawAddress)

public actual fun findNextFileW(hfindfile: Handle, lpfindfiledata: MutPtr<Win32FindDataw>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindNextFileW(hfindfile.rawAddress, lpfindfiledata.rawAddress)

public actual fun findNextStreamW(hfindstream: Handle, lpfindstreamdata: MutPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindNextStreamW(hfindstream.rawAddress, lpfindstreamdata.rawAddress)

public actual fun findNextVolumeA(hfindvolume: Handle, lpszvolumename: Pstr, cchbufferlength: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindNextVolumeA(hfindvolume.rawAddress, lpszvolumename.rawAddress, cchbufferlength.toInt())

public actual fun findNextVolumeMountPointA(hfindvolumemountpoint: Handle, lpszvolumemountpoint: Pstr, cchbufferlength: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindNextVolumeMountPointA(hfindvolumemountpoint.rawAddress, lpszvolumemountpoint.rawAddress, cchbufferlength.toInt())

public actual fun findNextVolumeMountPointW(hfindvolumemountpoint: Handle, lpszvolumemountpoint: Pwstr, cchbufferlength: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindNextVolumeMountPointW(hfindvolumemountpoint.rawAddress, lpszvolumemountpoint.rawAddress, cchbufferlength.toInt())

public actual fun findNextVolumeW(hfindvolume: Handle, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindNextVolumeW(hfindvolume.rawAddress, lpszvolumename.rawAddress, cchbufferlength.toInt())

public actual fun findVolumeClose(hfindvolume: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindVolumeClose(hfindvolume.rawAddress)

public actual fun findVolumeMountPointClose(hfindvolumemountpoint: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFindVolumeMountPointClose(hfindvolumemountpoint.rawAddress)

public actual fun flushFileBuffers(hfile: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFlushFileBuffers(hfile.rawAddress)

public actual fun flushLogBuffers(pvmarshal: ConstPtr<CVoid>, poverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFlushLogBuffers(pvmarshal.rawAddress, poverlapped.rawAddress)

public actual fun flushLogToLsn(pvmarshalcontext: MutPtr<CVoid>, plsnflush: MutPtr<ClsLsn>, plsnlastflushed: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFlushLogToLsn(pvmarshalcontext.rawAddress, plsnflush.rawAddress, plsnlastflushed.rawAddress, poverlapped.rawAddress)

public actual fun freeEncryptedFileMetadata(pbmetadata: ConstPtr<UByte>) {
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFreeEncryptedFileMetadata(pbmetadata.rawAddress)
}

public actual fun freeEncryptionCertificateHashList(pusers: ConstPtr<EncryptionCertificateHashList>) {
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFreeEncryptionCertificateHashList(pusers.rawAddress)
}

public actual fun freeReservedLog(pvmarshal: MutPtr<CVoid>, creservedrecords: UInt, pcbadjustment: MutPtr<Long>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemFreeReservedLog(pvmarshal.rawAddress, creservedrecords.toInt(), pcbadjustment.rawAddress)

public actual fun getBinaryTypeA(lpapplicationname: Pcstr, lpbinarytype: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetBinaryTypeA(lpapplicationname.rawAddress, lpbinarytype.rawAddress)

public actual fun getBinaryTypeW(lpapplicationname: Pcwstr, lpbinarytype: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetBinaryTypeW(lpapplicationname.rawAddress, lpbinarytype.rawAddress)

public actual fun getCompressedFileSizeA(lpfilename: Pcstr, lpfilesizehigh: MutPtr<UInt>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetCompressedFileSizeA(lpfilename.rawAddress, lpfilesizehigh.rawAddress).toUInt()

public actual fun getCompressedFileSizeTransactedA(lpfilename: Pcstr, lpfilesizehigh: MutPtr<UInt>, htransaction: Handle): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetCompressedFileSizeTransactedA(lpfilename.rawAddress, lpfilesizehigh.rawAddress, htransaction.rawAddress).toUInt()

public actual fun getCompressedFileSizeTransactedW(lpfilename: Pcwstr, lpfilesizehigh: MutPtr<UInt>, htransaction: Handle): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetCompressedFileSizeTransactedW(lpfilename.rawAddress, lpfilesizehigh.rawAddress, htransaction.rawAddress).toUInt()

public actual fun getCompressedFileSizeW(lpfilename: Pcwstr, lpfilesizehigh: MutPtr<UInt>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetCompressedFileSizeW(lpfilename.rawAddress, lpfilesizehigh.rawAddress).toUInt()

public actual fun getCurrentClockTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetCurrentClockTransactionManager(transactionmanagerhandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun getDiskFreeSpaceA(lprootpathname: Pcstr, lpsectorspercluster: MutPtr<UInt>, lpbytespersector: MutPtr<UInt>, lpnumberoffreeclusters: MutPtr<UInt>, lptotalnumberofclusters: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceA(lprootpathname.rawAddress, lpsectorspercluster.rawAddress, lpbytespersector.rawAddress, lpnumberoffreeclusters.rawAddress, lptotalnumberofclusters.rawAddress)

public actual fun getDiskFreeSpaceExA(lpdirectoryname: Pcstr, lpfreebytesavailabletocaller: MutPtr<ULong>, lptotalnumberofbytes: MutPtr<ULong>, lptotalnumberoffreebytes: MutPtr<ULong>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceExA(lpdirectoryname.rawAddress, lpfreebytesavailabletocaller.rawAddress, lptotalnumberofbytes.rawAddress, lptotalnumberoffreebytes.rawAddress)

public actual fun getDiskFreeSpaceExW(lpdirectoryname: Pcwstr, lpfreebytesavailabletocaller: MutPtr<ULong>, lptotalnumberofbytes: MutPtr<ULong>, lptotalnumberoffreebytes: MutPtr<ULong>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceExW(lpdirectoryname.rawAddress, lpfreebytesavailabletocaller.rawAddress, lptotalnumberofbytes.rawAddress, lptotalnumberoffreebytes.rawAddress)

public actual fun getDiskFreeSpaceW(lprootpathname: Pcwstr, lpsectorspercluster: MutPtr<UInt>, lpbytespersector: MutPtr<UInt>, lpnumberoffreeclusters: MutPtr<UInt>, lptotalnumberofclusters: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetDiskFreeSpaceW(lprootpathname.rawAddress, lpsectorspercluster.rawAddress, lpbytespersector.rawAddress, lpnumberoffreeclusters.rawAddress, lptotalnumberofclusters.rawAddress)

public actual fun getDiskSpaceInformationA(rootpath: Pcstr, diskspaceinfo: MutPtr<DiskSpaceInformation>): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetDiskSpaceInformationA(rootpath.rawAddress, diskspaceinfo.rawAddress)

public actual fun getDiskSpaceInformationW(rootpath: Pcwstr, diskspaceinfo: MutPtr<DiskSpaceInformation>): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetDiskSpaceInformationW(rootpath.rawAddress, diskspaceinfo.rawAddress)

public actual fun getDriveTypeA(lprootpathname: Pcstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetDriveTypeA(lprootpathname.rawAddress).toUInt()

public actual fun getDriveTypeW(lprootpathname: Pcwstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetDriveTypeW(lprootpathname.rawAddress).toUInt()

public actual fun getEncryptedFileMetadata(lpfilename: Pcwstr, pcbmetadata: MutPtr<UInt>, ppbmetadata: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetEncryptedFileMetadata(lpfilename.rawAddress, pcbmetadata.rawAddress, ppbmetadata.rawAddress).toUInt()

public actual fun getEnlistmentId(enlistmenthandle: Handle, enlistmentid: MutPtr<Guid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetEnlistmentId(enlistmenthandle.rawAddress, enlistmentid.rawAddress)

public actual fun getEnlistmentRecoveryInformation(enlistmenthandle: Handle, buffersize: UInt, buffer: MutPtr<CVoid>, bufferused: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetEnlistmentRecoveryInformation(enlistmenthandle.rawAddress, buffersize.toInt(), buffer.rawAddress, bufferused.rawAddress)

public actual fun getExpandedNameA(lpszsource: Pcstr, lpszbuffer: Pstr): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetExpandedNameA(lpszsource.rawAddress, lpszbuffer.rawAddress)

public actual fun getExpandedNameW(lpszsource: Pcwstr, lpszbuffer: Pwstr): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetExpandedNameW(lpszsource.rawAddress, lpszbuffer.rawAddress)

public actual fun getFileAttributesA(lpfilename: Pcstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileAttributesA(lpfilename.rawAddress).toUInt()

public actual fun getFileAttributesExA(lpfilename: Pcstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileAttributesExA(lpfilename.rawAddress, finfolevelid, lpfileinformation.rawAddress)

public actual fun getFileAttributesExFromAppW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileAttributesExFromAppW(lpfilename.rawAddress, finfolevelid, lpfileinformation.rawAddress)

public actual fun getFileAttributesExW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileAttributesExW(lpfilename.rawAddress, finfolevelid, lpfileinformation.rawAddress)

public actual fun getFileAttributesTransactedA(lpfilename: Pcstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr<CVoid>, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileAttributesTransactedA(lpfilename.rawAddress, finfolevelid, lpfileinformation.rawAddress, htransaction.rawAddress)

public actual fun getFileAttributesTransactedW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr<CVoid>, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileAttributesTransactedW(lpfilename.rawAddress, finfolevelid, lpfileinformation.rawAddress, htransaction.rawAddress)

public actual fun getFileAttributesW(lpfilename: Pcwstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileAttributesW(lpfilename.rawAddress).toUInt()

public actual fun getFileBandwidthReservation(hfile: Handle, lpperiodmilliseconds: MutPtr<UInt>, lpbytesperperiod: MutPtr<UInt>, pdiscardable: MutPtr<Bool>, lptransfersize: MutPtr<UInt>, lpnumoutstandingrequests: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileBandwidthReservation(hfile.rawAddress, lpperiodmilliseconds.rawAddress, lpbytesperperiod.rawAddress, pdiscardable.rawAddress, lptransfersize.rawAddress, lpnumoutstandingrequests.rawAddress)

public actual fun getFileInformationByHandle(hfile: Handle, lpfileinformation: MutPtr<ByHandleFileInformation>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileInformationByHandle(hfile.rawAddress, lpfileinformation.rawAddress)

public actual fun getFileInformationByHandleEx(hfile: Handle, fileinformationclass: FileInfoByHandleClass, lpfileinformation: MutPtr<CVoid>, dwbuffersize: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileInformationByHandleEx(hfile.rawAddress, fileinformationclass, lpfileinformation.rawAddress, dwbuffersize.toInt())

public actual fun getFileSize(hfile: Handle, lpfilesizehigh: MutPtr<UInt>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileSize(hfile.rawAddress, lpfilesizehigh.rawAddress).toUInt()

public actual fun getFileSizeEx(hfile: Handle, lpfilesize: MutPtr<Long>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileSizeEx(hfile.rawAddress, lpfilesize.rawAddress)

public actual fun getFileTime(hfile: Handle, lpcreationtime: MutPtr<Filetime>, lplastaccesstime: MutPtr<Filetime>, lplastwritetime: MutPtr<Filetime>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileTime(hfile.rawAddress, lpcreationtime.rawAddress, lplastaccesstime.rawAddress, lplastwritetime.rawAddress)

public actual fun getFileType(hfile: Handle): FileType =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileType(hfile.rawAddress).toUInt()

public actual fun getFileVersionInfoA(lptstrfilename: Pcstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoA(lptstrfilename.rawAddress, dwhandle.toInt(), dwlen.toInt(), lpdata.rawAddress)

public actual fun getFileVersionInfoExA(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoExA(dwflags.toInt(), lpwstrfilename.rawAddress, dwhandle.toInt(), dwlen.toInt(), lpdata.rawAddress)

public actual fun getFileVersionInfoExW(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcwstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoExW(dwflags.toInt(), lpwstrfilename.rawAddress, dwhandle.toInt(), dwlen.toInt(), lpdata.rawAddress)

public actual fun getFileVersionInfoSizeA(lptstrfilename: Pcstr, lpdwhandle: MutPtr<UInt>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeA(lptstrfilename.rawAddress, lpdwhandle.rawAddress).toUInt()

public actual fun getFileVersionInfoSizeExA(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcstr, lpdwhandle: MutPtr<UInt>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeExA(dwflags.toInt(), lpwstrfilename.rawAddress, lpdwhandle.rawAddress).toUInt()

public actual fun getFileVersionInfoSizeExW(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcwstr, lpdwhandle: MutPtr<UInt>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeExW(dwflags.toInt(), lpwstrfilename.rawAddress, lpdwhandle.rawAddress).toUInt()

public actual fun getFileVersionInfoSizeW(lptstrfilename: Pcwstr, lpdwhandle: MutPtr<UInt>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoSizeW(lptstrfilename.rawAddress, lpdwhandle.rawAddress).toUInt()

public actual fun getFileVersionInfoW(lptstrfilename: Pcwstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFileVersionInfoW(lptstrfilename.rawAddress, dwhandle.toInt(), dwlen.toInt(), lpdata.rawAddress)

public actual fun getFinalPathNameByHandleA(hfile: Handle, lpszfilepath: Pstr, cchfilepath: UInt, dwflags: GetfinalpathnamebyhandleFlags): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFinalPathNameByHandleA(hfile.rawAddress, lpszfilepath.rawAddress, cchfilepath.toInt(), dwflags.toInt()).toUInt()

public actual fun getFinalPathNameByHandleW(hfile: Handle, lpszfilepath: Pwstr, cchfilepath: UInt, dwflags: GetfinalpathnamebyhandleFlags): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFinalPathNameByHandleW(hfile.rawAddress, lpszfilepath.rawAddress, cchfilepath.toInt(), dwflags.toInt()).toUInt()

public actual fun getFullPathNameA(lpfilename: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: MutPtr<Pstr>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFullPathNameA(lpfilename.rawAddress, nbufferlength.toInt(), lpbuffer.rawAddress, lpfilepart.rawAddress).toUInt()

public actual fun getFullPathNameTransactedA(lpfilename: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: MutPtr<Pstr>, htransaction: Handle): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFullPathNameTransactedA(lpfilename.rawAddress, nbufferlength.toInt(), lpbuffer.rawAddress, lpfilepart.rawAddress, htransaction.rawAddress).toUInt()

public actual fun getFullPathNameTransactedW(lpfilename: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: MutPtr<Pwstr>, htransaction: Handle): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFullPathNameTransactedW(lpfilename.rawAddress, nbufferlength.toInt(), lpbuffer.rawAddress, lpfilepart.rawAddress, htransaction.rawAddress).toUInt()

public actual fun getFullPathNameW(lpfilename: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: MutPtr<Pwstr>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetFullPathNameW(lpfilename.rawAddress, nbufferlength.toInt(), lpbuffer.rawAddress, lpfilepart.rawAddress).toUInt()

public actual fun getIoRingInfo(ioring: Hioring, info: MutPtr<IoringInfo>): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetIoRingInfo(ioring.rawAddress, info.rawAddress)

public actual fun getLogContainerName(hlog: Handle, cidlogicalcontainer: UInt, pwstrcontainername: Pcwstr, clencontainername: UInt, pcactuallencontainername: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetLogContainerName(hlog.rawAddress, cidlogicalcontainer.toInt(), pwstrcontainername.rawAddress, clencontainername.toInt(), pcactuallencontainername.rawAddress)

public actual fun getLogFileInformation(hlog: Handle, pinfobuffer: MutPtr<ClsInformation>, cbbuffer: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetLogFileInformation(hlog.rawAddress, pinfobuffer.rawAddress, cbbuffer.rawAddress)

public actual fun getLogIoStatistics(hlog: Handle, pvstatsbuffer: MutPtr<CVoid>, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetLogIoStatistics(hlog.rawAddress, pvstatsbuffer.rawAddress, cbstatsbuffer.toInt(), estatsclass, pcbstatswritten.rawAddress)

public actual fun getLogReservationInfo(pvmarshal: ConstPtr<CVoid>, pcbrecordnumber: MutPtr<UInt>, pcbuserreservation: MutPtr<Long>, pcbcommitreservation: MutPtr<Long>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetLogReservationInfo(pvmarshal.rawAddress, pcbrecordnumber.rawAddress, pcbuserreservation.rawAddress, pcbcommitreservation.rawAddress)

public actual fun getLogicalDriveStringsA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetLogicalDriveStringsA(nbufferlength.toInt(), lpbuffer.rawAddress).toUInt()

public actual fun getLogicalDriveStringsW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetLogicalDriveStringsW(nbufferlength.toInt(), lpbuffer.rawAddress).toUInt()

public actual fun getLogicalDrives(): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetLogicalDrives().toUInt()

public actual fun getLongPathNameA(lpszshortpath: Pcstr, lpszlongpath: Pstr, cchbuffer: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetLongPathNameA(lpszshortpath.rawAddress, lpszlongpath.rawAddress, cchbuffer.toInt()).toUInt()

public actual fun getLongPathNameTransactedA(lpszshortpath: Pcstr, lpszlongpath: Pstr, cchbuffer: UInt, htransaction: Handle): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetLongPathNameTransactedA(lpszshortpath.rawAddress, lpszlongpath.rawAddress, cchbuffer.toInt(), htransaction.rawAddress).toUInt()

public actual fun getLongPathNameTransactedW(lpszshortpath: Pcwstr, lpszlongpath: Pwstr, cchbuffer: UInt, htransaction: Handle): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetLongPathNameTransactedW(lpszshortpath.rawAddress, lpszlongpath.rawAddress, cchbuffer.toInt(), htransaction.rawAddress).toUInt()

public actual fun getLongPathNameW(lpszshortpath: Pcwstr, lpszlongpath: Pwstr, cchbuffer: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetLongPathNameW(lpszshortpath.rawAddress, lpszlongpath.rawAddress, cchbuffer.toInt()).toUInt()

public actual fun getNextLogArchiveExtent(pvarchivecontext: MutPtr<CVoid>, rgadextent: MutPtr<ClsArchiveDescriptor>, cdescriptors: UInt, pcdescriptorsreturned: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetNextLogArchiveExtent(pvarchivecontext.rawAddress, rgadextent.rawAddress, cdescriptors.toInt(), pcdescriptorsreturned.rawAddress)

public actual fun getNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: MutPtr<TransactionNotification>, notificationlength: UInt, dwmilliseconds: UInt, returnlength: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetNotificationResourceManager(resourcemanagerhandle.rawAddress, transactionnotification.rawAddress, notificationlength.toInt(), dwmilliseconds.toInt(), returnlength.rawAddress)

public actual fun getNotificationResourceManagerAsync(resourcemanagerhandle: Handle, transactionnotification: MutPtr<TransactionNotification>, transactionnotificationlength: UInt, returnlength: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetNotificationResourceManagerAsync(resourcemanagerhandle.rawAddress, transactionnotification.rawAddress, transactionnotificationlength.toInt(), returnlength.rawAddress, lpoverlapped.rawAddress)

public actual fun getShortPathNameA(lpszlongpath: Pcstr, lpszshortpath: Pstr, cchbuffer: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetShortPathNameA(lpszlongpath.rawAddress, lpszshortpath.rawAddress, cchbuffer.toInt()).toUInt()

public actual fun getShortPathNameW(lpszlongpath: Pcwstr, lpszshortpath: Pwstr, cchbuffer: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetShortPathNameW(lpszlongpath.rawAddress, lpszshortpath.rawAddress, cchbuffer.toInt()).toUInt()

public actual fun getTapeParameters(hdevice: Handle, dwoperation: GetTapeDriveParametersOperation, lpdwsize: MutPtr<UInt>, lptapeinformation: MutPtr<CVoid>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetTapeParameters(hdevice.rawAddress, dwoperation.toInt(), lpdwsize.rawAddress, lptapeinformation.rawAddress).toUInt()

public actual fun getTapePosition(hdevice: Handle, dwpositiontype: TapePositionType, lpdwpartition: MutPtr<UInt>, lpdwoffsetlow: MutPtr<UInt>, lpdwoffsethigh: MutPtr<UInt>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetTapePosition(hdevice.rawAddress, dwpositiontype.toInt(), lpdwpartition.rawAddress, lpdwoffsetlow.rawAddress, lpdwoffsethigh.rawAddress).toUInt()

public actual fun getTapeStatus(hdevice: Handle): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetTapeStatus(hdevice.rawAddress).toUInt()

public actual fun getTempFileNameA(lppathname: Pcstr, lpprefixstring: Pcstr, uunique: UInt, lptempfilename: Pstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetTempFileNameA(lppathname.rawAddress, lpprefixstring.rawAddress, uunique.toInt(), lptempfilename.rawAddress).toUInt()

public actual fun getTempFileNameW(lppathname: Pcwstr, lpprefixstring: Pcwstr, uunique: UInt, lptempfilename: Pwstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetTempFileNameW(lppathname.rawAddress, lpprefixstring.rawAddress, uunique.toInt(), lptempfilename.rawAddress).toUInt()

public actual fun getTempPath2A(bufferlength: UInt, buffer: Pstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetTempPath2A(bufferlength.toInt(), buffer.rawAddress).toUInt()

public actual fun getTempPath2W(bufferlength: UInt, buffer: Pwstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetTempPath2W(bufferlength.toInt(), buffer.rawAddress).toUInt()

public actual fun getTempPathA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetTempPathA(nbufferlength.toInt(), lpbuffer.rawAddress).toUInt()

public actual fun getTempPathW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetTempPathW(nbufferlength.toInt(), lpbuffer.rawAddress).toUInt()

public actual fun getTransactionId(transactionhandle: Handle, transactionid: MutPtr<Guid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetTransactionId(transactionhandle.rawAddress, transactionid.rawAddress)

public actual fun getTransactionInformation(transactionhandle: Handle, outcome: MutPtr<UInt>, isolationlevel: MutPtr<UInt>, isolationflags: MutPtr<UInt>, timeout: MutPtr<UInt>, bufferlength: UInt, description: Pwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetTransactionInformation(transactionhandle.rawAddress, outcome.rawAddress, isolationlevel.rawAddress, isolationflags.rawAddress, timeout.rawAddress, bufferlength.toInt(), description.rawAddress)

public actual fun getTransactionManagerId(transactionmanagerhandle: Handle, transactionmanagerid: MutPtr<Guid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetTransactionManagerId(transactionmanagerhandle.rawAddress, transactionmanagerid.rawAddress)

public actual fun getVolumeInformationA(lprootpathname: Pcstr, lpvolumenamebuffer: Pstr, nvolumenamesize: UInt, lpvolumeserialnumber: MutPtr<UInt>, lpmaximumcomponentlength: MutPtr<UInt>, lpfilesystemflags: MutPtr<UInt>, lpfilesystemnamebuffer: Pstr, nfilesystemnamesize: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetVolumeInformationA(lprootpathname.rawAddress, lpvolumenamebuffer.rawAddress, nvolumenamesize.toInt(), lpvolumeserialnumber.rawAddress, lpmaximumcomponentlength.rawAddress, lpfilesystemflags.rawAddress, lpfilesystemnamebuffer.rawAddress, nfilesystemnamesize.toInt())

public actual fun getVolumeInformationByHandleW(hfile: Handle, lpvolumenamebuffer: Pwstr, nvolumenamesize: UInt, lpvolumeserialnumber: MutPtr<UInt>, lpmaximumcomponentlength: MutPtr<UInt>, lpfilesystemflags: MutPtr<UInt>, lpfilesystemnamebuffer: Pwstr, nfilesystemnamesize: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetVolumeInformationByHandleW(hfile.rawAddress, lpvolumenamebuffer.rawAddress, nvolumenamesize.toInt(), lpvolumeserialnumber.rawAddress, lpmaximumcomponentlength.rawAddress, lpfilesystemflags.rawAddress, lpfilesystemnamebuffer.rawAddress, nfilesystemnamesize.toInt())

public actual fun getVolumeInformationW(lprootpathname: Pcwstr, lpvolumenamebuffer: Pwstr, nvolumenamesize: UInt, lpvolumeserialnumber: MutPtr<UInt>, lpmaximumcomponentlength: MutPtr<UInt>, lpfilesystemflags: MutPtr<UInt>, lpfilesystemnamebuffer: Pwstr, nfilesystemnamesize: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetVolumeInformationW(lprootpathname.rawAddress, lpvolumenamebuffer.rawAddress, nvolumenamesize.toInt(), lpvolumeserialnumber.rawAddress, lpmaximumcomponentlength.rawAddress, lpfilesystemflags.rawAddress, lpfilesystemnamebuffer.rawAddress, nfilesystemnamesize.toInt())

public actual fun getVolumeNameForVolumeMountPointA(lpszvolumemountpoint: Pcstr, lpszvolumename: Pstr, cchbufferlength: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetVolumeNameForVolumeMountPointA(lpszvolumemountpoint.rawAddress, lpszvolumename.rawAddress, cchbufferlength.toInt())

public actual fun getVolumeNameForVolumeMountPointW(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetVolumeNameForVolumeMountPointW(lpszvolumemountpoint.rawAddress, lpszvolumename.rawAddress, cchbufferlength.toInt())

public actual fun getVolumePathNameA(lpszfilename: Pcstr, lpszvolumepathname: Pstr, cchbufferlength: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetVolumePathNameA(lpszfilename.rawAddress, lpszvolumepathname.rawAddress, cchbufferlength.toInt())

public actual fun getVolumePathNameW(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, cchbufferlength: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetVolumePathNameW(lpszfilename.rawAddress, lpszvolumepathname.rawAddress, cchbufferlength.toInt())

public actual fun getVolumePathNamesForVolumeNameA(lpszvolumename: Pcstr, lpszvolumepathnames: Pstr, cchbufferlength: UInt, lpcchreturnlength: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetVolumePathNamesForVolumeNameA(lpszvolumename.rawAddress, lpszvolumepathnames.rawAddress, cchbufferlength.toInt(), lpcchreturnlength.rawAddress)

public actual fun getVolumePathNamesForVolumeNameW(lpszvolumename: Pcwstr, lpszvolumepathnames: Pwstr, cchbufferlength: UInt, lpcchreturnlength: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemGetVolumePathNamesForVolumeNameW(lpszvolumename.rawAddress, lpszvolumepathnames.rawAddress, cchbufferlength.toInt(), lpcchreturnlength.rawAddress)

public actual fun handleLogFull(hlog: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemHandleLogFull(hlog.rawAddress)

public actual fun installLogPolicy(hlog: Handle, ppolicy: MutPtr<ClfsMgmtPolicy>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemInstallLogPolicy(hlog.rawAddress, ppolicy.rawAddress)

public actual fun isIoRingOpSupported(ioring: Hioring, op: IoringOpCode): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemIsIoRingOpSupported(ioring.rawAddress, op)

public actual fun lZClose(hfile: Int) {
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLZClose(hfile)
}

public actual fun lZCopy(hfsource: Int, hfdest: Int): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLZCopy(hfsource, hfdest)

public actual fun lZDone() {
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLZDone()
}

public actual fun lZInit(hfsource: Int): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLZInit(hfsource)

public actual fun lZOpenFileA(lpfilename: Pcstr, lpreopenbuf: MutPtr<Ofstruct>, wstyle: LzopenfileStyle): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLZOpenFileA(lpfilename.rawAddress, lpreopenbuf.rawAddress, wstyle.toShort())

public actual fun lZOpenFileW(lpfilename: Pcwstr, lpreopenbuf: MutPtr<Ofstruct>, wstyle: LzopenfileStyle): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLZOpenFileW(lpfilename.rawAddress, lpreopenbuf.rawAddress, wstyle.toShort())

public actual fun lZRead(hfile: Int, lpbuffer: Pstr, cbread: Int): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLZRead(hfile, lpbuffer.rawAddress, cbread)

public actual fun lZSeek(hfile: Int, loffset: Int, iorigin: Int): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLZSeek(hfile, loffset, iorigin)

public actual fun lZStart(): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLZStart()

public actual fun localFileTimeToFileTime(lplocalfiletime: ConstPtr<Filetime>, lpfiletime: MutPtr<Filetime>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLocalFileTimeToFileTime(lplocalfiletime.rawAddress, lpfiletime.rawAddress)

public actual fun lockFile(hfile: Handle, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLockFile(hfile.rawAddress, dwfileoffsetlow.toInt(), dwfileoffsethigh.toInt(), nnumberofbytestolocklow.toInt(), nnumberofbytestolockhigh.toInt())

public actual fun lockFileEx(hfile: Handle, dwflags: LockFileFlags, dwreserved: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt, lpoverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLockFileEx(hfile.rawAddress, dwflags.toInt(), dwreserved.toInt(), nnumberofbytestolocklow.toInt(), nnumberofbytestolockhigh.toInt(), lpoverlapped.rawAddress)

public actual fun logTailAdvanceFailure(hlog: Handle, dwreason: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLogTailAdvanceFailure(hlog.rawAddress, dwreason.toInt())

public actual fun lsnBlockOffset(plsn: ConstPtr<ClsLsn>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLsnBlockOffset(plsn.rawAddress).toUInt()

public actual fun lsnContainer(plsn: ConstPtr<ClsLsn>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLsnContainer(plsn.rawAddress).toUInt()

public actual fun lsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn =
    ClsLsn()

public actual fun lsnEqual(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLsnEqual(plsn1.rawAddress, plsn2.rawAddress)

public actual fun lsnGreater(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLsnGreater(plsn1.rawAddress, plsn2.rawAddress)

public actual fun lsnIncrement(plsn: ConstPtr<ClsLsn>): ClsLsn =
    ClsLsn()

public actual fun lsnInvalid(plsn: ConstPtr<ClsLsn>): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLsnInvalid(plsn.rawAddress)

public actual fun lsnLess(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLsnLess(plsn1.rawAddress, plsn2.rawAddress)

public actual fun lsnNull(plsn: ConstPtr<ClsLsn>): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLsnNull(plsn.rawAddress)

public actual fun lsnRecordSequence(plsn: ConstPtr<ClsLsn>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemLsnRecordSequence(plsn.rawAddress).toUInt()

public actual fun moveFileA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemMoveFileA(lpexistingfilename.rawAddress, lpnewfilename.rawAddress)

public actual fun moveFileExA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, dwflags: MoveFileFlags): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemMoveFileExA(lpexistingfilename.rawAddress, lpnewfilename.rawAddress, dwflags.toInt())

public actual fun moveFileExW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: MoveFileFlags): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemMoveFileExW(lpexistingfilename.rawAddress, lpnewfilename.rawAddress, dwflags.toInt())

public actual fun moveFileFromAppW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemMoveFileFromAppW(lpexistingfilename.rawAddress, lpnewfilename.rawAddress)

public actual fun moveFileTransactedA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, dwflags: MoveFileFlags, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemMoveFileTransactedA(lpexistingfilename.rawAddress, lpnewfilename.rawAddress, 0L, lpdata.rawAddress, dwflags.toInt(), htransaction.rawAddress)

public actual fun moveFileTransactedW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, dwflags: MoveFileFlags, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemMoveFileTransactedW(lpexistingfilename.rawAddress, lpnewfilename.rawAddress, 0L, lpdata.rawAddress, dwflags.toInt(), htransaction.rawAddress)

public actual fun moveFileW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemMoveFileW(lpexistingfilename.rawAddress, lpnewfilename.rawAddress)

public actual fun moveFileWithProgressA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, dwflags: MoveFileFlags): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemMoveFileWithProgressA(lpexistingfilename.rawAddress, lpnewfilename.rawAddress, 0L, lpdata.rawAddress, dwflags.toInt())

public actual fun moveFileWithProgressW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, dwflags: MoveFileFlags): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemMoveFileWithProgressW(lpexistingfilename.rawAddress, lpnewfilename.rawAddress, 0L, lpdata.rawAddress, dwflags.toInt())

public actual fun netConnectionEnum(servername: Pcwstr, qualifier: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemNetConnectionEnum(servername.rawAddress, qualifier.rawAddress, level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumeHandle.rawAddress).toUInt()

public actual fun netFileClose(servername: Pcwstr, fileid: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemNetFileClose(servername.rawAddress, fileid.toInt()).toUInt()

public actual fun netFileEnum(servername: Pcwstr, basepath: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<ULong>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemNetFileEnum(servername.rawAddress, basepath.rawAddress, username.rawAddress, level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumeHandle.rawAddress).toUInt()

public actual fun netFileGetInfo(servername: Pcwstr, fileid: UInt, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemNetFileGetInfo(servername.rawAddress, fileid.toInt(), level.toInt(), bufptr.rawAddress).toUInt()

public actual fun netServerAliasAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemNetServerAliasAdd(servername.rawAddress, level.toInt(), buf.rawAddress).toUInt()

public actual fun netServerAliasDel(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemNetServerAliasDel(servername.rawAddress, level.toInt(), buf.rawAddress).toUInt()

public actual fun netServerAliasEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemNetServerAliasEnum(servername.rawAddress, level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumehandle.rawAddress).toUInt()

public actual fun netSessionDel(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemNetSessionDel(servername.rawAddress, uncclientname.rawAddress, username.rawAddress).toUInt()

public actual fun netSessionEnum(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemNetSessionEnum(servername.rawAddress, uncclientname.rawAddress, username.rawAddress, level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumeHandle.rawAddress).toUInt()

public actual fun netSessionGetInfo(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemNetSessionGetInfo(servername.rawAddress, uncclientname.rawAddress, username.rawAddress, level.toInt(), bufptr.rawAddress).toUInt()

public actual fun netShareAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemNetShareAdd(servername.rawAddress, level.toInt(), buf.rawAddress, parmErr.rawAddress).toUInt()

public actual fun netShareCheck(servername: Pcwstr, device: Pcwstr, type: MutPtr<UInt>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemNetShareCheck(servername.rawAddress, device.rawAddress, type.rawAddress).toUInt()

public actual fun netShareDel(servername: Pcwstr, netname: Pcwstr, reserved: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemNetShareDel(servername.rawAddress, netname.rawAddress, reserved.toInt()).toUInt()

public actual fun netShareDelEx(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemNetShareDelEx(servername.rawAddress, level.toInt(), buf.rawAddress).toUInt()

public actual fun netShareDelSticky(servername: Pcwstr, netname: Pcwstr, reserved: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemNetShareDelSticky(servername.rawAddress, netname.rawAddress, reserved.toInt()).toUInt()

public actual fun netShareEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemNetShareEnum(servername.rawAddress, level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumeHandle.rawAddress).toUInt()

public actual fun netShareEnumSticky(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemNetShareEnumSticky(servername.rawAddress, level.toInt(), bufptr.rawAddress, prefmaxlen.toInt(), entriesread.rawAddress, totalentries.rawAddress, resumeHandle.rawAddress).toUInt()

public actual fun netShareGetInfo(servername: Pcwstr, netname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemNetShareGetInfo(servername.rawAddress, netname.rawAddress, level.toInt(), bufptr.rawAddress).toUInt()

public actual fun netShareSetInfo(servername: Pcwstr, netname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemNetShareSetInfo(servername.rawAddress, netname.rawAddress, level.toInt(), buf.rawAddress, parmErr.rawAddress).toUInt()

public actual fun netStatisticsGet(servername: ConstPtr<Byte>, service: ConstPtr<Byte>, level: UInt, options: UInt, buffer: MutPtr<MutPtr<UByte>>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemNetStatisticsGet(servername.rawAddress, service.rawAddress, level.toInt(), options.toInt(), buffer.rawAddress).toUInt()

public actual fun openEncryptedFileRawA(lpfilename: Pcstr, ulflags: UInt, pvcontext: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemOpenEncryptedFileRawA(lpfilename.rawAddress, ulflags.toInt(), pvcontext.rawAddress).toUInt()

public actual fun openEncryptedFileRawW(lpfilename: Pcwstr, ulflags: UInt, pvcontext: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemOpenEncryptedFileRawW(lpfilename.rawAddress, ulflags.toInt(), pvcontext.rawAddress).toUInt()

public actual fun openEnlistment(dwdesiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentid: MutPtr<Guid>): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemOpenEnlistment(dwdesiredaccess.toInt(), resourcemanagerhandle.rawAddress, enlistmentid.rawAddress))

public actual fun openFile(lpfilename: Pcstr, lpreopenbuff: MutPtr<Ofstruct>, ustyle: UInt): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemOpenFile(lpfilename.rawAddress, lpreopenbuff.rawAddress, ustyle.toInt())

public actual fun openFileById(hvolumehint: Handle, lpfileid: ConstPtr<FileIdDescriptor>, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwflagsandattributes: FileFlagsAndAttributes): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemOpenFileById(hvolumehint.rawAddress, lpfileid.rawAddress, dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes.rawAddress, dwflagsandattributes.toInt()))

public actual fun openResourceManager(dwdesiredaccess: UInt, tmhandle: Handle, resourcemanagerid: MutPtr<Guid>): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemOpenResourceManager(dwdesiredaccess.toInt(), tmhandle.rawAddress, resourcemanagerid.rawAddress))

public actual fun openTransaction(dwdesiredaccess: UInt, transactionid: MutPtr<Guid>): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemOpenTransaction(dwdesiredaccess.toInt(), transactionid.rawAddress))

public actual fun openTransactionManager(logfilename: Pcwstr, desiredaccess: UInt, openoptions: UInt): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemOpenTransactionManager(logfilename.rawAddress, desiredaccess.toInt(), openoptions.toInt()))

public actual fun openTransactionManagerById(transactionmanagerid: ConstPtr<Guid>, desiredaccess: UInt, openoptions: UInt): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemOpenTransactionManagerById(transactionmanagerid.rawAddress, desiredaccess.toInt(), openoptions.toInt()))

public actual fun popIoRingCompletion(ioring: Hioring, cqe: MutPtr<IoringCqe>): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemPopIoRingCompletion(ioring.rawAddress, cqe.rawAddress)

public actual fun prePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemPrePrepareComplete(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun prePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemPrePrepareEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun prepareComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemPrepareComplete(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun prepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemPrepareEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun prepareLogArchive(hlog: Handle, pszbaselogfilename: Pwstr, clen: UInt, plsnlow: ConstPtr<ClsLsn>, plsnhigh: ConstPtr<ClsLsn>, pcactuallength: MutPtr<UInt>, poffbaselogfiledata: MutPtr<ULong>, pcbbaselogfilelength: MutPtr<ULong>, plsnbase: MutPtr<ClsLsn>, plsnlast: MutPtr<ClsLsn>, plsncurrentarchivetail: MutPtr<ClsLsn>, ppvarchivecontext: MutPtr<MutPtr<CVoid>>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemPrepareLogArchive(hlog.rawAddress, pszbaselogfilename.rawAddress, clen.toInt(), plsnlow.rawAddress, plsnhigh.rawAddress, pcactuallength.rawAddress, poffbaselogfiledata.rawAddress, pcbbaselogfilelength.rawAddress, plsnbase.rawAddress, plsnlast.rawAddress, plsncurrentarchivetail.rawAddress, ppvarchivecontext.rawAddress)

public actual fun prepareTape(hdevice: Handle, dwoperation: PrepareTapeOperation, bimmediate: Bool): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemPrepareTape(hdevice.rawAddress, dwoperation.toInt(), bimmediate).toUInt()

public actual fun queryDosDeviceA(lpdevicename: Pcstr, lptargetpath: Pstr, ucchmax: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemQueryDosDeviceA(lpdevicename.rawAddress, lptargetpath.rawAddress, ucchmax.toInt()).toUInt()

public actual fun queryDosDeviceW(lpdevicename: Pcwstr, lptargetpath: Pwstr, ucchmax: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemQueryDosDeviceW(lpdevicename.rawAddress, lptargetpath.rawAddress, ucchmax.toInt()).toUInt()

public actual fun queryIoRingCapabilities(capabilities: MutPtr<IoringCapabilities>): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemQueryIoRingCapabilities(capabilities.rawAddress)

public actual fun queryLogPolicy(hlog: Handle, epolicytype: ClfsMgmtPolicyType, ppolicybuffer: MutPtr<ClfsMgmtPolicy>, pcbpolicybuffer: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemQueryLogPolicy(hlog.rawAddress, epolicytype, ppolicybuffer.rawAddress, pcbpolicybuffer.rawAddress)

public actual fun queryRecoveryAgentsOnEncryptedFile(lpfilename: Pcwstr, precoveryagents: MutPtr<MutPtr<EncryptionCertificateHashList>>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemQueryRecoveryAgentsOnEncryptedFile(lpfilename.rawAddress, precoveryagents.rawAddress).toUInt()

public actual fun queryUsersOnEncryptedFile(lpfilename: Pcwstr, pusers: MutPtr<MutPtr<EncryptionCertificateHashList>>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemQueryUsersOnEncryptedFile(lpfilename.rawAddress, pusers.rawAddress).toUInt()

public actual fun reOpenFile(horiginalfile: Handle, dwdesiredaccess: UInt, dwsharemode: FileShareMode, dwflagsandattributes: FileFlagsAndAttributes): Handle =
    MutPtr(WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemReOpenFile(horiginalfile.rawAddress, dwdesiredaccess.toInt(), dwsharemode.toInt(), dwflagsandattributes.toInt()))

public actual fun readDirectoryChangesExW(hdirectory: Handle, lpbuffer: MutPtr<CVoid>, nbufferlength: UInt, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange, lpbytesreturned: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpoverlappedCompletionRoutine, readdirectorynotifyinformationclass: ReadDirectoryNotifyInformationClass): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemReadDirectoryChangesExW(hdirectory.rawAddress, lpbuffer.rawAddress, nbufferlength.toInt(), bwatchsubtree, dwnotifyfilter.toInt(), lpbytesreturned.rawAddress, lpoverlapped.rawAddress, 0L, readdirectorynotifyinformationclass)

public actual fun readDirectoryChangesW(hdirectory: Handle, lpbuffer: MutPtr<CVoid>, nbufferlength: UInt, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange, lpbytesreturned: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemReadDirectoryChangesW(hdirectory.rawAddress, lpbuffer.rawAddress, nbufferlength.toInt(), bwatchsubtree, dwnotifyfilter.toInt(), lpbytesreturned.rawAddress, lpoverlapped.rawAddress, 0L)

public actual fun readEncryptedFileRaw(pfexportcallback: PfeExportFunc, pvcallbackcontext: ConstPtr<CVoid>, pvcontext: ConstPtr<CVoid>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemReadEncryptedFileRaw(0L, pvcallbackcontext.rawAddress, pvcontext.rawAddress).toUInt()

public actual fun readFile(hfile: Handle, lpbuffer: MutPtr<UByte>, nnumberofbytestoread: UInt, lpnumberofbytesread: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemReadFile(hfile.rawAddress, lpbuffer.rawAddress, nnumberofbytestoread.toInt(), lpnumberofbytesread.rawAddress, lpoverlapped.rawAddress)

public actual fun readFileEx(hfile: Handle, lpbuffer: MutPtr<UByte>, nnumberofbytestoread: UInt, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemReadFileEx(hfile.rawAddress, lpbuffer.rawAddress, nnumberofbytestoread.toInt(), lpoverlapped.rawAddress, 0L)

public actual fun readFileScatter(hfile: Handle, asegmentarray: ConstPtr<FileSegmentElement>, nnumberofbytestoread: UInt, lpreserved: ConstPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemReadFileScatter(hfile.rawAddress, asegmentarray.rawAddress, nnumberofbytestoread.toInt(), lpreserved.rawAddress, lpoverlapped.rawAddress)

public actual fun readLogArchiveMetadata(pvarchivecontext: MutPtr<CVoid>, cboffset: UInt, cbbytestoread: UInt, pbreadbuffer: MutPtr<UByte>, pcbbytesread: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemReadLogArchiveMetadata(pvarchivecontext.rawAddress, cboffset.toInt(), cbbytestoread.toInt(), pbreadbuffer.rawAddress, pcbbytesread.rawAddress)

public actual fun readLogNotification(hlog: Handle, pnotification: MutPtr<ClfsMgmtNotification>, lpoverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemReadLogNotification(hlog.rawAddress, pnotification.rawAddress, lpoverlapped.rawAddress)

public actual fun readLogRecord(pvmarshal: MutPtr<CVoid>, plsnfirst: MutPtr<ClsLsn>, econtextmode: ClfsContextMode, ppvreadbuffer: MutPtr<MutPtr<CVoid>>, pcbreadbuffer: MutPtr<UInt>, perecordtype: MutPtr<UByte>, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, ppvreadcontext: MutPtr<MutPtr<CVoid>>, poverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemReadLogRecord(pvmarshal.rawAddress, plsnfirst.rawAddress, econtextmode, ppvreadbuffer.rawAddress, pcbreadbuffer.rawAddress, perecordtype.rawAddress, plsnundonext.rawAddress, plsnprevious.rawAddress, ppvreadcontext.rawAddress, poverlapped.rawAddress)

public actual fun readLogRestartArea(pvmarshal: MutPtr<CVoid>, ppvrestartbuffer: MutPtr<MutPtr<CVoid>>, pcbrestartbuffer: MutPtr<UInt>, plsn: MutPtr<ClsLsn>, ppvcontext: MutPtr<MutPtr<CVoid>>, poverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemReadLogRestartArea(pvmarshal.rawAddress, ppvrestartbuffer.rawAddress, pcbrestartbuffer.rawAddress, plsn.rawAddress, ppvcontext.rawAddress, poverlapped.rawAddress)

public actual fun readNextLogRecord(pvreadcontext: MutPtr<CVoid>, ppvbuffer: MutPtr<MutPtr<CVoid>>, pcbbuffer: MutPtr<UInt>, perecordtype: MutPtr<UByte>, plsnuser: MutPtr<ClsLsn>, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, plsnrecord: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemReadNextLogRecord(pvreadcontext.rawAddress, ppvbuffer.rawAddress, pcbbuffer.rawAddress, perecordtype.rawAddress, plsnuser.rawAddress, plsnundonext.rawAddress, plsnprevious.rawAddress, plsnrecord.rawAddress, poverlapped.rawAddress)

public actual fun readOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemReadOnlyEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun readPreviousLogRestartArea(pvreadcontext: MutPtr<CVoid>, ppvrestartbuffer: MutPtr<MutPtr<CVoid>>, pcbrestartbuffer: MutPtr<UInt>, plsnrestart: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemReadPreviousLogRestartArea(pvreadcontext.rawAddress, ppvrestartbuffer.rawAddress, pcbrestartbuffer.rawAddress, plsnrestart.rawAddress, poverlapped.rawAddress)

public actual fun recoverEnlistment(enlistmenthandle: Handle, enlistmentkey: MutPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemRecoverEnlistment(enlistmenthandle.rawAddress, enlistmentkey.rawAddress)

public actual fun recoverResourceManager(resourcemanagerhandle: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemRecoverResourceManager(resourcemanagerhandle.rawAddress)

public actual fun recoverTransactionManager(transactionmanagerhandle: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemRecoverTransactionManager(transactionmanagerhandle.rawAddress)

public actual fun registerForLogWriteNotification(hlog: Handle, cbthreshold: UInt, fenable: Bool): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemRegisterForLogWriteNotification(hlog.rawAddress, cbthreshold.toInt(), fenable)

public actual fun registerManageableLogClient(hlog: Handle, pcallbacks: MutPtr<LogManagementCallbacks>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemRegisterManageableLogClient(hlog.rawAddress, pcallbacks.rawAddress)

public actual fun removeDirectoryA(lppathname: Pcstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemRemoveDirectoryA(lppathname.rawAddress)

public actual fun removeDirectoryFromAppW(lppathname: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemRemoveDirectoryFromAppW(lppathname.rawAddress)

public actual fun removeDirectoryTransactedA(lppathname: Pcstr, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemRemoveDirectoryTransactedA(lppathname.rawAddress, htransaction.rawAddress)

public actual fun removeDirectoryTransactedW(lppathname: Pcwstr, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemRemoveDirectoryTransactedW(lppathname.rawAddress, htransaction.rawAddress)

public actual fun removeDirectoryW(lppathname: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemRemoveDirectoryW(lppathname.rawAddress)

public actual fun removeLogContainer(hlog: Handle, pwszcontainerpath: Pcwstr, fforce: Bool, preserved: MutPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemRemoveLogContainer(hlog.rawAddress, pwszcontainerpath.rawAddress, fforce, preserved.rawAddress)

public actual fun removeLogContainerSet(hlog: Handle, ccontainer: UShort, rgwszcontainerpath: ConstPtr<Pcwstr>, fforce: Bool, preserved: MutPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemRemoveLogContainerSet(hlog.rawAddress, ccontainer.toShort(), rgwszcontainerpath.rawAddress, fforce, preserved.rawAddress)

public actual fun removeLogPolicy(hlog: Handle, epolicytype: ClfsMgmtPolicyType): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemRemoveLogPolicy(hlog.rawAddress, epolicytype)

public actual fun removeUsersFromEncryptedFile(lpfilename: Pcwstr, phashes: ConstPtr<EncryptionCertificateHashList>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemRemoveUsersFromEncryptedFile(lpfilename.rawAddress, phashes.rawAddress).toUInt()

public actual fun renameTransactionManager(logfilename: Pcwstr, existingtransactionmanagerguid: MutPtr<Guid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemRenameTransactionManager(logfilename.rawAddress, existingtransactionmanagerguid.rawAddress)

public actual fun replaceFileA(lpreplacedfilename: Pcstr, lpreplacementfilename: Pcstr, lpbackupfilename: Pcstr, dwreplaceflags: ReplaceFileFlags, lpexclude: ConstPtr<CVoid>, lpreserved: ConstPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemReplaceFileA(lpreplacedfilename.rawAddress, lpreplacementfilename.rawAddress, lpbackupfilename.rawAddress, dwreplaceflags.toInt(), lpexclude.rawAddress, lpreserved.rawAddress)

public actual fun replaceFileFromAppW(lpreplacedfilename: Pcwstr, lpreplacementfilename: Pcwstr, lpbackupfilename: Pcwstr, dwreplaceflags: UInt, lpexclude: ConstPtr<CVoid>, lpreserved: ConstPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemReplaceFileFromAppW(lpreplacedfilename.rawAddress, lpreplacementfilename.rawAddress, lpbackupfilename.rawAddress, dwreplaceflags.toInt(), lpexclude.rawAddress, lpreserved.rawAddress)

public actual fun replaceFileW(lpreplacedfilename: Pcwstr, lpreplacementfilename: Pcwstr, lpbackupfilename: Pcwstr, dwreplaceflags: ReplaceFileFlags, lpexclude: ConstPtr<CVoid>, lpreserved: ConstPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemReplaceFileW(lpreplacedfilename.rawAddress, lpreplacementfilename.rawAddress, lpbackupfilename.rawAddress, dwreplaceflags.toInt(), lpexclude.rawAddress, lpreserved.rawAddress)

public actual fun reserveAndAppendLog(pvmarshal: MutPtr<CVoid>, rgwriteentries: MutPtr<ClsWriteEntry>, cwriteentries: UInt, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, creserverecords: UInt, rgcbreservation: MutPtr<Long>, fflags: ClfsFlag, plsn: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemReserveAndAppendLog(pvmarshal.rawAddress, rgwriteentries.rawAddress, cwriteentries.toInt(), plsnundonext.rawAddress, plsnprevious.rawAddress, creserverecords.toInt(), rgcbreservation.rawAddress, fflags.toInt(), plsn.rawAddress, poverlapped.rawAddress)

public actual fun reserveAndAppendLogAligned(pvmarshal: MutPtr<CVoid>, rgwriteentries: MutPtr<ClsWriteEntry>, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, creserverecords: UInt, rgcbreservation: MutPtr<Long>, fflags: ClfsFlag, plsn: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemReserveAndAppendLogAligned(pvmarshal.rawAddress, rgwriteentries.rawAddress, cwriteentries.toInt(), cbentryalignment.toInt(), plsnundonext.rawAddress, plsnprevious.rawAddress, creserverecords.toInt(), rgcbreservation.rawAddress, fflags.toInt(), plsn.rawAddress, poverlapped.rawAddress)

public actual fun rollbackComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemRollbackComplete(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun rollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemRollbackEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun rollbackTransaction(transactionhandle: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemRollbackTransaction(transactionhandle.rawAddress)

public actual fun rollbackTransactionAsync(transactionhandle: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemRollbackTransactionAsync(transactionhandle.rawAddress)

public actual fun rollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemRollforwardTransactionManager(transactionmanagerhandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun scanLogContainers(pcxscan: MutPtr<ClsScanContext>, escanmode: UByte, preserved: MutPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemScanLogContainers(pcxscan.rawAddress, escanmode.toByte(), preserved.rawAddress)

public actual fun searchPathA(lppath: Pcstr, lpfilename: Pcstr, lpextension: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: MutPtr<Pstr>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSearchPathA(lppath.rawAddress, lpfilename.rawAddress, lpextension.rawAddress, nbufferlength.toInt(), lpbuffer.rawAddress, lpfilepart.rawAddress).toUInt()

public actual fun searchPathW(lppath: Pcwstr, lpfilename: Pcwstr, lpextension: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: MutPtr<Pwstr>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSearchPathW(lppath.rawAddress, lpfilename.rawAddress, lpextension.rawAddress, nbufferlength.toInt(), lpbuffer.rawAddress, lpfilepart.rawAddress).toUInt()

public actual fun setEncryptedFileMetadata(lpfilename: Pcwstr, pboldmetadata: ConstPtr<UByte>, pbnewmetadata: ConstPtr<UByte>, pownerhash: ConstPtr<EncryptionCertificateHash>, dwoperation: UInt, pcertificatesadded: ConstPtr<EncryptionCertificateHashList>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetEncryptedFileMetadata(lpfilename.rawAddress, pboldmetadata.rawAddress, pbnewmetadata.rawAddress, pownerhash.rawAddress, dwoperation.toInt(), pcertificatesadded.rawAddress).toUInt()

public actual fun setEndOfFile(hfile: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetEndOfFile(hfile.rawAddress)

public actual fun setEndOfLog(hlog: Handle, plsnend: MutPtr<ClsLsn>, lpoverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetEndOfLog(hlog.rawAddress, plsnend.rawAddress, lpoverlapped.rawAddress)

public actual fun setEnlistmentRecoveryInformation(enlistmenthandle: Handle, buffersize: UInt, buffer: MutPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetEnlistmentRecoveryInformation(enlistmenthandle.rawAddress, buffersize.toInt(), buffer.rawAddress)

public actual fun setFileApisToANSI() {
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetFileApisToANSI()
}

public actual fun setFileApisToOEM() {
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetFileApisToOEM()
}

public actual fun setFileAttributesA(lpfilename: Pcstr, dwfileattributes: FileFlagsAndAttributes): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetFileAttributesA(lpfilename.rawAddress, dwfileattributes.toInt())

public actual fun setFileAttributesFromAppW(lpfilename: Pcwstr, dwfileattributes: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetFileAttributesFromAppW(lpfilename.rawAddress, dwfileattributes.toInt())

public actual fun setFileAttributesTransactedA(lpfilename: Pcstr, dwfileattributes: UInt, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetFileAttributesTransactedA(lpfilename.rawAddress, dwfileattributes.toInt(), htransaction.rawAddress)

public actual fun setFileAttributesTransactedW(lpfilename: Pcwstr, dwfileattributes: UInt, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetFileAttributesTransactedW(lpfilename.rawAddress, dwfileattributes.toInt(), htransaction.rawAddress)

public actual fun setFileAttributesW(lpfilename: Pcwstr, dwfileattributes: FileFlagsAndAttributes): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetFileAttributesW(lpfilename.rawAddress, dwfileattributes.toInt())

public actual fun setFileBandwidthReservation(hfile: Handle, nperiodmilliseconds: UInt, nbytesperperiod: UInt, bdiscardable: Bool, lptransfersize: MutPtr<UInt>, lpnumoutstandingrequests: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetFileBandwidthReservation(hfile.rawAddress, nperiodmilliseconds.toInt(), nbytesperperiod.toInt(), bdiscardable, lptransfersize.rawAddress, lpnumoutstandingrequests.rawAddress)

public actual fun setFileCompletionNotificationModes(filehandle: Handle, flags: UByte): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetFileCompletionNotificationModes(filehandle.rawAddress, flags.toByte())

public actual fun setFileInformationByHandle(hfile: Handle, fileinformationclass: FileInfoByHandleClass, lpfileinformation: ConstPtr<CVoid>, dwbuffersize: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetFileInformationByHandle(hfile.rawAddress, fileinformationclass, lpfileinformation.rawAddress, dwbuffersize.toInt())

public actual fun setFileIoOverlappedRange(filehandle: Handle, overlappedrangestart: ConstPtr<UByte>, length: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetFileIoOverlappedRange(filehandle.rawAddress, overlappedrangestart.rawAddress, length.toInt())

public actual fun setFilePointer(hfile: Handle, ldistancetomove: Int, lpdistancetomovehigh: MutPtr<Int>, dwmovemethod: SetFilePointerMoveMethod): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetFilePointer(hfile.rawAddress, ldistancetomove, lpdistancetomovehigh.rawAddress, dwmovemethod.toInt()).toUInt()

public actual fun setFilePointerEx(hfile: Handle, lidistancetomove: Long, lpnewfilepointer: MutPtr<Long>, dwmovemethod: SetFilePointerMoveMethod): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetFilePointerEx(hfile.rawAddress, lidistancetomove, lpnewfilepointer.rawAddress, dwmovemethod.toInt())

public actual fun setFileShortNameA(hfile: Handle, lpshortname: Pcstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetFileShortNameA(hfile.rawAddress, lpshortname.rawAddress)

public actual fun setFileShortNameW(hfile: Handle, lpshortname: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetFileShortNameW(hfile.rawAddress, lpshortname.rawAddress)

public actual fun setFileTime(hfile: Handle, lpcreationtime: ConstPtr<Filetime>, lplastaccesstime: ConstPtr<Filetime>, lplastwritetime: ConstPtr<Filetime>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetFileTime(hfile.rawAddress, lpcreationtime.rawAddress, lplastaccesstime.rawAddress, lplastwritetime.rawAddress)

public actual fun setFileValidData(hfile: Handle, validdatalength: Long): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetFileValidData(hfile.rawAddress, validdatalength)

public actual fun setIoRingCompletionEvent(ioring: Hioring, hevent: Handle): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetIoRingCompletionEvent(ioring.rawAddress, hevent.rawAddress)

public actual fun setLogArchiveMode(hlog: Handle, emode: ClfsLogArchiveMode): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetLogArchiveMode(hlog.rawAddress, emode)

public actual fun setLogArchiveTail(hlog: Handle, plsnarchivetail: MutPtr<ClsLsn>, preserved: MutPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetLogArchiveTail(hlog.rawAddress, plsnarchivetail.rawAddress, preserved.rawAddress)

public actual fun setLogFileSizeWithPolicy(hlog: Handle, pdesiredsize: ConstPtr<ULong>, presultingsize: MutPtr<ULong>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetLogFileSizeWithPolicy(hlog.rawAddress, pdesiredsize.rawAddress, presultingsize.rawAddress)

public actual fun setResourceManagerCompletionPort(resourcemanagerhandle: Handle, iocompletionporthandle: Handle, completionkey: ULong): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetResourceManagerCompletionPort(resourcemanagerhandle.rawAddress, iocompletionporthandle.rawAddress, completionkey.toLong())

public actual fun setSearchPathMode(flags: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetSearchPathMode(flags.toInt())

public actual fun setTapeParameters(hdevice: Handle, dwoperation: TapeInformationType, lptapeinformation: ConstPtr<CVoid>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetTapeParameters(hdevice.rawAddress, dwoperation.toInt(), lptapeinformation.rawAddress).toUInt()

public actual fun setTapePosition(hdevice: Handle, dwpositionmethod: TapePositionMethod, dwpartition: UInt, dwoffsetlow: UInt, dwoffsethigh: UInt, bimmediate: Bool): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetTapePosition(hdevice.rawAddress, dwpositionmethod.toInt(), dwpartition.toInt(), dwoffsetlow.toInt(), dwoffsethigh.toInt(), bimmediate).toUInt()

public actual fun setTransactionInformation(transactionhandle: Handle, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetTransactionInformation(transactionhandle.rawAddress, isolationlevel.toInt(), isolationflags.toInt(), timeout.toInt(), description.rawAddress)

public actual fun setUserFileEncryptionKey(pencryptioncertificate: ConstPtr<EncryptionCertificate>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetUserFileEncryptionKey(pencryptioncertificate.rawAddress).toUInt()

public actual fun setUserFileEncryptionKeyEx(pencryptioncertificate: ConstPtr<EncryptionCertificate>, dwcapabilities: UInt, dwflags: UInt, pvreserved: ConstPtr<CVoid>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetUserFileEncryptionKeyEx(pencryptioncertificate.rawAddress, dwcapabilities.toInt(), dwflags.toInt(), pvreserved.rawAddress).toUInt()

public actual fun setVolumeLabelA(lprootpathname: Pcstr, lpvolumename: Pcstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetVolumeLabelA(lprootpathname.rawAddress, lpvolumename.rawAddress)

public actual fun setVolumeLabelW(lprootpathname: Pcwstr, lpvolumename: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetVolumeLabelW(lprootpathname.rawAddress, lpvolumename.rawAddress)

public actual fun setVolumeMountPointA(lpszvolumemountpoint: Pcstr, lpszvolumename: Pcstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetVolumeMountPointA(lpszvolumemountpoint.rawAddress, lpszvolumename.rawAddress)

public actual fun setVolumeMountPointW(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSetVolumeMountPointW(lpszvolumemountpoint.rawAddress, lpszvolumename.rawAddress)

public actual fun singlePhaseReject(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSinglePhaseReject(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun submitIoRing(ioring: Hioring, waitoperations: UInt, milliseconds: UInt, submittedentries: MutPtr<UInt>): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemSubmitIoRing(ioring.rawAddress, waitoperations.toInt(), milliseconds.toInt(), submittedentries.rawAddress)

public actual fun terminateLogArchive(pvarchivecontext: MutPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemTerminateLogArchive(pvarchivecontext.rawAddress)

public actual fun terminateReadLog(pvcursorcontext: MutPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemTerminateReadLog(pvcursorcontext.rawAddress)

public actual fun truncateLog(pvmarshal: ConstPtr<CVoid>, plsnend: ConstPtr<ClsLsn>, lpoverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemTruncateLog(pvmarshal.rawAddress, plsnend.rawAddress, lpoverlapped.rawAddress)

public actual fun txfGetThreadMiniVersionForCreate(miniversion: MutPtr<UShort>) {
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemTxfGetThreadMiniVersionForCreate(miniversion.rawAddress)
}

public actual fun txfLogCreateFileReadContext(logpath: Pcwstr, beginninglsn: ClsLsn, endinglsn: ClsLsn, txffileid: ConstPtr<TxfId>, txflogcontext: MutPtr<MutPtr<CVoid>>): Bool =
    0

public actual fun txfLogCreateRangeReadContext(logpath: Pcwstr, beginninglsn: ClsLsn, endinglsn: ClsLsn, beginningvirtualclock: ConstPtr<Long>, endingvirtualclock: ConstPtr<Long>, recordtypemask: UInt, txflogcontext: MutPtr<MutPtr<CVoid>>): Bool =
    0

public actual fun txfLogDestroyReadContext(txflogcontext: ConstPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemTxfLogDestroyReadContext(txflogcontext.rawAddress)

public actual fun txfLogReadRecords(txflogcontext: ConstPtr<CVoid>, bufferlength: UInt, buffer: MutPtr<CVoid>, bytesused: MutPtr<UInt>, recordcount: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemTxfLogReadRecords(txflogcontext.rawAddress, bufferlength.toInt(), buffer.rawAddress, bytesused.rawAddress, recordcount.rawAddress)

public actual fun txfLogRecordGetFileName(recordbuffer: ConstPtr<CVoid>, recordbufferlengthinbytes: UInt, namebuffer: Pwstr, namebufferlengthinbytes: MutPtr<UInt>, txfid: MutPtr<TxfId>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemTxfLogRecordGetFileName(recordbuffer.rawAddress, recordbufferlengthinbytes.toInt(), namebuffer.rawAddress, namebufferlengthinbytes.rawAddress, txfid.rawAddress)

public actual fun txfLogRecordGetGenericType(recordbuffer: ConstPtr<CVoid>, recordbufferlengthinbytes: UInt, generictype: MutPtr<UInt>, virtualclock: MutPtr<Long>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemTxfLogRecordGetGenericType(recordbuffer.rawAddress, recordbufferlengthinbytes.toInt(), generictype.rawAddress, virtualclock.rawAddress)

public actual fun txfReadMetadataInfo(filehandle: Handle, txffileid: MutPtr<TxfId>, lastlsn: MutPtr<ClsLsn>, transactionstate: MutPtr<UInt>, lockingtransaction: MutPtr<Guid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemTxfReadMetadataInfo(filehandle.rawAddress, txffileid.rawAddress, lastlsn.rawAddress, transactionstate.rawAddress, lockingtransaction.rawAddress)

public actual fun txfSetThreadMiniVersionForCreate(miniversion: UShort) {
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemTxfSetThreadMiniVersionForCreate(miniversion.toShort())
}

public actual fun unlockFile(hfile: Handle, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemUnlockFile(hfile.rawAddress, dwfileoffsetlow.toInt(), dwfileoffsethigh.toInt(), nnumberofbytestounlocklow.toInt(), nnumberofbytestounlockhigh.toInt())

public actual fun unlockFileEx(hfile: Handle, dwreserved: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt, lpoverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemUnlockFileEx(hfile.rawAddress, dwreserved.toInt(), nnumberofbytestounlocklow.toInt(), nnumberofbytestounlockhigh.toInt(), lpoverlapped.rawAddress)

public actual fun validateLog(pszlogfilename: Pcwstr, psalogfile: MutPtr<SecurityAttributes>, pinfobuffer: MutPtr<ClsInformation>, pcbbuffer: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemValidateLog(pszlogfilename.rawAddress, psalogfile.rawAddress, pinfobuffer.rawAddress, pcbbuffer.rawAddress)

public actual fun verFindFileA(uflags: VerFindFileFlags, szfilename: Pcstr, szwindir: Pcstr, szappdir: Pcstr, szcurdir: Pstr, pucurdirlen: MutPtr<UInt>, szdestdir: Pstr, pudestdirlen: MutPtr<UInt>): VerFindFileStatus =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemVerFindFileA(uflags.toInt(), szfilename.rawAddress, szwindir.rawAddress, szappdir.rawAddress, szcurdir.rawAddress, pucurdirlen.rawAddress, szdestdir.rawAddress, pudestdirlen.rawAddress).toUInt()

public actual fun verFindFileW(uflags: VerFindFileFlags, szfilename: Pcwstr, szwindir: Pcwstr, szappdir: Pcwstr, szcurdir: Pwstr, pucurdirlen: MutPtr<UInt>, szdestdir: Pwstr, pudestdirlen: MutPtr<UInt>): VerFindFileStatus =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemVerFindFileW(uflags.toInt(), szfilename.rawAddress, szwindir.rawAddress, szappdir.rawAddress, szcurdir.rawAddress, pucurdirlen.rawAddress, szdestdir.rawAddress, pudestdirlen.rawAddress).toUInt()

public actual fun verInstallFileA(uflags: VerInstallFileFlags, szsrcfilename: Pcstr, szdestfilename: Pcstr, szsrcdir: Pcstr, szdestdir: Pcstr, szcurdir: Pcstr, sztmpfile: Pstr, putmpfilelen: MutPtr<UInt>): VerInstallFileStatus =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemVerInstallFileA(uflags.toInt(), szsrcfilename.rawAddress, szdestfilename.rawAddress, szsrcdir.rawAddress, szdestdir.rawAddress, szcurdir.rawAddress, sztmpfile.rawAddress, putmpfilelen.rawAddress).toUInt()

public actual fun verInstallFileW(uflags: VerInstallFileFlags, szsrcfilename: Pcwstr, szdestfilename: Pcwstr, szsrcdir: Pcwstr, szdestdir: Pcwstr, szcurdir: Pcwstr, sztmpfile: Pwstr, putmpfilelen: MutPtr<UInt>): VerInstallFileStatus =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemVerInstallFileW(uflags.toInt(), szsrcfilename.rawAddress, szdestfilename.rawAddress, szsrcdir.rawAddress, szdestdir.rawAddress, szcurdir.rawAddress, sztmpfile.rawAddress, putmpfilelen.rawAddress).toUInt()

public actual fun verLanguageNameA(wlang: UInt, szlang: Pstr, cchlang: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemVerLanguageNameA(wlang.toInt(), szlang.rawAddress, cchlang.toInt()).toUInt()

public actual fun verLanguageNameW(wlang: UInt, szlang: Pwstr, cchlang: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemVerLanguageNameW(wlang.toInt(), szlang.rawAddress, cchlang.toInt()).toUInt()

public actual fun verQueryValueA(pblock: ConstPtr<CVoid>, lpsubblock: Pcstr, lplpbuffer: MutPtr<MutPtr<CVoid>>, pulen: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemVerQueryValueA(pblock.rawAddress, lpsubblock.rawAddress, lplpbuffer.rawAddress, pulen.rawAddress)

public actual fun verQueryValueW(pblock: ConstPtr<CVoid>, lpsubblock: Pcwstr, lplpbuffer: MutPtr<MutPtr<CVoid>>, pulen: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemVerQueryValueW(pblock.rawAddress, lpsubblock.rawAddress, lplpbuffer.rawAddress, pulen.rawAddress)

public actual fun wofEnumEntries(volumename: Pcwstr, provider: UInt, enumproc: WofEnumEntryProc, userdata: ConstPtr<CVoid>): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemWofEnumEntries(volumename.rawAddress, provider.toInt(), 0L, userdata.rawAddress)

public actual fun wofFileEnumFiles(volumename: Pcwstr, algorithm: UInt, enumproc: WofEnumFilesProc, userdata: ConstPtr<CVoid>): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemWofFileEnumFiles(volumename.rawAddress, algorithm.toInt(), 0L, userdata.rawAddress)

public actual fun wofGetDriverVersion(fileorvolumehandle: Handle, provider: UInt, wofversion: MutPtr<UInt>): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemWofGetDriverVersion(fileorvolumehandle.rawAddress, provider.toInt(), wofversion.rawAddress)

public actual fun wofIsExternalFile(filepath: Pcwstr, isexternalfile: MutPtr<Bool>, provider: MutPtr<UInt>, externalfileinfo: MutPtr<CVoid>, bufferlength: MutPtr<UInt>): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemWofIsExternalFile(filepath.rawAddress, isexternalfile.rawAddress, provider.rawAddress, externalfileinfo.rawAddress, bufferlength.rawAddress)

public actual fun wofSetFileDataLocation(filehandle: Handle, provider: UInt, externalfileinfo: ConstPtr<CVoid>, length: UInt): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemWofSetFileDataLocation(filehandle.rawAddress, provider.toInt(), externalfileinfo.rawAddress, length.toInt())

public actual fun wofShouldCompressBinaries(volume: Pcwstr, algorithm: MutPtr<UInt>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemWofShouldCompressBinaries(volume.rawAddress, algorithm.rawAddress)

public actual fun wofWimAddEntry(volumename: Pcwstr, wimpath: Pcwstr, wimtype: UInt, wimindex: UInt, datasourceid: MutPtr<Long>): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemWofWimAddEntry(volumename.rawAddress, wimpath.rawAddress, wimtype.toInt(), wimindex.toInt(), datasourceid.rawAddress)

public actual fun wofWimEnumFiles(volumename: Pcwstr, datasourceid: Long, enumproc: WofEnumFilesProc, userdata: ConstPtr<CVoid>): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemWofWimEnumFiles(volumename.rawAddress, datasourceid, 0L, userdata.rawAddress)

public actual fun wofWimRemoveEntry(volumename: Pcwstr, datasourceid: Long): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemWofWimRemoveEntry(volumename.rawAddress, datasourceid)

public actual fun wofWimSuspendEntry(volumename: Pcwstr, datasourceid: Long): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemWofWimSuspendEntry(volumename.rawAddress, datasourceid)

public actual fun wofWimUpdateEntry(volumename: Pcwstr, datasourceid: Long, newwimpath: Pcwstr): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemWofWimUpdateEntry(volumename.rawAddress, datasourceid, newwimpath.rawAddress)

public actual fun wow64DisableWow64FsRedirection(oldvalue: MutPtr<MutPtr<CVoid>>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemWow64DisableWow64FsRedirection(oldvalue.rawAddress)

public actual fun wow64EnableWow64FsRedirection(wow64fsenableredirection: Boolean): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemWow64EnableWow64FsRedirection(wow64fsenableredirection)

public actual fun wow64RevertWow64FsRedirection(olvalue: ConstPtr<CVoid>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemWow64RevertWow64FsRedirection(olvalue.rawAddress)

public actual fun writeEncryptedFileRaw(pfimportcallback: PfeImportFunc, pvcallbackcontext: ConstPtr<CVoid>, pvcontext: ConstPtr<CVoid>): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemWriteEncryptedFileRaw(0L, pvcallbackcontext.rawAddress, pvcontext.rawAddress).toUInt()

public actual fun writeFile(hfile: Handle, lpbuffer: ConstPtr<UByte>, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemWriteFile(hfile.rawAddress, lpbuffer.rawAddress, nnumberofbytestowrite.toInt(), lpnumberofbyteswritten.rawAddress, lpoverlapped.rawAddress)

public actual fun writeFileEx(hfile: Handle, lpbuffer: ConstPtr<UByte>, nnumberofbytestowrite: UInt, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemWriteFileEx(hfile.rawAddress, lpbuffer.rawAddress, nnumberofbytestowrite.toInt(), lpoverlapped.rawAddress, 0L)

public actual fun writeFileGather(hfile: Handle, asegmentarray: ConstPtr<FileSegmentElement>, nnumberofbytestowrite: UInt, lpreserved: ConstPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemWriteFileGather(hfile.rawAddress, asegmentarray.rawAddress, nnumberofbytestowrite.toInt(), lpreserved.rawAddress, lpoverlapped.rawAddress)

public actual fun writeLogRestartArea(pvmarshal: MutPtr<CVoid>, pvrestartbuffer: MutPtr<CVoid>, cbrestartbuffer: UInt, plsnbase: MutPtr<ClsLsn>, fflags: ClfsFlag, pcbwritten: MutPtr<UInt>, plsnnext: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemWriteLogRestartArea(pvmarshal.rawAddress, pvrestartbuffer.rawAddress, cbrestartbuffer.toInt(), plsnbase.rawAddress, fflags.toInt(), pcbwritten.rawAddress, plsnnext.rawAddress, poverlapped.rawAddress)

public actual fun writeTapemark(hdevice: Handle, dwtapemarktype: TapemarkType, dwtapemarkcount: UInt, bimmediate: Bool): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssysWindowsWin32StorageFilesystemWriteTapemark(hdevice.rawAddress, dwtapemarktype.toInt(), dwtapemarkcount.toInt(), bimmediate).toUInt()
