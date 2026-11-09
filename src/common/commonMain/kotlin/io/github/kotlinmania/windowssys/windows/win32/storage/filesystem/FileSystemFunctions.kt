package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.io.LPOVERLAPPED_COMPLETION_ROUTINE

public expect fun AddLogContainer(hlog: HANDLE, pcbcontainer: Long, pwszcontainerpath: PCWSTR, preserved: Long): BOOL

public expect fun AddLogContainerSet(hlog: HANDLE, ccontainer: UShort, pcbcontainer: Long, rgwszcontainerpath: Long, preserved: Long): BOOL

public expect fun AddUsersToEncryptedFile(lpfilename: PCWSTR, pencryptioncertificates: Long): UInt

public expect fun AdvanceLogBase(pvmarshal: Long, plsnbase: Long, fflags: UInt, poverlapped: Long): BOOL

public expect fun AlignReservedLog(pvmarshal: Long, creservedrecords: UInt, rgcbreservation: Long, pcbalignreservation: Long): BOOL

public expect fun AllocReservedLog(pvmarshal: Long, creservedrecords: UInt, pcbadjustment: Long): BOOL

public expect fun AreFileApisANSI(): BOOL

public expect fun AreShortNamesEnabled(handle: HANDLE, enabled: Long): BOOL

public expect fun BackupRead(hfile: HANDLE, lpbuffer: Long, nnumberofbytestoread: UInt, lpnumberofbytesread: Long, babort: BOOL, bprocesssecurity: BOOL, lpcontext: Long): BOOL

public expect fun BackupSeek(hfile: HANDLE, dwlowbytestoseek: UInt, dwhighbytestoseek: UInt, lpdwlowbyteseeked: Long, lpdwhighbyteseeked: Long, lpcontext: Long): BOOL

public expect fun BackupWrite(hfile: HANDLE, lpbuffer: Long, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: Long, babort: BOOL, bprocesssecurity: BOOL, lpcontext: Long): BOOL

public expect fun BuildIoRingCancelRequest(ioring: HIORING, file: IORING_HANDLE_REF, optocancel: ULong, userdata: ULong): HRESULT

public expect fun BuildIoRingFlushFile(ioring: HIORING, fileref: IORING_HANDLE_REF, flushmode: FILE_FLUSH_MODE, userdata: ULong, sqeflags: IORING_SQE_FLAGS): HRESULT

public expect fun BuildIoRingReadFile(ioring: HIORING, fileref: IORING_HANDLE_REF, dataref: IORING_BUFFER_REF, numberofbytestoread: UInt, fileoffset: ULong, userdata: ULong, sqeflags: IORING_SQE_FLAGS): HRESULT

public expect fun BuildIoRingRegisterBuffers(ioring: HIORING, count: UInt, buffers: Long, userdata: ULong): HRESULT

public expect fun BuildIoRingRegisterFileHandles(ioring: HIORING, count: UInt, handles: Long, userdata: ULong): HRESULT

public expect fun BuildIoRingWriteFile(ioring: HIORING, fileref: IORING_HANDLE_REF, bufferref: IORING_BUFFER_REF, numberofbytestowrite: UInt, fileoffset: ULong, writeflags: FILE_WRITE_FLAGS, userdata: ULong, sqeflags: IORING_SQE_FLAGS): HRESULT

public expect fun CheckNameLegalDOS8Dot3A(lpname: PCSTR, lpoemname: PSTR, oemnamesize: UInt, pbnamecontainsspaces: Long, pbnamelegal: Long): BOOL

public expect fun CheckNameLegalDOS8Dot3W(lpname: PCWSTR, lpoemname: PSTR, oemnamesize: UInt, pbnamecontainsspaces: Long, pbnamelegal: Long): BOOL

public expect fun CloseAndResetLogFile(hlog: HANDLE): BOOL

public expect fun CloseEncryptedFileRaw(pvcontext: Long)

public expect fun CloseIoRing(ioring: HIORING): HRESULT

public expect fun CommitComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL

public expect fun CommitEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL

public expect fun CommitTransaction(transactionhandle: HANDLE): BOOL

public expect fun CommitTransactionAsync(transactionhandle: HANDLE): BOOL

public expect fun CompareFileTime(lpfiletime1: Long, lpfiletime2: Long): Int

public expect fun CopyFile2(pwszexistingfilename: PCWSTR, pwsznewfilename: PCWSTR, pextendedparameters: Long): HRESULT

public expect fun CopyFileA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, bfailifexists: BOOL): BOOL

public expect fun CopyFileExA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: COPYFILE_FLAGS): BOOL

public expect fun CopyFileExW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: COPYFILE_FLAGS): BOOL

public expect fun CopyFileFromAppW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, bfailifexists: BOOL): BOOL

public expect fun CopyFileTransactedA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: UInt, htransaction: HANDLE): BOOL

public expect fun CopyFileTransactedW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, pbcancel: Long, dwcopyflags: UInt, htransaction: HANDLE): BOOL

public expect fun CopyFileW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, bfailifexists: BOOL): BOOL

public expect fun CopyLZFile(hfsource: Int, hfdest: Int): Int

public expect fun CreateDirectoryA(lppathname: PCSTR, lpsecurityattributes: Long): BOOL

public expect fun CreateDirectoryExA(lptemplatedirectory: PCSTR, lpnewdirectory: PCSTR, lpsecurityattributes: Long): BOOL

public expect fun CreateDirectoryExW(lptemplatedirectory: PCWSTR, lpnewdirectory: PCWSTR, lpsecurityattributes: Long): BOOL

public expect fun CreateDirectoryFromAppW(lppathname: PCWSTR, lpsecurityattributes: Long): BOOL

public expect fun CreateDirectoryTransactedA(lptemplatedirectory: PCSTR, lpnewdirectory: PCSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL

public expect fun CreateDirectoryTransactedW(lptemplatedirectory: PCWSTR, lpnewdirectory: PCWSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL

public expect fun CreateDirectoryW(lppathname: PCWSTR, lpsecurityattributes: Long): BOOL

public expect fun CreateEnlistment(lpenlistmentattributes: Long, resourcemanagerhandle: HANDLE, transactionhandle: HANDLE, notificationmask: UInt, createoptions: UInt, enlistmentkey: Long): HANDLE

public expect fun CreateFile2(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, dwcreationdisposition: FILE_CREATION_DISPOSITION, pcreateexparams: Long): HANDLE

public expect fun CreateFile2FromAppW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationdisposition: UInt, pcreateexparams: Long): HANDLE

public expect fun CreateFileA(lpfilename: PCSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE): HANDLE

public expect fun CreateFileFromAppW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: Long, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: HANDLE): HANDLE

public expect fun CreateFileTransactedA(lpfilename: PCSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE, htransaction: HANDLE, pusminiversion: Long, lpextendedparameter: Long): HANDLE

public expect fun CreateFileTransactedW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE, htransaction: HANDLE, pusminiversion: Long, lpextendedparameter: Long): HANDLE

