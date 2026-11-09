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

public actual fun AddLogContainer(hlog: HANDLE, pcbcontainer: Long, pwszcontainerpath: PCWSTR, preserved: Long): BOOL =
    0

public actual fun AddLogContainerSet(hlog: HANDLE, ccontainer: UShort, pcbcontainer: Long, rgwszcontainerpath: Long, preserved: Long): BOOL =
    0

public actual fun AddUsersToEncryptedFile(lpfilename: PCWSTR, pencryptioncertificates: Long): UInt =
    0u

public actual fun AdvanceLogBase(pvmarshal: Long, plsnbase: Long, fflags: UInt, poverlapped: Long): BOOL =
    0

public actual fun AlignReservedLog(pvmarshal: Long, creservedrecords: UInt, rgcbreservation: Long, pcbalignreservation: Long): BOOL =
    0

public actual fun AllocReservedLog(pvmarshal: Long, creservedrecords: UInt, pcbadjustment: Long): BOOL =
    0

public actual fun AreFileApisANSI(): BOOL =
    0

public actual fun AreShortNamesEnabled(handle: HANDLE, enabled: Long): BOOL =
    0

public actual fun BackupRead(hfile: HANDLE, lpbuffer: Long, nnumberofbytestoread: UInt, lpnumberofbytesread: Long, babort: BOOL, bprocesssecurity: BOOL, lpcontext: Long): BOOL =
    0

public actual fun BackupSeek(hfile: HANDLE, dwlowbytestoseek: UInt, dwhighbytestoseek: UInt, lpdwlowbyteseeked: Long, lpdwhighbyteseeked: Long, lpcontext: Long): BOOL =
    0

public actual fun BackupWrite(hfile: HANDLE, lpbuffer: Long, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: Long, babort: BOOL, bprocesssecurity: BOOL, lpcontext: Long): BOOL =
    0

public actual fun BuildIoRingCancelRequest(ioring: HIORING, file: IORING_HANDLE_REF, optocancel: ULong, userdata: ULong): HRESULT =
    0

public actual fun BuildIoRingFlushFile(ioring: HIORING, fileref: IORING_HANDLE_REF, flushmode: FILE_FLUSH_MODE, userdata: ULong, sqeflags: IORING_SQE_FLAGS): HRESULT =
    0

public actual fun BuildIoRingReadFile(ioring: HIORING, fileref: IORING_HANDLE_REF, dataref: IORING_BUFFER_REF, numberofbytestoread: UInt, fileoffset: ULong, userdata: ULong, sqeflags: IORING_SQE_FLAGS): HRESULT =
    0

public actual fun BuildIoRingRegisterBuffers(ioring: HIORING, count: UInt, buffers: Long, userdata: ULong): HRESULT =
    0

public actual fun BuildIoRingRegisterFileHandles(ioring: HIORING, count: UInt, handles: Long, userdata: ULong): HRESULT =
    0

public actual fun BuildIoRingWriteFile(ioring: HIORING, fileref: IORING_HANDLE_REF, bufferref: IORING_BUFFER_REF, numberofbytestowrite: UInt, fileoffset: ULong, writeflags: FILE_WRITE_FLAGS, userdata: ULong, sqeflags: IORING_SQE_FLAGS): HRESULT =
    0

public actual fun CheckNameLegalDOS8Dot3A(lpname: PCSTR, lpoemname: PSTR, oemnamesize: UInt, pbnamecontainsspaces: Long, pbnamelegal: Long): BOOL =
    0

public actual fun CheckNameLegalDOS8Dot3W(lpname: PCWSTR, lpoemname: PSTR, oemnamesize: UInt, pbnamecontainsspaces: Long, pbnamelegal: Long): BOOL =
    0

public actual fun CloseAndResetLogFile(hlog: HANDLE): BOOL =
    0

public actual fun CloseEncryptedFileRaw(pvcontext: Long) {
}

public actual fun CloseIoRing(ioring: HIORING): HRESULT =
    0

public actual fun CommitComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    0

public actual fun CommitEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    0

public actual fun CommitTransaction(transactionhandle: HANDLE): BOOL =
    0

public actual fun CommitTransactionAsync(transactionhandle: HANDLE): BOOL =
    0

public actual fun CompareFileTime(lpfiletime1: Long, lpfiletime2: Long): Int =
    0

public actual fun CopyFile2(pwszexistingfilename: PCWSTR, pwsznewfilename: PCWSTR, pextendedparameters: Long): HRESULT =
    0

public actual fun CopyFileA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, bfailifexists: BOOL): BOOL =
    0

public actual fun CopyFileExA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: COPYFILE_FLAGS): BOOL =
    0

public actual fun CopyFileExW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: COPYFILE_FLAGS): BOOL =
    0

public actual fun CopyFileFromAppW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, bfailifexists: BOOL): BOOL =
    0

public actual fun CopyFileTransactedA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: UInt, htransaction: HANDLE): BOOL =
    0

public actual fun CopyFileTransactedW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: UInt, htransaction: HANDLE): BOOL =
    0

public actual fun CopyFileW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, bfailifexists: BOOL): BOOL =
    0

public actual fun CopyLZFile(hfsource: Int, hfdest: Int): Int =
    0

public actual fun CreateDirectoryA(lppathname: PCSTR, lpsecurityattributes: Long): BOOL =
    0

public actual fun CreateDirectoryExA(lptemplatedirectory: PCSTR, lpnewdirectory: PCSTR, lpsecurityattributes: Long): BOOL =
    0

public actual fun CreateDirectoryExW(lptemplatedirectory: PCWSTR, lpnewdirectory: PCWSTR, lpsecurityattributes: Long): BOOL =
    0

public actual fun CreateDirectoryFromAppW(lppathname: PCWSTR, lpsecurityattributes: Long): BOOL =
    0

public actual fun CreateDirectoryTransactedA(lptemplatedirectory: PCSTR, lpnewdirectory: PCSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL =
    0

public actual fun CreateDirectoryTransactedW(lptemplatedirectory: PCWSTR, lpnewdirectory: PCWSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL =
    0

public actual fun CreateDirectoryW(lppathname: PCWSTR, lpsecurityattributes: Long): BOOL =
    0

public actual fun CreateEnlistment(lpenlistmentattributes: Long, resourcemanagerhandle: HANDLE, transactionhandle: HANDLE, notificationmask: UInt, createoptions: UInt, enlistmentkey: Long): HANDLE =
    0L

public actual fun CreateFile2(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, dwcreationdisposition: FILE_CREATION_DISPOSITION, pcreateexparams: Long): HANDLE =
    0L

public actual fun CreateFile2FromAppW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationdisposition: UInt, pcreateexparams: Long): HANDLE =
    0L

public actual fun CreateFileA(lpfilename: PCSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE): HANDLE =
    0L

public actual fun CreateFileFromAppW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: Long, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: HANDLE): HANDLE =
    0L

public actual fun CreateFileTransactedA(lpfilename: PCSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE, htransaction: HANDLE, pusminiversion: Long, lpextendedparameter: Long): HANDLE =
    0L

public actual fun CreateFileTransactedW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE, htransaction: HANDLE, pusminiversion: Long, lpextendedparameter: Long): HANDLE =
    0L

public actual fun CreateFileW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE): HANDLE =
    0L

