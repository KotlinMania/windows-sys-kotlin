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

private object WindowsWin32StorageFilesystemJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_AddLogContainer(hlog: Long, pcbcontainer: Long, pwszcontainerpath: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_AddLogContainerSet(hlog: Long, ccontainer: Short, pcbcontainer: Long, rgwszcontainerpath: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_AddUsersToEncryptedFile(lpfilename: Long, pencryptioncertificates: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_AdvanceLogBase(pvmarshal: Long, plsnbase: Long, fflags: Int, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_AlignReservedLog(pvmarshal: Long, creservedrecords: Int, rgcbreservation: Long, pcbalignreservation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_AllocReservedLog(pvmarshal: Long, creservedrecords: Int, pcbadjustment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_AreFileApisANSI(): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_AreShortNamesEnabled(handle: Long, enabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_BackupRead(hfile: Long, lpbuffer: Long, nnumberofbytestoread: Int, lpnumberofbytesread: Long, babort: Int, bprocesssecurity: Int, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_BackupSeek(hfile: Long, dwlowbytestoseek: Int, dwhighbytestoseek: Int, lpdwlowbyteseeked: Long, lpdwhighbyteseeked: Long, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_BackupWrite(hfile: Long, lpbuffer: Long, nnumberofbytestowrite: Int, lpnumberofbyteswritten: Long, babort: Int, bprocesssecurity: Int, lpcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_BuildIoRingRegisterBuffers(ioring: Long, count: Int, buffers: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_BuildIoRingRegisterFileHandles(ioring: Long, count: Int, handles: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CheckNameLegalDOS8Dot3A(lpname: Long, lpoemname: Long, oemnamesize: Int, pbnamecontainsspaces: Long, pbnamelegal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CheckNameLegalDOS8Dot3W(lpname: Long, lpoemname: Long, oemnamesize: Int, pbnamecontainsspaces: Long, pbnamelegal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CloseAndResetLogFile(hlog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CloseEncryptedFileRaw(pvcontext: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CloseIoRing(ioring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CommitComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CommitEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CommitTransaction(transactionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CommitTransactionAsync(transactionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CompareFileTime(lpfiletime1: Long, lpfiletime2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CopyFile2(pwszexistingfilename: Long, pwsznewfilename: Long, pextendedparameters: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CopyFileA(lpexistingfilename: Long, lpnewfilename: Long, bfailifexists: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CopyFileExA(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, pbcancel: Long, dwcopyflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CopyFileExW(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, pbcancel: Long, dwcopyflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CopyFileFromAppW(lpexistingfilename: Long, lpnewfilename: Long, bfailifexists: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CopyFileTransactedA(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, pbcancel: Long, dwcopyflags: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CopyFileTransactedW(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, pbcancel: Long, dwcopyflags: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CopyFileW(lpexistingfilename: Long, lpnewfilename: Long, bfailifexists: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CopyLZFile(hfsource: Int, hfdest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateDirectoryA(lppathname: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateDirectoryExA(lptemplatedirectory: Long, lpnewdirectory: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateDirectoryExW(lptemplatedirectory: Long, lpnewdirectory: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateDirectoryFromAppW(lppathname: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateDirectoryTransactedA(lptemplatedirectory: Long, lpnewdirectory: Long, lpsecurityattributes: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateDirectoryTransactedW(lptemplatedirectory: Long, lpnewdirectory: Long, lpsecurityattributes: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateDirectoryW(lppathname: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateEnlistment(lpenlistmentattributes: Long, resourcemanagerhandle: Long, transactionhandle: Long, notificationmask: Int, createoptions: Int, enlistmentkey: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateFile2(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, dwcreationdisposition: Int, pcreateexparams: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateFile2FromAppW(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, dwcreationdisposition: Int, pcreateexparams: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateFileA(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwcreationdisposition: Int, dwflagsandattributes: Int, htemplatefile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateFileFromAppW(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwcreationdisposition: Int, dwflagsandattributes: Int, htemplatefile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateFileTransactedA(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwcreationdisposition: Int, dwflagsandattributes: Int, htemplatefile: Long, htransaction: Long, pusminiversion: Long, lpextendedparameter: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateFileTransactedW(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwcreationdisposition: Int, dwflagsandattributes: Int, htemplatefile: Long, htransaction: Long, pusminiversion: Long, lpextendedparameter: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateFileW(lpfilename: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwcreationdisposition: Int, dwflagsandattributes: Int, htemplatefile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateHardLinkA(lpfilename: Long, lpexistingfilename: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateHardLinkTransactedA(lpfilename: Long, lpexistingfilename: Long, lpsecurityattributes: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateHardLinkTransactedW(lpfilename: Long, lpexistingfilename: Long, lpsecurityattributes: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateHardLinkW(lpfilename: Long, lpexistingfilename: Long, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateLogContainerScanContext(hlog: Long, cfromcontainer: Int, ccontainers: Int, escanmode: Byte, pcxscan: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateLogFile(pszlogfilename: Long, fdesiredaccess: Int, dwsharemode: Int, psalogfile: Long, fcreatedisposition: Int, fflagsandattributes: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateLogMarshallingArea(hlog: Long, pfnallocbuffer: Long, pfnfreebuffer: Long, pvblockalloccontext: Long, cbmarshallingbuffer: Int, cmaxwritebuffers: Int, cmaxreadbuffers: Int, ppvmarshal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateResourceManager(lpresourcemanagerattributes: Long, resourcemanagerid: Long, createoptions: Int, tmhandle: Long, description: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateSymbolicLinkA(lpsymlinkfilename: Long, lptargetfilename: Long, dwflags: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateSymbolicLinkTransactedA(lpsymlinkfilename: Long, lptargetfilename: Long, dwflags: Int, htransaction: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateSymbolicLinkTransactedW(lpsymlinkfilename: Long, lptargetfilename: Long, dwflags: Int, htransaction: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateSymbolicLinkW(lpsymlinkfilename: Long, lptargetfilename: Long, dwflags: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateTapePartition(hdevice: Long, dwpartitionmethod: Int, dwcount: Int, dwsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateTransaction(lptransactionattributes: Long, uow: Long, createoptions: Int, isolationlevel: Int, isolationflags: Int, timeout: Int, description: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_CreateTransactionManager(lptransactionattributes: Long, logfilename: Long, createoptions: Int, commitstrength: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_DecryptFileA(lpfilename: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_DecryptFileW(lpfilename: Long, dwreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_DefineDosDeviceA(dwflags: Int, lpdevicename: Long, lptargetpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_DefineDosDeviceW(dwflags: Int, lpdevicename: Long, lptargetpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_DeleteFileA(lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_DeleteFileFromAppW(lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_DeleteFileTransactedA(lpfilename: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_DeleteFileTransactedW(lpfilename: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_DeleteFileW(lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_DeleteLogByHandle(hlog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_DeleteLogFile(pszlogfilename: Long, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_DeleteLogMarshallingArea(pvmarshal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_DeleteVolumeMountPointA(lpszvolumemountpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_DeleteVolumeMountPointW(lpszvolumemountpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_DeregisterManageableLogClient(hlog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_DuplicateEncryptionInfoFile(srcfilename: Long, dstfilename: Long, dwcreationdistribution: Int, dwattributes: Int, lpsecurityattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_EncryptFileA(lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_EncryptFileW(lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_EncryptionDisable(dirpath: Long, disable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_EraseTape(hdevice: Long, dwerasetype: Int, bimmediate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FileEncryptionStatusA(lpfilename: Long, lpstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FileEncryptionStatusW(lpfilename: Long, lpstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FileTimeToLocalFileTime(lpfiletime: Long, lplocalfiletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindClose(hfindfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindCloseChangeNotification(hchangehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindFirstChangeNotificationA(lppathname: Long, bwatchsubtree: Int, dwnotifyfilter: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindFirstChangeNotificationW(lppathname: Long, bwatchsubtree: Int, dwnotifyfilter: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindFirstFileA(lpfilename: Long, lpfindfiledata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindFirstFileExA(lpfilename: Long, finfolevelid: Int, lpfindfiledata: Long, fsearchop: Int, lpsearchfilter: Long, dwadditionalflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindFirstFileExFromAppW(lpfilename: Long, finfolevelid: Int, lpfindfiledata: Long, fsearchop: Int, lpsearchfilter: Long, dwadditionalflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindFirstFileExW(lpfilename: Long, finfolevelid: Int, lpfindfiledata: Long, fsearchop: Int, lpsearchfilter: Long, dwadditionalflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindFirstFileNameTransactedW(lpfilename: Long, dwflags: Int, stringlength: Long, linkname: Long, htransaction: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindFirstFileNameW(lpfilename: Long, dwflags: Int, stringlength: Long, linkname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindFirstFileTransactedA(lpfilename: Long, finfolevelid: Int, lpfindfiledata: Long, fsearchop: Int, lpsearchfilter: Long, dwadditionalflags: Int, htransaction: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindFirstFileTransactedW(lpfilename: Long, finfolevelid: Int, lpfindfiledata: Long, fsearchop: Int, lpsearchfilter: Long, dwadditionalflags: Int, htransaction: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindFirstFileW(lpfilename: Long, lpfindfiledata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindFirstStreamTransactedW(lpfilename: Long, infolevel: Int, lpfindstreamdata: Long, dwflags: Int, htransaction: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindFirstStreamW(lpfilename: Long, infolevel: Int, lpfindstreamdata: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindFirstVolumeA(lpszvolumename: Long, cchbufferlength: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindFirstVolumeMountPointA(lpszrootpathname: Long, lpszvolumemountpoint: Long, cchbufferlength: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindFirstVolumeMountPointW(lpszrootpathname: Long, lpszvolumemountpoint: Long, cchbufferlength: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindFirstVolumeW(lpszvolumename: Long, cchbufferlength: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindNextChangeNotification(hchangehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindNextFileA(hfindfile: Long, lpfindfiledata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindNextFileNameW(hfindstream: Long, stringlength: Long, linkname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindNextFileW(hfindfile: Long, lpfindfiledata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindNextStreamW(hfindstream: Long, lpfindstreamdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindNextVolumeA(hfindvolume: Long, lpszvolumename: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindNextVolumeMountPointA(hfindvolumemountpoint: Long, lpszvolumemountpoint: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindNextVolumeMountPointW(hfindvolumemountpoint: Long, lpszvolumemountpoint: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindNextVolumeW(hfindvolume: Long, lpszvolumename: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindVolumeClose(hfindvolume: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FindVolumeMountPointClose(hfindvolumemountpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FlushFileBuffers(hfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FlushLogBuffers(pvmarshal: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FlushLogToLsn(pvmarshalcontext: Long, plsnflush: Long, plsnlastflushed: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FreeEncryptedFileMetadata(pbmetadata: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FreeEncryptionCertificateHashList(pusers: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_FreeReservedLog(pvmarshal: Long, creservedrecords: Int, pcbadjustment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetBinaryTypeA(lpapplicationname: Long, lpbinarytype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetBinaryTypeW(lpapplicationname: Long, lpbinarytype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetCompressedFileSizeA(lpfilename: Long, lpfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetCompressedFileSizeTransactedA(lpfilename: Long, lpfilesizehigh: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetCompressedFileSizeTransactedW(lpfilename: Long, lpfilesizehigh: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetCompressedFileSizeW(lpfilename: Long, lpfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetCurrentClockTransactionManager(transactionmanagerhandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetDiskFreeSpaceA(lprootpathname: Long, lpsectorspercluster: Long, lpbytespersector: Long, lpnumberoffreeclusters: Long, lptotalnumberofclusters: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetDiskFreeSpaceExA(lpdirectoryname: Long, lpfreebytesavailabletocaller: Long, lptotalnumberofbytes: Long, lptotalnumberoffreebytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetDiskFreeSpaceExW(lpdirectoryname: Long, lpfreebytesavailabletocaller: Long, lptotalnumberofbytes: Long, lptotalnumberoffreebytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetDiskFreeSpaceW(lprootpathname: Long, lpsectorspercluster: Long, lpbytespersector: Long, lpnumberoffreeclusters: Long, lptotalnumberofclusters: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetDiskSpaceInformationA(rootpath: Long, diskspaceinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetDiskSpaceInformationW(rootpath: Long, diskspaceinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetDriveTypeA(lprootpathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetDriveTypeW(lprootpathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetEncryptedFileMetadata(lpfilename: Long, pcbmetadata: Long, ppbmetadata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetEnlistmentId(enlistmenthandle: Long, enlistmentid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetEnlistmentRecoveryInformation(enlistmenthandle: Long, buffersize: Int, buffer: Long, bufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetExpandedNameA(lpszsource: Long, lpszbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetExpandedNameW(lpszsource: Long, lpszbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileAttributesA(lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileAttributesExA(lpfilename: Long, finfolevelid: Int, lpfileinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileAttributesExFromAppW(lpfilename: Long, finfolevelid: Int, lpfileinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileAttributesExW(lpfilename: Long, finfolevelid: Int, lpfileinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileAttributesTransactedA(lpfilename: Long, finfolevelid: Int, lpfileinformation: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileAttributesTransactedW(lpfilename: Long, finfolevelid: Int, lpfileinformation: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileAttributesW(lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileBandwidthReservation(hfile: Long, lpperiodmilliseconds: Long, lpbytesperperiod: Long, pdiscardable: Long, lptransfersize: Long, lpnumoutstandingrequests: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileInformationByHandle(hfile: Long, lpfileinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileInformationByHandleEx(hfile: Long, fileinformationclass: Int, lpfileinformation: Long, dwbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileSize(hfile: Long, lpfilesizehigh: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileSizeEx(hfile: Long, lpfilesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileTime(hfile: Long, lpcreationtime: Long, lplastaccesstime: Long, lplastwritetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileType(hfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileVersionInfoA(lptstrfilename: Long, dwhandle: Int, dwlen: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileVersionInfoExA(dwflags: Int, lpwstrfilename: Long, dwhandle: Int, dwlen: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileVersionInfoExW(dwflags: Int, lpwstrfilename: Long, dwhandle: Int, dwlen: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileVersionInfoSizeA(lptstrfilename: Long, lpdwhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileVersionInfoSizeExA(dwflags: Int, lpwstrfilename: Long, lpdwhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileVersionInfoSizeExW(dwflags: Int, lpwstrfilename: Long, lpdwhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileVersionInfoSizeW(lptstrfilename: Long, lpdwhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFileVersionInfoW(lptstrfilename: Long, dwhandle: Int, dwlen: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFinalPathNameByHandleA(hfile: Long, lpszfilepath: Long, cchfilepath: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFinalPathNameByHandleW(hfile: Long, lpszfilepath: Long, cchfilepath: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFullPathNameA(lpfilename: Long, nbufferlength: Int, lpbuffer: Long, lpfilepart: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFullPathNameTransactedA(lpfilename: Long, nbufferlength: Int, lpbuffer: Long, lpfilepart: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFullPathNameTransactedW(lpfilename: Long, nbufferlength: Int, lpbuffer: Long, lpfilepart: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetFullPathNameW(lpfilename: Long, nbufferlength: Int, lpbuffer: Long, lpfilepart: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetIoRingInfo(ioring: Long, info: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetLogContainerName(hlog: Long, cidlogicalcontainer: Int, pwstrcontainername: Long, clencontainername: Int, pcactuallencontainername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetLogFileInformation(hlog: Long, pinfobuffer: Long, cbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetLogIoStatistics(hlog: Long, pvstatsbuffer: Long, cbstatsbuffer: Int, estatsclass: Int, pcbstatswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetLogReservationInfo(pvmarshal: Long, pcbrecordnumber: Long, pcbuserreservation: Long, pcbcommitreservation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetLogicalDriveStringsA(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetLogicalDriveStringsW(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetLogicalDrives(): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetLongPathNameA(lpszshortpath: Long, lpszlongpath: Long, cchbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetLongPathNameTransactedA(lpszshortpath: Long, lpszlongpath: Long, cchbuffer: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetLongPathNameTransactedW(lpszshortpath: Long, lpszlongpath: Long, cchbuffer: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetLongPathNameW(lpszshortpath: Long, lpszlongpath: Long, cchbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetNextLogArchiveExtent(pvarchivecontext: Long, rgadextent: Long, cdescriptors: Int, pcdescriptorsreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetNotificationResourceManager(resourcemanagerhandle: Long, transactionnotification: Long, notificationlength: Int, dwmilliseconds: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetNotificationResourceManagerAsync(resourcemanagerhandle: Long, transactionnotification: Long, transactionnotificationlength: Int, returnlength: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetShortPathNameA(lpszlongpath: Long, lpszshortpath: Long, cchbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetShortPathNameW(lpszlongpath: Long, lpszshortpath: Long, cchbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetTapeParameters(hdevice: Long, dwoperation: Int, lpdwsize: Long, lptapeinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetTapePosition(hdevice: Long, dwpositiontype: Int, lpdwpartition: Long, lpdwoffsetlow: Long, lpdwoffsethigh: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetTapeStatus(hdevice: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetTempFileNameA(lppathname: Long, lpprefixstring: Long, uunique: Int, lptempfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetTempFileNameW(lppathname: Long, lpprefixstring: Long, uunique: Int, lptempfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetTempPath2A(bufferlength: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetTempPath2W(bufferlength: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetTempPathA(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetTempPathW(nbufferlength: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetTransactionId(transactionhandle: Long, transactionid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetTransactionInformation(transactionhandle: Long, outcome: Long, isolationlevel: Long, isolationflags: Long, timeout: Long, bufferlength: Int, description: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetTransactionManagerId(transactionmanagerhandle: Long, transactionmanagerid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetVolumeInformationA(lprootpathname: Long, lpvolumenamebuffer: Long, nvolumenamesize: Int, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: Long, nfilesystemnamesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetVolumeInformationByHandleW(hfile: Long, lpvolumenamebuffer: Long, nvolumenamesize: Int, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: Long, nfilesystemnamesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetVolumeInformationW(lprootpathname: Long, lpvolumenamebuffer: Long, nvolumenamesize: Int, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: Long, nfilesystemnamesize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetVolumeNameForVolumeMountPointA(lpszvolumemountpoint: Long, lpszvolumename: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetVolumeNameForVolumeMountPointW(lpszvolumemountpoint: Long, lpszvolumename: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetVolumePathNameA(lpszfilename: Long, lpszvolumepathname: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetVolumePathNameW(lpszfilename: Long, lpszvolumepathname: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetVolumePathNamesForVolumeNameA(lpszvolumename: Long, lpszvolumepathnames: Long, cchbufferlength: Int, lpcchreturnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_GetVolumePathNamesForVolumeNameW(lpszvolumename: Long, lpszvolumepathnames: Long, cchbufferlength: Int, lpcchreturnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_HandleLogFull(hlog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_InstallLogPolicy(hlog: Long, ppolicy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_IsIoRingOpSupported(ioring: Long, op: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LZClose(hfile: Int)

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LZCopy(hfsource: Int, hfdest: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LZDone()

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LZInit(hfsource: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LZOpenFileA(lpfilename: Long, lpreopenbuf: Long, wstyle: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LZOpenFileW(lpfilename: Long, lpreopenbuf: Long, wstyle: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LZRead(hfile: Int, lpbuffer: Long, cbread: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LZSeek(hfile: Int, loffset: Int, iorigin: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LZStart(): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LocalFileTimeToFileTime(lplocalfiletime: Long, lpfiletime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LockFile(hfile: Long, dwfileoffsetlow: Int, dwfileoffsethigh: Int, nnumberofbytestolocklow: Int, nnumberofbytestolockhigh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LockFileEx(hfile: Long, dwflags: Int, dwreserved: Int, nnumberofbytestolocklow: Int, nnumberofbytestolockhigh: Int, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LogTailAdvanceFailure(hlog: Long, dwreason: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LsnBlockOffset(plsn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LsnContainer(plsn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LsnEqual(plsn1: Long, plsn2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LsnGreater(plsn1: Long, plsn2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LsnInvalid(plsn: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LsnLess(plsn1: Long, plsn2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LsnNull(plsn: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_LsnRecordSequence(plsn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_MoveFileA(lpexistingfilename: Long, lpnewfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_MoveFileExA(lpexistingfilename: Long, lpnewfilename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_MoveFileExW(lpexistingfilename: Long, lpnewfilename: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_MoveFileFromAppW(lpexistingfilename: Long, lpnewfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_MoveFileTransactedA(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, dwflags: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_MoveFileTransactedW(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, dwflags: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_MoveFileW(lpexistingfilename: Long, lpnewfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_MoveFileWithProgressA(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_MoveFileWithProgressW(lpexistingfilename: Long, lpnewfilename: Long, lpprogressroutine: Long, lpdata: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_NetConnectionEnum(servername: Long, qualifier: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resume_handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_NetFileClose(servername: Long, fileid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_NetFileEnum(servername: Long, basepath: Long, username: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resume_handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_NetFileGetInfo(servername: Long, fileid: Int, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_NetServerAliasAdd(servername: Long, level: Int, buf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_NetServerAliasDel(servername: Long, level: Int, buf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_NetServerAliasEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resumehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_NetSessionDel(servername: Long, uncclientname: Long, username: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_NetSessionEnum(servername: Long, uncclientname: Long, username: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resume_handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_NetSessionGetInfo(servername: Long, uncclientname: Long, username: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_NetShareAdd(servername: Long, level: Int, buf: Long, parm_err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_NetShareCheck(servername: Long, device: Long, type: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_NetShareDel(servername: Long, netname: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_NetShareDelEx(servername: Long, level: Int, buf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_NetShareDelSticky(servername: Long, netname: Long, reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_NetShareEnum(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resume_handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_NetShareEnumSticky(servername: Long, level: Int, bufptr: Long, prefmaxlen: Int, entriesread: Long, totalentries: Long, resume_handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_NetShareGetInfo(servername: Long, netname: Long, level: Int, bufptr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_NetShareSetInfo(servername: Long, netname: Long, level: Int, buf: Long, parm_err: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_NetStatisticsGet(servername: Long, service: Long, level: Int, options: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_OpenEncryptedFileRawA(lpfilename: Long, ulflags: Int, pvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_OpenEncryptedFileRawW(lpfilename: Long, ulflags: Int, pvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_OpenEnlistment(dwdesiredaccess: Int, resourcemanagerhandle: Long, enlistmentid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_OpenFile(lpfilename: Long, lpreopenbuff: Long, ustyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_OpenFileById(hvolumehint: Long, lpfileid: Long, dwdesiredaccess: Int, dwsharemode: Int, lpsecurityattributes: Long, dwflagsandattributes: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_OpenResourceManager(dwdesiredaccess: Int, tmhandle: Long, resourcemanagerid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_OpenTransaction(dwdesiredaccess: Int, transactionid: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_OpenTransactionManager(logfilename: Long, desiredaccess: Int, openoptions: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_OpenTransactionManagerById(transactionmanagerid: Long, desiredaccess: Int, openoptions: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_PopIoRingCompletion(ioring: Long, cqe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_PrePrepareComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_PrePrepareEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_PrepareComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_PrepareEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_PrepareLogArchive(hlog: Long, pszbaselogfilename: Long, clen: Int, plsnlow: Long, plsnhigh: Long, pcactuallength: Long, poffbaselogfiledata: Long, pcbbaselogfilelength: Long, plsnbase: Long, plsnlast: Long, plsncurrentarchivetail: Long, ppvarchivecontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_PrepareTape(hdevice: Long, dwoperation: Int, bimmediate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_QueryDosDeviceA(lpdevicename: Long, lptargetpath: Long, ucchmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_QueryDosDeviceW(lpdevicename: Long, lptargetpath: Long, ucchmax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_QueryIoRingCapabilities(capabilities: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_QueryLogPolicy(hlog: Long, epolicytype: Int, ppolicybuffer: Long, pcbpolicybuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_QueryRecoveryAgentsOnEncryptedFile(lpfilename: Long, precoveryagents: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_QueryUsersOnEncryptedFile(lpfilename: Long, pusers: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_ReOpenFile(horiginalfile: Long, dwdesiredaccess: Int, dwsharemode: Int, dwflagsandattributes: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_ReadEncryptedFileRaw(pfexportcallback: Long, pvcallbackcontext: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_ReadFile(hfile: Long, lpbuffer: Long, nnumberofbytestoread: Int, lpnumberofbytesread: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_ReadFileScatter(hfile: Long, asegmentarray: Long, nnumberofbytestoread: Int, lpreserved: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_ReadLogArchiveMetadata(pvarchivecontext: Long, cboffset: Int, cbbytestoread: Int, pbreadbuffer: Long, pcbbytesread: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_ReadLogNotification(hlog: Long, pnotification: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_ReadLogRecord(pvmarshal: Long, plsnfirst: Long, econtextmode: Int, ppvreadbuffer: Long, pcbreadbuffer: Long, perecordtype: Long, plsnundonext: Long, plsnprevious: Long, ppvreadcontext: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_ReadLogRestartArea(pvmarshal: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsn: Long, ppvcontext: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_ReadNextLogRecord(pvreadcontext: Long, ppvbuffer: Long, pcbbuffer: Long, perecordtype: Long, plsnuser: Long, plsnundonext: Long, plsnprevious: Long, plsnrecord: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_ReadOnlyEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_ReadPreviousLogRestartArea(pvreadcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsnrestart: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_RecoverEnlistment(enlistmenthandle: Long, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_RecoverResourceManager(resourcemanagerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_RecoverTransactionManager(transactionmanagerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_RegisterForLogWriteNotification(hlog: Long, cbthreshold: Int, fenable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_RegisterManageableLogClient(hlog: Long, pcallbacks: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_RemoveDirectoryA(lppathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_RemoveDirectoryFromAppW(lppathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_RemoveDirectoryTransactedA(lppathname: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_RemoveDirectoryTransactedW(lppathname: Long, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_RemoveDirectoryW(lppathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_RemoveLogContainer(hlog: Long, pwszcontainerpath: Long, fforce: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_RemoveLogContainerSet(hlog: Long, ccontainer: Short, rgwszcontainerpath: Long, fforce: Int, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_RemoveLogPolicy(hlog: Long, epolicytype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_RemoveUsersFromEncryptedFile(lpfilename: Long, phashes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_RenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_ReplaceFileA(lpreplacedfilename: Long, lpreplacementfilename: Long, lpbackupfilename: Long, dwreplaceflags: Int, lpexclude: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_ReplaceFileFromAppW(lpreplacedfilename: Long, lpreplacementfilename: Long, lpbackupfilename: Long, dwreplaceflags: Int, lpexclude: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_ReplaceFileW(lpreplacedfilename: Long, lpreplacementfilename: Long, lpbackupfilename: Long, dwreplaceflags: Int, lpexclude: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_ReserveAndAppendLog(pvmarshal: Long, rgwriteentries: Long, cwriteentries: Int, plsnundonext: Long, plsnprevious: Long, creserverecords: Int, rgcbreservation: Long, fflags: Int, plsn: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_ReserveAndAppendLogAligned(pvmarshal: Long, rgwriteentries: Long, cwriteentries: Int, cbentryalignment: Int, plsnundonext: Long, plsnprevious: Long, creserverecords: Int, rgcbreservation: Long, fflags: Int, plsn: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_RollbackComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_RollbackEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_RollbackTransaction(transactionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_RollbackTransactionAsync(transactionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_RollforwardTransactionManager(transactionmanagerhandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_ScanLogContainers(pcxscan: Long, escanmode: Byte, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SearchPathA(lppath: Long, lpfilename: Long, lpextension: Long, nbufferlength: Int, lpbuffer: Long, lpfilepart: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SearchPathW(lppath: Long, lpfilename: Long, lpextension: Long, nbufferlength: Int, lpbuffer: Long, lpfilepart: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetEncryptedFileMetadata(lpfilename: Long, pboldmetadata: Long, pbnewmetadata: Long, pownerhash: Long, dwoperation: Int, pcertificatesadded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetEndOfFile(hfile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetEndOfLog(hlog: Long, plsnend: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetEnlistmentRecoveryInformation(enlistmenthandle: Long, buffersize: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetFileApisToANSI()

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetFileApisToOEM()

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetFileAttributesA(lpfilename: Long, dwfileattributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetFileAttributesFromAppW(lpfilename: Long, dwfileattributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetFileAttributesTransactedA(lpfilename: Long, dwfileattributes: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetFileAttributesTransactedW(lpfilename: Long, dwfileattributes: Int, htransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetFileAttributesW(lpfilename: Long, dwfileattributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetFileBandwidthReservation(hfile: Long, nperiodmilliseconds: Int, nbytesperperiod: Int, bdiscardable: Int, lptransfersize: Long, lpnumoutstandingrequests: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetFileCompletionNotificationModes(filehandle: Long, flags: Byte): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetFileInformationByHandle(hfile: Long, fileinformationclass: Int, lpfileinformation: Long, dwbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetFileIoOverlappedRange(filehandle: Long, overlappedrangestart: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetFilePointer(hfile: Long, ldistancetomove: Int, lpdistancetomovehigh: Long, dwmovemethod: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetFilePointerEx(hfile: Long, lidistancetomove: Long, lpnewfilepointer: Long, dwmovemethod: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetFileShortNameA(hfile: Long, lpshortname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetFileShortNameW(hfile: Long, lpshortname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetFileTime(hfile: Long, lpcreationtime: Long, lplastaccesstime: Long, lplastwritetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetFileValidData(hfile: Long, validdatalength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetIoRingCompletionEvent(ioring: Long, hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetLogArchiveMode(hlog: Long, emode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetLogArchiveTail(hlog: Long, plsnarchivetail: Long, preserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetLogFileSizeWithPolicy(hlog: Long, pdesiredsize: Long, presultingsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetResourceManagerCompletionPort(resourcemanagerhandle: Long, iocompletionporthandle: Long, completionkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetSearchPathMode(flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetTapeParameters(hdevice: Long, dwoperation: Int, lptapeinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetTapePosition(hdevice: Long, dwpositionmethod: Int, dwpartition: Int, dwoffsetlow: Int, dwoffsethigh: Int, bimmediate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetTransactionInformation(transactionhandle: Long, isolationlevel: Int, isolationflags: Int, timeout: Int, description: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetUserFileEncryptionKey(pencryptioncertificate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetUserFileEncryptionKeyEx(pencryptioncertificate: Long, dwcapabilities: Int, dwflags: Int, pvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetVolumeLabelA(lprootpathname: Long, lpvolumename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetVolumeLabelW(lprootpathname: Long, lpvolumename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetVolumeMountPointA(lpszvolumemountpoint: Long, lpszvolumename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SetVolumeMountPointW(lpszvolumemountpoint: Long, lpszvolumename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SinglePhaseReject(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_SubmitIoRing(ioring: Long, waitoperations: Int, milliseconds: Int, submittedentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_TerminateLogArchive(pvarchivecontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_TerminateReadLog(pvcursorcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_TruncateLog(pvmarshal: Long, plsnend: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_TxfGetThreadMiniVersionForCreate(miniversion: Long)

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_TxfLogDestroyReadContext(txflogcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_TxfLogReadRecords(txflogcontext: Long, bufferlength: Int, buffer: Long, bytesused: Long, recordcount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_TxfLogRecordGetFileName(recordbuffer: Long, recordbufferlengthinbytes: Int, namebuffer: Long, namebufferlengthinbytes: Long, txfid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_TxfLogRecordGetGenericType(recordbuffer: Long, recordbufferlengthinbytes: Int, generictype: Long, virtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_TxfReadMetadataInfo(filehandle: Long, txffileid: Long, lastlsn: Long, transactionstate: Long, lockingtransaction: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_TxfSetThreadMiniVersionForCreate(miniversion: Short)

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_UnlockFile(hfile: Long, dwfileoffsetlow: Int, dwfileoffsethigh: Int, nnumberofbytestounlocklow: Int, nnumberofbytestounlockhigh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_UnlockFileEx(hfile: Long, dwreserved: Int, nnumberofbytestounlocklow: Int, nnumberofbytestounlockhigh: Int, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_ValidateLog(pszlogfilename: Long, psalogfile: Long, pinfobuffer: Long, pcbbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_VerFindFileA(uflags: Int, szfilename: Long, szwindir: Long, szappdir: Long, szcurdir: Long, pucurdirlen: Long, szdestdir: Long, pudestdirlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_VerFindFileW(uflags: Int, szfilename: Long, szwindir: Long, szappdir: Long, szcurdir: Long, pucurdirlen: Long, szdestdir: Long, pudestdirlen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_VerInstallFileA(uflags: Int, szsrcfilename: Long, szdestfilename: Long, szsrcdir: Long, szdestdir: Long, szcurdir: Long, sztmpfile: Long, putmpfilelen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_VerInstallFileW(uflags: Int, szsrcfilename: Long, szdestfilename: Long, szsrcdir: Long, szdestdir: Long, szcurdir: Long, sztmpfile: Long, putmpfilelen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_VerLanguageNameA(wlang: Int, szlang: Long, cchlang: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_VerLanguageNameW(wlang: Int, szlang: Long, cchlang: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_VerQueryValueA(pblock: Long, lpsubblock: Long, lplpbuffer: Long, pulen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_VerQueryValueW(pblock: Long, lpsubblock: Long, lplpbuffer: Long, pulen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_WofEnumEntries(volumename: Long, provider: Int, enumproc: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_WofFileEnumFiles(volumename: Long, algorithm: Int, enumproc: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_WofGetDriverVersion(fileorvolumehandle: Long, provider: Int, wofversion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_WofIsExternalFile(filepath: Long, isexternalfile: Long, provider: Long, externalfileinfo: Long, bufferlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_WofSetFileDataLocation(filehandle: Long, provider: Int, externalfileinfo: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_WofShouldCompressBinaries(volume: Long, algorithm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_WofWimAddEntry(volumename: Long, wimpath: Long, wimtype: Int, wimindex: Int, datasourceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_WofWimEnumFiles(volumename: Long, datasourceid: Long, enumproc: Long, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_WofWimRemoveEntry(volumename: Long, datasourceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_WofWimSuspendEntry(volumename: Long, datasourceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_WofWimUpdateEntry(volumename: Long, datasourceid: Long, newwimpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_Wow64DisableWow64FsRedirection(oldvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_Wow64EnableWow64FsRedirection(wow64fsenableredirection: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_Wow64RevertWow64FsRedirection(olvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_WriteEncryptedFileRaw(pfimportcallback: Long, pvcallbackcontext: Long, pvcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_WriteFile(hfile: Long, lpbuffer: Long, nnumberofbytestowrite: Int, lpnumberofbyteswritten: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_WriteFileGather(hfile: Long, asegmentarray: Long, nnumberofbytestowrite: Int, lpreserved: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_WriteLogRestartArea(pvmarshal: Long, pvrestartbuffer: Long, cbrestartbuffer: Int, plsnbase: Long, fflags: Int, pcbwritten: Long, plsnnext: Long, poverlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_filesystem_WriteTapemark(hdevice: Long, dwtapemarktype: Int, dwtapemarkcount: Int, bimmediate: Int): Int
}

public actual fun AddLogContainer(hlog: HANDLE, pcbcontainer: Long, pwszcontainerpath: PCWSTR, preserved: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_AddLogContainer(hlog, pcbcontainer, pwszcontainerpath, preserved)

public actual fun AddLogContainerSet(hlog: HANDLE, ccontainer: UShort, pcbcontainer: Long, rgwszcontainerpath: Long, preserved: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_AddLogContainerSet(hlog, ccontainer.toShort(), pcbcontainer, rgwszcontainerpath, preserved)

public actual fun AddUsersToEncryptedFile(lpfilename: PCWSTR, pencryptioncertificates: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_AddUsersToEncryptedFile(lpfilename, pencryptioncertificates).toUInt()

public actual fun AdvanceLogBase(pvmarshal: Long, plsnbase: Long, fflags: UInt, poverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_AdvanceLogBase(pvmarshal, plsnbase, fflags.toInt(), poverlapped)

public actual fun AlignReservedLog(pvmarshal: Long, creservedrecords: UInt, rgcbreservation: Long, pcbalignreservation: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_AlignReservedLog(pvmarshal, creservedrecords.toInt(), rgcbreservation, pcbalignreservation)

public actual fun AllocReservedLog(pvmarshal: Long, creservedrecords: UInt, pcbadjustment: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_AllocReservedLog(pvmarshal, creservedrecords.toInt(), pcbadjustment)

public actual fun AreFileApisANSI(): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_AreFileApisANSI()

public actual fun AreShortNamesEnabled(handle: HANDLE, enabled: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_AreShortNamesEnabled(handle, enabled)

public actual fun BackupRead(hfile: HANDLE, lpbuffer: Long, nnumberofbytestoread: UInt, lpnumberofbytesread: Long, babort: BOOL, bprocesssecurity: BOOL, lpcontext: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_BackupRead(hfile, lpbuffer, nnumberofbytestoread.toInt(), lpnumberofbytesread, babort, bprocesssecurity, lpcontext)

public actual fun BackupSeek(hfile: HANDLE, dwlowbytestoseek: UInt, dwhighbytestoseek: UInt, lpdwlowbyteseeked: Long, lpdwhighbyteseeked: Long, lpcontext: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_BackupSeek(hfile, dwlowbytestoseek.toInt(), dwhighbytestoseek.toInt(), lpdwlowbyteseeked, lpdwhighbyteseeked, lpcontext)

public actual fun BackupWrite(hfile: HANDLE, lpbuffer: Long, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: Long, babort: BOOL, bprocesssecurity: BOOL, lpcontext: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_BackupWrite(hfile, lpbuffer, nnumberofbytestowrite.toInt(), lpnumberofbyteswritten, babort, bprocesssecurity, lpcontext)

public actual fun BuildIoRingCancelRequest(ioring: HIORING, file: IORING_HANDLE_REF, optocancel: ULong, userdata: ULong): HRESULT =
    0

public actual fun BuildIoRingFlushFile(ioring: HIORING, fileref: IORING_HANDLE_REF, flushmode: FILE_FLUSH_MODE, userdata: ULong, sqeflags: IORING_SQE_FLAGS): HRESULT =
    0

public actual fun BuildIoRingReadFile(ioring: HIORING, fileref: IORING_HANDLE_REF, dataref: IORING_BUFFER_REF, numberofbytestoread: UInt, fileoffset: ULong, userdata: ULong, sqeflags: IORING_SQE_FLAGS): HRESULT =
    0

public actual fun BuildIoRingRegisterBuffers(ioring: HIORING, count: UInt, buffers: Long, userdata: ULong): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_BuildIoRingRegisterBuffers(ioring, count.toInt(), buffers, userdata.toLong())

public actual fun BuildIoRingRegisterFileHandles(ioring: HIORING, count: UInt, handles: Long, userdata: ULong): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_BuildIoRingRegisterFileHandles(ioring, count.toInt(), handles, userdata.toLong())

public actual fun BuildIoRingWriteFile(ioring: HIORING, fileref: IORING_HANDLE_REF, bufferref: IORING_BUFFER_REF, numberofbytestowrite: UInt, fileoffset: ULong, writeflags: FILE_WRITE_FLAGS, userdata: ULong, sqeflags: IORING_SQE_FLAGS): HRESULT =
    0

public actual fun CheckNameLegalDOS8Dot3A(lpname: PCSTR, lpoemname: PSTR, oemnamesize: UInt, pbnamecontainsspaces: Long, pbnamelegal: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CheckNameLegalDOS8Dot3A(lpname, lpoemname, oemnamesize.toInt(), pbnamecontainsspaces, pbnamelegal)

public actual fun CheckNameLegalDOS8Dot3W(lpname: PCWSTR, lpoemname: PSTR, oemnamesize: UInt, pbnamecontainsspaces: Long, pbnamelegal: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CheckNameLegalDOS8Dot3W(lpname, lpoemname, oemnamesize.toInt(), pbnamecontainsspaces, pbnamelegal)

public actual fun CloseAndResetLogFile(hlog: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CloseAndResetLogFile(hlog)

public actual fun CloseEncryptedFileRaw(pvcontext: Long) {
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CloseEncryptedFileRaw(pvcontext)
}

public actual fun CloseIoRing(ioring: HIORING): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CloseIoRing(ioring)

public actual fun CommitComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CommitComplete(enlistmenthandle, tmvirtualclock)

public actual fun CommitEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CommitEnlistment(enlistmenthandle, tmvirtualclock)

public actual fun CommitTransaction(transactionhandle: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CommitTransaction(transactionhandle)

public actual fun CommitTransactionAsync(transactionhandle: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CommitTransactionAsync(transactionhandle)

public actual fun CompareFileTime(lpfiletime1: Long, lpfiletime2: Long): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CompareFileTime(lpfiletime1, lpfiletime2)

public actual fun CopyFile2(pwszexistingfilename: PCWSTR, pwsznewfilename: PCWSTR, pextendedparameters: Long): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CopyFile2(pwszexistingfilename, pwsznewfilename, pextendedparameters)

public actual fun CopyFileA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, bfailifexists: BOOL): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CopyFileA(lpexistingfilename, lpnewfilename, bfailifexists)

public actual fun CopyFileExA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: COPYFILE_FLAGS): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CopyFileExA(lpexistingfilename, lpnewfilename, lpprogressroutine.toLong(), lpdata, pbcancel, dwcopyflags.toInt())

public actual fun CopyFileExW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: COPYFILE_FLAGS): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CopyFileExW(lpexistingfilename, lpnewfilename, lpprogressroutine.toLong(), lpdata, pbcancel, dwcopyflags.toInt())

public actual fun CopyFileFromAppW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, bfailifexists: BOOL): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CopyFileFromAppW(lpexistingfilename, lpnewfilename, bfailifexists)

public actual fun CopyFileTransactedA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: UInt, htransaction: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CopyFileTransactedA(lpexistingfilename, lpnewfilename, lpprogressroutine.toLong(), lpdata, pbcancel, dwcopyflags.toInt(), htransaction)

public actual fun CopyFileTransactedW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: UInt, htransaction: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CopyFileTransactedW(lpexistingfilename, lpnewfilename, lpprogressroutine.toLong(), lpdata, pbcancel, dwcopyflags.toInt(), htransaction)

public actual fun CopyFileW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, bfailifexists: BOOL): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CopyFileW(lpexistingfilename, lpnewfilename, bfailifexists)

public actual fun CopyLZFile(hfsource: Int, hfdest: Int): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CopyLZFile(hfsource, hfdest)

public actual fun CreateDirectoryA(lppathname: PCSTR, lpsecurityattributes: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateDirectoryA(lppathname, lpsecurityattributes)

public actual fun CreateDirectoryExA(lptemplatedirectory: PCSTR, lpnewdirectory: PCSTR, lpsecurityattributes: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateDirectoryExA(lptemplatedirectory, lpnewdirectory, lpsecurityattributes)

public actual fun CreateDirectoryExW(lptemplatedirectory: PCWSTR, lpnewdirectory: PCWSTR, lpsecurityattributes: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateDirectoryExW(lptemplatedirectory, lpnewdirectory, lpsecurityattributes)

public actual fun CreateDirectoryFromAppW(lppathname: PCWSTR, lpsecurityattributes: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateDirectoryFromAppW(lppathname, lpsecurityattributes)

public actual fun CreateDirectoryTransactedA(lptemplatedirectory: PCSTR, lpnewdirectory: PCSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateDirectoryTransactedA(lptemplatedirectory, lpnewdirectory, lpsecurityattributes, htransaction)

public actual fun CreateDirectoryTransactedW(lptemplatedirectory: PCWSTR, lpnewdirectory: PCWSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateDirectoryTransactedW(lptemplatedirectory, lpnewdirectory, lpsecurityattributes, htransaction)

public actual fun CreateDirectoryW(lppathname: PCWSTR, lpsecurityattributes: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateDirectoryW(lppathname, lpsecurityattributes)

public actual fun CreateEnlistment(lpenlistmentattributes: Long, resourcemanagerhandle: HANDLE, transactionhandle: HANDLE, notificationmask: UInt, createoptions: UInt, enlistmentkey: Long): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateEnlistment(lpenlistmentattributes, resourcemanagerhandle, transactionhandle, notificationmask.toInt(), createoptions.toInt(), enlistmentkey)

public actual fun CreateFile2(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, dwcreationdisposition: FILE_CREATION_DISPOSITION, pcreateexparams: Long): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateFile2(lpfilename, dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationdisposition.toInt(), pcreateexparams)

public actual fun CreateFile2FromAppW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationdisposition: UInt, pcreateexparams: Long): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateFile2FromAppW(lpfilename, dwdesiredaccess.toInt(), dwsharemode.toInt(), dwcreationdisposition.toInt(), pcreateexparams)

public actual fun CreateFileA(lpfilename: PCSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateFileA(lpfilename, dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes, dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile)

public actual fun CreateFileFromAppW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: Long, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: HANDLE): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateFileFromAppW(lpfilename, dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes, dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile)

public actual fun CreateFileTransactedA(lpfilename: PCSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE, htransaction: HANDLE, pusminiversion: Long, lpextendedparameter: Long): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateFileTransactedA(lpfilename, dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes, dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile, htransaction, pusminiversion, lpextendedparameter)

public actual fun CreateFileTransactedW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE, htransaction: HANDLE, pusminiversion: Long, lpextendedparameter: Long): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateFileTransactedW(lpfilename, dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes, dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile, htransaction, pusminiversion, lpextendedparameter)

public actual fun CreateFileW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateFileW(lpfilename, dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes, dwcreationdisposition.toInt(), dwflagsandattributes.toInt(), htemplatefile)

public actual fun CreateHardLinkA(lpfilename: PCSTR, lpexistingfilename: PCSTR, lpsecurityattributes: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateHardLinkA(lpfilename, lpexistingfilename, lpsecurityattributes)

public actual fun CreateHardLinkTransactedA(lpfilename: PCSTR, lpexistingfilename: PCSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateHardLinkTransactedA(lpfilename, lpexistingfilename, lpsecurityattributes, htransaction)

public actual fun CreateHardLinkTransactedW(lpfilename: PCWSTR, lpexistingfilename: PCWSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateHardLinkTransactedW(lpfilename, lpexistingfilename, lpsecurityattributes, htransaction)

public actual fun CreateHardLinkW(lpfilename: PCWSTR, lpexistingfilename: PCWSTR, lpsecurityattributes: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateHardLinkW(lpfilename, lpexistingfilename, lpsecurityattributes)

public actual fun CreateIoRing(ioringversion: IORING_VERSION, flags: IORING_CREATE_FLAGS, submissionqueuesize: UInt, completionqueuesize: UInt, h: Long): HRESULT =
    0

public actual fun CreateLogContainerScanContext(hlog: HANDLE, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: Long, poverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateLogContainerScanContext(hlog, cfromcontainer.toInt(), ccontainers.toInt(), escanmode.toByte(), pcxscan, poverlapped)

public actual fun CreateLogFile(pszlogfilename: PCWSTR, fdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, psalogfile: Long, fcreatedisposition: FILE_CREATION_DISPOSITION, fflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateLogFile(pszlogfilename, fdesiredaccess.toInt(), dwsharemode.toInt(), psalogfile, fcreatedisposition.toInt(), fflagsandattributes.toInt())

public actual fun CreateLogMarshallingArea(hlog: HANDLE, pfnallocbuffer: CLFS_BLOCK_ALLOCATION, pfnfreebuffer: CLFS_BLOCK_DEALLOCATION, pvblockalloccontext: Long, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshal: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateLogMarshallingArea(hlog, pfnallocbuffer.toLong(), pfnfreebuffer.toLong(), pvblockalloccontext, cbmarshallingbuffer.toInt(), cmaxwritebuffers.toInt(), cmaxreadbuffers.toInt(), ppvmarshal)

public actual fun CreateResourceManager(lpresourcemanagerattributes: Long, resourcemanagerid: Long, createoptions: UInt, tmhandle: HANDLE, description: PCWSTR): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateResourceManager(lpresourcemanagerattributes, resourcemanagerid, createoptions.toInt(), tmhandle, description)

public actual fun CreateSymbolicLinkA(lpsymlinkfilename: PCSTR, lptargetfilename: PCSTR, dwflags: SYMBOLIC_LINK_FLAGS): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateSymbolicLinkA(lpsymlinkfilename, lptargetfilename, dwflags.toInt())

public actual fun CreateSymbolicLinkTransactedA(lpsymlinkfilename: PCSTR, lptargetfilename: PCSTR, dwflags: SYMBOLIC_LINK_FLAGS, htransaction: HANDLE): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateSymbolicLinkTransactedA(lpsymlinkfilename, lptargetfilename, dwflags.toInt(), htransaction)

public actual fun CreateSymbolicLinkTransactedW(lpsymlinkfilename: PCWSTR, lptargetfilename: PCWSTR, dwflags: SYMBOLIC_LINK_FLAGS, htransaction: HANDLE): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateSymbolicLinkTransactedW(lpsymlinkfilename, lptargetfilename, dwflags.toInt(), htransaction)

public actual fun CreateSymbolicLinkW(lpsymlinkfilename: PCWSTR, lptargetfilename: PCWSTR, dwflags: SYMBOLIC_LINK_FLAGS): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateSymbolicLinkW(lpsymlinkfilename, lptargetfilename, dwflags.toInt())

public actual fun CreateTapePartition(hdevice: HANDLE, dwpartitionmethod: CREATE_TAPE_PARTITION_METHOD, dwcount: UInt, dwsize: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateTapePartition(hdevice, dwpartitionmethod.toInt(), dwcount.toInt(), dwsize.toInt()).toUInt()

public actual fun CreateTransaction(lptransactionattributes: Long, uow: Long, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: PCWSTR): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateTransaction(lptransactionattributes, uow, createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), timeout.toInt(), description)

public actual fun CreateTransactionManager(lptransactionattributes: Long, logfilename: PCWSTR, createoptions: UInt, commitstrength: UInt): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_CreateTransactionManager(lptransactionattributes, logfilename, createoptions.toInt(), commitstrength.toInt())

public actual fun DecryptFileA(lpfilename: PCSTR, dwreserved: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_DecryptFileA(lpfilename, dwreserved.toInt())

public actual fun DecryptFileW(lpfilename: PCWSTR, dwreserved: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_DecryptFileW(lpfilename, dwreserved.toInt())

public actual fun DefineDosDeviceA(dwflags: DEFINE_DOS_DEVICE_FLAGS, lpdevicename: PCSTR, lptargetpath: PCSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_DefineDosDeviceA(dwflags.toInt(), lpdevicename, lptargetpath)

public actual fun DefineDosDeviceW(dwflags: DEFINE_DOS_DEVICE_FLAGS, lpdevicename: PCWSTR, lptargetpath: PCWSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_DefineDosDeviceW(dwflags.toInt(), lpdevicename, lptargetpath)

public actual fun DeleteFileA(lpfilename: PCSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_DeleteFileA(lpfilename)

public actual fun DeleteFileFromAppW(lpfilename: PCWSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_DeleteFileFromAppW(lpfilename)

public actual fun DeleteFileTransactedA(lpfilename: PCSTR, htransaction: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_DeleteFileTransactedA(lpfilename, htransaction)

public actual fun DeleteFileTransactedW(lpfilename: PCWSTR, htransaction: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_DeleteFileTransactedW(lpfilename, htransaction)

public actual fun DeleteFileW(lpfilename: PCWSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_DeleteFileW(lpfilename)

public actual fun DeleteLogByHandle(hlog: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_DeleteLogByHandle(hlog)

public actual fun DeleteLogFile(pszlogfilename: PCWSTR, pvreserved: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_DeleteLogFile(pszlogfilename, pvreserved)

public actual fun DeleteLogMarshallingArea(pvmarshal: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_DeleteLogMarshallingArea(pvmarshal)

public actual fun DeleteVolumeMountPointA(lpszvolumemountpoint: PCSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_DeleteVolumeMountPointA(lpszvolumemountpoint)

public actual fun DeleteVolumeMountPointW(lpszvolumemountpoint: PCWSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_DeleteVolumeMountPointW(lpszvolumemountpoint)

public actual fun DeregisterManageableLogClient(hlog: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_DeregisterManageableLogClient(hlog)

public actual fun DuplicateEncryptionInfoFile(srcfilename: PCWSTR, dstfilename: PCWSTR, dwcreationdistribution: UInt, dwattributes: UInt, lpsecurityattributes: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_DuplicateEncryptionInfoFile(srcfilename, dstfilename, dwcreationdistribution.toInt(), dwattributes.toInt(), lpsecurityattributes).toUInt()

public actual fun EncryptFileA(lpfilename: PCSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_EncryptFileA(lpfilename)

public actual fun EncryptFileW(lpfilename: PCWSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_EncryptFileW(lpfilename)

public actual fun EncryptionDisable(dirpath: PCWSTR, disable: BOOL): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_EncryptionDisable(dirpath, disable)

public actual fun EraseTape(hdevice: HANDLE, dwerasetype: ERASE_TAPE_TYPE, bimmediate: BOOL): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_EraseTape(hdevice, dwerasetype.toInt(), bimmediate).toUInt()

public actual fun FileEncryptionStatusA(lpfilename: PCSTR, lpstatus: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FileEncryptionStatusA(lpfilename, lpstatus)

public actual fun FileEncryptionStatusW(lpfilename: PCWSTR, lpstatus: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FileEncryptionStatusW(lpfilename, lpstatus)

public actual fun FileTimeToLocalFileTime(lpfiletime: Long, lplocalfiletime: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FileTimeToLocalFileTime(lpfiletime, lplocalfiletime)

public actual fun FindClose(hfindfile: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindClose(hfindfile)

public actual fun FindCloseChangeNotification(hchangehandle: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindCloseChangeNotification(hchangehandle)

public actual fun FindFirstChangeNotificationA(lppathname: PCSTR, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindFirstChangeNotificationA(lppathname, bwatchsubtree, dwnotifyfilter.toInt())

public actual fun FindFirstChangeNotificationW(lppathname: PCWSTR, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindFirstChangeNotificationW(lppathname, bwatchsubtree, dwnotifyfilter.toInt())

public actual fun FindFirstFileA(lpfilename: PCSTR, lpfindfiledata: Long): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindFirstFileA(lpfilename, lpfindfiledata)

public actual fun FindFirstFileExA(lpfilename: PCSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: FIND_FIRST_EX_FLAGS): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindFirstFileExA(lpfilename, finfolevelid, lpfindfiledata, fsearchop, lpsearchfilter, dwadditionalflags.toInt())

public actual fun FindFirstFileExFromAppW(lpfilename: PCWSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: UInt): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindFirstFileExFromAppW(lpfilename, finfolevelid, lpfindfiledata, fsearchop, lpsearchfilter, dwadditionalflags.toInt())

public actual fun FindFirstFileExW(lpfilename: PCWSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: FIND_FIRST_EX_FLAGS): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindFirstFileExW(lpfilename, finfolevelid, lpfindfiledata, fsearchop, lpsearchfilter, dwadditionalflags.toInt())

public actual fun FindFirstFileNameTransactedW(lpfilename: PCWSTR, dwflags: UInt, stringlength: Long, linkname: PWSTR, htransaction: HANDLE): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindFirstFileNameTransactedW(lpfilename, dwflags.toInt(), stringlength, linkname, htransaction)

public actual fun FindFirstFileNameW(lpfilename: PCWSTR, dwflags: UInt, stringlength: Long, linkname: PWSTR): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindFirstFileNameW(lpfilename, dwflags.toInt(), stringlength, linkname)

public actual fun FindFirstFileTransactedA(lpfilename: PCSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: UInt, htransaction: HANDLE): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindFirstFileTransactedA(lpfilename, finfolevelid, lpfindfiledata, fsearchop, lpsearchfilter, dwadditionalflags.toInt(), htransaction)

public actual fun FindFirstFileTransactedW(lpfilename: PCWSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: UInt, htransaction: HANDLE): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindFirstFileTransactedW(lpfilename, finfolevelid, lpfindfiledata, fsearchop, lpsearchfilter, dwadditionalflags.toInt(), htransaction)

public actual fun FindFirstFileW(lpfilename: PCWSTR, lpfindfiledata: Long): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindFirstFileW(lpfilename, lpfindfiledata)

public actual fun FindFirstStreamTransactedW(lpfilename: PCWSTR, infolevel: STREAM_INFO_LEVELS, lpfindstreamdata: Long, dwflags: UInt, htransaction: HANDLE): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindFirstStreamTransactedW(lpfilename, infolevel, lpfindstreamdata, dwflags.toInt(), htransaction)

public actual fun FindFirstStreamW(lpfilename: PCWSTR, infolevel: STREAM_INFO_LEVELS, lpfindstreamdata: Long, dwflags: UInt): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindFirstStreamW(lpfilename, infolevel, lpfindstreamdata, dwflags.toInt())

public actual fun FindFirstVolumeA(lpszvolumename: PSTR, cchbufferlength: UInt): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindFirstVolumeA(lpszvolumename, cchbufferlength.toInt())

public actual fun FindFirstVolumeMountPointA(lpszrootpathname: PCSTR, lpszvolumemountpoint: PSTR, cchbufferlength: UInt): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindFirstVolumeMountPointA(lpszrootpathname, lpszvolumemountpoint, cchbufferlength.toInt())

public actual fun FindFirstVolumeMountPointW(lpszrootpathname: PCWSTR, lpszvolumemountpoint: PWSTR, cchbufferlength: UInt): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindFirstVolumeMountPointW(lpszrootpathname, lpszvolumemountpoint, cchbufferlength.toInt())

public actual fun FindFirstVolumeW(lpszvolumename: PWSTR, cchbufferlength: UInt): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindFirstVolumeW(lpszvolumename, cchbufferlength.toInt())

public actual fun FindNextChangeNotification(hchangehandle: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindNextChangeNotification(hchangehandle)

public actual fun FindNextFileA(hfindfile: HANDLE, lpfindfiledata: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindNextFileA(hfindfile, lpfindfiledata)

public actual fun FindNextFileNameW(hfindstream: HANDLE, stringlength: Long, linkname: PWSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindNextFileNameW(hfindstream, stringlength, linkname)

public actual fun FindNextFileW(hfindfile: HANDLE, lpfindfiledata: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindNextFileW(hfindfile, lpfindfiledata)

public actual fun FindNextStreamW(hfindstream: HANDLE, lpfindstreamdata: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindNextStreamW(hfindstream, lpfindstreamdata)

public actual fun FindNextVolumeA(hfindvolume: HANDLE, lpszvolumename: PSTR, cchbufferlength: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindNextVolumeA(hfindvolume, lpszvolumename, cchbufferlength.toInt())

public actual fun FindNextVolumeMountPointA(hfindvolumemountpoint: HANDLE, lpszvolumemountpoint: PSTR, cchbufferlength: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindNextVolumeMountPointA(hfindvolumemountpoint, lpszvolumemountpoint, cchbufferlength.toInt())

public actual fun FindNextVolumeMountPointW(hfindvolumemountpoint: HANDLE, lpszvolumemountpoint: PWSTR, cchbufferlength: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindNextVolumeMountPointW(hfindvolumemountpoint, lpszvolumemountpoint, cchbufferlength.toInt())

public actual fun FindNextVolumeW(hfindvolume: HANDLE, lpszvolumename: PWSTR, cchbufferlength: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindNextVolumeW(hfindvolume, lpszvolumename, cchbufferlength.toInt())

public actual fun FindVolumeClose(hfindvolume: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindVolumeClose(hfindvolume)

public actual fun FindVolumeMountPointClose(hfindvolumemountpoint: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FindVolumeMountPointClose(hfindvolumemountpoint)

public actual fun FlushFileBuffers(hfile: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FlushFileBuffers(hfile)

public actual fun FlushLogBuffers(pvmarshal: Long, poverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FlushLogBuffers(pvmarshal, poverlapped)

public actual fun FlushLogToLsn(pvmarshalcontext: Long, plsnflush: Long, plsnlastflushed: Long, poverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FlushLogToLsn(pvmarshalcontext, plsnflush, plsnlastflushed, poverlapped)

public actual fun FreeEncryptedFileMetadata(pbmetadata: Long) {
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FreeEncryptedFileMetadata(pbmetadata)
}

public actual fun FreeEncryptionCertificateHashList(pusers: Long) {
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FreeEncryptionCertificateHashList(pusers)
}

public actual fun FreeReservedLog(pvmarshal: Long, creservedrecords: UInt, pcbadjustment: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_FreeReservedLog(pvmarshal, creservedrecords.toInt(), pcbadjustment)

public actual fun GetBinaryTypeA(lpapplicationname: PCSTR, lpbinarytype: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetBinaryTypeA(lpapplicationname, lpbinarytype)

public actual fun GetBinaryTypeW(lpapplicationname: PCWSTR, lpbinarytype: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetBinaryTypeW(lpapplicationname, lpbinarytype)

public actual fun GetCompressedFileSizeA(lpfilename: PCSTR, lpfilesizehigh: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetCompressedFileSizeA(lpfilename, lpfilesizehigh).toUInt()

public actual fun GetCompressedFileSizeTransactedA(lpfilename: PCSTR, lpfilesizehigh: Long, htransaction: HANDLE): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetCompressedFileSizeTransactedA(lpfilename, lpfilesizehigh, htransaction).toUInt()

public actual fun GetCompressedFileSizeTransactedW(lpfilename: PCWSTR, lpfilesizehigh: Long, htransaction: HANDLE): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetCompressedFileSizeTransactedW(lpfilename, lpfilesizehigh, htransaction).toUInt()

public actual fun GetCompressedFileSizeW(lpfilename: PCWSTR, lpfilesizehigh: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetCompressedFileSizeW(lpfilename, lpfilesizehigh).toUInt()

public actual fun GetCurrentClockTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetCurrentClockTransactionManager(transactionmanagerhandle, tmvirtualclock)

public actual fun GetDiskFreeSpaceA(lprootpathname: PCSTR, lpsectorspercluster: Long, lpbytespersector: Long, lpnumberoffreeclusters: Long, lptotalnumberofclusters: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetDiskFreeSpaceA(lprootpathname, lpsectorspercluster, lpbytespersector, lpnumberoffreeclusters, lptotalnumberofclusters)

public actual fun GetDiskFreeSpaceExA(lpdirectoryname: PCSTR, lpfreebytesavailabletocaller: Long, lptotalnumberofbytes: Long, lptotalnumberoffreebytes: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetDiskFreeSpaceExA(lpdirectoryname, lpfreebytesavailabletocaller, lptotalnumberofbytes, lptotalnumberoffreebytes)

public actual fun GetDiskFreeSpaceExW(lpdirectoryname: PCWSTR, lpfreebytesavailabletocaller: Long, lptotalnumberofbytes: Long, lptotalnumberoffreebytes: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetDiskFreeSpaceExW(lpdirectoryname, lpfreebytesavailabletocaller, lptotalnumberofbytes, lptotalnumberoffreebytes)

public actual fun GetDiskFreeSpaceW(lprootpathname: PCWSTR, lpsectorspercluster: Long, lpbytespersector: Long, lpnumberoffreeclusters: Long, lptotalnumberofclusters: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetDiskFreeSpaceW(lprootpathname, lpsectorspercluster, lpbytespersector, lpnumberoffreeclusters, lptotalnumberofclusters)

public actual fun GetDiskSpaceInformationA(rootpath: PCSTR, diskspaceinfo: Long): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetDiskSpaceInformationA(rootpath, diskspaceinfo)

public actual fun GetDiskSpaceInformationW(rootpath: PCWSTR, diskspaceinfo: Long): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetDiskSpaceInformationW(rootpath, diskspaceinfo)

public actual fun GetDriveTypeA(lprootpathname: PCSTR): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetDriveTypeA(lprootpathname).toUInt()

public actual fun GetDriveTypeW(lprootpathname: PCWSTR): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetDriveTypeW(lprootpathname).toUInt()

public actual fun GetEncryptedFileMetadata(lpfilename: PCWSTR, pcbmetadata: Long, ppbmetadata: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetEncryptedFileMetadata(lpfilename, pcbmetadata, ppbmetadata).toUInt()

public actual fun GetEnlistmentId(enlistmenthandle: HANDLE, enlistmentid: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetEnlistmentId(enlistmenthandle, enlistmentid)

public actual fun GetEnlistmentRecoveryInformation(enlistmenthandle: HANDLE, buffersize: UInt, buffer: Long, bufferused: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetEnlistmentRecoveryInformation(enlistmenthandle, buffersize.toInt(), buffer, bufferused)

public actual fun GetExpandedNameA(lpszsource: PCSTR, lpszbuffer: PSTR): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetExpandedNameA(lpszsource, lpszbuffer)

public actual fun GetExpandedNameW(lpszsource: PCWSTR, lpszbuffer: PWSTR): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetExpandedNameW(lpszsource, lpszbuffer)

public actual fun GetFileAttributesA(lpfilename: PCSTR): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileAttributesA(lpfilename).toUInt()

public actual fun GetFileAttributesExA(lpfilename: PCSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileAttributesExA(lpfilename, finfolevelid, lpfileinformation)

public actual fun GetFileAttributesExFromAppW(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileAttributesExFromAppW(lpfilename, finfolevelid, lpfileinformation)

public actual fun GetFileAttributesExW(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileAttributesExW(lpfilename, finfolevelid, lpfileinformation)

public actual fun GetFileAttributesTransactedA(lpfilename: PCSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long, htransaction: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileAttributesTransactedA(lpfilename, finfolevelid, lpfileinformation, htransaction)

public actual fun GetFileAttributesTransactedW(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long, htransaction: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileAttributesTransactedW(lpfilename, finfolevelid, lpfileinformation, htransaction)

public actual fun GetFileAttributesW(lpfilename: PCWSTR): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileAttributesW(lpfilename).toUInt()

public actual fun GetFileBandwidthReservation(hfile: HANDLE, lpperiodmilliseconds: Long, lpbytesperperiod: Long, pdiscardable: Long, lptransfersize: Long, lpnumoutstandingrequests: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileBandwidthReservation(hfile, lpperiodmilliseconds, lpbytesperperiod, pdiscardable, lptransfersize, lpnumoutstandingrequests)

public actual fun GetFileInformationByHandle(hfile: HANDLE, lpfileinformation: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileInformationByHandle(hfile, lpfileinformation)

public actual fun GetFileInformationByHandleEx(hfile: HANDLE, fileinformationclass: FILE_INFO_BY_HANDLE_CLASS, lpfileinformation: Long, dwbuffersize: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileInformationByHandleEx(hfile, fileinformationclass, lpfileinformation, dwbuffersize.toInt())

public actual fun GetFileSize(hfile: HANDLE, lpfilesizehigh: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileSize(hfile, lpfilesizehigh).toUInt()

public actual fun GetFileSizeEx(hfile: HANDLE, lpfilesize: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileSizeEx(hfile, lpfilesize)

public actual fun GetFileTime(hfile: HANDLE, lpcreationtime: Long, lplastaccesstime: Long, lplastwritetime: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileTime(hfile, lpcreationtime, lplastaccesstime, lplastwritetime)

public actual fun GetFileType(hfile: HANDLE): FILE_TYPE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileType(hfile).toUInt()

public actual fun GetFileVersionInfoA(lptstrfilename: PCSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoA(lptstrfilename, dwhandle.toInt(), dwlen.toInt(), lpdata)

public actual fun GetFileVersionInfoExA(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoExA(dwflags.toInt(), lpwstrfilename, dwhandle.toInt(), dwlen.toInt(), lpdata)

public actual fun GetFileVersionInfoExW(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCWSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoExW(dwflags.toInt(), lpwstrfilename, dwhandle.toInt(), dwlen.toInt(), lpdata)

public actual fun GetFileVersionInfoSizeA(lptstrfilename: PCSTR, lpdwhandle: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoSizeA(lptstrfilename, lpdwhandle).toUInt()

public actual fun GetFileVersionInfoSizeExA(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCSTR, lpdwhandle: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoSizeExA(dwflags.toInt(), lpwstrfilename, lpdwhandle).toUInt()

public actual fun GetFileVersionInfoSizeExW(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCWSTR, lpdwhandle: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoSizeExW(dwflags.toInt(), lpwstrfilename, lpdwhandle).toUInt()

public actual fun GetFileVersionInfoSizeW(lptstrfilename: PCWSTR, lpdwhandle: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoSizeW(lptstrfilename, lpdwhandle).toUInt()

public actual fun GetFileVersionInfoW(lptstrfilename: PCWSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFileVersionInfoW(lptstrfilename, dwhandle.toInt(), dwlen.toInt(), lpdata)

public actual fun GetFinalPathNameByHandleA(hfile: HANDLE, lpszfilepath: PSTR, cchfilepath: UInt, dwflags: GETFINALPATHNAMEBYHANDLE_FLAGS): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFinalPathNameByHandleA(hfile, lpszfilepath, cchfilepath.toInt(), dwflags.toInt()).toUInt()

public actual fun GetFinalPathNameByHandleW(hfile: HANDLE, lpszfilepath: PWSTR, cchfilepath: UInt, dwflags: GETFINALPATHNAMEBYHANDLE_FLAGS): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFinalPathNameByHandleW(hfile, lpszfilepath, cchfilepath.toInt(), dwflags.toInt()).toUInt()

public actual fun GetFullPathNameA(lpfilename: PCSTR, nbufferlength: UInt, lpbuffer: PSTR, lpfilepart: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFullPathNameA(lpfilename, nbufferlength.toInt(), lpbuffer, lpfilepart).toUInt()

public actual fun GetFullPathNameTransactedA(lpfilename: PCSTR, nbufferlength: UInt, lpbuffer: PSTR, lpfilepart: Long, htransaction: HANDLE): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFullPathNameTransactedA(lpfilename, nbufferlength.toInt(), lpbuffer, lpfilepart, htransaction).toUInt()

public actual fun GetFullPathNameTransactedW(lpfilename: PCWSTR, nbufferlength: UInt, lpbuffer: PWSTR, lpfilepart: Long, htransaction: HANDLE): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFullPathNameTransactedW(lpfilename, nbufferlength.toInt(), lpbuffer, lpfilepart, htransaction).toUInt()

public actual fun GetFullPathNameW(lpfilename: PCWSTR, nbufferlength: UInt, lpbuffer: PWSTR, lpfilepart: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetFullPathNameW(lpfilename, nbufferlength.toInt(), lpbuffer, lpfilepart).toUInt()

public actual fun GetIoRingInfo(ioring: HIORING, info: Long): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetIoRingInfo(ioring, info)

public actual fun GetLogContainerName(hlog: HANDLE, cidlogicalcontainer: UInt, pwstrcontainername: PCWSTR, clencontainername: UInt, pcactuallencontainername: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetLogContainerName(hlog, cidlogicalcontainer.toInt(), pwstrcontainername, clencontainername.toInt(), pcactuallencontainername)

public actual fun GetLogFileInformation(hlog: HANDLE, pinfobuffer: Long, cbbuffer: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetLogFileInformation(hlog, pinfobuffer, cbbuffer)

public actual fun GetLogIoStatistics(hlog: HANDLE, pvstatsbuffer: Long, cbstatsbuffer: UInt, estatsclass: CLFS_IOSTATS_CLASS, pcbstatswritten: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetLogIoStatistics(hlog, pvstatsbuffer, cbstatsbuffer.toInt(), estatsclass, pcbstatswritten)

public actual fun GetLogReservationInfo(pvmarshal: Long, pcbrecordnumber: Long, pcbuserreservation: Long, pcbcommitreservation: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetLogReservationInfo(pvmarshal, pcbrecordnumber, pcbuserreservation, pcbcommitreservation)

public actual fun GetLogicalDriveStringsA(nbufferlength: UInt, lpbuffer: PSTR): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetLogicalDriveStringsA(nbufferlength.toInt(), lpbuffer).toUInt()

public actual fun GetLogicalDriveStringsW(nbufferlength: UInt, lpbuffer: PWSTR): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetLogicalDriveStringsW(nbufferlength.toInt(), lpbuffer).toUInt()

public actual fun GetLogicalDrives(): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetLogicalDrives().toUInt()

public actual fun GetLongPathNameA(lpszshortpath: PCSTR, lpszlongpath: PSTR, cchbuffer: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetLongPathNameA(lpszshortpath, lpszlongpath, cchbuffer.toInt()).toUInt()

public actual fun GetLongPathNameTransactedA(lpszshortpath: PCSTR, lpszlongpath: PSTR, cchbuffer: UInt, htransaction: HANDLE): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetLongPathNameTransactedA(lpszshortpath, lpszlongpath, cchbuffer.toInt(), htransaction).toUInt()

public actual fun GetLongPathNameTransactedW(lpszshortpath: PCWSTR, lpszlongpath: PWSTR, cchbuffer: UInt, htransaction: HANDLE): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetLongPathNameTransactedW(lpszshortpath, lpszlongpath, cchbuffer.toInt(), htransaction).toUInt()

public actual fun GetLongPathNameW(lpszshortpath: PCWSTR, lpszlongpath: PWSTR, cchbuffer: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetLongPathNameW(lpszshortpath, lpszlongpath, cchbuffer.toInt()).toUInt()

public actual fun GetNextLogArchiveExtent(pvarchivecontext: Long, rgadextent: Long, cdescriptors: UInt, pcdescriptorsreturned: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetNextLogArchiveExtent(pvarchivecontext, rgadextent, cdescriptors.toInt(), pcdescriptorsreturned)

public actual fun GetNotificationResourceManager(resourcemanagerhandle: HANDLE, transactionnotification: Long, notificationlength: UInt, dwmilliseconds: UInt, returnlength: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetNotificationResourceManager(resourcemanagerhandle, transactionnotification, notificationlength.toInt(), dwmilliseconds.toInt(), returnlength)

public actual fun GetNotificationResourceManagerAsync(resourcemanagerhandle: HANDLE, transactionnotification: Long, transactionnotificationlength: UInt, returnlength: Long, lpoverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetNotificationResourceManagerAsync(resourcemanagerhandle, transactionnotification, transactionnotificationlength.toInt(), returnlength, lpoverlapped)

public actual fun GetShortPathNameA(lpszlongpath: PCSTR, lpszshortpath: PSTR, cchbuffer: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetShortPathNameA(lpszlongpath, lpszshortpath, cchbuffer.toInt()).toUInt()

public actual fun GetShortPathNameW(lpszlongpath: PCWSTR, lpszshortpath: PWSTR, cchbuffer: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetShortPathNameW(lpszlongpath, lpszshortpath, cchbuffer.toInt()).toUInt()

public actual fun GetTapeParameters(hdevice: HANDLE, dwoperation: GET_TAPE_DRIVE_PARAMETERS_OPERATION, lpdwsize: Long, lptapeinformation: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetTapeParameters(hdevice, dwoperation.toInt(), lpdwsize, lptapeinformation).toUInt()

public actual fun GetTapePosition(hdevice: HANDLE, dwpositiontype: TAPE_POSITION_TYPE, lpdwpartition: Long, lpdwoffsetlow: Long, lpdwoffsethigh: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetTapePosition(hdevice, dwpositiontype.toInt(), lpdwpartition, lpdwoffsetlow, lpdwoffsethigh).toUInt()

public actual fun GetTapeStatus(hdevice: HANDLE): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetTapeStatus(hdevice).toUInt()

public actual fun GetTempFileNameA(lppathname: PCSTR, lpprefixstring: PCSTR, uunique: UInt, lptempfilename: PSTR): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetTempFileNameA(lppathname, lpprefixstring, uunique.toInt(), lptempfilename).toUInt()

public actual fun GetTempFileNameW(lppathname: PCWSTR, lpprefixstring: PCWSTR, uunique: UInt, lptempfilename: PWSTR): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetTempFileNameW(lppathname, lpprefixstring, uunique.toInt(), lptempfilename).toUInt()

public actual fun GetTempPath2A(bufferlength: UInt, buffer: PSTR): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetTempPath2A(bufferlength.toInt(), buffer).toUInt()

public actual fun GetTempPath2W(bufferlength: UInt, buffer: PWSTR): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetTempPath2W(bufferlength.toInt(), buffer).toUInt()

public actual fun GetTempPathA(nbufferlength: UInt, lpbuffer: PSTR): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetTempPathA(nbufferlength.toInt(), lpbuffer).toUInt()

public actual fun GetTempPathW(nbufferlength: UInt, lpbuffer: PWSTR): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetTempPathW(nbufferlength.toInt(), lpbuffer).toUInt()

public actual fun GetTransactionId(transactionhandle: HANDLE, transactionid: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetTransactionId(transactionhandle, transactionid)

public actual fun GetTransactionInformation(transactionhandle: HANDLE, outcome: Long, isolationlevel: Long, isolationflags: Long, timeout: Long, bufferlength: UInt, description: PWSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetTransactionInformation(transactionhandle, outcome, isolationlevel, isolationflags, timeout, bufferlength.toInt(), description)

public actual fun GetTransactionManagerId(transactionmanagerhandle: HANDLE, transactionmanagerid: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetTransactionManagerId(transactionmanagerhandle, transactionmanagerid)

public actual fun GetVolumeInformationA(lprootpathname: PCSTR, lpvolumenamebuffer: PSTR, nvolumenamesize: UInt, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: PSTR, nfilesystemnamesize: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetVolumeInformationA(lprootpathname, lpvolumenamebuffer, nvolumenamesize.toInt(), lpvolumeserialnumber, lpmaximumcomponentlength, lpfilesystemflags, lpfilesystemnamebuffer, nfilesystemnamesize.toInt())

public actual fun GetVolumeInformationByHandleW(hfile: HANDLE, lpvolumenamebuffer: PWSTR, nvolumenamesize: UInt, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: PWSTR, nfilesystemnamesize: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetVolumeInformationByHandleW(hfile, lpvolumenamebuffer, nvolumenamesize.toInt(), lpvolumeserialnumber, lpmaximumcomponentlength, lpfilesystemflags, lpfilesystemnamebuffer, nfilesystemnamesize.toInt())

public actual fun GetVolumeInformationW(lprootpathname: PCWSTR, lpvolumenamebuffer: PWSTR, nvolumenamesize: UInt, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: PWSTR, nfilesystemnamesize: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetVolumeInformationW(lprootpathname, lpvolumenamebuffer, nvolumenamesize.toInt(), lpvolumeserialnumber, lpmaximumcomponentlength, lpfilesystemflags, lpfilesystemnamebuffer, nfilesystemnamesize.toInt())

public actual fun GetVolumeNameForVolumeMountPointA(lpszvolumemountpoint: PCSTR, lpszvolumename: PSTR, cchbufferlength: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetVolumeNameForVolumeMountPointA(lpszvolumemountpoint, lpszvolumename, cchbufferlength.toInt())

public actual fun GetVolumeNameForVolumeMountPointW(lpszvolumemountpoint: PCWSTR, lpszvolumename: PWSTR, cchbufferlength: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetVolumeNameForVolumeMountPointW(lpszvolumemountpoint, lpszvolumename, cchbufferlength.toInt())

public actual fun GetVolumePathNameA(lpszfilename: PCSTR, lpszvolumepathname: PSTR, cchbufferlength: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetVolumePathNameA(lpszfilename, lpszvolumepathname, cchbufferlength.toInt())

public actual fun GetVolumePathNameW(lpszfilename: PCWSTR, lpszvolumepathname: PWSTR, cchbufferlength: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetVolumePathNameW(lpszfilename, lpszvolumepathname, cchbufferlength.toInt())

public actual fun GetVolumePathNamesForVolumeNameA(lpszvolumename: PCSTR, lpszvolumepathnames: PSTR, cchbufferlength: UInt, lpcchreturnlength: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetVolumePathNamesForVolumeNameA(lpszvolumename, lpszvolumepathnames, cchbufferlength.toInt(), lpcchreturnlength)

public actual fun GetVolumePathNamesForVolumeNameW(lpszvolumename: PCWSTR, lpszvolumepathnames: PWSTR, cchbufferlength: UInt, lpcchreturnlength: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_GetVolumePathNamesForVolumeNameW(lpszvolumename, lpszvolumepathnames, cchbufferlength.toInt(), lpcchreturnlength)

public actual fun HandleLogFull(hlog: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_HandleLogFull(hlog)

public actual fun InstallLogPolicy(hlog: HANDLE, ppolicy: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_InstallLogPolicy(hlog, ppolicy)

public actual fun IsIoRingOpSupported(ioring: HIORING, op: IORING_OP_CODE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_IsIoRingOpSupported(ioring, op)

public actual fun LZClose(hfile: Int) {
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LZClose(hfile)
}

public actual fun LZCopy(hfsource: Int, hfdest: Int): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LZCopy(hfsource, hfdest)

public actual fun LZDone() {
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LZDone()
}

public actual fun LZInit(hfsource: Int): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LZInit(hfsource)

public actual fun LZOpenFileA(lpfilename: PCSTR, lpreopenbuf: Long, wstyle: LZOPENFILE_STYLE): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LZOpenFileA(lpfilename, lpreopenbuf, wstyle.toShort())

public actual fun LZOpenFileW(lpfilename: PCWSTR, lpreopenbuf: Long, wstyle: LZOPENFILE_STYLE): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LZOpenFileW(lpfilename, lpreopenbuf, wstyle.toShort())

public actual fun LZRead(hfile: Int, lpbuffer: PSTR, cbread: Int): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LZRead(hfile, lpbuffer, cbread)

public actual fun LZSeek(hfile: Int, loffset: Int, iorigin: Int): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LZSeek(hfile, loffset, iorigin)

public actual fun LZStart(): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LZStart()

public actual fun LocalFileTimeToFileTime(lplocalfiletime: Long, lpfiletime: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LocalFileTimeToFileTime(lplocalfiletime, lpfiletime)

public actual fun LockFile(hfile: HANDLE, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LockFile(hfile, dwfileoffsetlow.toInt(), dwfileoffsethigh.toInt(), nnumberofbytestolocklow.toInt(), nnumberofbytestolockhigh.toInt())

public actual fun LockFileEx(hfile: HANDLE, dwflags: LOCK_FILE_FLAGS, dwreserved: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt, lpoverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LockFileEx(hfile, dwflags.toInt(), dwreserved.toInt(), nnumberofbytestolocklow.toInt(), nnumberofbytestolockhigh.toInt(), lpoverlapped)

public actual fun LogTailAdvanceFailure(hlog: HANDLE, dwreason: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LogTailAdvanceFailure(hlog, dwreason.toInt())

public actual fun LsnBlockOffset(plsn: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LsnBlockOffset(plsn).toUInt()

public actual fun LsnContainer(plsn: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LsnContainer(plsn).toUInt()

public actual fun LsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): CLS_LSN =
    CLS_LSN()

public actual fun LsnEqual(plsn1: Long, plsn2: Long): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LsnEqual(plsn1, plsn2)

public actual fun LsnGreater(plsn1: Long, plsn2: Long): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LsnGreater(plsn1, plsn2)

public actual fun LsnIncrement(plsn: Long): CLS_LSN =
    CLS_LSN()

public actual fun LsnInvalid(plsn: Long): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LsnInvalid(plsn)

public actual fun LsnLess(plsn1: Long, plsn2: Long): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LsnLess(plsn1, plsn2)

public actual fun LsnNull(plsn: Long): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LsnNull(plsn)

public actual fun LsnRecordSequence(plsn: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_LsnRecordSequence(plsn).toUInt()

public actual fun MoveFileA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_MoveFileA(lpexistingfilename, lpnewfilename)

public actual fun MoveFileExA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, dwflags: MOVE_FILE_FLAGS): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_MoveFileExA(lpexistingfilename, lpnewfilename, dwflags.toInt())

public actual fun MoveFileExW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, dwflags: MOVE_FILE_FLAGS): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_MoveFileExW(lpexistingfilename, lpnewfilename, dwflags.toInt())

public actual fun MoveFileFromAppW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_MoveFileFromAppW(lpexistingfilename, lpnewfilename)

public actual fun MoveFileTransactedA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS, htransaction: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_MoveFileTransactedA(lpexistingfilename, lpnewfilename, lpprogressroutine.toLong(), lpdata, dwflags.toInt(), htransaction)

public actual fun MoveFileTransactedW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS, htransaction: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_MoveFileTransactedW(lpexistingfilename, lpnewfilename, lpprogressroutine.toLong(), lpdata, dwflags.toInt(), htransaction)

public actual fun MoveFileW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_MoveFileW(lpexistingfilename, lpnewfilename)

public actual fun MoveFileWithProgressA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_MoveFileWithProgressA(lpexistingfilename, lpnewfilename, lpprogressroutine.toLong(), lpdata, dwflags.toInt())

public actual fun MoveFileWithProgressW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_MoveFileWithProgressW(lpexistingfilename, lpnewfilename, lpprogressroutine.toLong(), lpdata, dwflags.toInt())

public actual fun NetConnectionEnum(servername: PCWSTR, qualifier: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_NetConnectionEnum(servername, qualifier, level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, resume_handle).toUInt()

public actual fun NetFileClose(servername: PCWSTR, fileid: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_NetFileClose(servername, fileid.toInt()).toUInt()

public actual fun NetFileEnum(servername: PCWSTR, basepath: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_NetFileEnum(servername, basepath, username, level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, resume_handle).toUInt()

public actual fun NetFileGetInfo(servername: PCWSTR, fileid: UInt, level: UInt, bufptr: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_NetFileGetInfo(servername, fileid.toInt(), level.toInt(), bufptr).toUInt()

public actual fun NetServerAliasAdd(servername: PCWSTR, level: UInt, buf: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_NetServerAliasAdd(servername, level.toInt(), buf).toUInt()

public actual fun NetServerAliasDel(servername: PCWSTR, level: UInt, buf: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_NetServerAliasDel(servername, level.toInt(), buf).toUInt()

public actual fun NetServerAliasEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_NetServerAliasEnum(servername, level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, resumehandle).toUInt()

public actual fun NetSessionDel(servername: PCWSTR, uncclientname: PCWSTR, username: PCWSTR): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_NetSessionDel(servername, uncclientname, username).toUInt()

public actual fun NetSessionEnum(servername: PCWSTR, uncclientname: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_NetSessionEnum(servername, uncclientname, username, level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, resume_handle).toUInt()

public actual fun NetSessionGetInfo(servername: PCWSTR, uncclientname: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_NetSessionGetInfo(servername, uncclientname, username, level.toInt(), bufptr).toUInt()

public actual fun NetShareAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_NetShareAdd(servername, level.toInt(), buf, parm_err).toUInt()

public actual fun NetShareCheck(servername: PCWSTR, device: PCWSTR, type: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_NetShareCheck(servername, device, type).toUInt()

public actual fun NetShareDel(servername: PCWSTR, netname: PCWSTR, reserved: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_NetShareDel(servername, netname, reserved.toInt()).toUInt()

public actual fun NetShareDelEx(servername: PCWSTR, level: UInt, buf: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_NetShareDelEx(servername, level.toInt(), buf).toUInt()

public actual fun NetShareDelSticky(servername: PCWSTR, netname: PCWSTR, reserved: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_NetShareDelSticky(servername, netname, reserved.toInt()).toUInt()

public actual fun NetShareEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_NetShareEnum(servername, level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, resume_handle).toUInt()

public actual fun NetShareEnumSticky(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_NetShareEnumSticky(servername, level.toInt(), bufptr, prefmaxlen.toInt(), entriesread, totalentries, resume_handle).toUInt()

public actual fun NetShareGetInfo(servername: PCWSTR, netname: PCWSTR, level: UInt, bufptr: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_NetShareGetInfo(servername, netname, level.toInt(), bufptr).toUInt()

public actual fun NetShareSetInfo(servername: PCWSTR, netname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_NetShareSetInfo(servername, netname, level.toInt(), buf, parm_err).toUInt()

public actual fun NetStatisticsGet(servername: Long, service: Long, level: UInt, options: UInt, buffer: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_NetStatisticsGet(servername, service, level.toInt(), options.toInt(), buffer).toUInt()

public actual fun OpenEncryptedFileRawA(lpfilename: PCSTR, ulflags: UInt, pvcontext: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_OpenEncryptedFileRawA(lpfilename, ulflags.toInt(), pvcontext).toUInt()

public actual fun OpenEncryptedFileRawW(lpfilename: PCWSTR, ulflags: UInt, pvcontext: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_OpenEncryptedFileRawW(lpfilename, ulflags.toInt(), pvcontext).toUInt()

public actual fun OpenEnlistment(dwdesiredaccess: UInt, resourcemanagerhandle: HANDLE, enlistmentid: Long): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_OpenEnlistment(dwdesiredaccess.toInt(), resourcemanagerhandle, enlistmentid)

public actual fun OpenFile(lpfilename: PCSTR, lpreopenbuff: Long, ustyle: UInt): Int =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_OpenFile(lpfilename, lpreopenbuff, ustyle.toInt())

public actual fun OpenFileById(hvolumehint: HANDLE, lpfileid: Long, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_OpenFileById(hvolumehint, lpfileid, dwdesiredaccess.toInt(), dwsharemode.toInt(), lpsecurityattributes, dwflagsandattributes.toInt())

public actual fun OpenResourceManager(dwdesiredaccess: UInt, tmhandle: HANDLE, resourcemanagerid: Long): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_OpenResourceManager(dwdesiredaccess.toInt(), tmhandle, resourcemanagerid)

public actual fun OpenTransaction(dwdesiredaccess: UInt, transactionid: Long): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_OpenTransaction(dwdesiredaccess.toInt(), transactionid)

public actual fun OpenTransactionManager(logfilename: PCWSTR, desiredaccess: UInt, openoptions: UInt): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_OpenTransactionManager(logfilename, desiredaccess.toInt(), openoptions.toInt())

public actual fun OpenTransactionManagerById(transactionmanagerid: Long, desiredaccess: UInt, openoptions: UInt): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_OpenTransactionManagerById(transactionmanagerid, desiredaccess.toInt(), openoptions.toInt())

public actual fun PopIoRingCompletion(ioring: HIORING, cqe: Long): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_PopIoRingCompletion(ioring, cqe)

public actual fun PrePrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_PrePrepareComplete(enlistmenthandle, tmvirtualclock)

public actual fun PrePrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_PrePrepareEnlistment(enlistmenthandle, tmvirtualclock)

public actual fun PrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_PrepareComplete(enlistmenthandle, tmvirtualclock)

public actual fun PrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_PrepareEnlistment(enlistmenthandle, tmvirtualclock)

public actual fun PrepareLogArchive(hlog: HANDLE, pszbaselogfilename: PWSTR, clen: UInt, plsnlow: Long, plsnhigh: Long, pcactuallength: Long, poffbaselogfiledata: Long, pcbbaselogfilelength: Long, plsnbase: Long, plsnlast: Long, plsncurrentarchivetail: Long, ppvarchivecontext: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_PrepareLogArchive(hlog, pszbaselogfilename, clen.toInt(), plsnlow, plsnhigh, pcactuallength, poffbaselogfiledata, pcbbaselogfilelength, plsnbase, plsnlast, plsncurrentarchivetail, ppvarchivecontext)

public actual fun PrepareTape(hdevice: HANDLE, dwoperation: PREPARE_TAPE_OPERATION, bimmediate: BOOL): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_PrepareTape(hdevice, dwoperation.toInt(), bimmediate).toUInt()

public actual fun QueryDosDeviceA(lpdevicename: PCSTR, lptargetpath: PSTR, ucchmax: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_QueryDosDeviceA(lpdevicename, lptargetpath, ucchmax.toInt()).toUInt()

public actual fun QueryDosDeviceW(lpdevicename: PCWSTR, lptargetpath: PWSTR, ucchmax: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_QueryDosDeviceW(lpdevicename, lptargetpath, ucchmax.toInt()).toUInt()

public actual fun QueryIoRingCapabilities(capabilities: Long): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_QueryIoRingCapabilities(capabilities)

public actual fun QueryLogPolicy(hlog: HANDLE, epolicytype: CLFS_MGMT_POLICY_TYPE, ppolicybuffer: Long, pcbpolicybuffer: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_QueryLogPolicy(hlog, epolicytype, ppolicybuffer, pcbpolicybuffer)

public actual fun QueryRecoveryAgentsOnEncryptedFile(lpfilename: PCWSTR, precoveryagents: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_QueryRecoveryAgentsOnEncryptedFile(lpfilename, precoveryagents).toUInt()

public actual fun QueryUsersOnEncryptedFile(lpfilename: PCWSTR, pusers: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_QueryUsersOnEncryptedFile(lpfilename, pusers).toUInt()

public actual fun ReOpenFile(horiginalfile: HANDLE, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES): HANDLE =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_ReOpenFile(horiginalfile, dwdesiredaccess.toInt(), dwsharemode.toInt(), dwflagsandattributes.toInt())

public actual fun ReadDirectoryChangesExW(hdirectory: HANDLE, lpbuffer: Long, nbufferlength: UInt, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE, lpbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE, readdirectorynotifyinformationclass: READ_DIRECTORY_NOTIFY_INFORMATION_CLASS): BOOL =
    0

public actual fun ReadDirectoryChangesW(hdirectory: HANDLE, lpbuffer: Long, nbufferlength: UInt, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE, lpbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE): BOOL =
    0

public actual fun ReadEncryptedFileRaw(pfexportcallback: PFE_EXPORT_FUNC, pvcallbackcontext: Long, pvcontext: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_ReadEncryptedFileRaw(pfexportcallback.toLong(), pvcallbackcontext, pvcontext).toUInt()

public actual fun ReadFile(hfile: HANDLE, lpbuffer: Long, nnumberofbytestoread: UInt, lpnumberofbytesread: Long, lpoverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_ReadFile(hfile, lpbuffer, nnumberofbytestoread.toInt(), lpnumberofbytesread, lpoverlapped)

public actual fun ReadFileEx(hfile: HANDLE, lpbuffer: Long, nnumberofbytestoread: UInt, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE): BOOL =
    0

public actual fun ReadFileScatter(hfile: HANDLE, asegmentarray: Long, nnumberofbytestoread: UInt, lpreserved: Long, lpoverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_ReadFileScatter(hfile, asegmentarray, nnumberofbytestoread.toInt(), lpreserved, lpoverlapped)

public actual fun ReadLogArchiveMetadata(pvarchivecontext: Long, cboffset: UInt, cbbytestoread: UInt, pbreadbuffer: Long, pcbbytesread: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_ReadLogArchiveMetadata(pvarchivecontext, cboffset.toInt(), cbbytestoread.toInt(), pbreadbuffer, pcbbytesread)

public actual fun ReadLogNotification(hlog: HANDLE, pnotification: Long, lpoverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_ReadLogNotification(hlog, pnotification, lpoverlapped)

public actual fun ReadLogRecord(pvmarshal: Long, plsnfirst: Long, econtextmode: CLFS_CONTEXT_MODE, ppvreadbuffer: Long, pcbreadbuffer: Long, perecordtype: Long, plsnundonext: Long, plsnprevious: Long, ppvreadcontext: Long, poverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_ReadLogRecord(pvmarshal, plsnfirst, econtextmode, ppvreadbuffer, pcbreadbuffer, perecordtype, plsnundonext, plsnprevious, ppvreadcontext, poverlapped)

public actual fun ReadLogRestartArea(pvmarshal: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsn: Long, ppvcontext: Long, poverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_ReadLogRestartArea(pvmarshal, ppvrestartbuffer, pcbrestartbuffer, plsn, ppvcontext, poverlapped)

public actual fun ReadNextLogRecord(pvreadcontext: Long, ppvbuffer: Long, pcbbuffer: Long, perecordtype: Long, plsnuser: Long, plsnundonext: Long, plsnprevious: Long, plsnrecord: Long, poverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_ReadNextLogRecord(pvreadcontext, ppvbuffer, pcbbuffer, perecordtype, plsnuser, plsnundonext, plsnprevious, plsnrecord, poverlapped)

public actual fun ReadOnlyEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_ReadOnlyEnlistment(enlistmenthandle, tmvirtualclock)

public actual fun ReadPreviousLogRestartArea(pvreadcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsnrestart: Long, poverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_ReadPreviousLogRestartArea(pvreadcontext, ppvrestartbuffer, pcbrestartbuffer, plsnrestart, poverlapped)

public actual fun RecoverEnlistment(enlistmenthandle: HANDLE, enlistmentkey: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_RecoverEnlistment(enlistmenthandle, enlistmentkey)

public actual fun RecoverResourceManager(resourcemanagerhandle: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_RecoverResourceManager(resourcemanagerhandle)

public actual fun RecoverTransactionManager(transactionmanagerhandle: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_RecoverTransactionManager(transactionmanagerhandle)

public actual fun RegisterForLogWriteNotification(hlog: HANDLE, cbthreshold: UInt, fenable: BOOL): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_RegisterForLogWriteNotification(hlog, cbthreshold.toInt(), fenable)

public actual fun RegisterManageableLogClient(hlog: HANDLE, pcallbacks: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_RegisterManageableLogClient(hlog, pcallbacks)

public actual fun RemoveDirectoryA(lppathname: PCSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_RemoveDirectoryA(lppathname)

public actual fun RemoveDirectoryFromAppW(lppathname: PCWSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_RemoveDirectoryFromAppW(lppathname)

public actual fun RemoveDirectoryTransactedA(lppathname: PCSTR, htransaction: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_RemoveDirectoryTransactedA(lppathname, htransaction)

public actual fun RemoveDirectoryTransactedW(lppathname: PCWSTR, htransaction: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_RemoveDirectoryTransactedW(lppathname, htransaction)

public actual fun RemoveDirectoryW(lppathname: PCWSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_RemoveDirectoryW(lppathname)

public actual fun RemoveLogContainer(hlog: HANDLE, pwszcontainerpath: PCWSTR, fforce: BOOL, preserved: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_RemoveLogContainer(hlog, pwszcontainerpath, fforce, preserved)

public actual fun RemoveLogContainerSet(hlog: HANDLE, ccontainer: UShort, rgwszcontainerpath: Long, fforce: BOOL, preserved: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_RemoveLogContainerSet(hlog, ccontainer.toShort(), rgwszcontainerpath, fforce, preserved)

public actual fun RemoveLogPolicy(hlog: HANDLE, epolicytype: CLFS_MGMT_POLICY_TYPE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_RemoveLogPolicy(hlog, epolicytype)

public actual fun RemoveUsersFromEncryptedFile(lpfilename: PCWSTR, phashes: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_RemoveUsersFromEncryptedFile(lpfilename, phashes).toUInt()

public actual fun RenameTransactionManager(logfilename: PCWSTR, existingtransactionmanagerguid: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_RenameTransactionManager(logfilename, existingtransactionmanagerguid)

public actual fun ReplaceFileA(lpreplacedfilename: PCSTR, lpreplacementfilename: PCSTR, lpbackupfilename: PCSTR, dwreplaceflags: REPLACE_FILE_FLAGS, lpexclude: Long, lpreserved: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_ReplaceFileA(lpreplacedfilename, lpreplacementfilename, lpbackupfilename, dwreplaceflags.toInt(), lpexclude, lpreserved)

public actual fun ReplaceFileFromAppW(lpreplacedfilename: PCWSTR, lpreplacementfilename: PCWSTR, lpbackupfilename: PCWSTR, dwreplaceflags: UInt, lpexclude: Long, lpreserved: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_ReplaceFileFromAppW(lpreplacedfilename, lpreplacementfilename, lpbackupfilename, dwreplaceflags.toInt(), lpexclude, lpreserved)

public actual fun ReplaceFileW(lpreplacedfilename: PCWSTR, lpreplacementfilename: PCWSTR, lpbackupfilename: PCWSTR, dwreplaceflags: REPLACE_FILE_FLAGS, lpexclude: Long, lpreserved: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_ReplaceFileW(lpreplacedfilename, lpreplacementfilename, lpbackupfilename, dwreplaceflags.toInt(), lpexclude, lpreserved)

public actual fun ReserveAndAppendLog(pvmarshal: Long, rgwriteentries: Long, cwriteentries: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: CLFS_FLAG, plsn: Long, poverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_ReserveAndAppendLog(pvmarshal, rgwriteentries, cwriteentries.toInt(), plsnundonext, plsnprevious, creserverecords.toInt(), rgcbreservation, fflags.toInt(), plsn, poverlapped)

public actual fun ReserveAndAppendLogAligned(pvmarshal: Long, rgwriteentries: Long, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: CLFS_FLAG, plsn: Long, poverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_ReserveAndAppendLogAligned(pvmarshal, rgwriteentries, cwriteentries.toInt(), cbentryalignment.toInt(), plsnundonext, plsnprevious, creserverecords.toInt(), rgcbreservation, fflags.toInt(), plsn, poverlapped)

public actual fun RollbackComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_RollbackComplete(enlistmenthandle, tmvirtualclock)

public actual fun RollbackEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_RollbackEnlistment(enlistmenthandle, tmvirtualclock)

public actual fun RollbackTransaction(transactionhandle: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_RollbackTransaction(transactionhandle)

public actual fun RollbackTransactionAsync(transactionhandle: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_RollbackTransactionAsync(transactionhandle)

public actual fun RollforwardTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_RollforwardTransactionManager(transactionmanagerhandle, tmvirtualclock)

public actual fun ScanLogContainers(pcxscan: Long, escanmode: UByte, preserved: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_ScanLogContainers(pcxscan, escanmode.toByte(), preserved)

public actual fun SearchPathA(lppath: PCSTR, lpfilename: PCSTR, lpextension: PCSTR, nbufferlength: UInt, lpbuffer: PSTR, lpfilepart: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SearchPathA(lppath, lpfilename, lpextension, nbufferlength.toInt(), lpbuffer, lpfilepart).toUInt()

public actual fun SearchPathW(lppath: PCWSTR, lpfilename: PCWSTR, lpextension: PCWSTR, nbufferlength: UInt, lpbuffer: PWSTR, lpfilepart: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SearchPathW(lppath, lpfilename, lpextension, nbufferlength.toInt(), lpbuffer, lpfilepart).toUInt()

public actual fun SetEncryptedFileMetadata(lpfilename: PCWSTR, pboldmetadata: Long, pbnewmetadata: Long, pownerhash: Long, dwoperation: UInt, pcertificatesadded: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetEncryptedFileMetadata(lpfilename, pboldmetadata, pbnewmetadata, pownerhash, dwoperation.toInt(), pcertificatesadded).toUInt()

public actual fun SetEndOfFile(hfile: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetEndOfFile(hfile)

public actual fun SetEndOfLog(hlog: HANDLE, plsnend: Long, lpoverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetEndOfLog(hlog, plsnend, lpoverlapped)

public actual fun SetEnlistmentRecoveryInformation(enlistmenthandle: HANDLE, buffersize: UInt, buffer: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetEnlistmentRecoveryInformation(enlistmenthandle, buffersize.toInt(), buffer)

public actual fun SetFileApisToANSI() {
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetFileApisToANSI()
}

public actual fun SetFileApisToOEM() {
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetFileApisToOEM()
}

public actual fun SetFileAttributesA(lpfilename: PCSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetFileAttributesA(lpfilename, dwfileattributes.toInt())

public actual fun SetFileAttributesFromAppW(lpfilename: PCWSTR, dwfileattributes: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetFileAttributesFromAppW(lpfilename, dwfileattributes.toInt())

public actual fun SetFileAttributesTransactedA(lpfilename: PCSTR, dwfileattributes: UInt, htransaction: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetFileAttributesTransactedA(lpfilename, dwfileattributes.toInt(), htransaction)

public actual fun SetFileAttributesTransactedW(lpfilename: PCWSTR, dwfileattributes: UInt, htransaction: HANDLE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetFileAttributesTransactedW(lpfilename, dwfileattributes.toInt(), htransaction)

public actual fun SetFileAttributesW(lpfilename: PCWSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetFileAttributesW(lpfilename, dwfileattributes.toInt())

public actual fun SetFileBandwidthReservation(hfile: HANDLE, nperiodmilliseconds: UInt, nbytesperperiod: UInt, bdiscardable: BOOL, lptransfersize: Long, lpnumoutstandingrequests: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetFileBandwidthReservation(hfile, nperiodmilliseconds.toInt(), nbytesperperiod.toInt(), bdiscardable, lptransfersize, lpnumoutstandingrequests)

public actual fun SetFileCompletionNotificationModes(filehandle: HANDLE, flags: UByte): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetFileCompletionNotificationModes(filehandle, flags.toByte())

public actual fun SetFileInformationByHandle(hfile: HANDLE, fileinformationclass: FILE_INFO_BY_HANDLE_CLASS, lpfileinformation: Long, dwbuffersize: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetFileInformationByHandle(hfile, fileinformationclass, lpfileinformation, dwbuffersize.toInt())

public actual fun SetFileIoOverlappedRange(filehandle: HANDLE, overlappedrangestart: Long, length: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetFileIoOverlappedRange(filehandle, overlappedrangestart, length.toInt())

public actual fun SetFilePointer(hfile: HANDLE, ldistancetomove: Int, lpdistancetomovehigh: Long, dwmovemethod: SET_FILE_POINTER_MOVE_METHOD): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetFilePointer(hfile, ldistancetomove, lpdistancetomovehigh, dwmovemethod.toInt()).toUInt()

public actual fun SetFilePointerEx(hfile: HANDLE, lidistancetomove: Long, lpnewfilepointer: Long, dwmovemethod: SET_FILE_POINTER_MOVE_METHOD): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetFilePointerEx(hfile, lidistancetomove, lpnewfilepointer, dwmovemethod.toInt())

public actual fun SetFileShortNameA(hfile: HANDLE, lpshortname: PCSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetFileShortNameA(hfile, lpshortname)

public actual fun SetFileShortNameW(hfile: HANDLE, lpshortname: PCWSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetFileShortNameW(hfile, lpshortname)

public actual fun SetFileTime(hfile: HANDLE, lpcreationtime: Long, lplastaccesstime: Long, lplastwritetime: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetFileTime(hfile, lpcreationtime, lplastaccesstime, lplastwritetime)

public actual fun SetFileValidData(hfile: HANDLE, validdatalength: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetFileValidData(hfile, validdatalength)

public actual fun SetIoRingCompletionEvent(ioring: HIORING, hevent: HANDLE): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetIoRingCompletionEvent(ioring, hevent)

public actual fun SetLogArchiveMode(hlog: HANDLE, emode: CLFS_LOG_ARCHIVE_MODE): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetLogArchiveMode(hlog, emode)

public actual fun SetLogArchiveTail(hlog: HANDLE, plsnarchivetail: Long, preserved: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetLogArchiveTail(hlog, plsnarchivetail, preserved)

public actual fun SetLogFileSizeWithPolicy(hlog: HANDLE, pdesiredsize: Long, presultingsize: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetLogFileSizeWithPolicy(hlog, pdesiredsize, presultingsize)

public actual fun SetResourceManagerCompletionPort(resourcemanagerhandle: HANDLE, iocompletionporthandle: HANDLE, completionkey: ULong): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetResourceManagerCompletionPort(resourcemanagerhandle, iocompletionporthandle, completionkey.toLong())

public actual fun SetSearchPathMode(flags: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetSearchPathMode(flags.toInt())

public actual fun SetTapeParameters(hdevice: HANDLE, dwoperation: TAPE_INFORMATION_TYPE, lptapeinformation: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetTapeParameters(hdevice, dwoperation.toInt(), lptapeinformation).toUInt()

public actual fun SetTapePosition(hdevice: HANDLE, dwpositionmethod: TAPE_POSITION_METHOD, dwpartition: UInt, dwoffsetlow: UInt, dwoffsethigh: UInt, bimmediate: BOOL): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetTapePosition(hdevice, dwpositionmethod.toInt(), dwpartition.toInt(), dwoffsetlow.toInt(), dwoffsethigh.toInt(), bimmediate).toUInt()

public actual fun SetTransactionInformation(transactionhandle: HANDLE, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: PCWSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetTransactionInformation(transactionhandle, isolationlevel.toInt(), isolationflags.toInt(), timeout.toInt(), description)

public actual fun SetUserFileEncryptionKey(pencryptioncertificate: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetUserFileEncryptionKey(pencryptioncertificate).toUInt()

public actual fun SetUserFileEncryptionKeyEx(pencryptioncertificate: Long, dwcapabilities: UInt, dwflags: UInt, pvreserved: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetUserFileEncryptionKeyEx(pencryptioncertificate, dwcapabilities.toInt(), dwflags.toInt(), pvreserved).toUInt()

public actual fun SetVolumeLabelA(lprootpathname: PCSTR, lpvolumename: PCSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetVolumeLabelA(lprootpathname, lpvolumename)

public actual fun SetVolumeLabelW(lprootpathname: PCWSTR, lpvolumename: PCWSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetVolumeLabelW(lprootpathname, lpvolumename)

public actual fun SetVolumeMountPointA(lpszvolumemountpoint: PCSTR, lpszvolumename: PCSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetVolumeMountPointA(lpszvolumemountpoint, lpszvolumename)

public actual fun SetVolumeMountPointW(lpszvolumemountpoint: PCWSTR, lpszvolumename: PCWSTR): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SetVolumeMountPointW(lpszvolumemountpoint, lpszvolumename)

public actual fun SinglePhaseReject(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SinglePhaseReject(enlistmenthandle, tmvirtualclock)

public actual fun SubmitIoRing(ioring: HIORING, waitoperations: UInt, milliseconds: UInt, submittedentries: Long): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_SubmitIoRing(ioring, waitoperations.toInt(), milliseconds.toInt(), submittedentries)

public actual fun TerminateLogArchive(pvarchivecontext: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_TerminateLogArchive(pvarchivecontext)

public actual fun TerminateReadLog(pvcursorcontext: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_TerminateReadLog(pvcursorcontext)

public actual fun TruncateLog(pvmarshal: Long, plsnend: Long, lpoverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_TruncateLog(pvmarshal, plsnend, lpoverlapped)

public actual fun TxfGetThreadMiniVersionForCreate(miniversion: Long) {
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_TxfGetThreadMiniVersionForCreate(miniversion)
}

public actual fun TxfLogCreateFileReadContext(logpath: PCWSTR, beginninglsn: CLS_LSN, endinglsn: CLS_LSN, txffileid: Long, txflogcontext: Long): BOOL =
    0

public actual fun TxfLogCreateRangeReadContext(logpath: PCWSTR, beginninglsn: CLS_LSN, endinglsn: CLS_LSN, beginningvirtualclock: Long, endingvirtualclock: Long, recordtypemask: UInt, txflogcontext: Long): BOOL =
    0

public actual fun TxfLogDestroyReadContext(txflogcontext: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_TxfLogDestroyReadContext(txflogcontext)

public actual fun TxfLogReadRecords(txflogcontext: Long, bufferlength: UInt, buffer: Long, bytesused: Long, recordcount: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_TxfLogReadRecords(txflogcontext, bufferlength.toInt(), buffer, bytesused, recordcount)

public actual fun TxfLogRecordGetFileName(recordbuffer: Long, recordbufferlengthinbytes: UInt, namebuffer: PWSTR, namebufferlengthinbytes: Long, txfid: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_TxfLogRecordGetFileName(recordbuffer, recordbufferlengthinbytes.toInt(), namebuffer, namebufferlengthinbytes, txfid)

public actual fun TxfLogRecordGetGenericType(recordbuffer: Long, recordbufferlengthinbytes: UInt, generictype: Long, virtualclock: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_TxfLogRecordGetGenericType(recordbuffer, recordbufferlengthinbytes.toInt(), generictype, virtualclock)

public actual fun TxfReadMetadataInfo(filehandle: HANDLE, txffileid: Long, lastlsn: Long, transactionstate: Long, lockingtransaction: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_TxfReadMetadataInfo(filehandle, txffileid, lastlsn, transactionstate, lockingtransaction)

public actual fun TxfSetThreadMiniVersionForCreate(miniversion: UShort) {
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_TxfSetThreadMiniVersionForCreate(miniversion.toShort())
}

public actual fun UnlockFile(hfile: HANDLE, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_UnlockFile(hfile, dwfileoffsetlow.toInt(), dwfileoffsethigh.toInt(), nnumberofbytestounlocklow.toInt(), nnumberofbytestounlockhigh.toInt())

public actual fun UnlockFileEx(hfile: HANDLE, dwreserved: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt, lpoverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_UnlockFileEx(hfile, dwreserved.toInt(), nnumberofbytestounlocklow.toInt(), nnumberofbytestounlockhigh.toInt(), lpoverlapped)

public actual fun ValidateLog(pszlogfilename: PCWSTR, psalogfile: Long, pinfobuffer: Long, pcbbuffer: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_ValidateLog(pszlogfilename, psalogfile, pinfobuffer, pcbbuffer)

public actual fun VerFindFileA(uflags: VER_FIND_FILE_FLAGS, szfilename: PCSTR, szwindir: PCSTR, szappdir: PCSTR, szcurdir: PSTR, pucurdirlen: Long, szdestdir: PSTR, pudestdirlen: Long): VER_FIND_FILE_STATUS =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_VerFindFileA(uflags.toInt(), szfilename, szwindir, szappdir, szcurdir, pucurdirlen, szdestdir, pudestdirlen).toUInt()

public actual fun VerFindFileW(uflags: VER_FIND_FILE_FLAGS, szfilename: PCWSTR, szwindir: PCWSTR, szappdir: PCWSTR, szcurdir: PWSTR, pucurdirlen: Long, szdestdir: PWSTR, pudestdirlen: Long): VER_FIND_FILE_STATUS =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_VerFindFileW(uflags.toInt(), szfilename, szwindir, szappdir, szcurdir, pucurdirlen, szdestdir, pudestdirlen).toUInt()

public actual fun VerInstallFileA(uflags: VER_INSTALL_FILE_FLAGS, szsrcfilename: PCSTR, szdestfilename: PCSTR, szsrcdir: PCSTR, szdestdir: PCSTR, szcurdir: PCSTR, sztmpfile: PSTR, putmpfilelen: Long): VER_INSTALL_FILE_STATUS =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_VerInstallFileA(uflags.toInt(), szsrcfilename, szdestfilename, szsrcdir, szdestdir, szcurdir, sztmpfile, putmpfilelen).toUInt()

public actual fun VerInstallFileW(uflags: VER_INSTALL_FILE_FLAGS, szsrcfilename: PCWSTR, szdestfilename: PCWSTR, szsrcdir: PCWSTR, szdestdir: PCWSTR, szcurdir: PCWSTR, sztmpfile: PWSTR, putmpfilelen: Long): VER_INSTALL_FILE_STATUS =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_VerInstallFileW(uflags.toInt(), szsrcfilename, szdestfilename, szsrcdir, szdestdir, szcurdir, sztmpfile, putmpfilelen).toUInt()

public actual fun VerLanguageNameA(wlang: UInt, szlang: PSTR, cchlang: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_VerLanguageNameA(wlang.toInt(), szlang, cchlang.toInt()).toUInt()

public actual fun VerLanguageNameW(wlang: UInt, szlang: PWSTR, cchlang: UInt): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_VerLanguageNameW(wlang.toInt(), szlang, cchlang.toInt()).toUInt()

public actual fun VerQueryValueA(pblock: Long, lpsubblock: PCSTR, lplpbuffer: Long, pulen: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_VerQueryValueA(pblock, lpsubblock, lplpbuffer, pulen)

public actual fun VerQueryValueW(pblock: Long, lpsubblock: PCWSTR, lplpbuffer: Long, pulen: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_VerQueryValueW(pblock, lpsubblock, lplpbuffer, pulen)

public actual fun WofEnumEntries(volumename: PCWSTR, provider: UInt, enumproc: WofEnumEntryProc, userdata: Long): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_WofEnumEntries(volumename, provider.toInt(), enumproc.toLong(), userdata)

public actual fun WofFileEnumFiles(volumename: PCWSTR, algorithm: UInt, enumproc: WofEnumFilesProc, userdata: Long): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_WofFileEnumFiles(volumename, algorithm.toInt(), enumproc.toLong(), userdata)

public actual fun WofGetDriverVersion(fileorvolumehandle: HANDLE, provider: UInt, wofversion: Long): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_WofGetDriverVersion(fileorvolumehandle, provider.toInt(), wofversion)

public actual fun WofIsExternalFile(filepath: PCWSTR, isexternalfile: Long, provider: Long, externalfileinfo: Long, bufferlength: Long): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_WofIsExternalFile(filepath, isexternalfile, provider, externalfileinfo, bufferlength)

public actual fun WofSetFileDataLocation(filehandle: HANDLE, provider: UInt, externalfileinfo: Long, length: UInt): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_WofSetFileDataLocation(filehandle, provider.toInt(), externalfileinfo, length.toInt())

public actual fun WofShouldCompressBinaries(volume: PCWSTR, algorithm: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_WofShouldCompressBinaries(volume, algorithm)

public actual fun WofWimAddEntry(volumename: PCWSTR, wimpath: PCWSTR, wimtype: UInt, wimindex: UInt, datasourceid: Long): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_WofWimAddEntry(volumename, wimpath, wimtype.toInt(), wimindex.toInt(), datasourceid)

public actual fun WofWimEnumFiles(volumename: PCWSTR, datasourceid: Long, enumproc: WofEnumFilesProc, userdata: Long): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_WofWimEnumFiles(volumename, datasourceid, enumproc.toLong(), userdata)

public actual fun WofWimRemoveEntry(volumename: PCWSTR, datasourceid: Long): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_WofWimRemoveEntry(volumename, datasourceid)

public actual fun WofWimSuspendEntry(volumename: PCWSTR, datasourceid: Long): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_WofWimSuspendEntry(volumename, datasourceid)

public actual fun WofWimUpdateEntry(volumename: PCWSTR, datasourceid: Long, newwimpath: PCWSTR): HRESULT =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_WofWimUpdateEntry(volumename, datasourceid, newwimpath)

public actual fun Wow64DisableWow64FsRedirection(oldvalue: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_Wow64DisableWow64FsRedirection(oldvalue)

public actual fun Wow64EnableWow64FsRedirection(wow64fsenableredirection: Boolean): Boolean =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_Wow64EnableWow64FsRedirection(wow64fsenableredirection)

public actual fun Wow64RevertWow64FsRedirection(olvalue: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_Wow64RevertWow64FsRedirection(olvalue)

public actual fun WriteEncryptedFileRaw(pfimportcallback: PFE_IMPORT_FUNC, pvcallbackcontext: Long, pvcontext: Long): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_WriteEncryptedFileRaw(pfimportcallback.toLong(), pvcallbackcontext, pvcontext).toUInt()

public actual fun WriteFile(hfile: HANDLE, lpbuffer: Long, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: Long, lpoverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_WriteFile(hfile, lpbuffer, nnumberofbytestowrite.toInt(), lpnumberofbyteswritten, lpoverlapped)

public actual fun WriteFileEx(hfile: HANDLE, lpbuffer: Long, nnumberofbytestowrite: UInt, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE): BOOL =
    0

public actual fun WriteFileGather(hfile: HANDLE, asegmentarray: Long, nnumberofbytestowrite: UInt, lpreserved: Long, lpoverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_WriteFileGather(hfile, asegmentarray, nnumberofbytestowrite.toInt(), lpreserved, lpoverlapped)

public actual fun WriteLogRestartArea(pvmarshal: Long, pvrestartbuffer: Long, cbrestartbuffer: UInt, plsnbase: Long, fflags: CLFS_FLAG, pcbwritten: Long, plsnnext: Long, poverlapped: Long): BOOL =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_WriteLogRestartArea(pvmarshal, pvrestartbuffer, cbrestartbuffer.toInt(), plsnbase, fflags.toInt(), pcbwritten, plsnnext, poverlapped)

public actual fun WriteTapemark(hdevice: HANDLE, dwtapemarktype: TAPEMARK_TYPE, dwtapemarkcount: UInt, bimmediate: BOOL): UInt =
    WindowsWin32StorageFilesystemJniBridge.windowssys_windows_win32_storage_filesystem_WriteTapemark(hdevice, dwtapemarktype.toInt(), dwtapemarkcount.toInt(), bimmediate).toUInt()