public expect fun CreateFileW(lpfilename: PCWSTR, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwcreationdisposition: FILE_CREATION_DISPOSITION, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES, htemplatefile: HANDLE): HANDLE

public expect fun CreateHardLinkA(lpfilename: PCSTR, lpexistingfilename: PCSTR, lpsecurityattributes: Long): BOOL

public expect fun CreateHardLinkTransactedA(lpfilename: PCSTR, lpexistingfilename: PCSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL

public expect fun CreateHardLinkTransactedW(lpfilename: PCWSTR, lpexistingfilename: PCWSTR, lpsecurityattributes: Long, htransaction: HANDLE): BOOL

public expect fun CreateHardLinkW(lpfilename: PCWSTR, lpexistingfilename: PCWSTR, lpsecurityattributes: Long): BOOL

public expect fun CreateIoRing(ioringversion: IORING_VERSION, flags: IORING_CREATE_FLAGS, submissionqueuesize: UInt, completionqueuesize: UInt, h: Long): HRESULT

public expect fun CreateLogContainerScanContext(hlog: HANDLE, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: Long, poverlapped: Long): BOOL

public expect fun CreateLogFile(pszlogfilename: PCWSTR, fdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, psalogfile: Long, fcreatedisposition: FILE_CREATION_DISPOSITION, fflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES): HANDLE

public expect fun CreateLogMarshallingArea(hlog: HANDLE, pfnallocbuffer: CLFS_BLOCK_ALLOCATION, pfnfreebuffer: CLFS_BLOCK_DEALLOCATION, pvblockalloccontext: Long, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshal: Long): BOOL

public expect fun CreateResourceManager(lpresourcemanagerattributes: Long, resourcemanagerid: Long, createoptions: UInt, tmhandle: HANDLE, description: PCWSTR): HANDLE

public expect fun CreateSymbolicLinkA(lpsymlinkfilename: PCSTR, lptargetfilename: PCSTR, dwflags: SYMBOLIC_LINK_FLAGS): Boolean

public expect fun CreateSymbolicLinkTransactedA(lpsymlinkfilename: PCSTR, lptargetfilename: PCSTR, dwflags: SYMBOLIC_LINK_FLAGS, htransaction: HANDLE): Boolean

public expect fun CreateSymbolicLinkTransactedW(lpsymlinkfilename: PCWSTR, lptargetfilename: PCWSTR, dwflags: SYMBOLIC_LINK_FLAGS, htransaction: HANDLE): Boolean

public expect fun CreateSymbolicLinkW(lpsymlinkfilename: PCWSTR, lptargetfilename: PCWSTR, dwflags: SYMBOLIC_LINK_FLAGS): Boolean

public expect fun CreateTapePartition(hdevice: HANDLE, dwpartitionmethod: CREATE_TAPE_PARTITION_METHOD, dwcount: UInt, dwsize: UInt): UInt

public expect fun CreateTransaction(lptransactionattributes: Long, uow: Long, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: PCWSTR): HANDLE

public expect fun CreateTransactionManager(lptransactionattributes: Long, logfilename: PCWSTR, createoptions: UInt, commitstrength: UInt): HANDLE

public expect fun DecryptFileA(lpfilename: PCSTR, dwreserved: UInt): BOOL

public expect fun DecryptFileW(lpfilename: PCWSTR, dwreserved: UInt): BOOL

public expect fun DefineDosDeviceA(dwflags: DEFINE_DOS_DEVICE_FLAGS, lpdevicename: PCSTR, lptargetpath: PCSTR): BOOL

public expect fun DefineDosDeviceW(dwflags: DEFINE_DOS_DEVICE_FLAGS, lpdevicename: PCWSTR, lptargetpath: PCWSTR): BOOL

public expect fun DeleteFileA(lpfilename: PCSTR): BOOL

public expect fun DeleteFileFromAppW(lpfilename: PCWSTR): BOOL

public expect fun DeleteFileTransactedA(lpfilename: PCSTR, htransaction: HANDLE): BOOL

public expect fun DeleteFileTransactedW(lpfilename: PCWSTR, htransaction: HANDLE): BOOL

public expect fun DeleteFileW(lpfilename: PCWSTR): BOOL

public expect fun DeleteLogByHandle(hlog: HANDLE): BOOL

public expect fun DeleteLogFile(pszlogfilename: PCWSTR, pvreserved: Long): BOOL

public expect fun DeleteLogMarshallingArea(pvmarshal: Long): BOOL

public expect fun DeleteVolumeMountPointA(lpszvolumemountpoint: PCSTR): BOOL

public expect fun DeleteVolumeMountPointW(lpszvolumemountpoint: PCWSTR): BOOL

public expect fun DeregisterManageableLogClient(hlog: HANDLE): BOOL

public expect fun DuplicateEncryptionInfoFile(srcfilename: PCWSTR, dstfilename: PCWSTR, dwcreationdistribution: UInt, dwattributes: UInt, lpsecurityattributes: Long): UInt

public expect fun EncryptFileA(lpfilename: PCSTR): BOOL

public expect fun EncryptFileW(lpfilename: PCWSTR): BOOL

public expect fun EncryptionDisable(dirpath: PCWSTR, disable: BOOL): BOOL

public expect fun EraseTape(hdevice: HANDLE, dwerasetype: ERASE_TAPE_TYPE, bimmediate: BOOL): UInt

public expect fun FileEncryptionStatusA(lpfilename: PCSTR, lpstatus: Long): BOOL

public expect fun FileEncryptionStatusW(lpfilename: PCWSTR, lpstatus: Long): BOOL

public expect fun FileTimeToLocalFileTime(lpfiletime: Long, lplocalfiletime: Long): BOOL

public expect fun FindClose(hfindfile: HANDLE): BOOL

public expect fun FindCloseChangeNotification(hchangehandle: HANDLE): BOOL

public expect fun FindFirstChangeNotificationA(lppathname: PCSTR, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE): HANDLE

public expect fun FindFirstChangeNotificationW(lppathname: PCWSTR, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE): HANDLE

public expect fun FindFirstFileA(lpfilename: PCSTR, lpfindfiledata: Long): HANDLE

public expect fun FindFirstFileExA(lpfilename: PCSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: FIND_FIRST_EX_FLAGS): HANDLE

public expect fun FindFirstFileExFromAppW(lpfilename: PCWSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: UInt): HANDLE

public expect fun FindFirstFileExW(lpfilename: PCWSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: FIND_FIRST_EX_FLAGS): HANDLE

public expect fun FindFirstFileNameTransactedW(lpfilename: PCWSTR, dwflags: UInt, stringlength: Long, linkname: PWSTR, htransaction: HANDLE): HANDLE

public expect fun FindFirstFileNameW(lpfilename: PCWSTR, dwflags: UInt, stringlength: Long, linkname: PWSTR): HANDLE

public expect fun FindFirstFileTransactedA(lpfilename: PCSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: UInt, htransaction: HANDLE): HANDLE

public expect fun FindFirstFileTransactedW(lpfilename: PCWSTR, finfolevelid: FINDEX_INFO_LEVELS, lpfindfiledata: Long, fsearchop: FINDEX_SEARCH_OPS, lpsearchfilter: Long, dwadditionalflags: UInt, htransaction: HANDLE): HANDLE

public expect fun FindFirstFileW(lpfilename: PCWSTR, lpfindfiledata: Long): HANDLE

public expect fun FindFirstStreamTransactedW(lpfilename: PCWSTR, infolevel: STREAM_INFO_LEVELS, lpfindstreamdata: Long, dwflags: UInt, htransaction: HANDLE): HANDLE

public expect fun FindFirstStreamW(lpfilename: PCWSTR, infolevel: STREAM_INFO_LEVELS, lpfindstreamdata: Long, dwflags: UInt): HANDLE

public expect fun FindFirstVolumeA(lpszvolumename: PSTR, cchbufferlength: UInt): HANDLE

public expect fun FindFirstVolumeMountPointA(lpszrootpathname: PCSTR, lpszvolumemountpoint: PSTR, cchbufferlength: UInt): HANDLE

public expect fun FindFirstVolumeMountPointW(lpszrootpathname: PCWSTR, lpszvolumemountpoint: PWSTR, cchbufferlength: UInt): HANDLE

public expect fun FindFirstVolumeW(lpszvolumename: PWSTR, cchbufferlength: UInt): HANDLE

public expect fun FindNextChangeNotification(hchangehandle: HANDLE): BOOL

public expect fun FindNextFileA(hfindfile: HANDLE, lpfindfiledata: Long): BOOL

public expect fun FindNextFileNameW(hfindstream: HANDLE, stringlength: Long, linkname: PWSTR): BOOL

public expect fun FindNextFileW(hfindfile: HANDLE, lpfindfiledata: Long): BOOL

public expect fun FindNextStreamW(hfindstream: HANDLE, lpfindstreamdata: Long): BOOL

public expect fun FindNextVolumeA(hfindvolume: HANDLE, lpszvolumename: PSTR, cchbufferlength: UInt): BOOL

public expect fun FindNextVolumeMountPointA(hfindvolumemountpoint: HANDLE, lpszvolumemountpoint: PSTR, cchbufferlength: UInt): BOOL

public expect fun FindNextVolumeMountPointW(hfindvolumemountpoint: HANDLE, lpszvolumemountpoint: PWSTR, cchbufferlength: UInt): BOOL

public expect fun FindNextVolumeW(hfindvolume: HANDLE, lpszvolumename: PWSTR, cchbufferlength: UInt): BOOL

public expect fun FindVolumeClose(hfindvolume: HANDLE): BOOL

public expect fun FindVolumeMountPointClose(hfindvolumemountpoint: HANDLE): BOOL

public expect fun FlushFileBuffers(hfile: HANDLE): BOOL

public expect fun FlushLogBuffers(pvmarshal: Long, poverlapped: Long): BOOL

public expect fun FlushLogToLsn(pvmarshalcontext: Long, plsnflush: Long, plsnlastflushed: Long, poverlapped: Long): BOOL

public expect fun FreeEncryptedFileMetadata(pbmetadata: Long)

public expect fun FreeEncryptionCertificateHashList(pusers: Long)

public expect fun FreeReservedLog(pvmarshal: Long, creservedrecords: UInt, pcbadjustment: Long): BOOL

public expect fun GetBinaryTypeA(lpapplicationname: PCSTR, lpbinarytype: Long): BOOL

public expect fun GetBinaryTypeW(lpapplicationname: PCWSTR, lpbinarytype: Long): BOOL

public expect fun GetCompressedFileSizeA(lpfilename: PCSTR, lpfilesizehigh: Long): UInt

public expect fun GetCompressedFileSizeTransactedA(lpfilename: PCSTR, lpfilesizehigh: Long, htransaction: HANDLE): UInt

public expect fun GetCompressedFileSizeTransactedW(lpfilename: PCWSTR, lpfilesizehigh: Long, htransaction: HANDLE): UInt

public expect fun GetCompressedFileSizeW(lpfilename: PCWSTR, lpfilesizehigh: Long): UInt

public expect fun GetCurrentClockTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): BOOL