public actual fun CreateHardLinkA(lpfilename: PCSTR, lpexistingfilename: PCSTR, lpsecurityattributes: Long): BOOL =
    0

public actual fun CreateHardLinkTransactedA(lpfilename: PCSTR, lpexistingfilename: PCSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL =
    0

public actual fun CreateHardLinkTransactedW(lpfilename: PCWSTR, lpexistingfilename: PCWSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL =
    0

public actual fun CreateHardLinkW(lpfilename: PCWSTR, lpexistingfilename: PCWSTR, lpsecurityattributes: Long): BOOL =
    0

public actual fun CreateIoRing(ioringversion: IORING_VERSION, flags: IORING_CREATE_FLAGS, submissionqueuesize: UInt, completionqueuesize: UInt, h: Long): HRESULT =
    0

public actual fun CreateLogContainerScanContext(hlog: HANDLE, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: Long, poverlapped: Long): BOOL =
    0

public actual fun CreateLogFile(pszlogfilename: PCWSTR, fdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, psalogfile: Long, fcreatedisposition: FILE_CREATION_DISPOSITION, fflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES): HANDLE =
    0L

public actual fun CreateLogMarshallingArea(hlog: HANDLE, pfnallocbuffer: CLFS_BLOCK_ALLOCATION, pfnfreebuffer: CLFS_BLOCK_DEALLOCATION, pvblockalloccontext: Long, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshal: Long): BOOL =
    0

public actual fun CreateResourceManager(lpresourcemanagerattributes: Long, resourcemanagerid: Long, createoptions: UInt, tmhandle: HANDLE, description: PCWSTR): HANDLE =
    0L

public actual fun CreateSymbolicLinkA(lpsymlinkfilename: PCSTR, lptargetfilename: PCSTR, dwflags: SYMBOLIC_LINK_FLAGS): Boolean =
    false

public actual fun CreateSymbolicLinkTransactedA(lpsymlinkfilename: PCSTR, lptargetfilename: PCSTR, dwflags: SYMBOLIC_LINK_FLAGS, htransaction: HANDLE): Boolean =
    false

public actual fun CreateSymbolicLinkTransactedW(lpsymlinkfilename: PCWSTR, lptargetfilename: PCWSTR, dwflags: SYMBOLIC_LINK_FLAGS, htransaction: HANDLE): Boolean =
    false

public actual fun CreateSymbolicLinkW(lpsymlinkfilename: PCWSTR, lptargetfilename: PCWSTR, dwflags: SYMBOLIC_LINK_FLAGS): Boolean =
    false

public actual fun CreateTapePartition(hdevice: HANDLE, dwpartitionmethod: CREATE_TAPE_PARTITION_METHOD, dwcount: UInt, dwsize: UInt): UInt =
    0u

public actual fun CreateTransaction(lptransactionattributes: Long, uow: Long, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: PCWSTR): HANDLE =
    0L

public actual fun CreateTransactionManager(lptransactionattributes: Long, logfilename: PCWSTR, createoptions: UInt, commitstrength: UInt): HANDLE =
    0L

public actual fun DecryptFileA(lpfilename: PCSTR, dwreserved: UInt): BOOL =
    0

public actual fun DecryptFileW(lpfilename: PCWSTR, dwreserved: UInt): BOOL =
    0

public actual fun DefineDosDeviceA(dwflags: DEFINE_DOS_DEVICE_FLAGS, lpdevicename: PCSTR, lptargetpath: PCSTR): BOOL =
    0

public actual fun DefineDosDeviceW(dwflags: DEFINE_DOS_DEVICE_FLAGS, lpdevicename: PCWSTR, lptargetpath: PCWSTR): BOOL =
    0

public actual fun DeleteFileA(lpfilename: PCSTR): BOOL =
    0

public actual fun DeleteFileFromAppW(lpfilename: PCWSTR): BOOL =
    0

public actual fun DeleteFileTransactedA(lpfilename: PCSTR, htransaction: HANDLE): BOOL =
    0

public actual fun DeleteFileTransactedW(lpfilename: PCWSTR, htransaction: HANDLE): BOOL =
    0

public actual fun DeleteFileW(lpfilename: PCWSTR): BOOL =
    0

public actual fun DeleteLogByHandle(hlog: HANDLE): BOOL =
    0

public actual fun DeleteLogFile(pszlogfilename: PCWSTR, pvreserved: Long): BOOL =
    0

public actual fun DeleteLogMarshallingArea(pvmarshal: Long): BOOL =
    0

public actual fun DeleteVolumeMountPointA(lpszvolumemountpoint: PCSTR): BOOL =
    0

public actual fun DeleteVolumeMountPointW(lpszvolumemountpoint: PCWSTR): BOOL =
    0

public actual fun DeregisterManageableLogClient(hlog: HANDLE): BOOL =
    0

public actual fun DuplicateEncryptionInfoFile(srcfilename: PCWSTR, dstfilename: PCWSTR, dwcreationdistribution: UInt, dwattributes: UInt, lpsecurityattributes: Long): UInt =
    0u

public actual fun EncryptFileA(lpfilename: PCSTR): BOOL =
    0

public actual fun EncryptFileW(lpfilename: PCWSTR): BOOL =
    0

public actual fun EncryptionDisable(dirpath: PCWSTR, disable: BOOL): BOOL =
    0

public actual fun EraseTape(hdevice: HANDLE, dwerasetype: ERASE_TAPE_TYPE, bimmediate: BOOL): UInt =
    0u

public actual fun FileEncryptionStatusA(lpfilename: PCSTR, lpstatus: Long): BOOL =
    0

public actual fun FileEncryptionStatusW(lpfilename: PCWSTR, lpstatus: Long): BOOL =
    0

public actual fun FileTimeToLocalFileTime(lpfiletime: Long, lplocalfiletime: Long): BOOL =
    0

public actual fun FindClose(hfindfile: HANDLE): BOOL =
    0

public actual fun FindCloseChangeNotification(hchangehandle: HANDLE): BOOL =
    0

public actual fun FindFirstChangeNotificationA(lppathname: PCSTR, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE): HANDLE =
    0L

public actual fun FindFirstChangeNotificationW(lppathname: PCWSTR, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE): HANDLE =
    0L

public actual fun FindFirstFileA(lpfilename: PCSTR, lpfindfiledata: Long): HANDLE =
    0L

public actual fun FindFirstFileExA(lpfilename: PCSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: FIND_FIRST_EX_FLAGS): HANDLE =
    0L

public actual fun FindFirstFileExFromAppW(lpfilename: PCWSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: UInt): HANDLE =
    0L

public actual fun FindFirstFileExW(lpfilename: PCWSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: FIND_FIRST_EX_FLAGS): HANDLE =
    0L

public actual fun FindFirstFileNameTransactedW(lpfilename: PCWSTR, dwflags: UInt, stringlength: Long, linkname: PWSTR, htransaction: HANDLE): HANDLE =
    0L

public actual fun FindFirstFileNameW(lpfilename: PCWSTR, dwflags: UInt, stringlength: Long, linkname: PWSTR): HANDLE =
    0L

public actual fun FindFirstFileTransactedA(lpfilename: PCSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: UInt, htransaction: HANDLE): HANDLE =
    0L

public actual fun FindFirstFileTransactedW(lpfilename: PCWSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: UInt, htransaction: HANDLE): HANDLE =
    0L

public actual fun FindFirstFileW(lpfilename: PCWSTR, lpfindfiledata: Long): HANDLE =
    0L

public actual fun FindFirstStreamTransactedW(lpfilename: PCWSTR, infolevel: STREAM_INFO_LEVELS, lpfindstreamdata: Long, dwflags: UInt, htransaction: HANDLE): HANDLE =
    0L

public actual fun FindFirstStreamW(lpfilename: PCWSTR, infolevel: STREAM_INFO_LEVELS, lpfindstreamdata: Long, dwflags: UInt): HANDLE =
    0L

public actual fun FindFirstVolumeA(lpszvolumename: PSTR, cchbufferlength: UInt): HANDLE =
    0L

public actual fun FindFirstVolumeMountPointA(lpszrootpathname: PCSTR, lpszvolumemountpoint: PSTR, cchbufferlength: UInt): HANDLE =
    0L

public actual fun FindFirstVolumeMountPointW(lpszrootpathname: PCWSTR, lpszvolumemountpoint: PWSTR, cchbufferlength: UInt): HANDLE =
    0L

public actual fun FindFirstVolumeW(lpszvolumename: PWSTR, cchbufferlength: UInt): HANDLE =
    0L

public actual fun FindNextChangeNotification(hchangehandle: HANDLE): BOOL =
    0

public actual fun FindNextFileA(hfindfile: HANDLE, lpfindfiledata: Long): BOOL =
    0

public actual fun FindNextFileNameW(hfindstream: HANDLE, stringlength: Long, linkname: PWSTR): BOOL =
    0

public actual fun FindNextFileW(hfindfile: HANDLE, lpfindfiledata: Long): BOOL =
    0

public actual fun FindNextStreamW(hfindstream: HANDLE, lpfindstreamdata: Long): BOOL =
    0

public actual fun FindNextVolumeA(hfindvolume: HANDLE, lpszvolumename: PSTR, cchbufferlength: UInt): BOOL =
    0

public actual fun FindNextVolumeMountPointA(hfindvolumemountpoint: HANDLE, lpszvolumemountpoint: PSTR, cchbufferlength: UInt): BOOL =
    0

public actual fun FindNextVolumeMountPointW(hfindvolumemountpoint: HANDLE, lpszvolumemountpoint: PWSTR, cchbufferlength: UInt): BOOL =
    0

public actual fun FindNextVolumeW(hfindvolume: HANDLE, lpszvolumename: PWSTR, cchbufferlength: UInt): BOOL =
    0

public actual fun FindVolumeClose(hfindvolume: HANDLE): BOOL =
    0

public actual fun FindVolumeMountPointClose(hfindvolumemountpoint: HANDLE): BOOL =
    0

public actual fun FlushFileBuffers(hfile: HANDLE): BOOL =
    0

public actual fun FlushLogBuffers(pvmarshal: Long, poverlapped: Long): BOOL =
    0

public actual fun FlushLogToLsn(pvmarshalcontext: Long, plsnflush: Long, plsnlastflushed: Long, poverlapped: Long): BOOL =
    0

public actual fun FreeEncryptedFileMetadata(pbmetadata: Long) {
}

public actual fun FreeEncryptionCertificateHashList(pusers: Long) {
}

public actual fun FreeReservedLog(pvmarshal: Long, creservedrecords: UInt, pcbadjustment: Long): BOOL =
    0

public actual fun GetBinaryTypeA(lpapplicationname: PCSTR, lpbinarytype: Long): BOOL =
    0

public actual fun GetBinaryTypeW(lpapplicationname: PCWSTR, lpbinarytype: Long): BOOL =
    0

public actual fun GetCompressedFileSizeA(lpfilename: PCSTR, lpfilesizehigh: Long): UInt =
    0u

public actual fun GetCompressedFileSizeTransactedA(lpfilename: PCSTR, lpfilesizehigh: Long, htransaction: HANDLE): UInt =
    0u

public actual fun GetCompressedFileSizeTransactedW(lpfilename: PCWSTR, lpfilesizehigh: Long, htransaction: HANDLE): UInt =
    0u

public actual fun GetCompressedFileSizeW(lpfilename: PCWSTR, lpfilesizehigh: Long): UInt =
    0u

public actual fun GetCurrentClockTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): BOOL =
    0

public actual fun GetDiskFreeSpaceA(lprootpathname: PCSTR, lpsectorspercluster: Long, lpbytespersector: Long, lpnumberoffreeclusters: Long, lptotalnumberofclusters: Long): BOOL =
    0

public actual fun GetDiskFreeSpaceExA(lpdirectoryname: PCSTR, lpfreebytesavailabletocaller: Long, lptotalnumberofbytes: Long, lptotalnumberoffreebytes: Long): BOOL =
    0

public actual fun GetDiskFreeSpaceExW(lpdirectoryname: PCWSTR, lpfreebytesavailabletocaller: Long, lptotalnumberofbytes: Long, lptotalnumberoffreebytes: Long): BOOL =
    0

public actual fun GetDiskFreeSpaceW(lprootpathname: PCWSTR, lpsectorspercluster: Long, lpbytespersector: Long, lpnumberoffreeclusters: Long, lptotalnumberofclusters: Long): BOOL =
    0

public actual fun GetDiskSpaceInformationA(rootpath: PCSTR, diskspaceinfo: Long): HRESULT =
    0

public actual fun GetDiskSpaceInformationW(rootpath: PCWSTR, diskspaceinfo: Long): HRESULT =
    0

public actual fun GetDriveTypeA(lprootpathname: PCSTR): UInt =
    0u

public actual fun GetDriveTypeW(lprootpathname: PCWSTR): UInt =
    0u

public actual fun GetEncryptedFileMetadata(lpfilename: PCWSTR, pcbmetadata: Long, ppbmetadata: Long): UInt =
    0u

public actual fun GetEnlistmentId(enlistmenthandle: HANDLE, enlistmentid: Long): BOOL =
    0

public actual fun GetEnlistmentRecoveryInformation(enlistmenthandle: HANDLE, buffersize: UInt, buffer: Long, bufferused: Long): BOOL =
    0

public actual fun GetExpandedNameA(lpszsource: PCSTR, lpszbuffer: PSTR): Int =
    0

public actual fun GetExpandedNameW(lpszsource: PCWSTR, lpszbuffer: PWSTR): Int =
    0

public actual fun GetFileAttributesA(lpfilename: PCSTR): UInt =
    0u

public actual fun GetFileAttributesExA(lpfilename: PCSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL =
    0

public actual fun GetFileAttributesExFromAppW(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL =
    0

public actual fun GetFileAttributesExW(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL =
    0

public actual fun GetFileAttributesTransactedA(lpfilename: PCSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long, htransaction: HANDLE): BOOL =
    0

public actual fun GetFileAttributesTransactedW(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long, htransaction: HANDLE): BOOL =
    0

public actual fun GetFileAttributesW(lpfilename: PCWSTR): UInt =
    0u

public actual fun GetFileBandwidthReservation(hfile: HANDLE, lpperiodmilliseconds: Long, lpbytesperperiod: Long, pdiscardable: Long, lptransfersize: Long, lpnumoutstandingrequests: Long): BOOL =
    0

public actual fun GetFileInformationByHandle(hfile: HANDLE, lpfileinformation: Long): BOOL =
    0

public actual fun GetFileInformationByHandleEx(hfile: HANDLE, fileinformationclass: FILE_INFO_BY_HANDLE_CLASS, lpfileinformation: Long, dwbuffersize: UInt): BOOL =
    0

public actual fun GetFileSize(hfile: HANDLE, lpfilesizehigh: Long): UInt =
    0u

public actual fun GetFileSizeEx(hfile: HANDLE, lpfilesize: Long): BOOL =
    0

public actual fun GetFileTime(hfile: HANDLE, lpcreationtime: Long, lplastaccesstime: Long, lplastwritetime: Long): BOOL =
    0

public actual fun GetFileType(hfile: HANDLE): FILE_TYPE =
    0u

public actual fun GetFileVersionInfoA(lptstrfilename: PCSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL =
    0

public actual fun GetFileVersionInfoExA(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL =
    0

public actual fun GetFileVersionInfoExW(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCWSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL =
    0

public actual fun GetFileVersionInfoSizeA(lptstrfilename: PCSTR, lpdwhandle: Long): UInt =
    0u

public actual fun GetFileVersionInfoSizeExA(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCSTR, lpdwhandle: Long): UInt =
    0u

public actual fun GetFileVersionInfoSizeExW(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCWSTR, lpdwhandle: Long): UInt =
    0u

public actual fun GetFileVersionInfoSizeW(lptstrfilename: PCWSTR, lpdwhandle: Long): UInt =
    0u

public actual fun GetFileVersionInfoW(lptstrfilename: PCWSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL =
    0

public actual fun GetFinalPathNameByHandleA(hfile: HANDLE, lpszfilepath: PSTR, cchfilepath: UInt, dwflags: GETFINALPATHNAMEBYHANDLE_FLAGS): UInt =
    0u

public actual fun GetFinalPathNameByHandleW(hfile: HANDLE, lpszfilepath: PWSTR, cchfilepath: UInt, dwflags: GETFINALPATHNAMEBYHANDLE_FLAGS): UInt =
    0u

public actual fun GetFullPathNameA(lpfilename: PCSTR, nbufferlength: UInt, lpbuffer: PSTR, lpfilepart: Long): UInt =
    0u

public actual fun GetFullPathNameTransactedA(lpfilename: PCSTR, nbufferlength: UInt, lpbuffer: PSTR, lpfilepart: Long, htransaction: HANDLE): UInt =
    0u

public actual fun GetFullPathNameTransactedW(lpfilename: PCWSTR, nbufferlength: UInt, lpbuffer: PWSTR, lpfilepart: Long, htransaction: HANDLE): UInt =
    0u

public actual fun GetFullPathNameW(lpfilename: PCWSTR, nbufferlength: UInt, lpbuffer: PWSTR, lpfilepart: Long): UInt =
    0u

public actual fun GetIoRingInfo(ioring: HIORING, info: Long): HRESULT =
    0

public actual fun GetLogContainerName(hlog: HANDLE, cidlogicalcontainer: UInt, pwstrcontainername: PCWSTR, clencontainername: UInt, pcactuallencontainername: Long): BOOL =
    0

public actual fun GetLogFileInformation(hlog: HANDLE, pinfobuffer: Long, cbbuffer: Long): BOOL =
    0

public actual fun GetLogIoStatistics(hlog: HANDLE, pvstatsbuffer: Long, cbstatsbuffer: UInt, estatsclass: CLFS_IOSTATS_CLASS, pcbstatswritten: Long): BOOL =
    0

public actual fun GetLogReservationInfo(pvmarshal: Long, pcbrecordnumber: Long, pcbuserreservation: Long, pcbcommitreservation: Long): BOOL =
    0

public actual fun GetLogicalDriveStringsA(nbufferlength: UInt, lpbuffer: PSTR): UInt =
    0u

public actual fun GetLogicalDriveStringsW(nbufferlength: UInt, lpbuffer: PWSTR): UInt =
    0u

public actual fun GetLogicalDrives(): UInt =
    0u

public actual fun GetLongPathNameA(lpszshortpath: PCSTR, lpszlongpath: PSTR, cchbuffer: UInt): UInt =
    0u

public actual fun GetLongPathNameTransactedA(lpszshortpath: PCSTR, lpszlongpath: PSTR, cchbuffer: UInt, htransaction: HANDLE): UInt =
    0u

public actual fun GetLongPathNameTransactedW(lpszshortpath: PCWSTR, lpszlongpath: PWSTR, cchbuffer: UInt, htransaction: HANDLE): UInt =
    0u

public actual fun GetLongPathNameW(lpszshortpath: PCWSTR, lpszlongpath: PWSTR, cchbuffer: UInt): UInt =
    0u

public actual fun GetNextLogArchiveExtent(pvarchivecontext: Long, rgadextent: Long, cdescriptors: UInt, pcdescriptorsreturned: Long): BOOL =
    0

public actual fun GetNotificationResourceManager(resourcemanagerhandle: HANDLE, transactionnotification: Long, notificationlength: UInt, dwmilliseconds: UInt, returnlength: Long): BOOL =
    0

public actual fun GetNotificationResourceManagerAsync(resourcemanagerhandle: HANDLE, transactionnotification: Long, transactionnotificationlength: UInt, returnlength: Long, lpoverlapped: Long): BOOL =
    0

public actual fun GetShortPathNameA(lpszlongpath: PCSTR, lpszshortpath: PSTR, cchbuffer: UInt): UInt =
    0u

public actual fun GetShortPathNameW(lpszlongpath: PCWSTR, lpszshortpath: PWSTR, cchbuffer: UInt): UInt =
    0u

public actual fun GetTapeParameters(hdevice: HANDLE, dwoperation: GET_TAPE_DRIVE_PARAMETERS_OPERATION, lpdwsize: Long, lptapeinformation: Long): UInt =
    0u

public actual fun GetTapePosition(hdevice: HANDLE, dwpositiontype: TAPE_POSITION_TYPE, lpdwpartition: Long, lpdwoffsetlow: Long, lpdwoffsethigh: Long): UInt =
    0u

public actual fun GetTapeStatus(hdevice: HANDLE): UInt =
    0u

public actual fun GetTempFileNameA(lppathname: PCSTR, lpprefixstring: PCSTR, uunique: UInt, lptempfilename: PSTR): UInt =
    0u

public actual fun GetTempFileNameW(lppathname: PCWSTR, lpprefixstring: PCWSTR, uunique: UInt, lptempfilename: PWSTR): UInt =
    0u

public actual fun GetTempPath2A(bufferlength: UInt, buffer: PSTR): UInt =
    0u

public actual fun GetTempPath2W(bufferlength: UInt, buffer: PWSTR): UInt =
    0u

public actual fun GetTempPathA(nbufferlength: UInt, lpbuffer: PSTR): UInt =
    0u

public actual fun GetTempPathW(nbufferlength: UInt, lpbuffer: PWSTR): UInt =
    0u

public actual fun GetTransactionId(transactionhandle: HANDLE, transactionid: Long): BOOL =
    0

public actual fun GetTransactionInformation(transactionhandle: HANDLE, outcome: Long, isolationlevel: Long, isolationflags: Long, timeout: Long, bufferlength: UInt, description: PWSTR): BOOL =
    0

public actual fun GetTransactionManagerId(transactionmanagerhandle: HANDLE, transactionmanagerid: Long): BOOL =
    0

public actual fun GetVolumeInformationA(lprootpathname: PCSTR, lpvolumenamebuffer: PSTR, nvolumenamesize: UInt, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: PSTR, nfilesystemnamesize: UInt): BOOL =
    0

public actual fun GetVolumeInformationByHandleW(hfile: HANDLE, lpvolumenamebuffer: PWSTR, nvolumenamesize: UInt, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: PWSTR, nfilesystemnamesize: UInt): BOOL =
    0

public actual fun GetVolumeInformationW(lprootpathname: PCWSTR, lpvolumenamebuffer: PWSTR, nvolumenamesize: UInt, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: PWSTR, nfilesystemnamesize: UInt): BOOL =
    0

public actual fun GetVolumeNameForVolumeMountPointA(lpszvolumemountpoint: PCSTR, lpszvolumename: PSTR, cchbufferlength: UInt): BOOL =
    0

public actual fun GetVolumeNameForVolumeMountPointW(lpszvolumemountpoint: PCWSTR, lpszvolumename: PWSTR, cchbufferlength: UInt): BOOL =
    0

public actual fun GetVolumePathNameA(lpszfilename: PCSTR, lpszvolumepathname: PSTR, cchbufferlength: UInt): BOOL =
    0

public actual fun GetVolumePathNameW(lpszfilename: PCWSTR, lpszvolumepathname: PWSTR, cchbufferlength: UInt): BOOL =
    0

public actual fun GetVolumePathNamesForVolumeNameA(lpszvolumename: PCSTR, lpszvolumepathnames: PSTR, cchbufferlength: UInt, lpcchreturnlength: Long): BOOL =
    0

public actual fun GetVolumePathNamesForVolumeNameW(lpszvolumename: PCWSTR, lpszvolumepathnames: PWSTR, cchbufferlength: UInt, lpcchreturnlength: Long): BOOL =
    0

public actual fun HandleLogFull(hlog: HANDLE): BOOL =
    0

public actual fun InstallLogPolicy(hlog: HANDLE, ppolicy: Long): BOOL =
    0

public actual fun IsIoRingOpSupported(ioring: HIORING, op: IORING_OP_CODE): BOOL =
    0

public actual fun LZClose(hfile: Int) {
}

public actual fun LZCopy(hfsource: Int, hfdest: Int): Int =
    0

public actual fun LZDone() {
}

public actual fun LZInit(hfsource: Int): Int =
    0

public actual fun LZOpenFileA(lpfilename: PCSTR, lpreopenbuf: Long, wstyle: LZOPENFILE_STYLE): Int =
    0

public actual fun LZOpenFileW(lpfilename: PCWSTR, lpreopenbuf: Long, wstyle: LZOPENFILE_STYLE): Int =
    0

public actual fun LZRead(hfile: Int, lpbuffer: PSTR, cbread: Int): Int =
    0

public actual fun LZSeek(hfile: Int, loffset: Int, iorigin: Int): Int =
    0

public actual fun LZStart(): Int =
    0

public actual fun LocalFileTimeToFileTime(lplocalfiletime: Long, lpfiletime: Long): BOOL =
    0

public actual fun LockFile(hfile: HANDLE, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt): BOOL =
    0

public actual fun LockFileEx(hfile: HANDLE, dwflags: LOCK_FILE_FLAGS, dwreserved: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt, lpoverlapped: Long): BOOL =
    0

public actual fun LogTailAdvanceFailure(hlog: HANDLE, dwreason: UInt): BOOL =
    0

public actual fun LsnBlockOffset(plsn: Long): UInt =
    0u

public actual fun LsnContainer(plsn: Long): UInt =
    0u

public actual fun LsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): CLS_LSN =
    CLS_LSN()

public actual fun LsnEqual(plsn1: Long, plsn2: Long): Boolean =
    false

public actual fun LsnGreater(plsn1: Long, plsn2: Long): Boolean =
    false

public actual fun LsnIncrement(plsn: Long): CLS_LSN =
    CLS_LSN()

public actual fun LsnInvalid(plsn: Long): Boolean =
    false

public actual fun LsnLess(plsn1: Long, plsn2: Long): Boolean =
    false

public actual fun LsnNull(plsn: Long): Boolean =
    false

public actual fun LsnRecordSequence(plsn: Long): UInt =
    0u

public actual fun MoveFileA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR): BOOL =
    0

public actual fun MoveFileExA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, dwflags: MOVE_FILE_FLAGS): BOOL =
    0

public actual fun MoveFileExW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, dwflags: MOVE_FILE_FLAGS): BOOL =
    0

public actual fun MoveFileFromAppW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR): BOOL =
    0

public actual fun MoveFileTransactedA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS, htransaction: HANDLE): BOOL =
    0

public actual fun MoveFileTransactedW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS, htransaction: HANDLE): BOOL =
    0

public actual fun MoveFileW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR): BOOL =
    0

