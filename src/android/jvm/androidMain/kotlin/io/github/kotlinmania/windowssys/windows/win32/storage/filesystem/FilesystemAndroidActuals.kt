@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32StorageFilesystemJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_addLogContainer(hlog: Long, pcbcontainer: Long, pwszcontainerpath: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_addLogContainerSet(hlog: Long, ccontainer: Short, pcbcontainer: Long, rgwszcontainerpath: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_addUsersToEncryptedFile(lpfilename: Long, pencryptioncertificates: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_advanceLogBase(pvmarshal: Long, plsnbase: Long, fflags: Int, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_alignReservedLog(pvmarshal: Long, creservedrecords: Int, rgcbreservation: Long, pcbalignreservation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_allocReservedLog(pvmarshal: Long, creservedrecords: Int, pcbadjustment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_areFileApisANSI(): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_areShortNamesEnabled(handle: Long, enabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_backupRead(hfile: Long, lpbuffer: Long, nnumberofbytestoread: Int, lpnumberofbytesread: Long, babort: Int, bprocesssecurity: Int, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_backupSeek(hfile: Long, dwlowbytestoseek: Int, dwhighbytestoseek: Int, lpdwlowbyteseeked: Long, lpdwhighbyteseeked: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_backupWrite(hfile: Long, lpbuffer: Long, nnumberofbytestowrite: Int, lpnumberofbyteswritten: Long, babort: Int, bprocesssecurity: Int, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_buildIoRingRegisterBuffers(ioring: Long, count: Int, buffers: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_buildIoRingRegisterFileHandles(ioring: Long, count: Int, handles: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_checkNameLegalDOS8Dot3A(lpname: Long, lpoemname: Long, oemnamesize: Int, pbnamecontainsspaces: Long, pbnamelegal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_checkNameLegalDOS8Dot3W(lpname: Long, lpoemname: Long, oemnamesize: Int, pbnamecontainsspaces: Long, pbnamelegal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_closeAndResetLogFile(hlog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_closeEncryptedFileRaw(pvcontext: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_closeIoRing(ioring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_commitComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_commitEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_commitTransaction(transactionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_commitTransactionAsync(transactionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_compareFileTime(lpfiletime1: Long, lpfiletime2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_copyFile2(pwszexistingfilename: Long, pwsznewfilename: Long, pextendedparameters: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_copyFileA(lpexistingfilename: Long, lpnewfilename: Long, bfailifexists: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_copyFileExA(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, pbcancel: Long, dwcopyflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_copyFileExW(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, pbcancel: Long, dwcopyflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_copyFileFromAppW(lpexistingfilename: Long, lpnewfilename: Long, bfailifexists: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_copyFileTransactedA(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, pbcancel: Long, dwcopyflags: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_copyFileTransactedW(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, pbcancel: Long, dwcopyflags: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_copyFileW(lpexistingfilename: Long, lpnewfilename: Long, bfailifexists: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_copyLZFile(hfsource: Int, hfdest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createDirectoryA(lppathname: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createDirectoryExA(lptemplatedirectory: Long, lpnewdirectory: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createDirectoryExW(lptemplatedirectory: Long, lpnewdirectory: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createDirectoryFromAppW(lppathname: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createDirectoryTransactedA(lptemplatedirectory: Long, lpnewdirectory: Long, lpsecurityattributes: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createDirectoryTransactedW(lptemplatedirectory: Long, lpnewdirectory: Long, lpsecurityattributes: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createDirectoryW(lppathname: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createEnlistment(lpenlistmentattributes: Long, resourcemanagerhandle: Long, transactionhandle: Long, notificationmask: Int, createoptions: Int, enlistmentkey: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createFile2(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, dwcreationdisposition: Int, pcreateexparams: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createFile2FromAppW(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, dwcreationdisposition: Int, pcreateexparams: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createFileA(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwcreationdisposition: Int, dwflagsandattributes: Int, htemplatefile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createFileFromAppW(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwcreationdisposition: Int, dwflagsandattributes: Int, htemplatefile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createFileTransactedA(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwcreationdisposition: Int, dwflagsandattributes: Int, htemplatefile: Long, htransaction: Long, pusminiversion: Long, lpextendedparameter: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createFileTransactedW(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwcreationdisposition: Int, dwflagsandattributes: Int, htemplatefile: Long, htransaction: Long, pusminiversion: Long, lpextendedparameter: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createFileW(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwcreationdisposition: Int, dwflagsandattributes: Int, htemplatefile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createHardLinkA(lpfilename: Long, lpexistingfilename: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createHardLinkTransactedA(lpfilename: Long, lpexistingfilename: Long, lpsecurityattributes: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createHardLinkTransactedW(lpfilename: Long, lpexistingfilename: Long, lpsecurityattributes: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createHardLinkW(lpfilename: Long, lpexistingfilename: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createLogContainerScanContext(hlog: Long, cfromcontainer: Int, ccontainers: Int, escanmode: Byte, pcxscan: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createLogFile(pszlogfilename: Long, fdesiredaccess: Int, dwsharemode: Int, psalogfile: Long, fcreatedisposition: Int, fflagsandattributes: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createLogMarshallingArea(hlog: Long, pfnallocbuffer: Long, pfnfreebuffer: Long, pvblockalloccontext: Long, cbmarshallingbuffer: Int, cmaxwritebuffers: Int, cmaxreadbuffers: Int, ppvmarshal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createResourceManager(lpresourcemanagerattributes: Long, resourcemanagerid: Long, createoptions: Int, tmhandle: Long, description: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createSymbolicLinkA(lpsymlinkfilename: Long, lptargetfilename: Long, dwflags: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createSymbolicLinkTransactedA(lpsymlinkfilename: Long, lptargetfilename: Long, dwflags: Int, htransaction: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createSymbolicLinkTransactedW(lpsymlinkfilename: Long, lptargetfilename: Long, dwflags: Int, htransaction: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createSymbolicLinkW(lpsymlinkfilename: Long, lptargetfilename: Long, dwflags: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createTapePartition(hdevice: Long, dwpartitionmethod: Int, dwcount: Int, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createTransaction(lptransactionattributes: Long, uow: Long, createoptions: Int, isolationlevel: Int, isolationflags: Int, timeout: Int, description: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_createTransactionManager(lptransactionattributes: Long, logfilename: Long, createoptions: Int, commitstrength: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_decryptFileA(lpfilename: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_decryptFileW(lpfilename: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_defineDosDeviceA(dwflags: Int, lpdevicename: Long, lptargetpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_defineDosDeviceW(dwflags: Int, lpdevicename: Long, lptargetpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_deleteFileA(lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_deleteFileFromAppW(lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_deleteFileTransactedA(lpfilename: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_deleteFileTransactedW(lpfilename: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_deleteFileW(lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_deleteLogByHandle(hlog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_deleteLogFile(pszlogfilename: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_deleteLogMarshallingArea(pvmarshal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_deleteVolumeMountPointA(lpszvolumemountpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_deleteVolumeMountPointW(lpszvolumemountpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_deregisterManageableLogClient(hlog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_duplicateEncryptionInfoFile(srcfilename: Long, dstfilename: Long, dwcreationdistribution: Int, dwattributes: Int, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_encryptFileA(lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_encryptFileW(lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_encryptionDisable(dirpath: Long, disable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_eraseTape(hdevice: Long, dwerasetype: Int, bimmediate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_fileEncryptionStatusA(lpfilename: Long, lpstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_fileEncryptionStatusW(lpfilename: Long, lpstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_fileTimeToLocalFileTime(lpfiletime: Long, lplocalfiletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findClose(hfindfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findCloseChangeNotification(hchangehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findFirstChangeNotificationA(lppathname: Long, bwatchsubtree: Int, dwnotifyfilter: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findFirstChangeNotificationW(lppathname: Long, bwatchsubtree: Int, dwnotifyfilter: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findFirstFileA(lpfilename: Long, lpfindfiledata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findFirstFileExA(lpfilename: Long, finfolevelid: Int, lpfindfiledata: Long, fsearchop: Int, lpsearchfilter: Long, dwadditionalflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findFirstFileExFromAppW(lpfilename: Long, finfolevelid: Int, lpfindfiledata: Long, fsearchop: Int, lpsearchfilter: Long, dwadditionalflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findFirstFileExW(lpfilename: Long, finfolevelid: Int, lpfindfiledata: Long, fsearchop: Int, lpsearchfilter: Long, dwadditionalflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findFirstFileNameTransactedW(lpfilename: Long, dwflags: Int, stringlength: Long, linkname: Long, htransaction: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findFirstFileNameW(lpfilename: Long, dwflags: Int, stringlength: Long, linkname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findFirstFileTransactedA(lpfilename: Long, finfolevelid: Int, lpfindfiledata: Long, fsearchop: Int, lpsearchfilter: Long, dwadditionalflags: Int, htransaction: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findFirstFileTransactedW(lpfilename: Long, finfolevelid: Int, lpfindfiledata: Long, fsearchop: Int, lpsearchfilter: Long, dwadditionalflags: Int, htransaction: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findFirstFileW(lpfilename: Long, lpfindfiledata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findFirstStreamTransactedW(lpfilename: Long, infolevel: Int, lpfindstreamdata: Long, dwflags: Int, htransaction: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findFirstStreamW(lpfilename: Long, infolevel: Int, lpfindstreamdata: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findFirstVolumeA(lpszvolumename: Long, cchbufferlength: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findFirstVolumeMountPointA(lpszrootpathname: Long, lpszvolumemountpoint: Long, cchbufferlength: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findFirstVolumeMountPointW(lpszrootpathname: Long, lpszvolumemountpoint: Long, cchbufferlength: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findFirstVolumeW(lpszvolumename: Long, cchbufferlength: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findNextChangeNotification(hchangehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findNextFileA(hfindfile: Long, lpfindfiledata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findNextFileNameW(hfindstream: Long, stringlength: Long, linkname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findNextFileW(hfindfile: Long, lpfindfiledata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findNextStreamW(hfindstream: Long, lpfindstreamdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findNextVolumeA(hfindvolume: Long, lpszvolumename: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findNextVolumeMountPointA(hfindvolumemountpoint: Long, lpszvolumemountpoint: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findNextVolumeMountPointW(hfindvolumemountpoint: Long, lpszvolumemountpoint: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findNextVolumeW(hfindvolume: Long, lpszvolumename: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findVolumeClose(hfindvolume: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_findVolumeMountPointClose(hfindvolumemountpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_flushFileBuffers(hfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_flushLogBuffers(pvmarshal: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_flushLogToLsn(pvmarshalcontext: Long, plsnflush: Long, plsnlastflushed: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_freeEncryptedFileMetadata(pbmetadata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_freeEncryptionCertificateHashList(pusers: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_freeReservedLog(pvmarshal: Long, creservedrecords: Int, pcbadjustment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getBinaryTypeA(lpapplicationname: Long, lpbinarytype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getBinaryTypeW(lpapplicationname: Long, lpbinarytype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getCompressedFileSizeA(lpfilename: Long, lpfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getCompressedFileSizeTransactedA(lpfilename: Long, lpfilesizehigh: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getCompressedFileSizeTransactedW(lpfilename: Long, lpfilesizehigh: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getCompressedFileSizeW(lpfilename: Long, lpfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getCurrentClockTransactionManager(transactionmanagerhandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceA(lprootpathname: Long, lpsectorspercluster: Long, lpbytespersector: Long, lpnumberoffreeclusters: Long, lptotalnumberofclusters: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceExA(lpdirectoryname: Long, lpfreebytesavailabletocaller: Long, lptotalnumberofbytes: Long, lptotalnumberoffreebytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceExW(lpdirectoryname: Long, lpfreebytesavailabletocaller: Long, lptotalnumberofbytes: Long, lptotalnumberoffreebytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceW(lprootpathname: Long, lpsectorspercluster: Long, lpbytespersector: Long, lpnumberoffreeclusters: Long, lptotalnumberofclusters: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getDiskSpaceInformationA(rootpath: Long, diskspaceinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getDiskSpaceInformationW(rootpath: Long, diskspaceinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getDriveTypeA(lprootpathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getDriveTypeW(lprootpathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getEncryptedFileMetadata(lpfilename: Long, pcbmetadata: Long, ppbmetadata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getEnlistmentId(enlistmenthandle: Long, enlistmentid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getEnlistmentRecoveryInformation(enlistmenthandle: Long, buffersize: Int, buffer: Long, bufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getExpandedNameA(lpszsource: Long, lpszbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getExpandedNameW(lpszsource: Long, lpszbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileAttributesA(lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileAttributesExA(lpfilename: Long, finfolevelid: Int, lpfileinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileAttributesExFromAppW(lpfilename: Long, finfolevelid: Int, lpfileinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileAttributesExW(lpfilename: Long, finfolevelid: Int, lpfileinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileAttributesTransactedA(lpfilename: Long, finfolevelid: Int, lpfileinformation: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileAttributesTransactedW(lpfilename: Long, finfolevelid: Int, lpfileinformation: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileAttributesW(lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileBandwidthReservation(hfile: Long, lpperiodmilliseconds: Long, lpbytesperperiod: Long, pdiscardable: Long, lptransfersize: Long, lpnumoutstandingrequests: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileInformationByHandle(hfile: Long, lpfileinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileInformationByHandleEx(hfile: Long, fileinformationclass: Int, lpfileinformation: Long, dwbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileSize(hfile: Long, lpfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileSizeEx(hfile: Long, lpfilesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileTime(hfile: Long, lpcreationtime: Long, lplastaccesstime: Long, lplastwritetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileType(hfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileVersionInfoA(lptstrfilename: Long, dwhandle: Int, dwlen: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileVersionInfoExA(dwflags: Int, lpwstrfilename: Long, dwhandle: Int, dwlen: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileVersionInfoExW(dwflags: Int, lpwstrfilename: Long, dwhandle: Int, dwlen: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeA(lptstrfilename: Long, lpdwhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeExA(dwflags: Int, lpwstrfilename: Long, lpdwhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeExW(dwflags: Int, lpwstrfilename: Long, lpdwhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeW(lptstrfilename: Long, lpdwhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFileVersionInfoW(lptstrfilename: Long, dwhandle: Int, dwlen: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFinalPathNameByHandleA(hfile: Long, lpszfilepath: Long, cchfilepath: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFinalPathNameByHandleW(hfile: Long, lpszfilepath: Long, cchfilepath: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFullPathNameA(lpfilename: Long, nbufferlength: Int, lpbuffer: Long, lpfilepart: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFullPathNameTransactedA(lpfilename: Long, nbufferlength: Int, lpbuffer: Long, lpfilepart: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFullPathNameTransactedW(lpfilename: Long, nbufferlength: Int, lpbuffer: Long, lpfilepart: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getFullPathNameW(lpfilename: Long, nbufferlength: Int, lpbuffer: Long, lpfilepart: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getIoRingInfo(ioring: Long, info: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getLogContainerName(hlog: Long, cidlogicalcontainer: Int, pwstrcontainername: Long, clencontainername: Int, pcactuallencontainername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getLogFileInformation(hlog: Long, pinfobuffer: Long, cbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getLogIoStatistics(hlog: Long, pvstatsbuffer: Long, cbstatsbuffer: Int, estatsclass: Int, pcbstatswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getLogReservationInfo(pvmarshal: Long, pcbrecordnumber: Long, pcbuserreservation: Long, pcbcommitreservation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getLogicalDriveStringsA(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getLogicalDriveStringsW(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getLogicalDrives(): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getLongPathNameA(lpszshortpath: Long, lpszlongpath: Long, cchbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getLongPathNameTransactedA(lpszshortpath: Long, lpszlongpath: Long, cchbuffer: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getLongPathNameTransactedW(lpszshortpath: Long, lpszlongpath: Long, cchbuffer: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getLongPathNameW(lpszshortpath: Long, lpszlongpath: Long, cchbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getNextLogArchiveExtent(pvarchivecontext: Long, rgadextent: Long, cdescriptors: Int, pcdescriptorsreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getNotificationResourceManager(resourcemanagerhandle: Long, transactionnotification: Long, notificationlength: Int, dwmilliseconds: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getNotificationResourceManagerAsync(resourcemanagerhandle: Long, transactionnotification: Long, transactionnotificationlength: Int, returnlength: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getShortPathNameA(lpszlongpath: Long, lpszshortpath: Long, cchbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getShortPathNameW(lpszlongpath: Long, lpszshortpath: Long, cchbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getTapeParameters(hdevice: Long, dwoperation: Int, lpdwsize: Long, lptapeinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getTapePosition(hdevice: Long, dwpositiontype: Int, lpdwpartition: Long, lpdwoffsetlow: Long, lpdwoffsethigh: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getTapeStatus(hdevice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getTempFileNameA(lppathname: Long, lpprefixstring: Long, uunique: Int, lptempfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getTempFileNameW(lppathname: Long, lpprefixstring: Long, uunique: Int, lptempfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getTempPath2A(bufferlength: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getTempPath2W(bufferlength: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getTempPathA(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getTempPathW(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getTransactionId(transactionhandle: Long, transactionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getTransactionInformation(transactionhandle: Long, outcome: Long, isolationlevel: Long, isolationflags: Long, timeout: Long, bufferlength: Int, description: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getTransactionManagerId(transactionmanagerhandle: Long, transactionmanagerid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getVolumeInformationA(lprootpathname: Long, lpvolumenamebuffer: Long, nvolumenamesize: Int, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: Long, nfilesystemnamesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getVolumeInformationByHandleW(hfile: Long, lpvolumenamebuffer: Long, nvolumenamesize: Int, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: Long, nfilesystemnamesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getVolumeInformationW(lprootpathname: Long, lpvolumenamebuffer: Long, nvolumenamesize: Int, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: Long, nfilesystemnamesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getVolumeNameForVolumeMountPointA(lpszvolumemountpoint: Long, lpszvolumename: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getVolumeNameForVolumeMountPointW(lpszvolumemountpoint: Long, lpszvolumename: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getVolumePathNameA(lpszfilename: Long, lpszvolumepathname: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getVolumePathNameW(lpszfilename: Long, lpszvolumepathname: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getVolumePathNamesForVolumeNameA(lpszvolumename: Long, lpszvolumepathnames: Long, cchbufferlength: Int, lpcchreturnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_getVolumePathNamesForVolumeNameW(lpszvolumename: Long, lpszvolumepathnames: Long, cchbufferlength: Int, lpcchreturnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_handleLogFull(hlog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_installLogPolicy(hlog: Long, ppolicy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_isIoRingOpSupported(ioring: Long, op: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_lZClose(hfile: Int)

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_lZCopy(hfsource: Int, hfdest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_lZDone()

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_lZInit(hfsource: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_lZOpenFileA(lpfilename: Long, lpreopenbuf: Long, wstyle: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_lZOpenFileW(lpfilename: Long, lpreopenbuf: Long, wstyle: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_lZRead(hfile: Int, lpbuffer: Long, cbread: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_lZSeek(hfile: Int, loffset: Int, iorigin: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_lZStart(): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_localFileTimeToFileTime(lplocalfiletime: Long, lpfiletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_lockFile(hfile: Long, dwfileoffsetlow: Int, dwfileoffsethigh: Int, nnumberofbytestolocklow: Int, nnumberofbytestolockhigh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_lockFileEx(hfile: Long, dwflags: Int, dwreserved: Int, nnumberofbytestolocklow: Int, nnumberofbytestolockhigh: Int, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_logTailAdvanceFailure(hlog: Long, dwreason: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_lsnBlockOffset(plsn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_lsnContainer(plsn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_lsnEqual(plsn1: Long, plsn2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_lsnGreater(plsn1: Long, plsn2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_lsnInvalid(plsn: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_lsnLess(plsn1: Long, plsn2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_lsnNull(plsn: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_lsnRecordSequence(plsn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_moveFileA(lpexistingfilename: Long, lpnewfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_moveFileExA(lpexistingfilename: Long, lpnewfilename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_moveFileExW(lpexistingfilename: Long, lpnewfilename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_moveFileFromAppW(lpexistingfilename: Long, lpnewfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_moveFileTransactedA(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, dwflags: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_moveFileTransactedW(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, dwflags: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_moveFileW(lpexistingfilename: Long, lpnewfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_moveFileWithProgressA(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_moveFileWithProgressW(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_netConnectionEnum(servername: Long, qualifier: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_netFileClose(servername: Long, fileid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_netFileEnum(servername: Long, basepath: Long, username: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_netFileGetInfo(servername: Long, fileid: Int, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_netServerAliasAdd(servername: Long, level: Int, buf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_netServerAliasDel(servername: Long, level: Int, buf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_netServerAliasEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_netSessionDel(servername: Long, uncclientname: Long, username: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_netSessionEnum(servername: Long, uncclientname: Long, username: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_netSessionGetInfo(servername: Long, uncclientname: Long, username: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_netShareAdd(servername: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_netShareCheck(servername: Long, device: Long, type: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_netShareDel(servername: Long, netname: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_netShareDelEx(servername: Long, level: Int, buf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_netShareDelSticky(servername: Long, netname: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_netShareEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_netShareEnumSticky(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumeHandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_netShareGetInfo(servername: Long, netname: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_netShareSetInfo(servername: Long, netname: Long, level: Int, buf: Long, parmErr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_netStatisticsGet(servername: Long, service: Long, level: Int, options: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_openEncryptedFileRawA(lpfilename: Long, ulflags: Int, pvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_openEncryptedFileRawW(lpfilename: Long, ulflags: Int, pvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_openEnlistment(dwdesiredaccess: Int, resourcemanagerhandle: Long, enlistmentid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_openFile(lpfilename: Long, lpreopenbuff: Long, ustyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_openFileById(hvolumehint: Long, lpfileid: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwflagsandattributes: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_openResourceManager(dwdesiredaccess: Int, tmhandle: Long, resourcemanagerid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_openTransaction(dwdesiredaccess: Int, transactionid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_openTransactionManager(logfilename: Long, desiredaccess: Int, openoptions: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_openTransactionManagerById(transactionmanagerid: Long, desiredaccess: Int, openoptions: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_popIoRingCompletion(ioring: Long, cqe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_prePrepareComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_prePrepareEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_prepareComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_prepareEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_prepareLogArchive(hlog: Long, pszbaselogfilename: Long, clen: Int, plsnlow: Long, plsnhigh: Long, pcactuallength: Long, poffbaselogfiledata: Long, pcbbaselogfilelength: Long, plsnbase: Long, plsnlast: Long, plsncurrentarchivetail: Long, ppvarchivecontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_prepareTape(hdevice: Long, dwoperation: Int, bimmediate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_queryDosDeviceA(lpdevicename: Long, lptargetpath: Long, ucchmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_queryDosDeviceW(lpdevicename: Long, lptargetpath: Long, ucchmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_queryIoRingCapabilities(capabilities: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_queryLogPolicy(hlog: Long, epolicytype: Int, ppolicybuffer: Long, pcbpolicybuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_queryRecoveryAgentsOnEncryptedFile(lpfilename: Long, precoveryagents: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_queryUsersOnEncryptedFile(lpfilename: Long, pusers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_reOpenFile(horiginalfile: Long, dwdesiredaccess: Int, dwsharemode: Int, dwflagsandattributes: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_readDirectoryChangesExW(hdirectory: Long, lpbuffer: Long, nbufferlength: Int, bwatchsubtree: Int, dwnotifyfilter: Int, lpbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: Long, readdirectorynotifyinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_readDirectoryChangesW(hdirectory: Long, lpbuffer: Long, nbufferlength: Int, bwatchsubtree: Int, dwnotifyfilter: Int, lpbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_readEncryptedFileRaw(pfexportcallback: Long, pvcallbackcontext: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_readFile(hfile: Long, lpbuffer: Long, nnumberofbytestoread: Int, lpnumberofbytesread: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_readFileEx(hfile: Long, lpbuffer: Long, nnumberofbytestoread: Int, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_readFileScatter(hfile: Long, asegmentarray: Long, nnumberofbytestoread: Int, lpreserved: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_readLogArchiveMetadata(pvarchivecontext: Long, cboffset: Int, cbbytestoread: Int, pbreadbuffer: Long, pcbbytesread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_readLogNotification(hlog: Long, pnotification: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_readLogRecord(pvmarshal: Long, plsnfirst: Long, econtextmode: Int, ppvreadbuffer: Long, pcbreadbuffer: Long, perecordtype: Long, plsnundonext: Long, plsnprevious: Long, ppvreadcontext: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_readLogRestartArea(pvmarshal: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsn: Long, ppvcontext: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_readNextLogRecord(pvreadcontext: Long, ppvbuffer: Long, pcbbuffer: Long, perecordtype: Long, plsnuser: Long, plsnundonext: Long, plsnprevious: Long, plsnrecord: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_readOnlyEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_readPreviousLogRestartArea(pvreadcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsnrestart: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_recoverEnlistment(enlistmenthandle: Long, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_recoverResourceManager(resourcemanagerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_recoverTransactionManager(transactionmanagerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_registerForLogWriteNotification(hlog: Long, cbthreshold: Int, fenable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_registerManageableLogClient(hlog: Long, pcallbacks: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_removeDirectoryA(lppathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_removeDirectoryFromAppW(lppathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_removeDirectoryTransactedA(lppathname: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_removeDirectoryTransactedW(lppathname: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_removeDirectoryW(lppathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_removeLogContainer(hlog: Long, pwszcontainerpath: Long, fforce: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_removeLogContainerSet(hlog: Long, ccontainer: Short, rgwszcontainerpath: Long, fforce: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_removeLogPolicy(hlog: Long, epolicytype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_removeUsersFromEncryptedFile(lpfilename: Long, phashes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_renameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_replaceFileA(lpreplacedfilename: Long, lpreplacementfilename: Long, lpbackupfilename: Long, dwreplaceflags: Int, lpexclude: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_replaceFileFromAppW(lpreplacedfilename: Long, lpreplacementfilename: Long, lpbackupfilename: Long, dwreplaceflags: Int, lpexclude: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_replaceFileW(lpreplacedfilename: Long, lpreplacementfilename: Long, lpbackupfilename: Long, dwreplaceflags: Int, lpexclude: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_reserveAndAppendLog(pvmarshal: Long, rgwriteentries: Long, cwriteentries: Int, plsnundonext: Long, plsnprevious: Long, creserverecords: Int, rgcbreservation: Long, fflags: Int, plsn: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_reserveAndAppendLogAligned(pvmarshal: Long, rgwriteentries: Long, cwriteentries: Int, cbentryalignment: Int, plsnundonext: Long, plsnprevious: Long, creserverecords: Int, rgcbreservation: Long, fflags: Int, plsn: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_rollbackComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_rollbackEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_rollbackTransaction(transactionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_rollbackTransactionAsync(transactionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_rollforwardTransactionManager(transactionmanagerhandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_scanLogContainers(pcxscan: Long, escanmode: Byte, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_searchPathA(lppath: Long, lpfilename: Long, lpextension: Long, nbufferlength: Int, lpbuffer: Long, lpfilepart: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_searchPathW(lppath: Long, lpfilename: Long, lpextension: Long, nbufferlength: Int, lpbuffer: Long, lpfilepart: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setEncryptedFileMetadata(lpfilename: Long, pboldmetadata: Long, pbnewmetadata: Long, pownerhash: Long, dwoperation: Int, pcertificatesadded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setEndOfFile(hfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setEndOfLog(hlog: Long, plsnend: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setEnlistmentRecoveryInformation(enlistmenthandle: Long, buffersize: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setFileApisToANSI()

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setFileApisToOEM()

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setFileAttributesA(lpfilename: Long, dwfileattributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setFileAttributesFromAppW(lpfilename: Long, dwfileattributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setFileAttributesTransactedA(lpfilename: Long, dwfileattributes: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setFileAttributesTransactedW(lpfilename: Long, dwfileattributes: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setFileAttributesW(lpfilename: Long, dwfileattributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setFileBandwidthReservation(hfile: Long, nperiodmilliseconds: Int, nbytesperperiod: Int, bdiscardable: Int, lptransfersize: Long, lpnumoutstandingrequests: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setFileCompletionNotificationModes(filehandle: Long, flags: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setFileInformationByHandle(hfile: Long, fileinformationclass: Int, lpfileinformation: Long, dwbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setFileIoOverlappedRange(filehandle: Long, overlappedrangestart: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setFilePointer(hfile: Long, ldistancetomove: Int, lpdistancetomovehigh: Long, dwmovemethod: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setFilePointerEx(hfile: Long, lidistancetomove: Long, lpnewfilepointer: Long, dwmovemethod: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setFileShortNameA(hfile: Long, lpshortname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setFileShortNameW(hfile: Long, lpshortname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setFileTime(hfile: Long, lpcreationtime: Long, lplastaccesstime: Long, lplastwritetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setFileValidData(hfile: Long, validdatalength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setIoRingCompletionEvent(ioring: Long, hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setLogArchiveMode(hlog: Long, emode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setLogArchiveTail(hlog: Long, plsnarchivetail: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setLogFileSizeWithPolicy(hlog: Long, pdesiredsize: Long, presultingsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setResourceManagerCompletionPort(resourcemanagerhandle: Long, iocompletionporthandle: Long, completionkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setSearchPathMode(flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setTapeParameters(hdevice: Long, dwoperation: Int, lptapeinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setTapePosition(hdevice: Long, dwpositionmethod: Int, dwpartition: Int, dwoffsetlow: Int, dwoffsethigh: Int, bimmediate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setTransactionInformation(transactionhandle: Long, isolationlevel: Int, isolationflags: Int, timeout: Int, description: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setUserFileEncryptionKey(pencryptioncertificate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setUserFileEncryptionKeyEx(pencryptioncertificate: Long, dwcapabilities: Int, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setVolumeLabelA(lprootpathname: Long, lpvolumename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setVolumeLabelW(lprootpathname: Long, lpvolumename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setVolumeMountPointA(lpszvolumemountpoint: Long, lpszvolumename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_setVolumeMountPointW(lpszvolumemountpoint: Long, lpszvolumename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_singlePhaseReject(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_submitIoRing(ioring: Long, waitoperations: Int, milliseconds: Int, submittedentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_terminateLogArchive(pvarchivecontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_terminateReadLog(pvcursorcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_truncateLog(pvmarshal: Long, plsnend: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_txfGetThreadMiniVersionForCreate(miniversion: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_txfLogDestroyReadContext(txflogcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_txfLogReadRecords(txflogcontext: Long, bufferlength: Int, buffer: Long, bytesused: Long, recordcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_txfLogRecordGetFileName(recordbuffer: Long, recordbufferlengthinbytes: Int, namebuffer: Long, namebufferlengthinbytes: Long, txfid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_txfLogRecordGetGenericType(recordbuffer: Long, recordbufferlengthinbytes: Int, generictype: Long, virtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_txfReadMetadataInfo(filehandle: Long, txffileid: Long, lastlsn: Long, transactionstate: Long, lockingtransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_txfSetThreadMiniVersionForCreate(miniversion: Short)

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_unlockFile(hfile: Long, dwfileoffsetlow: Int, dwfileoffsethigh: Int, nnumberofbytestounlocklow: Int, nnumberofbytestounlockhigh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_unlockFileEx(hfile: Long, dwreserved: Int, nnumberofbytestounlocklow: Int, nnumberofbytestounlockhigh: Int, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_validateLog(pszlogfilename: Long, psalogfile: Long, pinfobuffer: Long, pcbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_verFindFileA(uflags: Int, szfilename: Long, szwindir: Long, szappdir: Long, szcurdir: Long, pucurdirlen: Long, szdestdir: Long, pudestdirlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_verFindFileW(uflags: Int, szfilename: Long, szwindir: Long, szappdir: Long, szcurdir: Long, pucurdirlen: Long, szdestdir: Long, pudestdirlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_verInstallFileA(uflags: Int, szsrcfilename: Long, szdestfilename: Long, szsrcdir: Long, szdestdir: Long, szcurdir: Long, sztmpfile: Long, putmpfilelen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_verInstallFileW(uflags: Int, szsrcfilename: Long, szdestfilename: Long, szsrcdir: Long, szdestdir: Long, szcurdir: Long, sztmpfile: Long, putmpfilelen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_verLanguageNameA(wlang: Int, szlang: Long, cchlang: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_verLanguageNameW(wlang: Int, szlang: Long, cchlang: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_verQueryValueA(pblock: Long, lpsubblock: Long, lplpbuffer: Long, pulen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_verQueryValueW(pblock: Long, lpsubblock: Long, lplpbuffer: Long, pulen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_wofEnumEntries(volumename: Long, provider: Int, enumproc: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_wofFileEnumFiles(volumename: Long, algorithm: Int, enumproc: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_wofGetDriverVersion(fileorvolumehandle: Long, provider: Int, wofversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_wofIsExternalFile(filepath: Long, isexternalfile: Long, provider: Long, externalfileinfo: Long, bufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_wofSetFileDataLocation(filehandle: Long, provider: Int, externalfileinfo: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_wofShouldCompressBinaries(volume: Long, algorithm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_wofWimAddEntry(volumename: Long, wimpath: Long, wimtype: Int, wimindex: Int, datasourceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_wofWimEnumFiles(volumename: Long, datasourceid: Long, enumproc: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_wofWimRemoveEntry(volumename: Long, datasourceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_wofWimSuspendEntry(volumename: Long, datasourceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_wofWimUpdateEntry(volumename: Long, datasourceid: Long, newwimpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_wow64DisableWow64FsRedirection(oldvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_wow64EnableWow64FsRedirection(wow64fsenableredirection: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_wow64RevertWow64FsRedirection(olvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_writeEncryptedFileRaw(pfimportcallback: Long, pvcallbackcontext: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_writeFile(hfile: Long, lpbuffer: Long, nnumberofbytestowrite: Int, lpnumberofbyteswritten: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_writeFileEx(hfile: Long, lpbuffer: Long, nnumberofbytestowrite: Int, lpoverlapped: Long, lpcompletionroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_writeFileGather(hfile: Long, asegmentarray: Long, nnumberofbytestowrite: Int, lpreserved: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_writeLogRestartArea(pvmarshal: Long, pvrestartbuffer: Long, cbrestartbuffer: Int, plsnbase: Long, fflags: Int, pcbwritten: Long, plsnnext: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_writeTapemark(hdevice: Long, dwtapemarktype: Int, dwtapemarkcount: Int, bimmediate: Int): Int
}

public actual fun addLogContainer(hlog: Handle, pcbcontainer: COpaquePointer?, pwszcontainerpath: Pcwstr, preserved: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_addLogContainer((hlog?.value ?: 0L), (pcbcontainer?.value ?: 0L), (pwszcontainerpath?.value ?: 0L), (preserved?.value ?: 0L))

public actual fun addLogContainerSet(hlog: Handle, ccontainer: UShort, pcbcontainer: COpaquePointer?, rgwszcontainerpath: COpaquePointer?, preserved: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_addLogContainerSet((hlog?.value ?: 0L), ccontainer.toShort(), (pcbcontainer?.value ?: 0L), (rgwszcontainerpath?.value ?: 0L), (preserved?.value ?: 0L))

public actual fun addUsersToEncryptedFile(lpfilename: Pcwstr, pencryptioncertificates: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_addUsersToEncryptedFile((lpfilename?.value ?: 0L), (pencryptioncertificates?.value ?: 0L)).toUInt()

public actual fun advanceLogBase(pvmarshal: COpaquePointer?, plsnbase: COpaquePointer?, fflags: UInt, poverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_advanceLogBase((pvmarshal?.value ?: 0L), (plsnbase?.value ?: 0L), fflags.toInt(), (poverlapped?.value ?: 0L))

public actual fun alignReservedLog(pvmarshal: COpaquePointer?, creservedrecords: UInt, rgcbreservation: COpaquePointer?, pcbalignreservation: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_alignReservedLog((pvmarshal?.value ?: 0L), creservedrecords.toInt(), (rgcbreservation?.value ?: 0L), (pcbalignreservation?.value ?: 0L))

public actual fun allocReservedLog(pvmarshal: COpaquePointer?, creservedrecords: UInt, pcbadjustment: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_allocReservedLog((pvmarshal?.value ?: 0L), creservedrecords.toInt(), (pcbadjustment?.value ?: 0L))

public actual fun areFileApisANSI(): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_areFileApisANSI()

public actual fun areShortNamesEnabled(handle: Handle, enabled: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_areShortNamesEnabled((handle?.value ?: 0L), (enabled?.value ?: 0L))

public actual fun backupRead(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, lpnumberofbytesread: COpaquePointer?, babort: Bool, bprocesssecurity: Bool, lpcontext: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_backupRead((hfile?.value ?: 0L), (lpbuffer?.value ?: 0L), nnumberofbytestoread.toInt(), (lpnumberofbytesread?.value ?: 0L), babort, bprocesssecurity, (lpcontext?.value ?: 0L))

public actual fun backupSeek(hfile: Handle, dwlowbytestoseek: UInt, dwhighbytestoseek: UInt, lpdwlowbyteseeked: COpaquePointer?, lpdwhighbyteseeked: COpaquePointer?, lpcontext: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_backupSeek((hfile?.value ?: 0L), dwlowbytestoseek.toInt(), dwhighbytestoseek.toInt(), (lpdwlowbyteseeked?.value ?: 0L), (lpdwhighbyteseeked?.value ?: 0L), (lpcontext?.value ?: 0L))

public actual fun backupWrite(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: COpaquePointer?, babort: Bool, bprocesssecurity: Bool, lpcontext: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_backupWrite((hfile?.value ?: 0L), (lpbuffer?.value ?: 0L), nnumberofbytestowrite.toInt(), (lpnumberofbyteswritten?.value ?: 0L), babort, bprocesssecurity, (lpcontext?.value ?: 0L))

public actual fun buildIoRingCancelRequest(ioring: Hioring, file: IoringHandleRef, optocancel: ULong, userdata: ULong): Hresult =
    0

public actual fun buildIoRingFlushFile(ioring: Hioring, fileref: IoringHandleRef, flushmode: FileFlushMode, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    0

public actual fun buildIoRingReadFile(ioring: Hioring, fileref: IoringHandleRef, dataref: IoringBufferRef, numberofbytestoread: UInt, fileoffset: ULong, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    0

public actual fun buildIoRingRegisterBuffers(ioring: Hioring, count: UInt, buffers: COpaquePointer?, userdata: ULong): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_buildIoRingRegisterBuffers((ioring?.value ?: 0L), count.toInt(), (buffers?.value ?: 0L), userdata.toLong())

public actual fun buildIoRingRegisterFileHandles(ioring: Hioring, count: UInt, handles: COpaquePointer?, userdata: ULong): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_buildIoRingRegisterFileHandles((ioring?.value ?: 0L), count.toInt(), (handles?.value ?: 0L), userdata.toLong())

public actual fun buildIoRingWriteFile(ioring: Hioring, fileref: IoringHandleRef, bufferref: IoringBufferRef, numberofbytestowrite: UInt, fileoffset: ULong, writeflags: FileWriteFlags, userdata: ULong, sqeflags: IoringSqeFlags): Hresult =
    0

public actual fun checkNameLegalDOS8Dot3A(lpname: Pcstr, lpoemname: Pstr, oemnamesize: UInt, pbnamecontainsspaces: COpaquePointer?, pbnamelegal: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_checkNameLegalDOS8Dot3A((lpname?.value ?: 0L), (lpoemname?.value ?: 0L), oemnamesize.toInt(), (pbnamecontainsspaces?.value ?: 0L), (pbnamelegal?.value ?: 0L))

public actual fun checkNameLegalDOS8Dot3W(lpname: Pcwstr, lpoemname: Pstr, oemnamesize: UInt, pbnamecontainsspaces: COpaquePointer?, pbnamelegal: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_checkNameLegalDOS8Dot3W((lpname?.value ?: 0L), (lpoemname?.value ?: 0L), oemnamesize.toInt(), (pbnamecontainsspaces?.value ?: 0L), (pbnamelegal?.value ?: 0L))

public actual fun closeAndResetLogFile(hlog: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_closeAndResetLogFile((hlog?.value ?: 0L))

public actual fun closeEncryptedFileRaw(pvcontext: COpaquePointer?) {
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_closeEncryptedFileRaw((pvcontext?.value ?: 0L))
}

public actual fun closeIoRing(ioring: Hioring): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_closeIoRing((ioring?.value ?: 0L))

public actual fun commitComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_commitComplete((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun commitEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_commitEnlistment((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun commitTransaction(transactionhandle: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_commitTransaction((transactionhandle?.value ?: 0L))

public actual fun commitTransactionAsync(transactionhandle: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_commitTransactionAsync((transactionhandle?.value ?: 0L))

public actual fun compareFileTime(lpfiletime1: COpaquePointer?, lpfiletime2: COpaquePointer?): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_compareFileTime((lpfiletime1?.value ?: 0L), (lpfiletime2?.value ?: 0L))

public actual fun copyFile2(pwszexistingfilename: Pcwstr, pwsznewfilename: Pcwstr, pextendedparameters: COpaquePointer?): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_copyFile2((pwszexistingfilename?.value ?: 0L), (pwsznewfilename?.value ?: 0L), (pextendedparameters?.value ?: 0L))

public actual fun copyFileA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, bfailifexists: Bool): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_copyFileA((lpexistingfilename?.value ?: 0L), (lpnewfilename?.value ?: 0L), bfailifexists)

public actual fun copyFileExA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, pbcancel: COpaquePointer?, dwcopyflags: CopyfileFlags): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_copyFileExA((lpexistingfilename?.value ?: 0L), (lpnewfilename?.value ?: 0L), 0L, (lpdata?.value ?: 0L), (pbcancel?.value ?: 0L), dwcopyflags.toInt())

public actual fun copyFileExW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, pbcancel: COpaquePointer?, dwcopyflags: CopyfileFlags): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_copyFileExW((lpexistingfilename?.value ?: 0L), (lpnewfilename?.value ?: 0L), 0L, (lpdata?.value ?: 0L), (pbcancel?.value ?: 0L), dwcopyflags.toInt())

public actual fun copyFileFromAppW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, bfailifexists: Bool): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_copyFileFromAppW((lpexistingfilename?.value ?: 0L), (lpnewfilename?.value ?: 0L), bfailifexists)

public actual fun copyFileTransactedA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, pbcancel: COpaquePointer?, dwcopyflags: UInt, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_copyFileTransactedA((lpexistingfilename?.value ?: 0L), (lpnewfilename?.value ?: 0L), 0L, (lpdata?.value ?: 0L), (pbcancel?.value ?: 0L), dwcopyflags.toInt(), (htransaction?.value ?: 0L))

public actual fun copyFileTransactedW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, pbcancel: COpaquePointer?, dwcopyflags: UInt, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_copyFileTransactedW((lpexistingfilename?.value ?: 0L), (lpnewfilename?.value ?: 0L), 0L, (lpdata?.value ?: 0L), (pbcancel?.value ?: 0L), dwcopyflags.toInt(), (htransaction?.value ?: 0L))

public actual fun copyFileW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, bfailifexists: Bool): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_copyFileW((lpexistingfilename?.value ?: 0L), (lpnewfilename?.value ?: 0L), bfailifexists)

public actual fun copyLZFile(hfsource: Int, hfdest: Int): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_copyLZFile(hfsource, hfdest)

public actual fun createDirectoryA(lppathname: Pcstr, lpsecurityattributes: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createDirectoryA((lppathname?.value ?: 0L), (lpsecurityattributes?.value ?: 0L))

public actual fun createDirectoryExA(lptemplatedirectory: Pcstr, lpnewdirectory: Pcstr, lpsecurityattributes: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createDirectoryExA((lptemplatedirectory?.value ?: 0L), (lpnewdirectory?.value ?: 0L), (lpsecurityattributes?.value ?: 0L))

public actual fun createDirectoryExW(lptemplatedirectory: Pcwstr, lpnewdirectory: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createDirectoryExW((lptemplatedirectory?.value ?: 0L), (lpnewdirectory?.value ?: 0L), (lpsecurityattributes?.value ?: 0L))

public actual fun createDirectoryFromAppW(lppathname: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createDirectoryFromAppW((lppathname?.value ?: 0L), (lpsecurityattributes?.value ?: 0L))

public actual fun createDirectoryTransactedA(lptemplatedirectory: Pcstr, lpnewdirectory: Pcstr, lpsecurityattributes: COpaquePointer?, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createDirectoryTransactedA((lptemplatedirectory?.value ?: 0L), (lpnewdirectory?.value ?: 0L), (lpsecurityattributes?.value ?: 0L), (htransaction?.value ?: 0L))

public actual fun createDirectoryTransactedW(lptemplatedirectory: Pcwstr, lpnewdirectory: Pcwstr, lpsecurityattributes: COpaquePointer?, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createDirectoryTransactedW((lptemplatedirectory?.value ?: 0L), (lpnewdirectory?.value ?: 0L), (lpsecurityattributes?.value ?: 0L), (htransaction?.value ?: 0L))

public actual fun createDirectoryW(lppathname: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createDirectoryW((lppathname?.value ?: 0L), (lpsecurityattributes?.value ?: 0L))

public actual fun createEnlistment(lpenlistmentattributes: COpaquePointer?, resourcemanagerhandle: Handle, transactionhandle: Handle, notificationmask: UInt, createoptions: UInt, enlistmentkey: COpaquePointer?): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createEnlistment((lpenlistmentattributes?.value ?: 0L), (resourcemanagerhandle?.value ?: 0L), (transactionhandle?.value ?: 0L), notificationmask.toInt(), createoptions.toInt(), (enlistmentkey?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createFile2(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, dwcreationdisposition: FileCreationDisposition, pcreateexparams: COpaquePointer?): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createFile2((lpfilename?.value ?: 0L), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationdisposition.toInt(), (pcreateexparams?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createFile2FromAppW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationdisposition: UInt, pcreateexparams: COpaquePointer?): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createFile2FromAppW((lpfilename?.value ?: 0L), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationdisposition.toInt(), (pcreateexparams?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createFileA(lpfilename: Pcstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createFileA((lpfilename?.value ?: 0L), dwdesiredaccess.toInt(), dwsharemode.toInt(), (lpsecurityattributes?.value ?: 0L), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), (htemplatefile?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createFileFromAppW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createFileFromAppW((lpfilename?.value ?: 0L), dwdesiredaccess.toInt(), dwsharemode.toInt(), (lpsecurityattributes?.value ?: 0L), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), (htemplatefile?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createFileTransactedA(lpfilename: Pcstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle, htransaction: Handle, pusminiversion: COpaquePointer?, lpextendedparameter: COpaquePointer?): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createFileTransactedA((lpfilename?.value ?: 0L), dwdesiredaccess.toInt(), dwsharemode.toInt(), (lpsecurityattributes?.value ?: 0L), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), (htemplatefile?.value ?: 0L), (htransaction?.value ?: 0L), (pusminiversion?.value ?: 0L), (lpextendedparameter?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createFileTransactedW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle, htransaction: Handle, pusminiversion: COpaquePointer?, lpextendedparameter: COpaquePointer?): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createFileTransactedW((lpfilename?.value ?: 0L), dwdesiredaccess.toInt(), dwsharemode.toInt(), (lpsecurityattributes?.value ?: 0L), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), (htemplatefile?.value ?: 0L), (htransaction?.value ?: 0L), (pusminiversion?.value ?: 0L), (lpextendedparameter?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createFileW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createFileW((lpfilename?.value ?: 0L), dwdesiredaccess.toInt(), dwsharemode.toInt(), (lpsecurityattributes?.value ?: 0L), dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), (htemplatefile?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createHardLinkA(lpfilename: Pcstr, lpexistingfilename: Pcstr, lpsecurityattributes: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createHardLinkA((lpfilename?.value ?: 0L), (lpexistingfilename?.value ?: 0L), (lpsecurityattributes?.value ?: 0L))

public actual fun createHardLinkTransactedA(lpfilename: Pcstr, lpexistingfilename: Pcstr, lpsecurityattributes: COpaquePointer?, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createHardLinkTransactedA((lpfilename?.value ?: 0L), (lpexistingfilename?.value ?: 0L), (lpsecurityattributes?.value ?: 0L), (htransaction?.value ?: 0L))

public actual fun createHardLinkTransactedW(lpfilename: Pcwstr, lpexistingfilename: Pcwstr, lpsecurityattributes: COpaquePointer?, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createHardLinkTransactedW((lpfilename?.value ?: 0L), (lpexistingfilename?.value ?: 0L), (lpsecurityattributes?.value ?: 0L), (htransaction?.value ?: 0L))

public actual fun createHardLinkW(lpfilename: Pcwstr, lpexistingfilename: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createHardLinkW((lpfilename?.value ?: 0L), (lpexistingfilename?.value ?: 0L), (lpsecurityattributes?.value ?: 0L))

public actual fun createIoRing(ioringversion: IoringVersion, flags: IoringCreateFlags, submissionqueuesize: UInt, completionqueuesize: UInt, h: COpaquePointer?): Hresult =
    0

public actual fun createLogContainerScanContext(hlog: Handle, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createLogContainerScanContext((hlog?.value ?: 0L), cfromcontainer.toInt(), ccontainers.toInt(), escanmode.toByte(), (pcxscan?.value ?: 0L), (poverlapped?.value ?: 0L))

public actual fun createLogFile(pszlogfilename: Pcwstr, fdesiredaccess: UInt, dwsharemode: FileShareMode, psalogfile: COpaquePointer?, fcreatedisposition: FileCreationDisposition, fflagsandattributes: FileFlagsAndAttributes): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createLogFile((pszlogfilename?.value ?: 0L), fdesiredaccess.toInt(), dwsharemode.toInt(), (psalogfile?.value ?: 0L), fcreatedisposition.toInt(), fflagsandattributes.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createLogMarshallingArea(hlog: Handle, pfnallocbuffer: ClfsBlockAllocation, pfnfreebuffer: ClfsBlockDeallocation, pvblockalloccontext: COpaquePointer?, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshal: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createLogMarshallingArea((hlog?.value ?: 0L), 0L, 0L, (pvblockalloccontext?.value ?: 0L), cbmarshallingbuffer.toInt(), cmaxwritebuffers.toInt(), cmaxreadbuffers.toInt(), (ppvmarshal?.value ?: 0L))

public actual fun createResourceManager(lpresourcemanagerattributes: COpaquePointer?, resourcemanagerid: COpaquePointer?, createoptions: UInt, tmhandle: Handle, description: Pcwstr): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createResourceManager((lpresourcemanagerattributes?.value ?: 0L), (resourcemanagerid?.value ?: 0L), createoptions.toInt(), (tmhandle?.value ?: 0L), (description?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createSymbolicLinkA(lpsymlinkfilename: Pcstr, lptargetfilename: Pcstr, dwflags: SymbolicLinkFlags): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createSymbolicLinkA((lpsymlinkfilename?.value ?: 0L), (lptargetfilename?.value ?: 0L), dwflags.toInt())

public actual fun createSymbolicLinkTransactedA(lpsymlinkfilename: Pcstr, lptargetfilename: Pcstr, dwflags: SymbolicLinkFlags, htransaction: Handle): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createSymbolicLinkTransactedA((lpsymlinkfilename?.value ?: 0L), (lptargetfilename?.value ?: 0L), dwflags.toInt(), (htransaction?.value ?: 0L))

public actual fun createSymbolicLinkTransactedW(lpsymlinkfilename: Pcwstr, lptargetfilename: Pcwstr, dwflags: SymbolicLinkFlags, htransaction: Handle): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createSymbolicLinkTransactedW((lpsymlinkfilename?.value ?: 0L), (lptargetfilename?.value ?: 0L), dwflags.toInt(), (htransaction?.value ?: 0L))

public actual fun createSymbolicLinkW(lpsymlinkfilename: Pcwstr, lptargetfilename: Pcwstr, dwflags: SymbolicLinkFlags): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createSymbolicLinkW((lpsymlinkfilename?.value ?: 0L), (lptargetfilename?.value ?: 0L), dwflags.toInt())

public actual fun createTapePartition(hdevice: Handle, dwpartitionmethod: CreateTapePartitionMethod, dwcount: UInt, dwsize: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createTapePartition((hdevice?.value ?: 0L), dwpartitionmethod.toInt(), dwcount.toInt(), dwsize.toInt()).toUInt()

public actual fun createTransaction(lptransactionattributes: COpaquePointer?, uow: COpaquePointer?, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: Pcwstr): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createTransaction((lptransactionattributes?.value ?: 0L), (uow?.value ?: 0L), createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), timeout.toInt(), (description?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createTransactionManager(lptransactionattributes: COpaquePointer?, logfilename: Pcwstr, createoptions: UInt, commitstrength: UInt): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_createTransactionManager((lptransactionattributes?.value ?: 0L), (logfilename?.value ?: 0L), createoptions.toInt(), commitstrength.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun decryptFileA(lpfilename: Pcstr, dwreserved: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_decryptFileA((lpfilename?.value ?: 0L), dwreserved.toInt())

public actual fun decryptFileW(lpfilename: Pcwstr, dwreserved: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_decryptFileW((lpfilename?.value ?: 0L), dwreserved.toInt())

public actual fun defineDosDeviceA(dwflags: DefineDosDeviceFlags, lpdevicename: Pcstr, lptargetpath: Pcstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_defineDosDeviceA(dwflags.toInt(), (lpdevicename?.value ?: 0L), (lptargetpath?.value ?: 0L))

public actual fun defineDosDeviceW(dwflags: DefineDosDeviceFlags, lpdevicename: Pcwstr, lptargetpath: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_defineDosDeviceW(dwflags.toInt(), (lpdevicename?.value ?: 0L), (lptargetpath?.value ?: 0L))

public actual fun deleteFileA(lpfilename: Pcstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_deleteFileA((lpfilename?.value ?: 0L))

public actual fun deleteFileFromAppW(lpfilename: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_deleteFileFromAppW((lpfilename?.value ?: 0L))

public actual fun deleteFileTransactedA(lpfilename: Pcstr, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_deleteFileTransactedA((lpfilename?.value ?: 0L), (htransaction?.value ?: 0L))

public actual fun deleteFileTransactedW(lpfilename: Pcwstr, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_deleteFileTransactedW((lpfilename?.value ?: 0L), (htransaction?.value ?: 0L))

public actual fun deleteFileW(lpfilename: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_deleteFileW((lpfilename?.value ?: 0L))

public actual fun deleteLogByHandle(hlog: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_deleteLogByHandle((hlog?.value ?: 0L))

public actual fun deleteLogFile(pszlogfilename: Pcwstr, pvreserved: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_deleteLogFile((pszlogfilename?.value ?: 0L), (pvreserved?.value ?: 0L))

public actual fun deleteLogMarshallingArea(pvmarshal: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_deleteLogMarshallingArea((pvmarshal?.value ?: 0L))

public actual fun deleteVolumeMountPointA(lpszvolumemountpoint: Pcstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_deleteVolumeMountPointA((lpszvolumemountpoint?.value ?: 0L))

public actual fun deleteVolumeMountPointW(lpszvolumemountpoint: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_deleteVolumeMountPointW((lpszvolumemountpoint?.value ?: 0L))

public actual fun deregisterManageableLogClient(hlog: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_deregisterManageableLogClient((hlog?.value ?: 0L))

public actual fun duplicateEncryptionInfoFile(srcfilename: Pcwstr, dstfilename: Pcwstr, dwcreationdistribution: UInt, dwattributes: UInt, lpsecurityattributes: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_duplicateEncryptionInfoFile((srcfilename?.value ?: 0L), (dstfilename?.value ?: 0L), dwcreationdistribution.toInt(), dwattributes.toInt(), (lpsecurityattributes?.value ?: 0L)).toUInt()

public actual fun encryptFileA(lpfilename: Pcstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_encryptFileA((lpfilename?.value ?: 0L))

public actual fun encryptFileW(lpfilename: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_encryptFileW((lpfilename?.value ?: 0L))

public actual fun encryptionDisable(dirpath: Pcwstr, disable: Bool): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_encryptionDisable((dirpath?.value ?: 0L), disable)

public actual fun eraseTape(hdevice: Handle, dwerasetype: EraseTapeType, bimmediate: Bool): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_eraseTape((hdevice?.value ?: 0L), dwerasetype.toInt(), bimmediate).toUInt()

public actual fun fileEncryptionStatusA(lpfilename: Pcstr, lpstatus: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_fileEncryptionStatusA((lpfilename?.value ?: 0L), (lpstatus?.value ?: 0L))

public actual fun fileEncryptionStatusW(lpfilename: Pcwstr, lpstatus: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_fileEncryptionStatusW((lpfilename?.value ?: 0L), (lpstatus?.value ?: 0L))

public actual fun fileTimeToLocalFileTime(lpfiletime: COpaquePointer?, lplocalfiletime: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_fileTimeToLocalFileTime((lpfiletime?.value ?: 0L), (lplocalfiletime?.value ?: 0L))

public actual fun findClose(hfindfile: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findClose((hfindfile?.value ?: 0L))

public actual fun findCloseChangeNotification(hchangehandle: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findCloseChangeNotification((hchangehandle?.value ?: 0L))

public actual fun findFirstChangeNotificationA(lppathname: Pcstr, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findFirstChangeNotificationA((lppathname?.value ?: 0L), bwatchsubtree, dwnotifyfilter.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstChangeNotificationW(lppathname: Pcwstr, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findFirstChangeNotificationW((lppathname?.value ?: 0L), bwatchsubtree, dwnotifyfilter.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstFileA(lpfilename: Pcstr, lpfindfiledata: COpaquePointer?): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findFirstFileA((lpfilename?.value ?: 0L), (lpfindfiledata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstFileExA(lpfilename: Pcstr, finfolevelid: FindexInfoLevels, lpfindfiledata: COpaquePointer?, fsearchop: FindexSearchOps, lpsearchfilter: COpaquePointer?, dwadditionalflags: FindFirstExFlags): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findFirstFileExA((lpfilename?.value ?: 0L), finfolevelid, (lpfindfiledata?.value ?: 0L), fsearchop, (lpsearchfilter?.value ?: 0L), dwadditionalflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstFileExFromAppW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: COpaquePointer?, fsearchop: FindexSearchOps, lpsearchfilter: COpaquePointer?, dwadditionalflags: UInt): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findFirstFileExFromAppW((lpfilename?.value ?: 0L), finfolevelid, (lpfindfiledata?.value ?: 0L), fsearchop, (lpsearchfilter?.value ?: 0L), dwadditionalflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstFileExW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: COpaquePointer?, fsearchop: FindexSearchOps, lpsearchfilter: COpaquePointer?, dwadditionalflags: FindFirstExFlags): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findFirstFileExW((lpfilename?.value ?: 0L), finfolevelid, (lpfindfiledata?.value ?: 0L), fsearchop, (lpsearchfilter?.value ?: 0L), dwadditionalflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstFileNameTransactedW(lpfilename: Pcwstr, dwflags: UInt, stringlength: COpaquePointer?, linkname: Pwstr, htransaction: Handle): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findFirstFileNameTransactedW((lpfilename?.value ?: 0L), dwflags.toInt(), (stringlength?.value ?: 0L), (linkname?.value ?: 0L), (htransaction?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstFileNameW(lpfilename: Pcwstr, dwflags: UInt, stringlength: COpaquePointer?, linkname: Pwstr): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findFirstFileNameW((lpfilename?.value ?: 0L), dwflags.toInt(), (stringlength?.value ?: 0L), (linkname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstFileTransactedA(lpfilename: Pcstr, finfolevelid: FindexInfoLevels, lpfindfiledata: COpaquePointer?, fsearchop: FindexSearchOps, lpsearchfilter: COpaquePointer?, dwadditionalflags: UInt, htransaction: Handle): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findFirstFileTransactedA((lpfilename?.value ?: 0L), finfolevelid, (lpfindfiledata?.value ?: 0L), fsearchop, (lpsearchfilter?.value ?: 0L), dwadditionalflags.toInt(), (htransaction?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstFileTransactedW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: COpaquePointer?, fsearchop: FindexSearchOps, lpsearchfilter: COpaquePointer?, dwadditionalflags: UInt, htransaction: Handle): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findFirstFileTransactedW((lpfilename?.value ?: 0L), finfolevelid, (lpfindfiledata?.value ?: 0L), fsearchop, (lpsearchfilter?.value ?: 0L), dwadditionalflags.toInt(), (htransaction?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstFileW(lpfilename: Pcwstr, lpfindfiledata: COpaquePointer?): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findFirstFileW((lpfilename?.value ?: 0L), (lpfindfiledata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstStreamTransactedW(lpfilename: Pcwstr, infolevel: StreamInfoLevels, lpfindstreamdata: COpaquePointer?, dwflags: UInt, htransaction: Handle): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findFirstStreamTransactedW((lpfilename?.value ?: 0L), infolevel, (lpfindstreamdata?.value ?: 0L), dwflags.toInt(), (htransaction?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstStreamW(lpfilename: Pcwstr, infolevel: StreamInfoLevels, lpfindstreamdata: COpaquePointer?, dwflags: UInt): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findFirstStreamW((lpfilename?.value ?: 0L), infolevel, (lpfindstreamdata?.value ?: 0L), dwflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstVolumeA(lpszvolumename: Pstr, cchbufferlength: UInt): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findFirstVolumeA((lpszvolumename?.value ?: 0L), cchbufferlength.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstVolumeMountPointA(lpszrootpathname: Pcstr, lpszvolumemountpoint: Pstr, cchbufferlength: UInt): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findFirstVolumeMountPointA((lpszrootpathname?.value ?: 0L), (lpszvolumemountpoint?.value ?: 0L), cchbufferlength.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstVolumeMountPointW(lpszrootpathname: Pcwstr, lpszvolumemountpoint: Pwstr, cchbufferlength: UInt): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findFirstVolumeMountPointW((lpszrootpathname?.value ?: 0L), (lpszvolumemountpoint?.value ?: 0L), cchbufferlength.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findFirstVolumeW(lpszvolumename: Pwstr, cchbufferlength: UInt): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findFirstVolumeW((lpszvolumename?.value ?: 0L), cchbufferlength.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun findNextChangeNotification(hchangehandle: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findNextChangeNotification((hchangehandle?.value ?: 0L))

public actual fun findNextFileA(hfindfile: Handle, lpfindfiledata: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findNextFileA((hfindfile?.value ?: 0L), (lpfindfiledata?.value ?: 0L))

public actual fun findNextFileNameW(hfindstream: Handle, stringlength: COpaquePointer?, linkname: Pwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findNextFileNameW((hfindstream?.value ?: 0L), (stringlength?.value ?: 0L), (linkname?.value ?: 0L))

public actual fun findNextFileW(hfindfile: Handle, lpfindfiledata: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findNextFileW((hfindfile?.value ?: 0L), (lpfindfiledata?.value ?: 0L))

public actual fun findNextStreamW(hfindstream: Handle, lpfindstreamdata: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findNextStreamW((hfindstream?.value ?: 0L), (lpfindstreamdata?.value ?: 0L))

public actual fun findNextVolumeA(hfindvolume: Handle, lpszvolumename: Pstr, cchbufferlength: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findNextVolumeA((hfindvolume?.value ?: 0L), (lpszvolumename?.value ?: 0L), cchbufferlength.toInt())

public actual fun findNextVolumeMountPointA(hfindvolumemountpoint: Handle, lpszvolumemountpoint: Pstr, cchbufferlength: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findNextVolumeMountPointA((hfindvolumemountpoint?.value ?: 0L), (lpszvolumemountpoint?.value ?: 0L), cchbufferlength.toInt())

public actual fun findNextVolumeMountPointW(hfindvolumemountpoint: Handle, lpszvolumemountpoint: Pwstr, cchbufferlength: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findNextVolumeMountPointW((hfindvolumemountpoint?.value ?: 0L), (lpszvolumemountpoint?.value ?: 0L), cchbufferlength.toInt())

public actual fun findNextVolumeW(hfindvolume: Handle, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findNextVolumeW((hfindvolume?.value ?: 0L), (lpszvolumename?.value ?: 0L), cchbufferlength.toInt())

public actual fun findVolumeClose(hfindvolume: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findVolumeClose((hfindvolume?.value ?: 0L))

public actual fun findVolumeMountPointClose(hfindvolumemountpoint: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_findVolumeMountPointClose((hfindvolumemountpoint?.value ?: 0L))

public actual fun flushFileBuffers(hfile: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_flushFileBuffers((hfile?.value ?: 0L))

public actual fun flushLogBuffers(pvmarshal: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_flushLogBuffers((pvmarshal?.value ?: 0L), (poverlapped?.value ?: 0L))

public actual fun flushLogToLsn(pvmarshalcontext: COpaquePointer?, plsnflush: COpaquePointer?, plsnlastflushed: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_flushLogToLsn((pvmarshalcontext?.value ?: 0L), (plsnflush?.value ?: 0L), (plsnlastflushed?.value ?: 0L), (poverlapped?.value ?: 0L))

public actual fun freeEncryptedFileMetadata(pbmetadata: COpaquePointer?) {
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_freeEncryptedFileMetadata((pbmetadata?.value ?: 0L))
}

public actual fun freeEncryptionCertificateHashList(pusers: COpaquePointer?) {
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_freeEncryptionCertificateHashList((pusers?.value ?: 0L))
}

public actual fun freeReservedLog(pvmarshal: COpaquePointer?, creservedrecords: UInt, pcbadjustment: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_freeReservedLog((pvmarshal?.value ?: 0L), creservedrecords.toInt(), (pcbadjustment?.value ?: 0L))

public actual fun getBinaryTypeA(lpapplicationname: Pcstr, lpbinarytype: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getBinaryTypeA((lpapplicationname?.value ?: 0L), (lpbinarytype?.value ?: 0L))

public actual fun getBinaryTypeW(lpapplicationname: Pcwstr, lpbinarytype: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getBinaryTypeW((lpapplicationname?.value ?: 0L), (lpbinarytype?.value ?: 0L))

public actual fun getCompressedFileSizeA(lpfilename: Pcstr, lpfilesizehigh: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getCompressedFileSizeA((lpfilename?.value ?: 0L), (lpfilesizehigh?.value ?: 0L)).toUInt()

public actual fun getCompressedFileSizeTransactedA(lpfilename: Pcstr, lpfilesizehigh: COpaquePointer?, htransaction: Handle): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getCompressedFileSizeTransactedA((lpfilename?.value ?: 0L), (lpfilesizehigh?.value ?: 0L), (htransaction?.value ?: 0L)).toUInt()

public actual fun getCompressedFileSizeTransactedW(lpfilename: Pcwstr, lpfilesizehigh: COpaquePointer?, htransaction: Handle): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getCompressedFileSizeTransactedW((lpfilename?.value ?: 0L), (lpfilesizehigh?.value ?: 0L), (htransaction?.value ?: 0L)).toUInt()

public actual fun getCompressedFileSizeW(lpfilename: Pcwstr, lpfilesizehigh: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getCompressedFileSizeW((lpfilename?.value ?: 0L), (lpfilesizehigh?.value ?: 0L)).toUInt()

public actual fun getCurrentClockTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getCurrentClockTransactionManager((transactionmanagerhandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun getDiskFreeSpaceA(lprootpathname: Pcstr, lpsectorspercluster: COpaquePointer?, lpbytespersector: COpaquePointer?, lpnumberoffreeclusters: COpaquePointer?, lptotalnumberofclusters: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceA((lprootpathname?.value ?: 0L), (lpsectorspercluster?.value ?: 0L), (lpbytespersector?.value ?: 0L), (lpnumberoffreeclusters?.value ?: 0L), (lptotalnumberofclusters?.value ?: 0L))

public actual fun getDiskFreeSpaceExA(lpdirectoryname: Pcstr, lpfreebytesavailabletocaller: COpaquePointer?, lptotalnumberofbytes: COpaquePointer?, lptotalnumberoffreebytes: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceExA((lpdirectoryname?.value ?: 0L), (lpfreebytesavailabletocaller?.value ?: 0L), (lptotalnumberofbytes?.value ?: 0L), (lptotalnumberoffreebytes?.value ?: 0L))

public actual fun getDiskFreeSpaceExW(lpdirectoryname: Pcwstr, lpfreebytesavailabletocaller: COpaquePointer?, lptotalnumberofbytes: COpaquePointer?, lptotalnumberoffreebytes: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceExW((lpdirectoryname?.value ?: 0L), (lpfreebytesavailabletocaller?.value ?: 0L), (lptotalnumberofbytes?.value ?: 0L), (lptotalnumberoffreebytes?.value ?: 0L))

public actual fun getDiskFreeSpaceW(lprootpathname: Pcwstr, lpsectorspercluster: COpaquePointer?, lpbytespersector: COpaquePointer?, lpnumberoffreeclusters: COpaquePointer?, lptotalnumberofclusters: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getDiskFreeSpaceW((lprootpathname?.value ?: 0L), (lpsectorspercluster?.value ?: 0L), (lpbytespersector?.value ?: 0L), (lpnumberoffreeclusters?.value ?: 0L), (lptotalnumberofclusters?.value ?: 0L))

public actual fun getDiskSpaceInformationA(rootpath: Pcstr, diskspaceinfo: COpaquePointer?): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getDiskSpaceInformationA((rootpath?.value ?: 0L), (diskspaceinfo?.value ?: 0L))

public actual fun getDiskSpaceInformationW(rootpath: Pcwstr, diskspaceinfo: COpaquePointer?): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getDiskSpaceInformationW((rootpath?.value ?: 0L), (diskspaceinfo?.value ?: 0L))

public actual fun getDriveTypeA(lprootpathname: Pcstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getDriveTypeA((lprootpathname?.value ?: 0L)).toUInt()

public actual fun getDriveTypeW(lprootpathname: Pcwstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getDriveTypeW((lprootpathname?.value ?: 0L)).toUInt()

public actual fun getEncryptedFileMetadata(lpfilename: Pcwstr, pcbmetadata: COpaquePointer?, ppbmetadata: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getEncryptedFileMetadata((lpfilename?.value ?: 0L), (pcbmetadata?.value ?: 0L), (ppbmetadata?.value ?: 0L)).toUInt()

public actual fun getEnlistmentId(enlistmenthandle: Handle, enlistmentid: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getEnlistmentId((enlistmenthandle?.value ?: 0L), (enlistmentid?.value ?: 0L))

public actual fun getEnlistmentRecoveryInformation(enlistmenthandle: Handle, buffersize: UInt, buffer: COpaquePointer?, bufferused: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getEnlistmentRecoveryInformation((enlistmenthandle?.value ?: 0L), buffersize.toInt(), (buffer?.value ?: 0L), (bufferused?.value ?: 0L))

public actual fun getExpandedNameA(lpszsource: Pcstr, lpszbuffer: Pstr): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getExpandedNameA((lpszsource?.value ?: 0L), (lpszbuffer?.value ?: 0L))

public actual fun getExpandedNameW(lpszsource: Pcwstr, lpszbuffer: Pwstr): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getExpandedNameW((lpszsource?.value ?: 0L), (lpszbuffer?.value ?: 0L))

public actual fun getFileAttributesA(lpfilename: Pcstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileAttributesA((lpfilename?.value ?: 0L)).toUInt()

public actual fun getFileAttributesExA(lpfilename: Pcstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileAttributesExA((lpfilename?.value ?: 0L), finfolevelid, (lpfileinformation?.value ?: 0L))

public actual fun getFileAttributesExFromAppW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileAttributesExFromAppW((lpfilename?.value ?: 0L), finfolevelid, (lpfileinformation?.value ?: 0L))

public actual fun getFileAttributesExW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileAttributesExW((lpfilename?.value ?: 0L), finfolevelid, (lpfileinformation?.value ?: 0L))

public actual fun getFileAttributesTransactedA(lpfilename: Pcstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileAttributesTransactedA((lpfilename?.value ?: 0L), finfolevelid, (lpfileinformation?.value ?: 0L), (htransaction?.value ?: 0L))

public actual fun getFileAttributesTransactedW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileAttributesTransactedW((lpfilename?.value ?: 0L), finfolevelid, (lpfileinformation?.value ?: 0L), (htransaction?.value ?: 0L))

public actual fun getFileAttributesW(lpfilename: Pcwstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileAttributesW((lpfilename?.value ?: 0L)).toUInt()

public actual fun getFileBandwidthReservation(hfile: Handle, lpperiodmilliseconds: COpaquePointer?, lpbytesperperiod: COpaquePointer?, pdiscardable: COpaquePointer?, lptransfersize: COpaquePointer?, lpnumoutstandingrequests: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileBandwidthReservation((hfile?.value ?: 0L), (lpperiodmilliseconds?.value ?: 0L), (lpbytesperperiod?.value ?: 0L), (pdiscardable?.value ?: 0L), (lptransfersize?.value ?: 0L), (lpnumoutstandingrequests?.value ?: 0L))

public actual fun getFileInformationByHandle(hfile: Handle, lpfileinformation: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileInformationByHandle((hfile?.value ?: 0L), (lpfileinformation?.value ?: 0L))

public actual fun getFileInformationByHandleEx(hfile: Handle, fileinformationclass: FileInfoByHandleClass, lpfileinformation: COpaquePointer?, dwbuffersize: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileInformationByHandleEx((hfile?.value ?: 0L), fileinformationclass, (lpfileinformation?.value ?: 0L), dwbuffersize.toInt())

public actual fun getFileSize(hfile: Handle, lpfilesizehigh: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileSize((hfile?.value ?: 0L), (lpfilesizehigh?.value ?: 0L)).toUInt()

public actual fun getFileSizeEx(hfile: Handle, lpfilesize: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileSizeEx((hfile?.value ?: 0L), (lpfilesize?.value ?: 0L))

public actual fun getFileTime(hfile: Handle, lpcreationtime: COpaquePointer?, lplastaccesstime: COpaquePointer?, lplastwritetime: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileTime((hfile?.value ?: 0L), (lpcreationtime?.value ?: 0L), (lplastaccesstime?.value ?: 0L), (lplastwritetime?.value ?: 0L))

public actual fun getFileType(hfile: Handle): FileType =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileType((hfile?.value ?: 0L)).toUInt()

public actual fun getFileVersionInfoA(lptstrfilename: Pcstr, dwhandle: UInt, dwlen: UInt, lpdata: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileVersionInfoA((lptstrfilename?.value ?: 0L), dwhandle.toInt(), dwlen.toInt(), (lpdata?.value ?: 0L))

public actual fun getFileVersionInfoExA(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcstr, dwhandle: UInt, dwlen: UInt, lpdata: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileVersionInfoExA(dwflags.toInt(), (lpwstrfilename?.value ?: 0L), dwhandle.toInt(), dwlen.toInt(), (lpdata?.value ?: 0L))

public actual fun getFileVersionInfoExW(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcwstr, dwhandle: UInt, dwlen: UInt, lpdata: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileVersionInfoExW(dwflags.toInt(), (lpwstrfilename?.value ?: 0L), dwhandle.toInt(), dwlen.toInt(), (lpdata?.value ?: 0L))

public actual fun getFileVersionInfoSizeA(lptstrfilename: Pcstr, lpdwhandle: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeA((lptstrfilename?.value ?: 0L), (lpdwhandle?.value ?: 0L)).toUInt()

public actual fun getFileVersionInfoSizeExA(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcstr, lpdwhandle: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeExA(dwflags.toInt(), (lpwstrfilename?.value ?: 0L), (lpdwhandle?.value ?: 0L)).toUInt()

public actual fun getFileVersionInfoSizeExW(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcwstr, lpdwhandle: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeExW(dwflags.toInt(), (lpwstrfilename?.value ?: 0L), (lpdwhandle?.value ?: 0L)).toUInt()

public actual fun getFileVersionInfoSizeW(lptstrfilename: Pcwstr, lpdwhandle: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileVersionInfoSizeW((lptstrfilename?.value ?: 0L), (lpdwhandle?.value ?: 0L)).toUInt()

public actual fun getFileVersionInfoW(lptstrfilename: Pcwstr, dwhandle: UInt, dwlen: UInt, lpdata: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFileVersionInfoW((lptstrfilename?.value ?: 0L), dwhandle.toInt(), dwlen.toInt(), (lpdata?.value ?: 0L))

public actual fun getFinalPathNameByHandleA(hfile: Handle, lpszfilepath: Pstr, cchfilepath: UInt, dwflags: GetfinalpathnamebyhandleFlags): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFinalPathNameByHandleA((hfile?.value ?: 0L), (lpszfilepath?.value ?: 0L), cchfilepath.toInt(), dwflags.toInt()).toUInt()

public actual fun getFinalPathNameByHandleW(hfile: Handle, lpszfilepath: Pwstr, cchfilepath: UInt, dwflags: GetfinalpathnamebyhandleFlags): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFinalPathNameByHandleW((hfile?.value ?: 0L), (lpszfilepath?.value ?: 0L), cchfilepath.toInt(), dwflags.toInt()).toUInt()

public actual fun getFullPathNameA(lpfilename: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFullPathNameA((lpfilename?.value ?: 0L), nbufferlength.toInt(), (lpbuffer?.value ?: 0L), (lpfilepart?.value ?: 0L)).toUInt()

public actual fun getFullPathNameTransactedA(lpfilename: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: COpaquePointer?, htransaction: Handle): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFullPathNameTransactedA((lpfilename?.value ?: 0L), nbufferlength.toInt(), (lpbuffer?.value ?: 0L), (lpfilepart?.value ?: 0L), (htransaction?.value ?: 0L)).toUInt()

public actual fun getFullPathNameTransactedW(lpfilename: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: COpaquePointer?, htransaction: Handle): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFullPathNameTransactedW((lpfilename?.value ?: 0L), nbufferlength.toInt(), (lpbuffer?.value ?: 0L), (lpfilepart?.value ?: 0L), (htransaction?.value ?: 0L)).toUInt()

public actual fun getFullPathNameW(lpfilename: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getFullPathNameW((lpfilename?.value ?: 0L), nbufferlength.toInt(), (lpbuffer?.value ?: 0L), (lpfilepart?.value ?: 0L)).toUInt()

public actual fun getIoRingInfo(ioring: Hioring, info: COpaquePointer?): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getIoRingInfo((ioring?.value ?: 0L), (info?.value ?: 0L))

public actual fun getLogContainerName(hlog: Handle, cidlogicalcontainer: UInt, pwstrcontainername: Pcwstr, clencontainername: UInt, pcactuallencontainername: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getLogContainerName((hlog?.value ?: 0L), cidlogicalcontainer.toInt(), (pwstrcontainername?.value ?: 0L), clencontainername.toInt(), (pcactuallencontainername?.value ?: 0L))

public actual fun getLogFileInformation(hlog: Handle, pinfobuffer: COpaquePointer?, cbbuffer: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getLogFileInformation((hlog?.value ?: 0L), (pinfobuffer?.value ?: 0L), (cbbuffer?.value ?: 0L))

public actual fun getLogIoStatistics(hlog: Handle, pvstatsbuffer: COpaquePointer?, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getLogIoStatistics((hlog?.value ?: 0L), (pvstatsbuffer?.value ?: 0L), cbstatsbuffer.toInt(), estatsclass, (pcbstatswritten?.value ?: 0L))

public actual fun getLogReservationInfo(pvmarshal: COpaquePointer?, pcbrecordnumber: COpaquePointer?, pcbuserreservation: COpaquePointer?, pcbcommitreservation: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getLogReservationInfo((pvmarshal?.value ?: 0L), (pcbrecordnumber?.value ?: 0L), (pcbuserreservation?.value ?: 0L), (pcbcommitreservation?.value ?: 0L))

public actual fun getLogicalDriveStringsA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getLogicalDriveStringsA(nbufferlength.toInt(), (lpbuffer?.value ?: 0L)).toUInt()

public actual fun getLogicalDriveStringsW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getLogicalDriveStringsW(nbufferlength.toInt(), (lpbuffer?.value ?: 0L)).toUInt()

public actual fun getLogicalDrives(): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getLogicalDrives().toUInt()

public actual fun getLongPathNameA(lpszshortpath: Pcstr, lpszlongpath: Pstr, cchbuffer: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getLongPathNameA((lpszshortpath?.value ?: 0L), (lpszlongpath?.value ?: 0L), cchbuffer.toInt()).toUInt()

public actual fun getLongPathNameTransactedA(lpszshortpath: Pcstr, lpszlongpath: Pstr, cchbuffer: UInt, htransaction: Handle): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getLongPathNameTransactedA((lpszshortpath?.value ?: 0L), (lpszlongpath?.value ?: 0L), cchbuffer.toInt(), (htransaction?.value ?: 0L)).toUInt()

public actual fun getLongPathNameTransactedW(lpszshortpath: Pcwstr, lpszlongpath: Pwstr, cchbuffer: UInt, htransaction: Handle): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getLongPathNameTransactedW((lpszshortpath?.value ?: 0L), (lpszlongpath?.value ?: 0L), cchbuffer.toInt(), (htransaction?.value ?: 0L)).toUInt()

public actual fun getLongPathNameW(lpszshortpath: Pcwstr, lpszlongpath: Pwstr, cchbuffer: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getLongPathNameW((lpszshortpath?.value ?: 0L), (lpszlongpath?.value ?: 0L), cchbuffer.toInt()).toUInt()

public actual fun getNextLogArchiveExtent(pvarchivecontext: COpaquePointer?, rgadextent: COpaquePointer?, cdescriptors: UInt, pcdescriptorsreturned: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getNextLogArchiveExtent((pvarchivecontext?.value ?: 0L), (rgadextent?.value ?: 0L), cdescriptors.toInt(), (pcdescriptorsreturned?.value ?: 0L))

public actual fun getNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: COpaquePointer?, notificationlength: UInt, dwmilliseconds: UInt, returnlength: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getNotificationResourceManager((resourcemanagerhandle?.value ?: 0L), (transactionnotification?.value ?: 0L), notificationlength.toInt(), dwmilliseconds.toInt(), (returnlength?.value ?: 0L))

public actual fun getNotificationResourceManagerAsync(resourcemanagerhandle: Handle, transactionnotification: COpaquePointer?, transactionnotificationlength: UInt, returnlength: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getNotificationResourceManagerAsync((resourcemanagerhandle?.value ?: 0L), (transactionnotification?.value ?: 0L), transactionnotificationlength.toInt(), (returnlength?.value ?: 0L), (lpoverlapped?.value ?: 0L))

public actual fun getShortPathNameA(lpszlongpath: Pcstr, lpszshortpath: Pstr, cchbuffer: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getShortPathNameA((lpszlongpath?.value ?: 0L), (lpszshortpath?.value ?: 0L), cchbuffer.toInt()).toUInt()

public actual fun getShortPathNameW(lpszlongpath: Pcwstr, lpszshortpath: Pwstr, cchbuffer: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getShortPathNameW((lpszlongpath?.value ?: 0L), (lpszshortpath?.value ?: 0L), cchbuffer.toInt()).toUInt()

public actual fun getTapeParameters(hdevice: Handle, dwoperation: GetTapeDriveParametersOperation, lpdwsize: COpaquePointer?, lptapeinformation: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getTapeParameters((hdevice?.value ?: 0L), dwoperation.toInt(), (lpdwsize?.value ?: 0L), (lptapeinformation?.value ?: 0L)).toUInt()

public actual fun getTapePosition(hdevice: Handle, dwpositiontype: TapePositionType, lpdwpartition: COpaquePointer?, lpdwoffsetlow: COpaquePointer?, lpdwoffsethigh: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getTapePosition((hdevice?.value ?: 0L), dwpositiontype.toInt(), (lpdwpartition?.value ?: 0L), (lpdwoffsetlow?.value ?: 0L), (lpdwoffsethigh?.value ?: 0L)).toUInt()

public actual fun getTapeStatus(hdevice: Handle): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getTapeStatus((hdevice?.value ?: 0L)).toUInt()

public actual fun getTempFileNameA(lppathname: Pcstr, lpprefixstring: Pcstr, uunique: UInt, lptempfilename: Pstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getTempFileNameA((lppathname?.value ?: 0L), (lpprefixstring?.value ?: 0L), uunique.toInt(), (lptempfilename?.value ?: 0L)).toUInt()

public actual fun getTempFileNameW(lppathname: Pcwstr, lpprefixstring: Pcwstr, uunique: UInt, lptempfilename: Pwstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getTempFileNameW((lppathname?.value ?: 0L), (lpprefixstring?.value ?: 0L), uunique.toInt(), (lptempfilename?.value ?: 0L)).toUInt()

public actual fun getTempPath2A(bufferlength: UInt, buffer: Pstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getTempPath2A(bufferlength.toInt(), (buffer?.value ?: 0L)).toUInt()

public actual fun getTempPath2W(bufferlength: UInt, buffer: Pwstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getTempPath2W(bufferlength.toInt(), (buffer?.value ?: 0L)).toUInt()

public actual fun getTempPathA(nbufferlength: UInt, lpbuffer: Pstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getTempPathA(nbufferlength.toInt(), (lpbuffer?.value ?: 0L)).toUInt()

public actual fun getTempPathW(nbufferlength: UInt, lpbuffer: Pwstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getTempPathW(nbufferlength.toInt(), (lpbuffer?.value ?: 0L)).toUInt()

public actual fun getTransactionId(transactionhandle: Handle, transactionid: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getTransactionId((transactionhandle?.value ?: 0L), (transactionid?.value ?: 0L))

public actual fun getTransactionInformation(transactionhandle: Handle, outcome: COpaquePointer?, isolationlevel: COpaquePointer?, isolationflags: COpaquePointer?, timeout: COpaquePointer?, bufferlength: UInt, description: Pwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getTransactionInformation((transactionhandle?.value ?: 0L), (outcome?.value ?: 0L), (isolationlevel?.value ?: 0L), (isolationflags?.value ?: 0L), (timeout?.value ?: 0L), bufferlength.toInt(), (description?.value ?: 0L))

public actual fun getTransactionManagerId(transactionmanagerhandle: Handle, transactionmanagerid: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getTransactionManagerId((transactionmanagerhandle?.value ?: 0L), (transactionmanagerid?.value ?: 0L))

public actual fun getVolumeInformationA(lprootpathname: Pcstr, lpvolumenamebuffer: Pstr, nvolumenamesize: UInt, lpvolumeserialnumber: COpaquePointer?, lpmaximumcomponentlength: COpaquePointer?, lpfilesystemflags: COpaquePointer?, lpfilesystemnamebuffer: Pstr, nfilesystemnamesize: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getVolumeInformationA((lprootpathname?.value ?: 0L), (lpvolumenamebuffer?.value ?: 0L), nvolumenamesize.toInt(), (lpvolumeserialnumber?.value ?: 0L), (lpmaximumcomponentlength?.value ?: 0L), (lpfilesystemflags?.value ?: 0L), (lpfilesystemnamebuffer?.value ?: 0L), nfilesystemnamesize.toInt())

public actual fun getVolumeInformationByHandleW(hfile: Handle, lpvolumenamebuffer: Pwstr, nvolumenamesize: UInt, lpvolumeserialnumber: COpaquePointer?, lpmaximumcomponentlength: COpaquePointer?, lpfilesystemflags: COpaquePointer?, lpfilesystemnamebuffer: Pwstr, nfilesystemnamesize: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getVolumeInformationByHandleW((hfile?.value ?: 0L), (lpvolumenamebuffer?.value ?: 0L), nvolumenamesize.toInt(), (lpvolumeserialnumber?.value ?: 0L), (lpmaximumcomponentlength?.value ?: 0L), (lpfilesystemflags?.value ?: 0L), (lpfilesystemnamebuffer?.value ?: 0L), nfilesystemnamesize.toInt())

public actual fun getVolumeInformationW(lprootpathname: Pcwstr, lpvolumenamebuffer: Pwstr, nvolumenamesize: UInt, lpvolumeserialnumber: COpaquePointer?, lpmaximumcomponentlength: COpaquePointer?, lpfilesystemflags: COpaquePointer?, lpfilesystemnamebuffer: Pwstr, nfilesystemnamesize: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getVolumeInformationW((lprootpathname?.value ?: 0L), (lpvolumenamebuffer?.value ?: 0L), nvolumenamesize.toInt(), (lpvolumeserialnumber?.value ?: 0L), (lpmaximumcomponentlength?.value ?: 0L), (lpfilesystemflags?.value ?: 0L), (lpfilesystemnamebuffer?.value ?: 0L), nfilesystemnamesize.toInt())

public actual fun getVolumeNameForVolumeMountPointA(lpszvolumemountpoint: Pcstr, lpszvolumename: Pstr, cchbufferlength: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getVolumeNameForVolumeMountPointA((lpszvolumemountpoint?.value ?: 0L), (lpszvolumename?.value ?: 0L), cchbufferlength.toInt())

public actual fun getVolumeNameForVolumeMountPointW(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getVolumeNameForVolumeMountPointW((lpszvolumemountpoint?.value ?: 0L), (lpszvolumename?.value ?: 0L), cchbufferlength.toInt())

public actual fun getVolumePathNameA(lpszfilename: Pcstr, lpszvolumepathname: Pstr, cchbufferlength: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getVolumePathNameA((lpszfilename?.value ?: 0L), (lpszvolumepathname?.value ?: 0L), cchbufferlength.toInt())

public actual fun getVolumePathNameW(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, cchbufferlength: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getVolumePathNameW((lpszfilename?.value ?: 0L), (lpszvolumepathname?.value ?: 0L), cchbufferlength.toInt())

public actual fun getVolumePathNamesForVolumeNameA(lpszvolumename: Pcstr, lpszvolumepathnames: Pstr, cchbufferlength: UInt, lpcchreturnlength: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getVolumePathNamesForVolumeNameA((lpszvolumename?.value ?: 0L), (lpszvolumepathnames?.value ?: 0L), cchbufferlength.toInt(), (lpcchreturnlength?.value ?: 0L))

public actual fun getVolumePathNamesForVolumeNameW(lpszvolumename: Pcwstr, lpszvolumepathnames: Pwstr, cchbufferlength: UInt, lpcchreturnlength: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_getVolumePathNamesForVolumeNameW((lpszvolumename?.value ?: 0L), (lpszvolumepathnames?.value ?: 0L), cchbufferlength.toInt(), (lpcchreturnlength?.value ?: 0L))

public actual fun handleLogFull(hlog: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_handleLogFull((hlog?.value ?: 0L))

public actual fun installLogPolicy(hlog: Handle, ppolicy: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_installLogPolicy((hlog?.value ?: 0L), (ppolicy?.value ?: 0L))

public actual fun isIoRingOpSupported(ioring: Hioring, op: IoringOpCode): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_isIoRingOpSupported((ioring?.value ?: 0L), op)

public actual fun lZClose(hfile: Int) {
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_lZClose(hfile)
}

public actual fun lZCopy(hfsource: Int, hfdest: Int): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_lZCopy(hfsource, hfdest)

public actual fun lZDone() {
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_lZDone()
}

public actual fun lZInit(hfsource: Int): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_lZInit(hfsource)

public actual fun lZOpenFileA(lpfilename: Pcstr, lpreopenbuf: COpaquePointer?, wstyle: LzopenfileStyle): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_lZOpenFileA((lpfilename?.value ?: 0L), (lpreopenbuf?.value ?: 0L), wstyle.toShort())

public actual fun lZOpenFileW(lpfilename: Pcwstr, lpreopenbuf: COpaquePointer?, wstyle: LzopenfileStyle): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_lZOpenFileW((lpfilename?.value ?: 0L), (lpreopenbuf?.value ?: 0L), wstyle.toShort())

public actual fun lZRead(hfile: Int, lpbuffer: Pstr, cbread: Int): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_lZRead(hfile, (lpbuffer?.value ?: 0L), cbread)

public actual fun lZSeek(hfile: Int, loffset: Int, iorigin: Int): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_lZSeek(hfile, loffset, iorigin)

public actual fun lZStart(): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_lZStart()

public actual fun localFileTimeToFileTime(lplocalfiletime: COpaquePointer?, lpfiletime: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_localFileTimeToFileTime((lplocalfiletime?.value ?: 0L), (lpfiletime?.value ?: 0L))

public actual fun lockFile(hfile: Handle, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_lockFile((hfile?.value ?: 0L), dwfileoffsetlow.toInt(), dwfileoffsethigh.toInt(), nnumberofbytestolocklow.toInt(), nnumberofbytestolockhigh.toInt())

public actual fun lockFileEx(hfile: Handle, dwflags: LockFileFlags, dwreserved: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt, lpoverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_lockFileEx((hfile?.value ?: 0L), dwflags.toInt(), dwreserved.toInt(), nnumberofbytestolocklow.toInt(), nnumberofbytestolockhigh.toInt(), (lpoverlapped?.value ?: 0L))

public actual fun logTailAdvanceFailure(hlog: Handle, dwreason: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_logTailAdvanceFailure((hlog?.value ?: 0L), dwreason.toInt())

public actual fun lsnBlockOffset(plsn: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_lsnBlockOffset((plsn?.value ?: 0L)).toUInt()

public actual fun lsnContainer(plsn: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_lsnContainer((plsn?.value ?: 0L)).toUInt()

public actual fun lsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn =
    ClsLsn()

public actual fun lsnEqual(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_lsnEqual((plsn1?.value ?: 0L), (plsn2?.value ?: 0L))

public actual fun lsnGreater(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_lsnGreater((plsn1?.value ?: 0L), (plsn2?.value ?: 0L))

public actual fun lsnIncrement(plsn: COpaquePointer?): ClsLsn =
    ClsLsn()

public actual fun lsnInvalid(plsn: COpaquePointer?): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_lsnInvalid((plsn?.value ?: 0L))

public actual fun lsnLess(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_lsnLess((plsn1?.value ?: 0L), (plsn2?.value ?: 0L))

public actual fun lsnNull(plsn: COpaquePointer?): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_lsnNull((plsn?.value ?: 0L))

public actual fun lsnRecordSequence(plsn: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_lsnRecordSequence((plsn?.value ?: 0L)).toUInt()

public actual fun moveFileA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_moveFileA((lpexistingfilename?.value ?: 0L), (lpnewfilename?.value ?: 0L))

public actual fun moveFileExA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, dwflags: MoveFileFlags): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_moveFileExA((lpexistingfilename?.value ?: 0L), (lpnewfilename?.value ?: 0L), dwflags.toInt())

public actual fun moveFileExW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: MoveFileFlags): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_moveFileExW((lpexistingfilename?.value ?: 0L), (lpnewfilename?.value ?: 0L), dwflags.toInt())

public actual fun moveFileFromAppW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_moveFileFromAppW((lpexistingfilename?.value ?: 0L), (lpnewfilename?.value ?: 0L))

public actual fun moveFileTransactedA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, dwflags: MoveFileFlags, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_moveFileTransactedA((lpexistingfilename?.value ?: 0L), (lpnewfilename?.value ?: 0L), 0L, (lpdata?.value ?: 0L), dwflags.toInt(), (htransaction?.value ?: 0L))

public actual fun moveFileTransactedW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, dwflags: MoveFileFlags, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_moveFileTransactedW((lpexistingfilename?.value ?: 0L), (lpnewfilename?.value ?: 0L), 0L, (lpdata?.value ?: 0L), dwflags.toInt(), (htransaction?.value ?: 0L))

public actual fun moveFileW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_moveFileW((lpexistingfilename?.value ?: 0L), (lpnewfilename?.value ?: 0L))

public actual fun moveFileWithProgressA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, dwflags: MoveFileFlags): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_moveFileWithProgressA((lpexistingfilename?.value ?: 0L), (lpnewfilename?.value ?: 0L), 0L, (lpdata?.value ?: 0L), dwflags.toInt())

public actual fun moveFileWithProgressW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, dwflags: MoveFileFlags): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_moveFileWithProgressW((lpexistingfilename?.value ?: 0L), (lpnewfilename?.value ?: 0L), 0L, (lpdata?.value ?: 0L), dwflags.toInt())

public actual fun netConnectionEnum(servername: Pcwstr, qualifier: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_netConnectionEnum((servername?.value ?: 0L), (qualifier?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumeHandle?.value ?: 0L)).toUInt()

public actual fun netFileClose(servername: Pcwstr, fileid: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_netFileClose((servername?.value ?: 0L), fileid.toInt()).toUInt()

public actual fun netFileEnum(servername: Pcwstr, basepath: Pcwstr, username: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_netFileEnum((servername?.value ?: 0L), (basepath?.value ?: 0L), (username?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumeHandle?.value ?: 0L)).toUInt()

public actual fun netFileGetInfo(servername: Pcwstr, fileid: UInt, level: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_netFileGetInfo((servername?.value ?: 0L), fileid.toInt(), level.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netServerAliasAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_netServerAliasAdd((servername?.value ?: 0L), level.toInt(), (buf?.value ?: 0L)).toUInt()

public actual fun netServerAliasDel(servername: Pcwstr, level: UInt, buf: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_netServerAliasDel((servername?.value ?: 0L), level.toInt(), (buf?.value ?: 0L)).toUInt()

public actual fun netServerAliasEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_netServerAliasEnum((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumehandle?.value ?: 0L)).toUInt()

public actual fun netSessionDel(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_netSessionDel((servername?.value ?: 0L), (uncclientname?.value ?: 0L), (username?.value ?: 0L)).toUInt()

public actual fun netSessionEnum(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_netSessionEnum((servername?.value ?: 0L), (uncclientname?.value ?: 0L), (username?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumeHandle?.value ?: 0L)).toUInt()

public actual fun netSessionGetInfo(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_netSessionGetInfo((servername?.value ?: 0L), (uncclientname?.value ?: 0L), (username?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netShareAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_netShareAdd((servername?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), (parmErr?.value ?: 0L)).toUInt()

public actual fun netShareCheck(servername: Pcwstr, device: Pcwstr, type: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_netShareCheck((servername?.value ?: 0L), (device?.value ?: 0L), (type?.value ?: 0L)).toUInt()

public actual fun netShareDel(servername: Pcwstr, netname: Pcwstr, reserved: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_netShareDel((servername?.value ?: 0L), (netname?.value ?: 0L), reserved.toInt()).toUInt()

public actual fun netShareDelEx(servername: Pcwstr, level: UInt, buf: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_netShareDelEx((servername?.value ?: 0L), level.toInt(), (buf?.value ?: 0L)).toUInt()

public actual fun netShareDelSticky(servername: Pcwstr, netname: Pcwstr, reserved: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_netShareDelSticky((servername?.value ?: 0L), (netname?.value ?: 0L), reserved.toInt()).toUInt()

public actual fun netShareEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_netShareEnum((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumeHandle?.value ?: 0L)).toUInt()

public actual fun netShareEnumSticky(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_netShareEnumSticky((servername?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L), prefmaxlen.toInt(), (entriesread?.value ?: 0L), (totalentries?.value ?: 0L), (resumeHandle?.value ?: 0L)).toUInt()

public actual fun netShareGetInfo(servername: Pcwstr, netname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_netShareGetInfo((servername?.value ?: 0L), (netname?.value ?: 0L), level.toInt(), (bufptr?.value ?: 0L)).toUInt()

public actual fun netShareSetInfo(servername: Pcwstr, netname: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_netShareSetInfo((servername?.value ?: 0L), (netname?.value ?: 0L), level.toInt(), (buf?.value ?: 0L), (parmErr?.value ?: 0L)).toUInt()

public actual fun netStatisticsGet(servername: COpaquePointer?, service: COpaquePointer?, level: UInt, options: UInt, buffer: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_netStatisticsGet((servername?.value ?: 0L), (service?.value ?: 0L), level.toInt(), options.toInt(), (buffer?.value ?: 0L)).toUInt()

public actual fun openEncryptedFileRawA(lpfilename: Pcstr, ulflags: UInt, pvcontext: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_openEncryptedFileRawA((lpfilename?.value ?: 0L), ulflags.toInt(), (pvcontext?.value ?: 0L)).toUInt()

public actual fun openEncryptedFileRawW(lpfilename: Pcwstr, ulflags: UInt, pvcontext: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_openEncryptedFileRawW((lpfilename?.value ?: 0L), ulflags.toInt(), (pvcontext?.value ?: 0L)).toUInt()

public actual fun openEnlistment(dwdesiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentid: COpaquePointer?): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_openEnlistment(dwdesiredaccess.toInt(), (resourcemanagerhandle?.value ?: 0L), (enlistmentid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openFile(lpfilename: Pcstr, lpreopenbuff: COpaquePointer?, ustyle: UInt): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_openFile((lpfilename?.value ?: 0L), (lpreopenbuff?.value ?: 0L), ustyle.toInt())

public actual fun openFileById(hvolumehint: Handle, lpfileid: COpaquePointer?, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: COpaquePointer?, dwflagsandattributes: FileFlagsAndAttributes): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_openFileById((hvolumehint?.value ?: 0L), (lpfileid?.value ?: 0L), dwdesiredaccess.toInt(), dwsharemode.toInt(), (lpsecurityattributes?.value ?: 0L), dwflagsandattributes.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openResourceManager(dwdesiredaccess: UInt, tmhandle: Handle, resourcemanagerid: COpaquePointer?): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_openResourceManager(dwdesiredaccess.toInt(), (tmhandle?.value ?: 0L), (resourcemanagerid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openTransaction(dwdesiredaccess: UInt, transactionid: COpaquePointer?): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_openTransaction(dwdesiredaccess.toInt(), (transactionid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openTransactionManager(logfilename: Pcwstr, desiredaccess: UInt, openoptions: UInt): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_openTransactionManager((logfilename?.value ?: 0L), desiredaccess.toInt(), openoptions.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openTransactionManagerById(transactionmanagerid: COpaquePointer?, desiredaccess: UInt, openoptions: UInt): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_openTransactionManagerById((transactionmanagerid?.value ?: 0L), desiredaccess.toInt(), openoptions.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun popIoRingCompletion(ioring: Hioring, cqe: COpaquePointer?): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_popIoRingCompletion((ioring?.value ?: 0L), (cqe?.value ?: 0L))

public actual fun prePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_prePrepareComplete((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun prePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_prePrepareEnlistment((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun prepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_prepareComplete((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun prepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_prepareEnlistment((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun prepareLogArchive(hlog: Handle, pszbaselogfilename: Pwstr, clen: UInt, plsnlow: COpaquePointer?, plsnhigh: COpaquePointer?, pcactuallength: COpaquePointer?, poffbaselogfiledata: COpaquePointer?, pcbbaselogfilelength: COpaquePointer?, plsnbase: COpaquePointer?, plsnlast: COpaquePointer?, plsncurrentarchivetail: COpaquePointer?, ppvarchivecontext: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_prepareLogArchive((hlog?.value ?: 0L), (pszbaselogfilename?.value ?: 0L), clen.toInt(), (plsnlow?.value ?: 0L), (plsnhigh?.value ?: 0L), (pcactuallength?.value ?: 0L), (poffbaselogfiledata?.value ?: 0L), (pcbbaselogfilelength?.value ?: 0L), (plsnbase?.value ?: 0L), (plsnlast?.value ?: 0L), (plsncurrentarchivetail?.value ?: 0L), (ppvarchivecontext?.value ?: 0L))

public actual fun prepareTape(hdevice: Handle, dwoperation: PrepareTapeOperation, bimmediate: Bool): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_prepareTape((hdevice?.value ?: 0L), dwoperation.toInt(), bimmediate).toUInt()

public actual fun queryDosDeviceA(lpdevicename: Pcstr, lptargetpath: Pstr, ucchmax: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_queryDosDeviceA((lpdevicename?.value ?: 0L), (lptargetpath?.value ?: 0L), ucchmax.toInt()).toUInt()

public actual fun queryDosDeviceW(lpdevicename: Pcwstr, lptargetpath: Pwstr, ucchmax: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_queryDosDeviceW((lpdevicename?.value ?: 0L), (lptargetpath?.value ?: 0L), ucchmax.toInt()).toUInt()

public actual fun queryIoRingCapabilities(capabilities: COpaquePointer?): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_queryIoRingCapabilities((capabilities?.value ?: 0L))

public actual fun queryLogPolicy(hlog: Handle, epolicytype: ClfsMgmtPolicyType, ppolicybuffer: COpaquePointer?, pcbpolicybuffer: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_queryLogPolicy((hlog?.value ?: 0L), epolicytype, (ppolicybuffer?.value ?: 0L), (pcbpolicybuffer?.value ?: 0L))

public actual fun queryRecoveryAgentsOnEncryptedFile(lpfilename: Pcwstr, precoveryagents: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_queryRecoveryAgentsOnEncryptedFile((lpfilename?.value ?: 0L), (precoveryagents?.value ?: 0L)).toUInt()

public actual fun queryUsersOnEncryptedFile(lpfilename: Pcwstr, pusers: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_queryUsersOnEncryptedFile((lpfilename?.value ?: 0L), (pusers?.value ?: 0L)).toUInt()

public actual fun reOpenFile(horiginalfile: Handle, dwdesiredaccess: UInt, dwsharemode: FileShareMode, dwflagsandattributes: FileFlagsAndAttributes): Handle =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_reOpenFile((horiginalfile?.value ?: 0L), dwdesiredaccess.toInt(), dwsharemode.toInt(), dwflagsandattributes.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun readDirectoryChangesExW(hdirectory: Handle, lpbuffer: COpaquePointer?, nbufferlength: UInt, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange, lpbytesreturned: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpoverlappedCompletionRoutine, readdirectorynotifyinformationclass: ReadDirectoryNotifyInformationClass): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_readDirectoryChangesExW((hdirectory?.value ?: 0L), (lpbuffer?.value ?: 0L), nbufferlength.toInt(), bwatchsubtree, dwnotifyfilter.toInt(), (lpbytesreturned?.value ?: 0L), (lpoverlapped?.value ?: 0L), 0L, readdirectorynotifyinformationclass)

public actual fun readDirectoryChangesW(hdirectory: Handle, lpbuffer: COpaquePointer?, nbufferlength: UInt, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange, lpbytesreturned: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_readDirectoryChangesW((hdirectory?.value ?: 0L), (lpbuffer?.value ?: 0L), nbufferlength.toInt(), bwatchsubtree, dwnotifyfilter.toInt(), (lpbytesreturned?.value ?: 0L), (lpoverlapped?.value ?: 0L), 0L)

public actual fun readEncryptedFileRaw(pfexportcallback: PfeExportFunc, pvcallbackcontext: COpaquePointer?, pvcontext: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_readEncryptedFileRaw(0L, (pvcallbackcontext?.value ?: 0L), (pvcontext?.value ?: 0L)).toUInt()

public actual fun readFile(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, lpnumberofbytesread: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_readFile((hfile?.value ?: 0L), (lpbuffer?.value ?: 0L), nnumberofbytestoread.toInt(), (lpnumberofbytesread?.value ?: 0L), (lpoverlapped?.value ?: 0L))

public actual fun readFileEx(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_readFileEx((hfile?.value ?: 0L), (lpbuffer?.value ?: 0L), nnumberofbytestoread.toInt(), (lpoverlapped?.value ?: 0L), 0L)

public actual fun readFileScatter(hfile: Handle, asegmentarray: COpaquePointer?, nnumberofbytestoread: UInt, lpreserved: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_readFileScatter((hfile?.value ?: 0L), (asegmentarray?.value ?: 0L), nnumberofbytestoread.toInt(), (lpreserved?.value ?: 0L), (lpoverlapped?.value ?: 0L))

public actual fun readLogArchiveMetadata(pvarchivecontext: COpaquePointer?, cboffset: UInt, cbbytestoread: UInt, pbreadbuffer: COpaquePointer?, pcbbytesread: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_readLogArchiveMetadata((pvarchivecontext?.value ?: 0L), cboffset.toInt(), cbbytestoread.toInt(), (pbreadbuffer?.value ?: 0L), (pcbbytesread?.value ?: 0L))

public actual fun readLogNotification(hlog: Handle, pnotification: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_readLogNotification((hlog?.value ?: 0L), (pnotification?.value ?: 0L), (lpoverlapped?.value ?: 0L))

public actual fun readLogRecord(pvmarshal: COpaquePointer?, plsnfirst: COpaquePointer?, econtextmode: ClfsContextMode, ppvreadbuffer: COpaquePointer?, pcbreadbuffer: COpaquePointer?, perecordtype: COpaquePointer?, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, ppvreadcontext: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_readLogRecord((pvmarshal?.value ?: 0L), (plsnfirst?.value ?: 0L), econtextmode, (ppvreadbuffer?.value ?: 0L), (pcbreadbuffer?.value ?: 0L), (perecordtype?.value ?: 0L), (plsnundonext?.value ?: 0L), (plsnprevious?.value ?: 0L), (ppvreadcontext?.value ?: 0L), (poverlapped?.value ?: 0L))

public actual fun readLogRestartArea(pvmarshal: COpaquePointer?, ppvrestartbuffer: COpaquePointer?, pcbrestartbuffer: COpaquePointer?, plsn: COpaquePointer?, ppvcontext: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_readLogRestartArea((pvmarshal?.value ?: 0L), (ppvrestartbuffer?.value ?: 0L), (pcbrestartbuffer?.value ?: 0L), (plsn?.value ?: 0L), (ppvcontext?.value ?: 0L), (poverlapped?.value ?: 0L))

public actual fun readNextLogRecord(pvreadcontext: COpaquePointer?, ppvbuffer: COpaquePointer?, pcbbuffer: COpaquePointer?, perecordtype: COpaquePointer?, plsnuser: COpaquePointer?, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, plsnrecord: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_readNextLogRecord((pvreadcontext?.value ?: 0L), (ppvbuffer?.value ?: 0L), (pcbbuffer?.value ?: 0L), (perecordtype?.value ?: 0L), (plsnuser?.value ?: 0L), (plsnundonext?.value ?: 0L), (plsnprevious?.value ?: 0L), (plsnrecord?.value ?: 0L), (poverlapped?.value ?: 0L))

public actual fun readOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_readOnlyEnlistment((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun readPreviousLogRestartArea(pvreadcontext: COpaquePointer?, ppvrestartbuffer: COpaquePointer?, pcbrestartbuffer: COpaquePointer?, plsnrestart: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_readPreviousLogRestartArea((pvreadcontext?.value ?: 0L), (ppvrestartbuffer?.value ?: 0L), (pcbrestartbuffer?.value ?: 0L), (plsnrestart?.value ?: 0L), (poverlapped?.value ?: 0L))

public actual fun recoverEnlistment(enlistmenthandle: Handle, enlistmentkey: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_recoverEnlistment((enlistmenthandle?.value ?: 0L), (enlistmentkey?.value ?: 0L))

public actual fun recoverResourceManager(resourcemanagerhandle: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_recoverResourceManager((resourcemanagerhandle?.value ?: 0L))

public actual fun recoverTransactionManager(transactionmanagerhandle: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_recoverTransactionManager((transactionmanagerhandle?.value ?: 0L))

public actual fun registerForLogWriteNotification(hlog: Handle, cbthreshold: UInt, fenable: Bool): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_registerForLogWriteNotification((hlog?.value ?: 0L), cbthreshold.toInt(), fenable)

public actual fun registerManageableLogClient(hlog: Handle, pcallbacks: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_registerManageableLogClient((hlog?.value ?: 0L), (pcallbacks?.value ?: 0L))

public actual fun removeDirectoryA(lppathname: Pcstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_removeDirectoryA((lppathname?.value ?: 0L))

public actual fun removeDirectoryFromAppW(lppathname: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_removeDirectoryFromAppW((lppathname?.value ?: 0L))

public actual fun removeDirectoryTransactedA(lppathname: Pcstr, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_removeDirectoryTransactedA((lppathname?.value ?: 0L), (htransaction?.value ?: 0L))

public actual fun removeDirectoryTransactedW(lppathname: Pcwstr, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_removeDirectoryTransactedW((lppathname?.value ?: 0L), (htransaction?.value ?: 0L))

public actual fun removeDirectoryW(lppathname: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_removeDirectoryW((lppathname?.value ?: 0L))

public actual fun removeLogContainer(hlog: Handle, pwszcontainerpath: Pcwstr, fforce: Bool, preserved: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_removeLogContainer((hlog?.value ?: 0L), (pwszcontainerpath?.value ?: 0L), fforce, (preserved?.value ?: 0L))

public actual fun removeLogContainerSet(hlog: Handle, ccontainer: UShort, rgwszcontainerpath: COpaquePointer?, fforce: Bool, preserved: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_removeLogContainerSet((hlog?.value ?: 0L), ccontainer.toShort(), (rgwszcontainerpath?.value ?: 0L), fforce, (preserved?.value ?: 0L))

public actual fun removeLogPolicy(hlog: Handle, epolicytype: ClfsMgmtPolicyType): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_removeLogPolicy((hlog?.value ?: 0L), epolicytype)

public actual fun removeUsersFromEncryptedFile(lpfilename: Pcwstr, phashes: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_removeUsersFromEncryptedFile((lpfilename?.value ?: 0L), (phashes?.value ?: 0L)).toUInt()

public actual fun renameTransactionManager(logfilename: Pcwstr, existingtransactionmanagerguid: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_renameTransactionManager((logfilename?.value ?: 0L), (existingtransactionmanagerguid?.value ?: 0L))

public actual fun replaceFileA(lpreplacedfilename: Pcstr, lpreplacementfilename: Pcstr, lpbackupfilename: Pcstr, dwreplaceflags: ReplaceFileFlags, lpexclude: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_replaceFileA((lpreplacedfilename?.value ?: 0L), (lpreplacementfilename?.value ?: 0L), (lpbackupfilename?.value ?: 0L), dwreplaceflags.toInt(), (lpexclude?.value ?: 0L), (lpreserved?.value ?: 0L))

public actual fun replaceFileFromAppW(lpreplacedfilename: Pcwstr, lpreplacementfilename: Pcwstr, lpbackupfilename: Pcwstr, dwreplaceflags: UInt, lpexclude: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_replaceFileFromAppW((lpreplacedfilename?.value ?: 0L), (lpreplacementfilename?.value ?: 0L), (lpbackupfilename?.value ?: 0L), dwreplaceflags.toInt(), (lpexclude?.value ?: 0L), (lpreserved?.value ?: 0L))

public actual fun replaceFileW(lpreplacedfilename: Pcwstr, lpreplacementfilename: Pcwstr, lpbackupfilename: Pcwstr, dwreplaceflags: ReplaceFileFlags, lpexclude: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_replaceFileW((lpreplacedfilename?.value ?: 0L), (lpreplacementfilename?.value ?: 0L), (lpbackupfilename?.value ?: 0L), dwreplaceflags.toInt(), (lpexclude?.value ?: 0L), (lpreserved?.value ?: 0L))

public actual fun reserveAndAppendLog(pvmarshal: COpaquePointer?, rgwriteentries: COpaquePointer?, cwriteentries: UInt, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, creserverecords: UInt, rgcbreservation: COpaquePointer?, fflags: ClfsFlag, plsn: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_reserveAndAppendLog((pvmarshal?.value ?: 0L), (rgwriteentries?.value ?: 0L), cwriteentries.toInt(), (plsnundonext?.value ?: 0L), (plsnprevious?.value ?: 0L), creserverecords.toInt(), (rgcbreservation?.value ?: 0L), fflags.toInt(), (plsn?.value ?: 0L), (poverlapped?.value ?: 0L))

public actual fun reserveAndAppendLogAligned(pvmarshal: COpaquePointer?, rgwriteentries: COpaquePointer?, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, creserverecords: UInt, rgcbreservation: COpaquePointer?, fflags: ClfsFlag, plsn: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_reserveAndAppendLogAligned((pvmarshal?.value ?: 0L), (rgwriteentries?.value ?: 0L), cwriteentries.toInt(), cbentryalignment.toInt(), (plsnundonext?.value ?: 0L), (plsnprevious?.value ?: 0L), creserverecords.toInt(), (rgcbreservation?.value ?: 0L), fflags.toInt(), (plsn?.value ?: 0L), (poverlapped?.value ?: 0L))

public actual fun rollbackComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_rollbackComplete((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun rollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_rollbackEnlistment((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun rollbackTransaction(transactionhandle: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_rollbackTransaction((transactionhandle?.value ?: 0L))

public actual fun rollbackTransactionAsync(transactionhandle: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_rollbackTransactionAsync((transactionhandle?.value ?: 0L))

public actual fun rollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_rollforwardTransactionManager((transactionmanagerhandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun scanLogContainers(pcxscan: COpaquePointer?, escanmode: UByte, preserved: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_scanLogContainers((pcxscan?.value ?: 0L), escanmode.toByte(), (preserved?.value ?: 0L))

public actual fun searchPathA(lppath: Pcstr, lpfilename: Pcstr, lpextension: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_searchPathA((lppath?.value ?: 0L), (lpfilename?.value ?: 0L), (lpextension?.value ?: 0L), nbufferlength.toInt(), (lpbuffer?.value ?: 0L), (lpfilepart?.value ?: 0L)).toUInt()

public actual fun searchPathW(lppath: Pcwstr, lpfilename: Pcwstr, lpextension: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_searchPathW((lppath?.value ?: 0L), (lpfilename?.value ?: 0L), (lpextension?.value ?: 0L), nbufferlength.toInt(), (lpbuffer?.value ?: 0L), (lpfilepart?.value ?: 0L)).toUInt()

public actual fun setEncryptedFileMetadata(lpfilename: Pcwstr, pboldmetadata: COpaquePointer?, pbnewmetadata: COpaquePointer?, pownerhash: COpaquePointer?, dwoperation: UInt, pcertificatesadded: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setEncryptedFileMetadata((lpfilename?.value ?: 0L), (pboldmetadata?.value ?: 0L), (pbnewmetadata?.value ?: 0L), (pownerhash?.value ?: 0L), dwoperation.toInt(), (pcertificatesadded?.value ?: 0L)).toUInt()

public actual fun setEndOfFile(hfile: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setEndOfFile((hfile?.value ?: 0L))

public actual fun setEndOfLog(hlog: Handle, plsnend: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setEndOfLog((hlog?.value ?: 0L), (plsnend?.value ?: 0L), (lpoverlapped?.value ?: 0L))

public actual fun setEnlistmentRecoveryInformation(enlistmenthandle: Handle, buffersize: UInt, buffer: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setEnlistmentRecoveryInformation((enlistmenthandle?.value ?: 0L), buffersize.toInt(), (buffer?.value ?: 0L))

public actual fun setFileApisToANSI() {
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setFileApisToANSI()
}

public actual fun setFileApisToOEM() {
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setFileApisToOEM()
}

public actual fun setFileAttributesA(lpfilename: Pcstr, dwfileattributes: FileFlagsAndAttributes): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setFileAttributesA((lpfilename?.value ?: 0L), dwfileattributes.toInt())

public actual fun setFileAttributesFromAppW(lpfilename: Pcwstr, dwfileattributes: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setFileAttributesFromAppW((lpfilename?.value ?: 0L), dwfileattributes.toInt())

public actual fun setFileAttributesTransactedA(lpfilename: Pcstr, dwfileattributes: UInt, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setFileAttributesTransactedA((lpfilename?.value ?: 0L), dwfileattributes.toInt(), (htransaction?.value ?: 0L))

public actual fun setFileAttributesTransactedW(lpfilename: Pcwstr, dwfileattributes: UInt, htransaction: Handle): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setFileAttributesTransactedW((lpfilename?.value ?: 0L), dwfileattributes.toInt(), (htransaction?.value ?: 0L))

public actual fun setFileAttributesW(lpfilename: Pcwstr, dwfileattributes: FileFlagsAndAttributes): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setFileAttributesW((lpfilename?.value ?: 0L), dwfileattributes.toInt())

public actual fun setFileBandwidthReservation(hfile: Handle, nperiodmilliseconds: UInt, nbytesperperiod: UInt, bdiscardable: Bool, lptransfersize: COpaquePointer?, lpnumoutstandingrequests: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setFileBandwidthReservation((hfile?.value ?: 0L), nperiodmilliseconds.toInt(), nbytesperperiod.toInt(), bdiscardable, (lptransfersize?.value ?: 0L), (lpnumoutstandingrequests?.value ?: 0L))

public actual fun setFileCompletionNotificationModes(filehandle: Handle, flags: UByte): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setFileCompletionNotificationModes((filehandle?.value ?: 0L), flags.toByte())

public actual fun setFileInformationByHandle(hfile: Handle, fileinformationclass: FileInfoByHandleClass, lpfileinformation: COpaquePointer?, dwbuffersize: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setFileInformationByHandle((hfile?.value ?: 0L), fileinformationclass, (lpfileinformation?.value ?: 0L), dwbuffersize.toInt())

public actual fun setFileIoOverlappedRange(filehandle: Handle, overlappedrangestart: COpaquePointer?, length: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setFileIoOverlappedRange((filehandle?.value ?: 0L), (overlappedrangestart?.value ?: 0L), length.toInt())

public actual fun setFilePointer(hfile: Handle, ldistancetomove: Int, lpdistancetomovehigh: COpaquePointer?, dwmovemethod: SetFilePointerMoveMethod): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setFilePointer((hfile?.value ?: 0L), ldistancetomove, (lpdistancetomovehigh?.value ?: 0L), dwmovemethod.toInt()).toUInt()

public actual fun setFilePointerEx(hfile: Handle, lidistancetomove: Long, lpnewfilepointer: COpaquePointer?, dwmovemethod: SetFilePointerMoveMethod): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setFilePointerEx((hfile?.value ?: 0L), lidistancetomove, (lpnewfilepointer?.value ?: 0L), dwmovemethod.toInt())

public actual fun setFileShortNameA(hfile: Handle, lpshortname: Pcstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setFileShortNameA((hfile?.value ?: 0L), (lpshortname?.value ?: 0L))

public actual fun setFileShortNameW(hfile: Handle, lpshortname: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setFileShortNameW((hfile?.value ?: 0L), (lpshortname?.value ?: 0L))

public actual fun setFileTime(hfile: Handle, lpcreationtime: COpaquePointer?, lplastaccesstime: COpaquePointer?, lplastwritetime: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setFileTime((hfile?.value ?: 0L), (lpcreationtime?.value ?: 0L), (lplastaccesstime?.value ?: 0L), (lplastwritetime?.value ?: 0L))

public actual fun setFileValidData(hfile: Handle, validdatalength: Long): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setFileValidData((hfile?.value ?: 0L), validdatalength)

public actual fun setIoRingCompletionEvent(ioring: Hioring, hevent: Handle): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setIoRingCompletionEvent((ioring?.value ?: 0L), (hevent?.value ?: 0L))

public actual fun setLogArchiveMode(hlog: Handle, emode: ClfsLogArchiveMode): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setLogArchiveMode((hlog?.value ?: 0L), emode)

public actual fun setLogArchiveTail(hlog: Handle, plsnarchivetail: COpaquePointer?, preserved: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setLogArchiveTail((hlog?.value ?: 0L), (plsnarchivetail?.value ?: 0L), (preserved?.value ?: 0L))

public actual fun setLogFileSizeWithPolicy(hlog: Handle, pdesiredsize: COpaquePointer?, presultingsize: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setLogFileSizeWithPolicy((hlog?.value ?: 0L), (pdesiredsize?.value ?: 0L), (presultingsize?.value ?: 0L))

public actual fun setResourceManagerCompletionPort(resourcemanagerhandle: Handle, iocompletionporthandle: Handle, completionkey: ULong): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setResourceManagerCompletionPort((resourcemanagerhandle?.value ?: 0L), (iocompletionporthandle?.value ?: 0L), completionkey.toLong())

public actual fun setSearchPathMode(flags: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setSearchPathMode(flags.toInt())

public actual fun setTapeParameters(hdevice: Handle, dwoperation: TapeInformationType, lptapeinformation: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setTapeParameters((hdevice?.value ?: 0L), dwoperation.toInt(), (lptapeinformation?.value ?: 0L)).toUInt()

public actual fun setTapePosition(hdevice: Handle, dwpositionmethod: TapePositionMethod, dwpartition: UInt, dwoffsetlow: UInt, dwoffsethigh: UInt, bimmediate: Bool): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setTapePosition((hdevice?.value ?: 0L), dwpositionmethod.toInt(), dwpartition.toInt(), dwoffsetlow.toInt(), dwoffsethigh.toInt(), bimmediate).toUInt()

public actual fun setTransactionInformation(transactionhandle: Handle, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setTransactionInformation((transactionhandle?.value ?: 0L), isolationlevel.toInt(), isolationflags.toInt(), timeout.toInt(), (description?.value ?: 0L))

public actual fun setUserFileEncryptionKey(pencryptioncertificate: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setUserFileEncryptionKey((pencryptioncertificate?.value ?: 0L)).toUInt()

public actual fun setUserFileEncryptionKeyEx(pencryptioncertificate: COpaquePointer?, dwcapabilities: UInt, dwflags: UInt, pvreserved: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setUserFileEncryptionKeyEx((pencryptioncertificate?.value ?: 0L), dwcapabilities.toInt(), dwflags.toInt(), (pvreserved?.value ?: 0L)).toUInt()

public actual fun setVolumeLabelA(lprootpathname: Pcstr, lpvolumename: Pcstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setVolumeLabelA((lprootpathname?.value ?: 0L), (lpvolumename?.value ?: 0L))

public actual fun setVolumeLabelW(lprootpathname: Pcwstr, lpvolumename: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setVolumeLabelW((lprootpathname?.value ?: 0L), (lpvolumename?.value ?: 0L))

public actual fun setVolumeMountPointA(lpszvolumemountpoint: Pcstr, lpszvolumename: Pcstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setVolumeMountPointA((lpszvolumemountpoint?.value ?: 0L), (lpszvolumename?.value ?: 0L))

public actual fun setVolumeMountPointW(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pcwstr): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_setVolumeMountPointW((lpszvolumemountpoint?.value ?: 0L), (lpszvolumename?.value ?: 0L))

public actual fun singlePhaseReject(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_singlePhaseReject((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun submitIoRing(ioring: Hioring, waitoperations: UInt, milliseconds: UInt, submittedentries: COpaquePointer?): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_submitIoRing((ioring?.value ?: 0L), waitoperations.toInt(), milliseconds.toInt(), (submittedentries?.value ?: 0L))

public actual fun terminateLogArchive(pvarchivecontext: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_terminateLogArchive((pvarchivecontext?.value ?: 0L))

public actual fun terminateReadLog(pvcursorcontext: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_terminateReadLog((pvcursorcontext?.value ?: 0L))

public actual fun truncateLog(pvmarshal: COpaquePointer?, plsnend: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_truncateLog((pvmarshal?.value ?: 0L), (plsnend?.value ?: 0L), (lpoverlapped?.value ?: 0L))

public actual fun txfGetThreadMiniVersionForCreate(miniversion: COpaquePointer?) {
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_txfGetThreadMiniVersionForCreate((miniversion?.value ?: 0L))
}

public actual fun txfLogCreateFileReadContext(logpath: Pcwstr, beginninglsn: ClsLsn, endinglsn: ClsLsn, txffileid: COpaquePointer?, txflogcontext: COpaquePointer?): Bool =
    0

public actual fun txfLogCreateRangeReadContext(logpath: Pcwstr, beginninglsn: ClsLsn, endinglsn: ClsLsn, beginningvirtualclock: COpaquePointer?, endingvirtualclock: COpaquePointer?, recordtypemask: UInt, txflogcontext: COpaquePointer?): Bool =
    0

public actual fun txfLogDestroyReadContext(txflogcontext: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_txfLogDestroyReadContext((txflogcontext?.value ?: 0L))

public actual fun txfLogReadRecords(txflogcontext: COpaquePointer?, bufferlength: UInt, buffer: COpaquePointer?, bytesused: COpaquePointer?, recordcount: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_txfLogReadRecords((txflogcontext?.value ?: 0L), bufferlength.toInt(), (buffer?.value ?: 0L), (bytesused?.value ?: 0L), (recordcount?.value ?: 0L))

public actual fun txfLogRecordGetFileName(recordbuffer: COpaquePointer?, recordbufferlengthinbytes: UInt, namebuffer: Pwstr, namebufferlengthinbytes: COpaquePointer?, txfid: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_txfLogRecordGetFileName((recordbuffer?.value ?: 0L), recordbufferlengthinbytes.toInt(), (namebuffer?.value ?: 0L), (namebufferlengthinbytes?.value ?: 0L), (txfid?.value ?: 0L))

public actual fun txfLogRecordGetGenericType(recordbuffer: COpaquePointer?, recordbufferlengthinbytes: UInt, generictype: COpaquePointer?, virtualclock: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_txfLogRecordGetGenericType((recordbuffer?.value ?: 0L), recordbufferlengthinbytes.toInt(), (generictype?.value ?: 0L), (virtualclock?.value ?: 0L))

public actual fun txfReadMetadataInfo(filehandle: Handle, txffileid: COpaquePointer?, lastlsn: COpaquePointer?, transactionstate: COpaquePointer?, lockingtransaction: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_txfReadMetadataInfo((filehandle?.value ?: 0L), (txffileid?.value ?: 0L), (lastlsn?.value ?: 0L), (transactionstate?.value ?: 0L), (lockingtransaction?.value ?: 0L))

public actual fun txfSetThreadMiniVersionForCreate(miniversion: UShort) {
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_txfSetThreadMiniVersionForCreate(miniversion.toShort())
}

public actual fun unlockFile(hfile: Handle, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_unlockFile((hfile?.value ?: 0L), dwfileoffsetlow.toInt(), dwfileoffsethigh.toInt(), nnumberofbytestounlocklow.toInt(), nnumberofbytestounlockhigh.toInt())

public actual fun unlockFileEx(hfile: Handle, dwreserved: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt, lpoverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_unlockFileEx((hfile?.value ?: 0L), dwreserved.toInt(), nnumberofbytestounlocklow.toInt(), nnumberofbytestounlockhigh.toInt(), (lpoverlapped?.value ?: 0L))

public actual fun validateLog(pszlogfilename: Pcwstr, psalogfile: COpaquePointer?, pinfobuffer: COpaquePointer?, pcbbuffer: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_validateLog((pszlogfilename?.value ?: 0L), (psalogfile?.value ?: 0L), (pinfobuffer?.value ?: 0L), (pcbbuffer?.value ?: 0L))

public actual fun verFindFileA(uflags: VerFindFileFlags, szfilename: Pcstr, szwindir: Pcstr, szappdir: Pcstr, szcurdir: Pstr, pucurdirlen: COpaquePointer?, szdestdir: Pstr, pudestdirlen: COpaquePointer?): VerFindFileStatus =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_verFindFileA(uflags.toInt(), (szfilename?.value ?: 0L), (szwindir?.value ?: 0L), (szappdir?.value ?: 0L), (szcurdir?.value ?: 0L), (pucurdirlen?.value ?: 0L), (szdestdir?.value ?: 0L), (pudestdirlen?.value ?: 0L)).toUInt()

public actual fun verFindFileW(uflags: VerFindFileFlags, szfilename: Pcwstr, szwindir: Pcwstr, szappdir: Pcwstr, szcurdir: Pwstr, pucurdirlen: COpaquePointer?, szdestdir: Pwstr, pudestdirlen: COpaquePointer?): VerFindFileStatus =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_verFindFileW(uflags.toInt(), (szfilename?.value ?: 0L), (szwindir?.value ?: 0L), (szappdir?.value ?: 0L), (szcurdir?.value ?: 0L), (pucurdirlen?.value ?: 0L), (szdestdir?.value ?: 0L), (pudestdirlen?.value ?: 0L)).toUInt()

public actual fun verInstallFileA(uflags: VerInstallFileFlags, szsrcfilename: Pcstr, szdestfilename: Pcstr, szsrcdir: Pcstr, szdestdir: Pcstr, szcurdir: Pcstr, sztmpfile: Pstr, putmpfilelen: COpaquePointer?): VerInstallFileStatus =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_verInstallFileA(uflags.toInt(), (szsrcfilename?.value ?: 0L), (szdestfilename?.value ?: 0L), (szsrcdir?.value ?: 0L), (szdestdir?.value ?: 0L), (szcurdir?.value ?: 0L), (sztmpfile?.value ?: 0L), (putmpfilelen?.value ?: 0L)).toUInt()

public actual fun verInstallFileW(uflags: VerInstallFileFlags, szsrcfilename: Pcwstr, szdestfilename: Pcwstr, szsrcdir: Pcwstr, szdestdir: Pcwstr, szcurdir: Pcwstr, sztmpfile: Pwstr, putmpfilelen: COpaquePointer?): VerInstallFileStatus =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_verInstallFileW(uflags.toInt(), (szsrcfilename?.value ?: 0L), (szdestfilename?.value ?: 0L), (szsrcdir?.value ?: 0L), (szdestdir?.value ?: 0L), (szcurdir?.value ?: 0L), (sztmpfile?.value ?: 0L), (putmpfilelen?.value ?: 0L)).toUInt()

public actual fun verLanguageNameA(wlang: UInt, szlang: Pstr, cchlang: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_verLanguageNameA(wlang.toInt(), (szlang?.value ?: 0L), cchlang.toInt()).toUInt()

public actual fun verLanguageNameW(wlang: UInt, szlang: Pwstr, cchlang: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_verLanguageNameW(wlang.toInt(), (szlang?.value ?: 0L), cchlang.toInt()).toUInt()

public actual fun verQueryValueA(pblock: COpaquePointer?, lpsubblock: Pcstr, lplpbuffer: COpaquePointer?, pulen: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_verQueryValueA((pblock?.value ?: 0L), (lpsubblock?.value ?: 0L), (lplpbuffer?.value ?: 0L), (pulen?.value ?: 0L))

public actual fun verQueryValueW(pblock: COpaquePointer?, lpsubblock: Pcwstr, lplpbuffer: COpaquePointer?, pulen: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_verQueryValueW((pblock?.value ?: 0L), (lpsubblock?.value ?: 0L), (lplpbuffer?.value ?: 0L), (pulen?.value ?: 0L))

public actual fun wofEnumEntries(volumename: Pcwstr, provider: UInt, enumproc: WofEnumEntryProc, userdata: COpaquePointer?): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_wofEnumEntries((volumename?.value ?: 0L), provider.toInt(), 0L, (userdata?.value ?: 0L))

public actual fun wofFileEnumFiles(volumename: Pcwstr, algorithm: UInt, enumproc: WofEnumFilesProc, userdata: COpaquePointer?): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_wofFileEnumFiles((volumename?.value ?: 0L), algorithm.toInt(), 0L, (userdata?.value ?: 0L))

public actual fun wofGetDriverVersion(fileorvolumehandle: Handle, provider: UInt, wofversion: COpaquePointer?): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_wofGetDriverVersion((fileorvolumehandle?.value ?: 0L), provider.toInt(), (wofversion?.value ?: 0L))

public actual fun wofIsExternalFile(filepath: Pcwstr, isexternalfile: COpaquePointer?, provider: COpaquePointer?, externalfileinfo: COpaquePointer?, bufferlength: COpaquePointer?): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_wofIsExternalFile((filepath?.value ?: 0L), (isexternalfile?.value ?: 0L), (provider?.value ?: 0L), (externalfileinfo?.value ?: 0L), (bufferlength?.value ?: 0L))

public actual fun wofSetFileDataLocation(filehandle: Handle, provider: UInt, externalfileinfo: COpaquePointer?, length: UInt): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_wofSetFileDataLocation((filehandle?.value ?: 0L), provider.toInt(), (externalfileinfo?.value ?: 0L), length.toInt())

public actual fun wofShouldCompressBinaries(volume: Pcwstr, algorithm: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_wofShouldCompressBinaries((volume?.value ?: 0L), (algorithm?.value ?: 0L))

public actual fun wofWimAddEntry(volumename: Pcwstr, wimpath: Pcwstr, wimtype: UInt, wimindex: UInt, datasourceid: COpaquePointer?): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_wofWimAddEntry((volumename?.value ?: 0L), (wimpath?.value ?: 0L), wimtype.toInt(), wimindex.toInt(), (datasourceid?.value ?: 0L))

public actual fun wofWimEnumFiles(volumename: Pcwstr, datasourceid: Long, enumproc: WofEnumFilesProc, userdata: COpaquePointer?): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_wofWimEnumFiles((volumename?.value ?: 0L), datasourceid, 0L, (userdata?.value ?: 0L))

public actual fun wofWimRemoveEntry(volumename: Pcwstr, datasourceid: Long): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_wofWimRemoveEntry((volumename?.value ?: 0L), datasourceid)

public actual fun wofWimSuspendEntry(volumename: Pcwstr, datasourceid: Long): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_wofWimSuspendEntry((volumename?.value ?: 0L), datasourceid)

public actual fun wofWimUpdateEntry(volumename: Pcwstr, datasourceid: Long, newwimpath: Pcwstr): Hresult =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_wofWimUpdateEntry((volumename?.value ?: 0L), datasourceid, (newwimpath?.value ?: 0L))

public actual fun wow64DisableWow64FsRedirection(oldvalue: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_wow64DisableWow64FsRedirection((oldvalue?.value ?: 0L))

public actual fun wow64EnableWow64FsRedirection(wow64fsenableredirection: Boolean): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_wow64EnableWow64FsRedirection(wow64fsenableredirection)

public actual fun wow64RevertWow64FsRedirection(olvalue: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_wow64RevertWow64FsRedirection((olvalue?.value ?: 0L))

public actual fun writeEncryptedFileRaw(pfimportcallback: PfeImportFunc, pvcallbackcontext: COpaquePointer?, pvcontext: COpaquePointer?): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_writeEncryptedFileRaw(0L, (pvcallbackcontext?.value ?: 0L), (pvcontext?.value ?: 0L)).toUInt()

public actual fun writeFile(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_writeFile((hfile?.value ?: 0L), (lpbuffer?.value ?: 0L), nnumberofbytestowrite.toInt(), (lpnumberofbyteswritten?.value ?: 0L), (lpoverlapped?.value ?: 0L))

public actual fun writeFileEx(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestowrite: UInt, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_writeFileEx((hfile?.value ?: 0L), (lpbuffer?.value ?: 0L), nnumberofbytestowrite.toInt(), (lpoverlapped?.value ?: 0L), 0L)

public actual fun writeFileGather(hfile: Handle, asegmentarray: COpaquePointer?, nnumberofbytestowrite: UInt, lpreserved: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_writeFileGather((hfile?.value ?: 0L), (asegmentarray?.value ?: 0L), nnumberofbytestowrite.toInt(), (lpreserved?.value ?: 0L), (lpoverlapped?.value ?: 0L))

public actual fun writeLogRestartArea(pvmarshal: COpaquePointer?, pvrestartbuffer: COpaquePointer?, cbrestartbuffer: UInt, plsnbase: COpaquePointer?, fflags: ClfsFlag, pcbwritten: COpaquePointer?, plsnnext: COpaquePointer?, poverlapped: COpaquePointer?): Bool =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_writeLogRestartArea((pvmarshal?.value ?: 0L), (pvrestartbuffer?.value ?: 0L), cbrestartbuffer.toInt(), (plsnbase?.value ?: 0L), fflags.toInt(), (pcbwritten?.value ?: 0L), (plsnnext?.value ?: 0L), (poverlapped?.value ?: 0L))

public actual fun writeTapemark(hdevice: Handle, dwtapemarktype: TapemarkType, dwtapemarkcount: UInt, bimmediate: Bool): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_writeTapemark((hdevice?.value ?: 0L), dwtapemarktype.toInt(), dwtapemarkcount.toInt(), bimmediate).toUInt()