public expect fun GetDiskFreeSpaceA(lprootpathname: PCSTR, lpsectorspercluster: Long, lpbytespersector: Long, lpnumberoffreeclusters: Long, lptotalnumberofclusters: Long): BOOL

public expect fun GetDiskFreeSpaceExA(lpdirectoryname: PCSTR, lpfreebytesavailabletocaller: Long, lptotalnumberofbytes: Long, lptotalnumberoffreebytes: Long): BOOL

public expect fun GetDiskFreeSpaceExW(lpdirectoryname: PCWSTR, lpfreebytesavailabletocaller: Long, lptotalnumberofbytes: Long, lptotalnumberoffreebytes: Long): BOOL

public expect fun GetDiskFreeSpaceW(lprootpathname: PCWSTR, lpsectorspercluster: Long, lpbytespersector: Long, lpnumberoffreeclusters: Long, lptotalnumberofclusters: Long): BOOL

public expect fun GetDiskSpaceInformationA(rootpath: PCSTR, diskspaceinfo: Long): HRESULT

public expect fun GetDiskSpaceInformationW(rootpath: PCWSTR, diskspaceinfo: Long): HRESULT

public expect fun GetDriveTypeA(lprootpathname: PCSTR): UInt

public expect fun GetDriveTypeW(lprootpathname: PCWSTR): UInt

public expect fun GetEncryptedFileMetadata(lpfilename: PCWSTR, pcbmetadata: Long, ppbmetadata: Long): UInt

public expect fun GetEnlistmentId(enlistmenthandle: HANDLE, enlistmentid: Long): BOOL

public expect fun GetEnlistmentRecoveryInformation(enlistmenthandle: HANDLE, buffersize: UInt, buffer: Long, bufferused: Long): BOOL

public expect fun GetExpandedNameA(lpszsource: PCSTR, lpszbuffer: PSTR): Int

public expect fun GetExpandedNameW(lpszsource: PCWSTR, lpszbuffer: PWSTR): Int

public expect fun GetFileAttributesA(lpfilename: PCSTR): UInt