public actual fun MoveFileWithProgressA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS): BOOL =
    0

public actual fun MoveFileWithProgressW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS): BOOL =
    0

public actual fun NetConnectionEnum(servername: PCWSTR, qualifier: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    0u

public actual fun NetFileClose(servername: PCWSTR, fileid: UInt): UInt =
    0u

public actual fun NetFileEnum(servername: PCWSTR, basepath: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    0u

public actual fun NetFileGetInfo(servername: PCWSTR, fileid: UInt, level: UInt, bufptr: Long): UInt =
    0u

public actual fun NetServerAliasAdd(servername: PCWSTR, level: UInt, buf: Long): UInt =
    0u

public actual fun NetServerAliasDel(servername: PCWSTR, level: UInt, buf: Long): UInt =
    0u

public actual fun NetServerAliasEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt =
    0u

public actual fun NetSessionDel(servername: PCWSTR, uncclientname: PCWSTR, username: PCWSTR): UInt =
    0u

public actual fun NetSessionEnum(servername: PCWSTR, uncclientname: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    0u

public actual fun NetSessionGetInfo(servername: PCWSTR, uncclientname: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long): UInt =
    0u

public actual fun NetShareAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    0u

public actual fun NetShareCheck(servername: PCWSTR, device: PCWSTR, type: Long): UInt =
    0u

public actual fun NetShareDel(servername: PCWSTR, netname: PCWSTR, reserved: UInt): UInt =
    0u

public actual fun NetShareDelEx(servername: PCWSTR, level: UInt, buf: Long): UInt =
    0u

public actual fun NetShareDelSticky(servername: PCWSTR, netname: PCWSTR, reserved: UInt): UInt =
    0u

public actual fun NetShareEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    0u

public actual fun NetShareEnumSticky(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt =
    0u

public actual fun NetShareGetInfo(servername: PCWSTR, netname: PCWSTR, level: UInt, bufptr: Long): UInt =
    0u

public actual fun NetShareSetInfo(servername: PCWSTR, netname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt =
    0u

public actual fun NetStatisticsGet(servername: Long, service: Long, level: UInt, options: UInt, buffer: Long): UInt =
    0u

public actual fun OpenEncryptedFileRawA(lpfilename: PCSTR, ulflags: UInt, pvcontext: Long): UInt =
    0u

public actual fun OpenEncryptedFileRawW(lpfilename: PCWSTR, ulflags: UInt, pvcontext: Long): UInt =
    0u

public actual fun OpenEnlistment(dwdesiredaccess: UInt, resourcemanagerhandle: HANDLE, enlistmentid: Long): HANDLE =
    0L

public actual fun OpenFile(lpfilename: PCSTR, lpreopenbuff: Long, ustyle: UInt): Int =
    0

public actual fun OpenFileById(hvolumehint: HANDLE, lpfileid: Long, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES): HANDLE =
    0L

public actual fun OpenResourceManager(dwdesiredaccess: UInt, tmhandle: HANDLE, resourcemanagerid: Long): HANDLE =
    0L

public actual fun OpenTransaction(dwdesiredaccess: UInt, transactionid: Long): HANDLE =
    0L

public actual fun OpenTransactionManager(logfilename: PCWSTR, desiredaccess: UInt, openoptions: UInt): HANDLE =
    0L

public actual fun OpenTransactionManagerById(transactionmanagerid: Long, desiredaccess: UInt, openoptions: UInt): HANDLE =
    0L

public actual fun PopIoRingCompletion(ioring: HIORING, cqe: Long): HRESULT =
    0

public actual fun PrePrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    0

public actual fun PrePrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    0

public actual fun PrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    0

public actual fun PrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    0

public actual fun PrepareLogArchive(hlog: HANDLE, pszbaselogfilename: PWSTR, clen: UInt, plsnlow: Long, plsnhigh: Long, pcactuallength: Long, poffbaselogfiledata: Long, pcbbaselogfilelength: Long, plsnbase: Long, plsnlast: Long, plsncurrentarchivetail: Long, ppvarchivecontext: Long): BOOL =
    0

public actual fun PrepareTape(hdevice: HANDLE, dwoperation: PREPARE_TAPE_OPERATION, bimmediate: BOOL): UInt =
    0u

public actual fun QueryDosDeviceA(lpdevicename: PCSTR, lptargetpath: PSTR, ucchmax: UInt): UInt =
    0u

public actual fun QueryDosDeviceW(lpdevicename: PCWSTR, lptargetpath: PWSTR, ucchmax: UInt): UInt =
    0u

public actual fun QueryIoRingCapabilities(capabilities: Long): HRESULT =
    0

public actual fun QueryLogPolicy(hlog: HANDLE, epolicytype: CLFS_MGMT_POLICY_TYPE, ppolicybuffer: Long, pcbpolicybuffer: Long): BOOL =
    0

public actual fun QueryRecoveryAgentsOnEncryptedFile(lpfilename: PCWSTR, precoveryagents: Long): UInt =
    0u

public actual fun QueryUsersOnEncryptedFile(lpfilename: PCWSTR, pusers: Long): UInt =
    0u

public actual fun ReOpenFile(horiginalfile: HANDLE, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES): HANDLE =
    0L

public actual fun ReadDirectoryChangesExW(hdirectory: HANDLE, lpbuffer: Long, nbufferlength: UInt, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE, lpbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE, readdirectorynotifyinformationclass: READ_DIRECTORY_NOTIFY_INFORMATION_CLASS): BOOL =
    0

public actual fun ReadDirectoryChangesW(hdirectory: HANDLE, lpbuffer: Long, nbufferlength: UInt, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE, lpbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE): BOOL =
    0

public actual fun ReadEncryptedFileRaw(pfexportcallback: PFE_EXPORT_FUNC, pvcallbackcontext: Long, pvcontext: Long): UInt =
    0u

public actual fun ReadFile(hfile: HANDLE, lpbuffer: Long, nnumberofbytestoread: UInt, lpnumberofbytesread: Long, lpoverlapped: Long): BOOL =
    0

public actual fun ReadFileEx(hfile: HANDLE, lpbuffer: Long, nnumberofbytestoread: UInt, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE): BOOL =
    0

public actual fun ReadFileScatter(hfile: HANDLE, asegmentarray: Long, nnumberofbytestoread: UInt, lpreserved: Long, lpoverlapped: Long): BOOL =
    0

public actual fun ReadLogArchiveMetadata(pvarchivecontext: Long, cboffset: UInt, cbbytestoread: UInt, pbreadbuffer: Long, pcbbytesread: Long): BOOL =
    0

public actual fun ReadLogNotification(hlog: HANDLE, pnotification: Long, lpoverlapped: Long): BOOL =
    0

public actual fun ReadLogRecord(pvmarshal: Long, plsnfirst: Long, econtextmode: CLFS_CONTEXT_MODE, ppvreadbuffer: Long, pcbreadbuffer: Long, perecordtype: Long, plsnundonext: Long, plsnprevious: Long, ppvreadcontext: Long, poverlapped: Long): BOOL =
    0

public actual fun ReadLogRestartArea(pvmarshal: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsn: Long, ppvcontext: Long, poverlapped: Long): BOOL =
    0

public actual fun ReadNextLogRecord(pvreadcontext: Long, ppvbuffer: Long, pcbbuffer: Long, perecordtype: Long, plsnuser: Long, plsnundonext: Long, plsnprevious: Long, plsnrecord: Long, poverlapped: Long): BOOL =
    0

public actual fun ReadOnlyEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    0

public actual fun ReadPreviousLogRestartArea(pvreadcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsnrestart: Long, poverlapped: Long): BOOL =
    0

public actual fun RecoverEnlistment(enlistmenthandle: HANDLE, enlistmentkey: Long): BOOL =
    0

public actual fun RecoverResourceManager(resourcemanagerhandle: HANDLE): BOOL =
    0

public actual fun RecoverTransactionManager(transactionmanagerhandle: HANDLE): BOOL =
    0

public actual fun RegisterForLogWriteNotification(hlog: HANDLE, cbthreshold: UInt, fenable: BOOL): BOOL =
    0

public actual fun RegisterManageableLogClient(hlog: HANDLE, pcallbacks: Long): BOOL =
    0

public actual fun RemoveDirectoryA(lppathname: PCSTR): BOOL =
    0

public actual fun RemoveDirectoryFromAppW(lppathname: PCWSTR): BOOL =
    0

public actual fun RemoveDirectoryTransactedA(lppathname: PCSTR, htransaction: HANDLE): BOOL =
    0

public actual fun RemoveDirectoryTransactedW(lppathname: PCWSTR, htransaction: HANDLE): BOOL =
    0

public actual fun RemoveDirectoryW(lppathname: PCWSTR): BOOL =
    0

public actual fun RemoveLogContainer(hlog: HANDLE, pwszcontainerpath: PCWSTR, fforce: BOOL, preserved: Long): BOOL =
    0

public actual fun RemoveLogContainerSet(hlog: HANDLE, ccontainer: UShort, rgwszcontainerpath: Long, fforce: BOOL, preserved: Long): BOOL =
    0

public actual fun RemoveLogPolicy(hlog: HANDLE, epolicytype: CLFS_MGMT_POLICY_TYPE): BOOL =
    0

public actual fun RemoveUsersFromEncryptedFile(lpfilename: PCWSTR, phashes: Long): UInt =
    0u

public actual fun RenameTransactionManager(logfilename: PCWSTR, existingtransactionmanagerguid: Long): BOOL =
    0

public actual fun ReplaceFileA(lpreplacedfilename: PCSTR, lpreplacementfilename: PCSTR, lpbackupfilename: PCSTR, dwreplaceflags: REPLACE_FILE_FLAGS, lpexclude: Long, lpreserved: Long): BOOL =
    0

public actual fun ReplaceFileFromAppW(lpreplacedfilename: PCWSTR, lpreplacementfilename: PCWSTR, lpbackupfilename: PCWSTR, dwreplaceflags: UInt, lpexclude: Long, lpreserved: Long): BOOL =
    0

public actual fun ReplaceFileW(lpreplacedfilename: PCWSTR, lpreplacementfilename: PCWSTR, lpbackupfilename: PCWSTR, dwreplaceflags: REPLACE_FILE_FLAGS, lpexclude: Long, lpreserved: Long): BOOL =
    0

public actual fun ReserveAndAppendLog(pvmarshal: Long, rgwriteentries: Long, cwriteentries: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: CLFS_FLAG, plsn: Long, poverlapped: Long): BOOL =
    0

public actual fun ReserveAndAppendLogAligned(pvmarshal: Long, rgwriteentries: Long, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: CLFS_FLAG, plsn: Long, poverlapped: Long): BOOL =
    0

public actual fun RollbackComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    0

public actual fun RollbackEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    0

public actual fun RollbackTransaction(transactionhandle: HANDLE): BOOL =
    0

public actual fun RollbackTransactionAsync(transactionhandle: HANDLE): BOOL =
    0

public actual fun RollforwardTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): BOOL =
    0

public actual fun ScanLogContainers(pcxscan: Long, escanmode: UByte, preserved: Long): BOOL =
    0

public actual fun SearchPathA(lppath: PCSTR, lpfilename: PCSTR, lpextension: PCSTR, nbufferlength: UInt, lpbuffer: PSTR, lpfilepart: Long): UInt =
    0u

public actual fun SearchPathW(lppath: PCWSTR, lpfilename: PCWSTR, lpextension: PCWSTR, nbufferlength: UInt, lpbuffer: PWSTR, lpfilepart: Long): UInt =
    0u

public actual fun SetEncryptedFileMetadata(lpfilename: PCWSTR, pboldmetadata: Long, pbnewmetadata: Long, pownerhash: Long, dwoperation: UInt, pcertificatesadded: Long): UInt =
    0u

public actual fun SetEndOfFile(hfile: HANDLE): BOOL =
    0

public actual fun SetEndOfLog(hlog: HANDLE, plsnend: Long, lpoverlapped: Long): BOOL =
    0

public actual fun SetEnlistmentRecoveryInformation(enlistmenthandle: HANDLE, buffersize: UInt, buffer: Long): BOOL =
    0

public actual fun SetFileApisToANSI() {
}

public actual fun SetFileApisToOEM() {
}

public actual fun SetFileAttributesA(lpfilename: PCSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES): BOOL =
    0

public actual fun SetFileAttributesFromAppW(lpfilename: PCWSTR, dwfileattributes: UInt): BOOL =
    0

public actual fun SetFileAttributesTransactedA(lpfilename: PCSTR, dwfileattributes: UInt, htransaction: HANDLE): BOOL =
    0

public actual fun SetFileAttributesTransactedW(lpfilename: PCWSTR, dwfileattributes: UInt, htransaction: HANDLE): BOOL =
    0

public actual fun SetFileAttributesW(lpfilename: PCWSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES): BOOL =
    0

public actual fun SetFileBandwidthReservation(hfile: HANDLE, nperiodmilliseconds: UInt, nbytesperperiod: UInt, bdiscardable: BOOL, lptransfersize: Long, lpnumoutstandingrequests: Long): BOOL =
    0

public actual fun SetFileCompletionNotificationModes(filehandle: HANDLE, flags: UByte): BOOL =
    0

public actual fun SetFileInformationByHandle(hfile: HANDLE, fileinformationclass: FILE_INFO_BY_HANDLE_CLASS, lpfileinformation: Long, dwbuffersize: UInt): BOOL =
    0

public actual fun SetFileIoOverlappedRange(filehandle: HANDLE, overlappedrangestart: Long, length: UInt): BOOL =
    0

public actual fun SetFilePointer(hfile: HANDLE, ldistancetomove: Int, lpdistancetomovehigh: Long, dwmovemethod: SET_FILE_POINTER_MOVE_METHOD): UInt =
    0u

public actual fun SetFilePointerEx(hfile: HANDLE, lidistancetomove: Long, lpnewfilepointer: Long, dwmovemethod: SET_FILE_POINTER_MOVE_METHOD): BOOL =
    0

public actual fun SetFileShortNameA(hfile: HANDLE, lpshortname: PCSTR): BOOL =
    0

public actual fun SetFileShortNameW(hfile: HANDLE, lpshortname: PCWSTR): BOOL =
    0

public actual fun SetFileTime(hfile: HANDLE, lpcreationtime: Long, lplastaccesstime: Long, lplastwritetime: Long): BOOL =
    0

public actual fun SetFileValidData(hfile: HANDLE, validdatalength: Long): BOOL =
    0

public actual fun SetIoRingCompletionEvent(ioring: HIORING, hevent: HANDLE): HRESULT =
    0

public actual fun SetLogArchiveMode(hlog: HANDLE, emode: CLFS_LOG_ARCHIVE_MODE): BOOL =
    0

public actual fun SetLogArchiveTail(hlog: HANDLE, plsnarchivetail: Long, preserved: Long): BOOL =
    0

public actual fun SetLogFileSizeWithPolicy(hlog: HANDLE, pdesiredsize: Long, presultingsize: Long): BOOL =
    0

public actual fun SetResourceManagerCompletionPort(resourcemanagerhandle: HANDLE, iocompletionporthandle: HANDLE, completionkey: ULong): BOOL =
    0

public actual fun SetSearchPathMode(flags: UInt): BOOL =
    0

public actual fun SetTapeParameters(hdevice: HANDLE, dwoperation: TAPE_INFORMATION_TYPE, lptapeinformation: Long): UInt =
    0u

public actual fun SetTapePosition(hdevice: HANDLE, dwpositionmethod: TAPE_POSITION_METHOD, dwpartition: UInt, dwoffsetlow: UInt, dwoffsethigh: UInt, bimmediate: BOOL): UInt =
    0u

public actual fun SetTransactionInformation(transactionhandle: HANDLE, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: PCWSTR): BOOL =
    0

public actual fun SetUserFileEncryptionKey(pencryptioncertificate: Long): UInt =
    0u

public actual fun SetUserFileEncryptionKeyEx(pencryptioncertificate: Long, dwcapabilities: UInt, dwflags: UInt, pvreserved: Long): UInt =
    0u

public actual fun SetVolumeLabelA(lprootpathname: PCSTR, lpvolumename: PCSTR): BOOL =
    0

public actual fun SetVolumeLabelW(lprootpathname: PCWSTR, lpvolumename: PCWSTR): BOOL =
    0

public actual fun SetVolumeMountPointA(lpszvolumemountpoint: PCSTR, lpszvolumename: PCSTR): BOOL =
    0

public actual fun SetVolumeMountPointW(lpszvolumemountpoint: PCWSTR, lpszvolumename: PCWSTR): BOOL =
    0

public actual fun SinglePhaseReject(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL =
    0

public actual fun SubmitIoRing(ioring: HIORING, waitoperations: UInt, milliseconds: UInt, submittedentries: Long): HRESULT =
    0

public actual fun TerminateLogArchive(pvarchivecontext: Long): BOOL =
    0

public actual fun TerminateReadLog(pvcursorcontext: Long): BOOL =
    0

public actual fun TruncateLog(pvmarshal: Long, plsnend: Long, lpoverlapped: Long): BOOL =
    0

public actual fun TxfGetThreadMiniVersionForCreate(miniversion: Long) {
}

public actual fun TxfLogCreateFileReadContext(logpath: PCWSTR, beginninglsn: CLS_LSN, endinglsn: CLS_LSN, txffileid: Long, txflogcontext: Long): BOOL =
    0

public actual fun TxfLogCreateRangeReadContext(logpath: PCWSTR, beginninglsn: CLS_LSN, endinglsn: CLS_LSN, beginningvirtualclock: Long, endingvirtualclock: Long, recordtypemask: UInt, txflogcontext: Long): BOOL =
    0

public actual fun TxfLogDestroyReadContext(txflogcontext: Long): BOOL =
    0

public actual fun TxfLogReadRecords(txflogcontext: Long, bufferlength: UInt, buffer: Long, bytesused: Long, recordcount: Long): BOOL =
    0

public actual fun TxfLogRecordGetFileName(recordbuffer: Long, recordbufferlengthinbytes: UInt, namebuffer: PWSTR, namebufferlengthinbytes: Long, txfid: Long): BOOL =
    0

public actual fun TxfLogRecordGetGenericType(recordbuffer: Long, recordbufferlengthinbytes: UInt, generictype: Long, virtualclock: Long): BOOL =
    0

public actual fun TxfReadMetadataInfo(filehandle: HANDLE, txffileid: Long, lastlsn: Long, transactionstate: Long, lockingtransaction: Long): BOOL =
    0

public actual fun TxfSetThreadMiniVersionForCreate(miniversion: UShort) {
}

public actual fun UnlockFile(hfile: HANDLE, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt): BOOL =
    0

public actual fun UnlockFileEx(hfile: HANDLE, dwreserved: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt, lpoverlapped: Long): BOOL =
    0

public actual fun ValidateLog(pszlogfilename: PCWSTR, psalogfile: Long, pinfobuffer: Long, pcbbuffer: Long): BOOL =
    0

public actual fun VerFindFileA(uflags: VER_FIND_FILE_FLAGS, szfilename: PCSTR, szwindir: PCSTR, szappdir: PCSTR, szcurdir: PSTR, pucurdirlen: Long, szdestdir: PSTR, pudestdirlen: Long): VER_FIND_FILE_STATUS =
    0u

public actual fun VerFindFileW(uflags: VER_FIND_FILE_FLAGS, szfilename: PCWSTR, szwindir: PCWSTR, szappdir: PCWSTR, szcurdir: PWSTR, pucurdirlen: Long, szdestdir: PWSTR, pudestdirlen: Long): VER_FIND_FILE_STATUS =
    0u

public actual fun VerInstallFileA(uflags: VER_INSTALL_FILE_FLAGS, szsrcfilename: PCSTR, szdestfilename: PCSTR, szsrcdir: PCSTR, szdestdir: PCSTR, szcurdir: PCSTR, sztmpfile: PSTR, putmpfilelen: Long): VER_INSTALL_FILE_STATUS =
    0u

public actual fun VerInstallFileW(uflags: VER_INSTALL_FILE_FLAGS, szsrcfilename: PCWSTR, szdestfilename: PCWSTR, szsrcdir: PCWSTR, szdestdir: PCWSTR, szcurdir: PCWSTR, sztmpfile: PWSTR, putmpfilelen: Long): VER_INSTALL_FILE_STATUS =
    0u

public actual fun VerLanguageNameA(wlang: UInt, szlang: PSTR, cchlang: UInt): UInt =
    0u

public actual fun VerLanguageNameW(wlang: UInt, szlang: PWSTR, cchlang: UInt): UInt =
    0u

public actual fun VerQueryValueA(pblock: Long, lpsubblock: PCSTR, lplpbuffer: Long, pulen: Long): BOOL =
    0

public actual fun VerQueryValueW(pblock: Long, lpsubblock: PCWSTR, lplpbuffer: Long, pulen: Long): BOOL =
    0

public actual fun WofEnumEntries(volumename: PCWSTR, provider: UInt, enumproc: WofEnumEntryProc, userdata: Long): HRESULT =
    0

public actual fun WofFileEnumFiles(volumename: PCWSTR, algorithm: UInt, enumproc: WofEnumFilesProc, userdata: Long): HRESULT =
    0

public actual fun WofGetDriverVersion(fileorvolumehandle: HANDLE, provider: UInt, wofversion: Long): HRESULT =
    0

public actual fun WofIsExternalFile(filepath: PCWSTR, isexternalfile: Long, provider: Long, externalfileinfo: Long, bufferlength: Long): HRESULT =
    0

public actual fun WofSetFileDataLocation(filehandle: HANDLE, provider: UInt, externalfileinfo: Long, length: UInt): HRESULT =
    0

public actual fun WofShouldCompressBinaries(volume: PCWSTR, algorithm: Long): BOOL =
    0

public actual fun WofWimAddEntry(volumename: PCWSTR, wimpath: PCWSTR, wimtype: UInt, wimindex: UInt, datasourceid: Long): HRESULT =
    0

public actual fun WofWimEnumFiles(volumename: PCWSTR, datasourceid: Long, enumproc: WofEnumFilesProc, userdata: Long): HRESULT =
    0

public actual fun WofWimRemoveEntry(volumename: PCWSTR, datasourceid: Long): HRESULT =
    0

public actual fun WofWimSuspendEntry(volumename: PCWSTR, datasourceid: Long): HRESULT =
    0

public actual fun WofWimUpdateEntry(volumename: PCWSTR, datasourceid: Long, newwimpath: PCWSTR): HRESULT =
    0

public actual fun Wow64DisableWow64FsRedirection(oldvalue: Long): BOOL =
    0

public actual fun Wow64EnableWow64FsRedirection(wow64fsenableredirection: Boolean): Boolean =
    false

public actual fun Wow64RevertWow64FsRedirection(olvalue: Long): BOOL =
    0

public actual fun WriteEncryptedFileRaw(pfimportcallback: PFE_IMPORT_FUNC, pvcallbackcontext: Long, pvcontext: Long): UInt =
    0u

public actual fun WriteFile(hfile: HANDLE, lpbuffer: Long, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: Long, lpoverlapped: Long): BOOL =
    0

public actual fun WriteFileEx(hfile: HANDLE, lpbuffer: Long, nnumberofbytestowrite: UInt, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE): BOOL =
    0

public actual fun WriteFileGather(hfile: HANDLE, asegmentarray: Long, nnumberofbytestowrite: UInt, lpreserved: Long, lpoverlapped: Long): BOOL =
    0

public actual fun WriteLogRestartArea(pvmarshal: Long, pvrestartbuffer: Long, cbrestartbuffer: UInt, plsnbase: Long, fflags: CLFS_FLAG, pcbwritten: Long, plsnnext: Long, poverlapped: Long): BOOL =
    0

public actual fun WriteTapemark(hdevice: HANDLE, dwtapemarktype: TAPEMARK_TYPE, dwtapemarkcount: UInt, bimmediate: BOOL): UInt =
    0u