public expect fun GetFileAttributesExA(lpfilename: PCSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL

public expect fun GetFileAttributesExFromAppW(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL

public expect fun GetFileAttributesExW(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long): BOOL

public expect fun GetFileAttributesTransactedA(lpfilename: PCSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long, htransaction: HANDLE): BOOL

public expect fun GetFileAttributesTransactedW(lpfilename: PCWSTR, finfolevelid: GET_FILEEX_INFO_LEVELS, lpfileinformation: Long, htransaction: HANDLE): BOOL

public expect fun GetFileAttributesW(lpfilename: PCWSTR): UInt

public expect fun GetFileBandwidthReservation(hfile: HANDLE, lpperiodmilliseconds: Long, lpbytesperperiod: Long, pdiscardable: Long, lptransfersize: Long, lpnumoutstandingrequests: Long): BOOL

public expect fun GetFileInformationByHandle(hfile: HANDLE, lpfileinformation: Long): BOOL

public expect fun GetFileInformationByHandleEx(hfile: HANDLE, fileinformationclass: FILE_INFO_BY_HANDLE_CLASS, lpfileinformation: Long, dwbuffersize: UInt): BOOL

public expect fun GetFileSize(hfile: HANDLE, lpfilesizehigh: Long): UInt

public expect fun GetFileSizeEx(hfile: HANDLE, lpfilesize: Long): BOOL

public expect fun GetFileTime(hfile: HANDLE, lpcreationtime: Long, lplastaccesstime: Long, lplastwritetime: Long): BOOL

public expect fun GetFileType(hfile: HANDLE): FILE_TYPE

public expect fun GetFileVersionInfoA(lptstrfilename: PCSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL

public expect fun GetFileVersionInfoExA(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL

public expect fun GetFileVersionInfoExW(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCWSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL

public expect fun GetFileVersionInfoSizeA(lptstrfilename: PCSTR, lpdwhandle: Long): UInt

public expect fun GetFileVersionInfoSizeExA(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCSTR, lpdwhandle: Long): UInt

public expect fun GetFileVersionInfoSizeExW(dwflags: GET_FILE_VERSION_INFO_FLAGS, lpwstrfilename: PCWSTR, lpdwhandle: Long): UInt

public expect fun GetFileVersionInfoSizeW(lptstrfilename: PCWSTR, lpdwhandle: Long): UInt

public expect fun GetFileVersionInfoW(lptstrfilename: PCWSTR, dwhandle: UInt, dwlen: UInt, lpdata: Long): BOOL

public expect fun GetFinalPathNameByHandleA(hfile: HANDLE, lpszfilepath: PSTR, cchfilepath: UInt, dwflags: GETFINALPATHNAMEBYHANDLE_FLAGS): UInt

public expect fun GetFinalPathNameByHandleW(hfile: HANDLE, lpszfilepath: PWSTR, cchfilepath: UInt, dwflags: GETFINALPATHNAMEBYHANDLE_FLAGS): UInt

public expect fun GetFullPathNameA(lpfilename: PCSTR, nbufferlength: UInt, lpbuffer: PSTR, lpfilepart: Long): UInt

public expect fun GetFullPathNameTransactedA(lpfilename: PCSTR, nbufferlength: UInt, lpbuffer: PSTR, lpfilepart: Long, htransaction: HANDLE): UInt

public expect fun GetFullPathNameTransactedW(lpfilename: PCWSTR, nbufferlength: UInt, lpbuffer: PWSTR, lpfilepart: Long, htransaction: HANDLE): UInt

public expect fun GetFullPathNameW(lpfilename: PCWSTR, nbufferlength: UInt, lpbuffer: PWSTR, lpfilepart: Long): UInt

public expect fun GetIoRingInfo(ioring: HIORING, info: Long): HRESULT

public expect fun GetLogContainerName(hlog: HANDLE, cidlogicalcontainer: UInt, pwstrcontainername: PCWSTR, clencontainername: UInt, pcactuallencontainername: Long): BOOL

public expect fun GetLogFileInformation(hlog: HANDLE, pinfobuffer: Long, cbbuffer: Long): BOOL

public expect fun GetLogIoStatistics(hlog: HANDLE, pvstatsbuffer: Long, cbstatsbuffer: UInt, estatsclass: CLFS_IOSTATS_CLASS, pcbstatswritten: Long): BOOL

public expect fun GetLogReservationInfo(pvmarshal: Long, pcbrecordnumber: Long, pcbuserreservation: Long, pcbcommitreservation: Long): BOOL

public expect fun GetLogicalDriveStringsA(nbufferlength: UInt, lpbuffer: PSTR): UInt

public expect fun GetLogicalDriveStringsW(nbufferlength: UInt, lpbuffer: PWSTR): UInt

public expect fun GetLogicalDrives(): UInt

public expect fun GetLongPathNameA(lpszshortpath: PCSTR, lpszlongpath: PSTR, cchbuffer: UInt): UInt

public expect fun GetLongPathNameTransactedA(lpszshortpath: PCSTR, lpszlongpath: PSTR, cchbuffer: UInt, htransaction: HANDLE): UInt

public expect fun GetLongPathNameTransactedW(lpszshortpath: PCWSTR, lpszlongpath: PWSTR, cchbuffer: UInt, htransaction: HANDLE): UInt

public expect fun GetLongPathNameW(lpszshortpath: PCWSTR, lpszlongpath: PWSTR, cchbuffer: UInt): UInt

public expect fun GetNextLogArchiveExtent(pvarchivecontext: Long, rgadextent: Long, cdescriptors: UInt, pcdescriptorsreturned: Long): BOOL

public expect fun GetNotificationResourceManager(resourcemanagerhandle: HANDLE, transactionnotification: Long, notificationlength: UInt, dwmilliseconds: UInt, returnlength: Long): BOOL

public expect fun GetNotificationResourceManagerAsync(resourcemanagerhandle: HANDLE, transactionnotification: Long, transactionnotificationlength: UInt, returnlength: Long, lpoverlapped: Long): BOOL

public expect fun GetShortPathNameA(lpszlongpath: PCSTR, lpszshortpath: PSTR, cchbuffer: UInt): UInt

public expect fun GetShortPathNameW(lpszlongpath: PCWSTR, lpszshortpath: PWSTR, cchbuffer: UInt): UInt

public expect fun GetTapeParameters(hdevice: HANDLE, dwoperation: GET_TAPE_DRIVE_PARAMETERS_OPERATION, lpdwsize: Long, lptapeinformation: Long): UInt

public expect fun GetTapePosition(hdevice: HANDLE, dwpositiontype: TAPE_POSITION_TYPE, lpdwpartition: Long, lpdwoffsetlow: Long, lpdwoffsethigh: Long): UInt

public expect fun GetTapeStatus(hdevice: HANDLE): UInt

public expect fun GetTempFileNameA(lppathname: PCSTR, lpprefixstring: PCSTR, uunique: UInt, lptempfilename: PSTR): UInt

public expect fun GetTempFileNameW(lppathname: PCWSTR, lpprefixstring: PCWSTR, uunique: UInt, lptempfilename: PWSTR): UInt

public expect fun GetTempPath2A(bufferlength: UInt, buffer: PSTR): UInt

public expect fun GetTempPath2W(bufferlength: UInt, buffer: PWSTR): UInt

public expect fun GetTempPathA(nbufferlength: UInt, lpbuffer: PSTR): UInt

public expect fun GetTempPathW(nbufferlength: UInt, lpbuffer: PWSTR): UInt

public expect fun GetTransactionId(transactionhandle: HANDLE, transactionid: Long): BOOL

public expect fun GetTransactionInformation(transactionhandle: HANDLE, outcome: Long, isolationlevel: Long, isolationflags: Long, timeout: Long, bufferlength: UInt, description: PWSTR): BOOL

public expect fun GetTransactionManagerId(transactionmanagerhandle: HANDLE, transactionmanagerid: Long): BOOL

public expect fun GetVolumeInformationA(lprootpathname: PCSTR, lpvolumenamebuffer: PSTR, nvolumenamesize: UInt, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: PSTR, nfilesystemnamesize: UInt): BOOL

public expect fun GetVolumeInformationByHandleW(hfile: HANDLE, lpvolumenamebuffer: PWSTR, nvolumenamesize: UInt, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: PWSTR, nfilesystemnamesize: UInt): BOOL

public expect fun GetVolumeInformationW(lprootpathname: PCWSTR, lpvolumenamebuffer: PWSTR, nvolumenamesize: UInt, lpvolumeserialnumber: Long, lpmaximumcomponentlength: Long, lpfilesystemflags: Long, lpfilesystemnamebuffer: PWSTR, nfilesystemnamesize: UInt): BOOL

public expect fun GetVolumeNameForVolumeMountPointA(lpszvolumemountpoint: PCSTR, lpszvolumename: PSTR, cchbufferlength: UInt): BOOL

public expect fun GetVolumeNameForVolumeMountPointW(lpszvolumemountpoint: PCWSTR, lpszvolumename: PWSTR, cchbufferlength: UInt): BOOL

public expect fun GetVolumePathNameA(lpszfilename: PCSTR, lpszvolumepathname: PSTR, cchbufferlength: UInt): BOOL

public expect fun GetVolumePathNameW(lpszfilename: PCWSTR, lpszvolumepathname: PWSTR, cchbufferlength: UInt): BOOL

public expect fun GetVolumePathNamesForVolumeNameA(lpszvolumename: PCSTR, lpszvolumepathnames: PSTR, cchbufferlength: UInt, lpcchreturnlength: Long): BOOL

public expect fun GetVolumePathNamesForVolumeNameW(lpszvolumename: PCWSTR, lpszvolumepathnames: PWSTR, cchbufferlength: UInt, lpcchreturnlength: Long): BOOL

public expect fun HandleLogFull(hlog: HANDLE): BOOL

public expect fun InstallLogPolicy(hlog: HANDLE, ppolicy: Long): BOOL

public expect fun IsIoRingOpSupported(ioring: HIORING, op: IORING_OP_CODE): BOOL

public expect fun LZClose(hfile: Int)

public expect fun LZCopy(hfsource: Int, hfdest: Int): Int

public expect fun LZDone()

public expect fun LZInit(hfsource: Int): Int

public expect fun LZOpenFileA(lpfilename: PCSTR, lpreopenbuf: Long, wstyle: LZOPENFILE_STYLE): Int

public expect fun LZOpenFileW(lpfilename: PCWSTR, lpreopenbuf: Long, wstyle: LZOPENFILE_STYLE): Int

public expect fun LZRead(hfile: Int, lpbuffer: PSTR, cbread: Int): Int

public expect fun LZSeek(hfile: Int, loffset: Int, iorigin: Int): Int

public expect fun LZStart(): Int

public expect fun LocalFileTimeToFileTime(lplocalfiletime: Long, lpfiletime: Long): BOOL

public expect fun LockFile(hfile: HANDLE, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt): BOOL

public expect fun LockFileEx(hfile: HANDLE, dwflags: LOCK_FILE_FLAGS, dwreserved: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt, lpoverlapped: Long): BOOL

public expect fun LogTailAdvanceFailure(hlog: HANDLE, dwreason: UInt): BOOL

public expect fun LsnBlockOffset(plsn: Long): UInt

public expect fun LsnContainer(plsn: Long): UInt

public expect fun LsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): CLS_LSN

public expect fun LsnEqual(plsn1: Long, plsn2: Long): Boolean

public expect fun LsnGreater(plsn1: Long, plsn2: Long): Boolean

public expect fun LsnIncrement(plsn: Long): CLS_LSN

public expect fun LsnInvalid(plsn: Long): Boolean

public expect fun LsnLess(plsn1: Long, plsn2: Long): Boolean

public expect fun LsnNull(plsn: Long): Boolean

public expect fun LsnRecordSequence(plsn: Long): UInt

public expect fun MoveFileA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR): BOOL

public expect fun MoveFileExA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, dwflags: MOVE_FILE_FLAGS): BOOL

public expect fun MoveFileExW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, dwflags: MOVE_FILE_FLAGS): BOOL

public expect fun MoveFileFromAppW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR): BOOL

public expect fun MoveFileTransactedA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS, htransaction: HANDLE): BOOL

public expect fun MoveFileTransactedW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS, htransaction: HANDLE): BOOL

public expect fun MoveFileW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR): BOOL

public expect fun MoveFileWithProgressA(lpexistingfilename: PCSTR, lpnewfilename: PCSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS): BOOL

public expect fun MoveFileWithProgressW(lpexistingfilename: PCWSTR, lpnewfilename: PCWSTR, lpprogressroutine: LPPROGRESS_ROUTINE, lpdata: Long, dwflags: MOVE_FILE_FLAGS): BOOL

public expect fun NetConnectionEnum(servername: PCWSTR, qualifier: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt

public expect fun NetFileClose(servername: PCWSTR, fileid: UInt): UInt

public expect fun NetFileEnum(servername: PCWSTR, basepath: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt

public expect fun NetFileGetInfo(servername: PCWSTR, fileid: UInt, level: UInt, bufptr: Long): UInt

public expect fun NetServerAliasAdd(servername: PCWSTR, level: UInt, buf: Long): UInt

public expect fun NetServerAliasDel(servername: PCWSTR, level: UInt, buf: Long): UInt

public expect fun NetServerAliasEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resumehandle: Long): UInt

public expect fun NetSessionDel(servername: PCWSTR, uncclientname: PCWSTR, username: PCWSTR): UInt

public expect fun NetSessionEnum(servername: PCWSTR, uncclientname: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt

public expect fun NetSessionGetInfo(servername: PCWSTR, uncclientname: PCWSTR, username: PCWSTR, level: UInt, bufptr: Long): UInt

public expect fun NetShareAdd(servername: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt

public expect fun NetShareCheck(servername: PCWSTR, device: PCWSTR, type: Long): UInt

public expect fun NetShareDel(servername: PCWSTR, netname: PCWSTR, reserved: UInt): UInt

public expect fun NetShareDelEx(servername: PCWSTR, level: UInt, buf: Long): UInt

public expect fun NetShareDelSticky(servername: PCWSTR, netname: PCWSTR, reserved: UInt): UInt

public expect fun NetShareEnum(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt

public expect fun NetShareEnumSticky(servername: PCWSTR, level: UInt, bufptr: Long, prefmaxlen: UInt, entriesread: Long, totalentries: Long, resume_handle: Long): UInt

public expect fun NetShareGetInfo(servername: PCWSTR, netname: PCWSTR, level: UInt, bufptr: Long): UInt

public expect fun NetShareSetInfo(servername: PCWSTR, netname: PCWSTR, level: UInt, buf: Long, parm_err: Long): UInt

public expect fun NetStatisticsGet(servername: Long, service: Long, level: UInt, options: UInt, buffer: Long): UInt

public expect fun OpenEncryptedFileRawA(lpfilename: PCSTR, ulflags: UInt, pvcontext: Long): UInt

public expect fun OpenEncryptedFileRawW(lpfilename: PCWSTR, ulflags: UInt, pvcontext: Long): UInt

public expect fun OpenEnlistment(dwdesiredaccess: UInt, resourcemanagerhandle: HANDLE, enlistmentid: Long): HANDLE

public expect fun OpenFile(lpfilename: PCSTR, lpreopenbuff: Long, ustyle: UInt): Int

public expect fun OpenFileById(hvolumehint: HANDLE, lpfileid: Long, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, lpsecurityattributes: Long, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES): HANDLE

public expect fun OpenResourceManager(dwdesiredaccess: UInt, tmhandle: HANDLE, resourcemanagerid: Long): HANDLE

public expect fun OpenTransaction(dwdesiredaccess: UInt, transactionid: Long): HANDLE

public expect fun OpenTransactionManager(logfilename: PCWSTR, desiredaccess: UInt, openoptions: UInt): HANDLE

public expect fun OpenTransactionManagerById(transactionmanagerid: Long, desiredaccess: UInt, openoptions: UInt): HANDLE

public expect fun PopIoRingCompletion(ioring: HIORING, cqe: Long): HRESULT

public expect fun PrePrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL

public expect fun PrePrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL

public expect fun PrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL

public expect fun PrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL

public expect fun PrepareLogArchive(hlog: HANDLE, pszbaselogfilename: PWSTR, clen: UInt, plsnlow: Long, plsnhigh: Long, pcactuallength: Long, poffbaselogfiledata: Long, pcbbaselogfilelength: Long, plsnbase: Long, plsnlast: Long, plsncurrentarchivetail: Long, ppvarchivecontext: Long): BOOL

public expect fun PrepareTape(hdevice: HANDLE, dwoperation: PREPARE_TAPE_OPERATION, bimmediate: BOOL): UInt

public expect fun QueryDosDeviceA(lpdevicename: PCSTR, lptargetpath: PSTR, ucchmax: UInt): UInt

public expect fun QueryDosDeviceW(lpdevicename: PCWSTR, lptargetpath: PWSTR, ucchmax: UInt): UInt

public expect fun QueryIoRingCapabilities(capabilities: Long): HRESULT

public expect fun QueryLogPolicy(hlog: HANDLE, epolicytype: CLFS_MGMT_POLICY_TYPE, ppolicybuffer: Long, pcbpolicybuffer: Long): BOOL

public expect fun QueryRecoveryAgentsOnEncryptedFile(lpfilename: PCWSTR, precoveryagents: Long): UInt

public expect fun QueryUsersOnEncryptedFile(lpfilename: PCWSTR, pusers: Long): UInt

public expect fun ReOpenFile(horiginalfile: HANDLE, dwdesiredaccess: UInt, dwsharemode: FILE_SHARE_MODE, dwflagsandattributes: FILE_FLAGS_AND_ATTRIBUTES): HANDLE

public expect fun ReadDirectoryChangesExW(hdirectory: HANDLE, lpbuffer: Long, nbufferlength: UInt, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE, lpbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE, readdirectorynotifyinformationclass: READ_DIRECTORY_NOTIFY_INFORMATION_CLASS): BOOL

public expect fun ReadDirectoryChangesW(hdirectory: HANDLE, lpbuffer: Long, nbufferlength: UInt, bwatchsubtree: BOOL, dwnotifyfilter: FILE_NOTIFY_CHANGE, lpbytesreturned: Long, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE): BOOL

public expect fun ReadEncryptedFileRaw(pfexportcallback: PFE_EXPORT_FUNC, pvcallbackcontext: Long, pvcontext: Long): UInt

public expect fun ReadFile(hfile: HANDLE, lpbuffer: Long, nnumberofbytestoread: UInt, lpnumberofbytesread: Long, lpoverlapped: Long): BOOL

public expect fun ReadFileEx(hfile: HANDLE, lpbuffer: Long, nnumberofbytestoread: UInt, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE): BOOL

public expect fun ReadFileScatter(hfile: HANDLE, asegmentarray: Long, nnumberofbytestoread: UInt, lpreserved: Long, lpoverlapped: Long): BOOL

public expect fun ReadLogArchiveMetadata(pvarchivecontext: Long, cboffset: UInt, cbbytestoread: UInt, pbreadbuffer: Long, pcbbytesread: Long): BOOL

public expect fun ReadLogNotification(hlog: HANDLE, pnotification: Long, lpoverlapped: Long): BOOL

public expect fun ReadLogRecord(pvmarshal: Long, plsnfirst: Long, econtextmode: CLFS_CONTEXT_MODE, ppvreadbuffer: Long, pcbreadbuffer: Long, perecordtype: Long, plsnundonext: Long, plsnprevious: Long, ppvreadcontext: Long, poverlapped: Long): BOOL

public expect fun ReadLogRestartArea(pvmarshal: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsn: Long, ppvcontext: Long, poverlapped: Long): BOOL

public expect fun ReadNextLogRecord(pvreadcontext: Long, ppvbuffer: Long, pcbbuffer: Long, perecordtype: Long, plsnuser: Long, plsnundonext: Long, plsnprevious: Long, plsnrecord: Long, poverlapped: Long): BOOL

public expect fun ReadOnlyEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL

public expect fun ReadPreviousLogRestartArea(pvreadcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsnrestart: Long, poverlapped: Long): BOOL

public expect fun RecoverEnlistment(enlistmenthandle: HANDLE, enlistmentkey: Long): BOOL

public expect fun RecoverResourceManager(resourcemanagerhandle: HANDLE): BOOL

public expect fun RecoverTransactionManager(transactionmanagerhandle: HANDLE): BOOL

public expect fun RegisterForLogWriteNotification(hlog: HANDLE, cbthreshold: UInt, fenable: BOOL): BOOL

public expect fun RegisterManageableLogClient(hlog: HANDLE, pcallbacks: Long): BOOL

public expect fun RemoveDirectoryA(lppathname: PCSTR): BOOL

public expect fun RemoveDirectoryFromAppW(lppathname: PCWSTR): BOOL

public expect fun RemoveDirectoryTransactedA(lppathname: PCSTR, htransaction: HANDLE): BOOL

public expect fun RemoveDirectoryTransactedW(lppathname: PCWSTR, htransaction: HANDLE): BOOL

public expect fun RemoveDirectoryW(lppathname: PCWSTR): BOOL

public expect fun RemoveLogContainer(hlog: HANDLE, pwszcontainerpath: PCWSTR, fforce: BOOL, preserved: Long): BOOL

public expect fun RemoveLogContainerSet(hlog: HANDLE, ccontainer: UShort, rgwszcontainerpath: Long, fforce: BOOL, preserved: Long): BOOL

public expect fun RemoveLogPolicy(hlog: HANDLE, epolicytype: CLFS_MGMT_POLICY_TYPE): BOOL

public expect fun RemoveUsersFromEncryptedFile(lpfilename: PCWSTR, phashes: Long): UInt

public expect fun RenameTransactionManager(logfilename: PCWSTR, existingtransactionmanagerguid: Long): BOOL

public expect fun ReplaceFileA(lpreplacedfilename: PCSTR, lpreplacementfilename: PCSTR, lpbackupfilename: PCSTR, dwreplaceflags: REPLACE_FILE_FLAGS, lpexclude: Long, lpreserved: Long): BOOL

public expect fun ReplaceFileFromAppW(lpreplacedfilename: PCWSTR, lpreplacementfilename: PCWSTR, lpbackupfilename: PCWSTR, dwreplaceflags: UInt, lpexclude: Long, lpreserved: Long): BOOL

public expect fun ReplaceFileW(lpreplacedfilename: PCWSTR, lpreplacementfilename: PCWSTR, lpbackupfilename: PCWSTR, dwreplaceflags: REPLACE_FILE_FLAGS, lpexclude: Long, lpreserved: Long): BOOL

public expect fun ReserveAndAppendLog(pvmarshal: Long, rgwriteentries: Long, cwriteentries: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: CLFS_FLAG, plsn: Long, poverlapped: Long): BOOL

public expect fun ReserveAndAppendLogAligned(pvmarshal: Long, rgwriteentries: Long, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: CLFS_FLAG, plsn: Long, poverlapped: Long): BOOL

public expect fun RollbackComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL

public expect fun RollbackEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL

public expect fun RollbackTransaction(transactionhandle: HANDLE): BOOL

public expect fun RollbackTransactionAsync(transactionhandle: HANDLE): BOOL

public expect fun RollforwardTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): BOOL

public expect fun ScanLogContainers(pcxscan: Long, escanmode: UByte, preserved: Long): BOOL

public expect fun SearchPathA(lppath: PCSTR, lpfilename: PCSTR, lpextension: PCSTR, nbufferlength: UInt, lpbuffer: PSTR, lpfilepart: Long): UInt

public expect fun SearchPathW(lppath: PCWSTR, lpfilename: PCWSTR, lpextension: PCWSTR, nbufferlength: UInt, lpbuffer: PWSTR, lpfilepart: Long): UInt

public expect fun SetEncryptedFileMetadata(lpfilename: PCWSTR, pboldmetadata: Long, pbnewmetadata: Long, pownerhash: Long, dwoperation: UInt, pcertificatesadded: Long): UInt

public expect fun SetEndOfFile(hfile: HANDLE): BOOL

public expect fun SetEndOfLog(hlog: HANDLE, plsnend: Long, lpoverlapped: Long): BOOL

public expect fun SetEnlistmentRecoveryInformation(enlistmenthandle: HANDLE, buffersize: UInt, buffer: Long): BOOL

public expect fun SetFileApisToANSI()

public expect fun SetFileApisToOEM()

public expect fun SetFileAttributesA(lpfilename: PCSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES): BOOL

public expect fun SetFileAttributesFromAppW(lpfilename: PCWSTR, dwfileattributes: UInt): BOOL

public expect fun SetFileAttributesTransactedA(lpfilename: PCSTR, dwfileattributes: UInt, htransaction: HANDLE): BOOL

public expect fun SetFileAttributesTransactedW(lpfilename: PCWSTR, dwfileattributes: UInt, htransaction: HANDLE): BOOL

public expect fun SetFileAttributesW(lpfilename: PCWSTR, dwfileattributes: FILE_FLAGS_AND_ATTRIBUTES): BOOL

public expect fun SetFileBandwidthReservation(hfile: HANDLE, nperiodmilliseconds: UInt, nbytesperperiod: UInt, bdiscardable: BOOL, lptransfersize: Long, lpnumoutstandingrequests: Long): BOOL

public expect fun SetFileCompletionNotificationModes(filehandle: HANDLE, flags: UByte): BOOL

public expect fun SetFileInformationByHandle(hfile: HANDLE, fileinformationclass: FILE_INFO_BY_HANDLE_CLASS, lpfileinformation: Long, dwbuffersize: UInt): BOOL

public expect fun SetFileIoOverlappedRange(filehandle: HANDLE, overlappedrangestart: Long, length: UInt): BOOL

public expect fun SetFilePointer(hfile: HANDLE, ldistancetomove: Int, lpdistancetomovehigh: Long, dwmovemethod: SET_FILE_POINTER_MOVE_METHOD): UInt

public expect fun SetFilePointerEx(hfile: HANDLE, lidistancetomove: Long, lpnewfilepointer: Long, dwmovemethod: SET_FILE_POINTER_MOVE_METHOD): BOOL

public expect fun SetFileShortNameA(hfile: HANDLE, lpshortname: PCSTR): BOOL

public expect fun SetFileShortNameW(hfile: HANDLE, lpshortname: PCWSTR): BOOL

public expect fun SetFileTime(hfile: HANDLE, lpcreationtime: Long, lplastaccesstime: Long, lplastwritetime: Long): BOOL

public expect fun SetFileValidData(hfile: HANDLE, validdatalength: Long): BOOL

public expect fun SetIoRingCompletionEvent(ioring: HIORING, hevent: HANDLE): HRESULT

public expect fun SetLogArchiveMode(hlog: HANDLE, emode: CLFS_LOG_ARCHIVE_MODE): BOOL

public expect fun SetLogArchiveTail(hlog: HANDLE, plsnarchivetail: Long, preserved: Long): BOOL

public expect fun SetLogFileSizeWithPolicy(hlog: HANDLE, pdesiredsize: Long, presultingsize: Long): BOOL

public expect fun SetResourceManagerCompletionPort(resourcemanagerhandle: HANDLE, iocompletionporthandle: HANDLE, completionkey: ULong): BOOL

public expect fun SetSearchPathMode(flags: UInt): BOOL

public expect fun SetTapeParameters(hdevice: HANDLE, dwoperation: TAPE_INFORMATION_TYPE, lptapeinformation: Long): UInt

public expect fun SetTapePosition(hdevice: HANDLE, dwpositionmethod: TAPE_POSITION_METHOD, dwpartition: UInt, dwoffsetlow: UInt, dwoffsethigh: UInt, bimmediate: BOOL): UInt

public expect fun SetTransactionInformation(transactionhandle: HANDLE, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: PCWSTR): BOOL

public expect fun SetUserFileEncryptionKey(pencryptioncertificate: Long): UInt

public expect fun SetUserFileEncryptionKeyEx(pencryptioncertificate: Long, dwcapabilities: UInt, dwflags: UInt, pvreserved: Long): UInt

public expect fun SetVolumeLabelA(lprootpathname: PCSTR, lpvolumename: PCSTR): BOOL

public expect fun SetVolumeLabelW(lprootpathname: PCWSTR, lpvolumename: PCWSTR): BOOL

public expect fun SetVolumeMountPointA(lpszvolumemountpoint: PCSTR, lpszvolumename: PCSTR): BOOL

public expect fun SetVolumeMountPointW(lpszvolumemountpoint: PCWSTR, lpszvolumename: PCWSTR): BOOL

public expect fun SinglePhaseReject(enlistmenthandle: HANDLE, tmvirtualclock: Long): BOOL

public expect fun SubmitIoRing(ioring: HIORING, waitoperations: UInt, milliseconds: UInt, submittedentries: Long): HRESULT

public expect fun TerminateLogArchive(pvarchivecontext: Long): BOOL

public expect fun TerminateReadLog(pvcursorcontext: Long): BOOL

public expect fun TruncateLog(pvmarshal: Long, plsnend: Long, lpoverlapped: Long): BOOL

public expect fun TxfGetThreadMiniVersionForCreate(miniversion: Long)

public expect fun TxfLogCreateFileReadContext(logpath: PCWSTR, beginninglsn: CLS_LSN, endinglsn: CLS_LSN, txffileid: Long, txflogcontext: Long): BOOL

public expect fun TxfLogCreateRangeReadContext(logpath: PCWSTR, beginninglsn: CLS_LSN, endinglsn: CLS_LSN, beginningvirtualclock: Long, endingvirtualclock: Long, recordtypemask: UInt, txflogcontext: Long): BOOL

public expect fun TxfLogDestroyReadContext(txflogcontext: Long): BOOL

public expect fun TxfLogReadRecords(txflogcontext: Long, bufferlength: UInt, buffer: Long, bytesused: Long, recordcount: Long): BOOL

public expect fun TxfLogRecordGetFileName(recordbuffer: Long, recordbufferlengthinbytes: UInt, namebuffer: PWSTR, namebufferlengthinbytes: Long, txfid: Long): BOOL

public expect fun TxfLogRecordGetGenericType(recordbuffer: Long, recordbufferlengthinbytes: UInt, generictype: Long, virtualclock: Long): BOOL

public expect fun TxfReadMetadataInfo(filehandle: HANDLE, txffileid: Long, lastlsn: Long, transactionstate: Long, lockingtransaction: Long): BOOL

public expect fun TxfSetThreadMiniVersionForCreate(miniversion: UShort)

public expect fun UnlockFile(hfile: HANDLE, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt): BOOL

public expect fun UnlockFileEx(hfile: HANDLE, dwreserved: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt, lpoverlapped: Long): BOOL

public expect fun ValidateLog(pszlogfilename: PCWSTR, psalogfile: Long, pinfobuffer: Long, pcbbuffer: Long): BOOL

public expect fun VerFindFileA(uflags: VER_FIND_FILE_FLAGS, szfilename: PCSTR, szwindir: PCSTR, szappdir: PCSTR, szcurdir: PSTR, pucurdirlen: Long, szdestdir: PSTR, pudestdirlen: Long): VER_FIND_FILE_STATUS

public expect fun VerFindFileW(uflags: VER_FIND_FILE_FLAGS, szfilename: PCWSTR, szwindir: PCWSTR, szappdir: PCWSTR, szcurdir: PWSTR, pucurdirlen: Long, szdestdir: PWSTR, pudestdirlen: Long): VER_FIND_FILE_STATUS

public expect fun VerInstallFileA(uflags: VER_INSTALL_FILE_FLAGS, szsrcfilename: PCSTR, szdestfilename: PCSTR, szsrcdir: PCSTR, szdestdir: PCSTR, szcurdir: PCSTR, sztmpfile: PSTR, putmpfilelen: Long): VER_INSTALL_FILE_STATUS

public expect fun VerInstallFileW(uflags: VER_INSTALL_FILE_FLAGS, szsrcfilename: PCWSTR, szdestfilename: PCWSTR, szsrcdir: PCWSTR, szdestdir: PCWSTR, szcurdir: PCWSTR, sztmpfile: PWSTR, putmpfilelen: Long): VER_INSTALL_FILE_STATUS

public expect fun VerLanguageNameA(wlang: UInt, szlang: PSTR, cchlang: UInt): UInt

public expect fun VerLanguageNameW(wlang: UInt, szlang: PWSTR, cchlang: UInt): UInt

public expect fun VerQueryValueA(pblock: Long, lpsubblock: PCSTR, lplpbuffer: Long, pulen: Long): BOOL

public expect fun VerQueryValueW(pblock: Long, lpsubblock: PCWSTR, lplpbuffer: Long, pulen: Long): BOOL

public expect fun WofEnumEntries(volumename: PCWSTR, provider: UInt, enumproc: WofEnumEntryProc, userdata: Long): HRESULT

public expect fun WofFileEnumFiles(volumename: PCWSTR, algorithm: UInt, enumproc: WofEnumFilesProc, userdata: Long): HRESULT

public expect fun WofGetDriverVersion(fileorvolumehandle: HANDLE, provider: UInt, wofversion: Long): HRESULT

public expect fun WofIsExternalFile(filepath: PCWSTR, isexternalfile: Long, provider: Long, externalfileinfo: Long, bufferlength: Long): HRESULT

public expect fun WofSetFileDataLocation(filehandle: HANDLE, provider: UInt, externalfileinfo: Long, length: UInt): HRESULT

public expect fun WofShouldCompressBinaries(volume: PCWSTR, algorithm: Long): BOOL

public expect fun WofWimAddEntry(volumename: PCWSTR, wimpath: PCWSTR, wimtype: UInt, wimindex: UInt, datasourceid: Long): HRESULT

public expect fun WofWimEnumFiles(volumename: PCWSTR, datasourceid: Long, enumproc: WofEnumFilesProc, userdata: Long): HRESULT

public expect fun WofWimRemoveEntry(volumename: PCWSTR, datasourceid: Long): HRESULT

public expect fun WofWimSuspendEntry(volumename: PCWSTR, datasourceid: Long): HRESULT

public expect fun WofWimUpdateEntry(volumename: PCWSTR, datasourceid: Long, newwimpath: PCWSTR): HRESULT

public expect fun Wow64DisableWow64FsRedirection(oldvalue: Long): BOOL

public expect fun Wow64EnableWow64FsRedirection(wow64fsenableredirection: Boolean): Boolean

public expect fun Wow64RevertWow64FsRedirection(olvalue: Long): BOOL

public expect fun WriteEncryptedFileRaw(pfimportcallback: PFE_IMPORT_FUNC, pvcallbackcontext: Long, pvcontext: Long): UInt

public expect fun WriteFile(hfile: HANDLE, lpbuffer: Long, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: Long, lpoverlapped: Long): BOOL

public expect fun WriteFileEx(hfile: HANDLE, lpbuffer: Long, nnumberofbytestowrite: UInt, lpoverlapped: Long, lpcompletionroutine: LPOVERLAPPED_COMPLETION_ROUTINE): BOOL

public expect fun WriteFileGather(hfile: HANDLE, asegmentarray: Long, nnumberofbytestowrite: UInt, lpreserved: Long, lpoverlapped: Long): BOOL

public expect fun WriteLogRestartArea(pvmarshal: Long, pvrestartbuffer: Long, cbrestartbuffer: UInt, plsnbase: Long, fflags: CLFS_FLAG, pcbwritten: Long, plsnnext: Long, poverlapped: Long): BOOL

public expect fun WriteTapemark(hdevice: HANDLE, dwtapemarktype: TAPEMARK_TYPE, dwtapemarkcount: UInt, bimmediate: BOOL): UInt
