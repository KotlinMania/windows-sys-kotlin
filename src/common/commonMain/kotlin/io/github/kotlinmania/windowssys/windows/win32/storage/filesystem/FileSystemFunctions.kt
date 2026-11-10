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

public expect fun addLogContainer(hlog: Handle, pcbcontainer: COpaquePointer?, pwszcontainerpath: Pcwstr, preserved: COpaquePointer?): Bool

public expect fun addLogContainerSet(hlog: Handle, ccontainer: UShort, pcbcontainer: COpaquePointer?, rgwszcontainerpath: COpaquePointer?, preserved: COpaquePointer?): Bool

public expect fun addUsersToEncryptedFile(lpfilename: Pcwstr, pencryptioncertificates: COpaquePointer?): UInt

public expect fun advanceLogBase(pvmarshal: COpaquePointer?, plsnbase: COpaquePointer?, fflags: UInt, poverlapped: COpaquePointer?): Bool

public expect fun alignReservedLog(pvmarshal: COpaquePointer?, creservedrecords: UInt, rgcbreservation: COpaquePointer?, pcbalignreservation: COpaquePointer?): Bool

public expect fun allocReservedLog(pvmarshal: COpaquePointer?, creservedrecords: UInt, pcbadjustment: COpaquePointer?): Bool

public expect fun areFileApisANSI(): Bool

public expect fun areShortNamesEnabled(handle: Handle, enabled: COpaquePointer?): Bool

public expect fun backupRead(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, lpnumberofbytesread: COpaquePointer?, babort: Bool, bprocesssecurity: Bool, lpcontext: COpaquePointer?): Bool

public expect fun backupSeek(hfile: Handle, dwlowbytestoseek: UInt, dwhighbytestoseek: UInt, lpdwlowbyteseeked: COpaquePointer?, lpdwhighbyteseeked: COpaquePointer?, lpcontext: COpaquePointer?): Bool

public expect fun backupWrite(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: COpaquePointer?, babort: Bool, bprocesssecurity: Bool, lpcontext: COpaquePointer?): Bool

public expect fun buildIoRingCancelRequest(ioring: Hioring, file: IoringHandleRef, optocancel: ULong, userdata: ULong): Hresult

public expect fun buildIoRingFlushFile(ioring: Hioring, fileref: IoringHandleRef, flushmode: FileFlushMode, userdata: ULong, sqeflags: IoringSqeFlags): Hresult

public expect fun buildIoRingReadFile(ioring: Hioring, fileref: IoringHandleRef, dataref: IoringBufferRef, numberofbytestoread: UInt, fileoffset: ULong, userdata: ULong, sqeflags: IoringSqeFlags): Hresult

public expect fun buildIoRingRegisterBuffers(ioring: Hioring, count: UInt, buffers: COpaquePointer?, userdata: ULong): Hresult

public expect fun buildIoRingRegisterFileHandles(ioring: Hioring, count: UInt, handles: COpaquePointer?, userdata: ULong): Hresult

public expect fun buildIoRingWriteFile(ioring: Hioring, fileref: IoringHandleRef, bufferref: IoringBufferRef, numberofbytestowrite: UInt, fileoffset: ULong, writeflags: FileWriteFlags, userdata: ULong, sqeflags: IoringSqeFlags): Hresult

public expect fun checkNameLegalDOS8Dot3A(lpname: Pcstr, lpoemname: Pstr, oemnamesize: UInt, pbnamecontainsspaces: COpaquePointer?, pbnamelegal: COpaquePointer?): Bool

public expect fun checkNameLegalDOS8Dot3W(lpname: Pcwstr, lpoemname: Pstr, oemnamesize: UInt, pbnamecontainsspaces: COpaquePointer?, pbnamelegal: COpaquePointer?): Bool

public expect fun closeAndResetLogFile(hlog: Handle): Bool

public expect fun closeEncryptedFileRaw(pvcontext: COpaquePointer?)

public expect fun closeIoRing(ioring: Hioring): Hresult

public expect fun commitComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool

public expect fun commitEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool

public expect fun commitTransaction(transactionhandle: Handle): Bool

public expect fun commitTransactionAsync(transactionhandle: Handle): Bool

public expect fun compareFileTime(lpfiletime1: COpaquePointer?, lpfiletime2: COpaquePointer?): Int

public expect fun copyFile2(pwszexistingfilename: Pcwstr, pwsznewfilename: Pcwstr, pextendedparameters: COpaquePointer?): Hresult

public expect fun copyFileA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, bfailifexists: Bool): Bool

public expect fun copyFileExA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, pbcancel: COpaquePointer?, dwcopyflags: CopyfileFlags): Bool

public expect fun copyFileExW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, pbcancel: COpaquePointer?, dwcopyflags: CopyfileFlags): Bool

public expect fun copyFileFromAppW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, bfailifexists: Bool): Bool

public expect fun copyFileTransactedA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, pbcancel: COpaquePointer?, dwcopyflags: UInt, htransaction: Handle): Bool

public expect fun copyFileTransactedW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, pbcancel: COpaquePointer?, dwcopyflags: UInt, htransaction: Handle): Bool

public expect fun copyFileW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, bfailifexists: Bool): Bool

public expect fun copyLZFile(hfsource: Int, hfdest: Int): Int

public expect fun createDirectoryA(lppathname: Pcstr, lpsecurityattributes: COpaquePointer?): Bool

public expect fun createDirectoryExA(lptemplatedirectory: Pcstr, lpnewdirectory: Pcstr, lpsecurityattributes: COpaquePointer?): Bool

public expect fun createDirectoryExW(lptemplatedirectory: Pcwstr, lpnewdirectory: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool

public expect fun createDirectoryFromAppW(lppathname: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool

public expect fun createDirectoryTransactedA(lptemplatedirectory: Pcstr, lpnewdirectory: Pcstr, lpsecurityattributes: COpaquePointer?, htransaction: Handle): Bool

public expect fun createDirectoryTransactedW(lptemplatedirectory: Pcwstr, lpnewdirectory: Pcwstr, lpsecurityattributes: COpaquePointer?, htransaction: Handle): Bool

public expect fun createDirectoryW(lppathname: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool

public expect fun createEnlistment(lpenlistmentattributes: COpaquePointer?, resourcemanagerhandle: Handle, transactionhandle: Handle, notificationmask: UInt, createoptions: UInt, enlistmentkey: COpaquePointer?): Handle

public expect fun createFile2(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, dwcreationdisposition: FileCreationDisposition, pcreateexparams: COpaquePointer?): Handle

public expect fun createFile2FromAppW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationdisposition: UInt, pcreateexparams: COpaquePointer?): Handle

public expect fun createFileA(lpfilename: Pcstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle): Handle

public expect fun createFileFromAppW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle

public expect fun createFileTransactedA(lpfilename: Pcstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle, htransaction: Handle, pusminiversion: COpaquePointer?, lpextendedparameter: COpaquePointer?): Handle

public expect fun createFileTransactedW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle, htransaction: Handle, pusminiversion: COpaquePointer?, lpextendedparameter: COpaquePointer?): Handle

public expect fun createFileW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: COpaquePointer?, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle): Handle

public expect fun createHardLinkA(lpfilename: Pcstr, lpexistingfilename: Pcstr, lpsecurityattributes: COpaquePointer?): Bool

public expect fun createHardLinkTransactedA(lpfilename: Pcstr, lpexistingfilename: Pcstr, lpsecurityattributes: COpaquePointer?, htransaction: Handle): Bool

public expect fun createHardLinkTransactedW(lpfilename: Pcwstr, lpexistingfilename: Pcwstr, lpsecurityattributes: COpaquePointer?, htransaction: Handle): Bool

public expect fun createHardLinkW(lpfilename: Pcwstr, lpexistingfilename: Pcwstr, lpsecurityattributes: COpaquePointer?): Bool

public expect fun createIoRing(ioringversion: IoringVersion, flags: IoringCreateFlags, submissionqueuesize: UInt, completionqueuesize: UInt, h: COpaquePointer?): Hresult

public expect fun createLogContainerScanContext(hlog: Handle, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: COpaquePointer?, poverlapped: COpaquePointer?): Bool

public expect fun createLogFile(pszlogfilename: Pcwstr, fdesiredaccess: UInt, dwsharemode: FileShareMode, psalogfile: COpaquePointer?, fcreatedisposition: FileCreationDisposition, fflagsandattributes: FileFlagsAndAttributes): Handle

public expect fun createLogMarshallingArea(hlog: Handle, pfnallocbuffer: ClfsBlockAllocation, pfnfreebuffer: ClfsBlockDeallocation, pvblockalloccontext: COpaquePointer?, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshal: COpaquePointer?): Bool

public expect fun createResourceManager(lpresourcemanagerattributes: COpaquePointer?, resourcemanagerid: COpaquePointer?, createoptions: UInt, tmhandle: Handle, description: Pcwstr): Handle

public expect fun createSymbolicLinkA(lpsymlinkfilename: Pcstr, lptargetfilename: Pcstr, dwflags: SymbolicLinkFlags): Boolean

public expect fun createSymbolicLinkTransactedA(lpsymlinkfilename: Pcstr, lptargetfilename: Pcstr, dwflags: SymbolicLinkFlags, htransaction: Handle): Boolean

public expect fun createSymbolicLinkTransactedW(lpsymlinkfilename: Pcwstr, lptargetfilename: Pcwstr, dwflags: SymbolicLinkFlags, htransaction: Handle): Boolean

public expect fun createSymbolicLinkW(lpsymlinkfilename: Pcwstr, lptargetfilename: Pcwstr, dwflags: SymbolicLinkFlags): Boolean

public expect fun createTapePartition(hdevice: Handle, dwpartitionmethod: CreateTapePartitionMethod, dwcount: UInt, dwsize: UInt): UInt

public expect fun createTransaction(lptransactionattributes: COpaquePointer?, uow: COpaquePointer?, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: Pcwstr): Handle

public expect fun createTransactionManager(lptransactionattributes: COpaquePointer?, logfilename: Pcwstr, createoptions: UInt, commitstrength: UInt): Handle

public expect fun decryptFileA(lpfilename: Pcstr, dwreserved: UInt): Bool

public expect fun decryptFileW(lpfilename: Pcwstr, dwreserved: UInt): Bool

public expect fun defineDosDeviceA(dwflags: DefineDosDeviceFlags, lpdevicename: Pcstr, lptargetpath: Pcstr): Bool

public expect fun defineDosDeviceW(dwflags: DefineDosDeviceFlags, lpdevicename: Pcwstr, lptargetpath: Pcwstr): Bool

public expect fun deleteFileA(lpfilename: Pcstr): Bool

public expect fun deleteFileFromAppW(lpfilename: Pcwstr): Bool

public expect fun deleteFileTransactedA(lpfilename: Pcstr, htransaction: Handle): Bool

public expect fun deleteFileTransactedW(lpfilename: Pcwstr, htransaction: Handle): Bool

public expect fun deleteFileW(lpfilename: Pcwstr): Bool

public expect fun deleteLogByHandle(hlog: Handle): Bool

public expect fun deleteLogFile(pszlogfilename: Pcwstr, pvreserved: COpaquePointer?): Bool

public expect fun deleteLogMarshallingArea(pvmarshal: COpaquePointer?): Bool

public expect fun deleteVolumeMountPointA(lpszvolumemountpoint: Pcstr): Bool

public expect fun deleteVolumeMountPointW(lpszvolumemountpoint: Pcwstr): Bool

public expect fun deregisterManageableLogClient(hlog: Handle): Bool

public expect fun duplicateEncryptionInfoFile(srcfilename: Pcwstr, dstfilename: Pcwstr, dwcreationdistribution: UInt, dwattributes: UInt, lpsecurityattributes: COpaquePointer?): UInt

public expect fun encryptFileA(lpfilename: Pcstr): Bool

public expect fun encryptFileW(lpfilename: Pcwstr): Bool

public expect fun encryptionDisable(dirpath: Pcwstr, disable: Bool): Bool

public expect fun eraseTape(hdevice: Handle, dwerasetype: EraseTapeType, bimmediate: Bool): UInt

public expect fun fileEncryptionStatusA(lpfilename: Pcstr, lpstatus: COpaquePointer?): Bool

public expect fun fileEncryptionStatusW(lpfilename: Pcwstr, lpstatus: COpaquePointer?): Bool

public expect fun fileTimeToLocalFileTime(lpfiletime: COpaquePointer?, lplocalfiletime: COpaquePointer?): Bool

public expect fun findClose(hfindfile: Handle): Bool

public expect fun findCloseChangeNotification(hchangehandle: Handle): Bool

public expect fun findFirstChangeNotificationA(lppathname: Pcstr, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange): Handle

public expect fun findFirstChangeNotificationW(lppathname: Pcwstr, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange): Handle

public expect fun findFirstFileA(lpfilename: Pcstr, lpfindfiledata: COpaquePointer?): Handle

public expect fun findFirstFileExA(lpfilename: Pcstr, finfolevelid: FindexInfoLevels, lpfindfiledata: COpaquePointer?, fsearchop: FindexSearchOps, lpsearchfilter: COpaquePointer?, dwadditionalflags: FindFirstExFlags): Handle

public expect fun findFirstFileExFromAppW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: COpaquePointer?, fsearchop: FindexSearchOps, lpsearchfilter: COpaquePointer?, dwadditionalflags: UInt): Handle

public expect fun findFirstFileExW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: COpaquePointer?, fsearchop: FindexSearchOps, lpsearchfilter: COpaquePointer?, dwadditionalflags: FindFirstExFlags): Handle

public expect fun findFirstFileNameTransactedW(lpfilename: Pcwstr, dwflags: UInt, stringlength: COpaquePointer?, linkname: Pwstr, htransaction: Handle): Handle

public expect fun findFirstFileNameW(lpfilename: Pcwstr, dwflags: UInt, stringlength: COpaquePointer?, linkname: Pwstr): Handle

public expect fun findFirstFileTransactedA(lpfilename: Pcstr, finfolevelid: FindexInfoLevels, lpfindfiledata: COpaquePointer?, fsearchop: FindexSearchOps, lpsearchfilter: COpaquePointer?, dwadditionalflags: UInt, htransaction: Handle): Handle

public expect fun findFirstFileTransactedW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: COpaquePointer?, fsearchop: FindexSearchOps, lpsearchfilter: COpaquePointer?, dwadditionalflags: UInt, htransaction: Handle): Handle

public expect fun findFirstFileW(lpfilename: Pcwstr, lpfindfiledata: COpaquePointer?): Handle

public expect fun findFirstStreamTransactedW(lpfilename: Pcwstr, infolevel: StreamInfoLevels, lpfindstreamdata: COpaquePointer?, dwflags: UInt, htransaction: Handle): Handle

public expect fun findFirstStreamW(lpfilename: Pcwstr, infolevel: StreamInfoLevels, lpfindstreamdata: COpaquePointer?, dwflags: UInt): Handle

public expect fun findFirstVolumeA(lpszvolumename: Pstr, cchbufferlength: UInt): Handle

public expect fun findFirstVolumeMountPointA(lpszrootpathname: Pcstr, lpszvolumemountpoint: Pstr, cchbufferlength: UInt): Handle

public expect fun findFirstVolumeMountPointW(lpszrootpathname: Pcwstr, lpszvolumemountpoint: Pwstr, cchbufferlength: UInt): Handle

public expect fun findFirstVolumeW(lpszvolumename: Pwstr, cchbufferlength: UInt): Handle

public expect fun findNextChangeNotification(hchangehandle: Handle): Bool

public expect fun findNextFileA(hfindfile: Handle, lpfindfiledata: COpaquePointer?): Bool

public expect fun findNextFileNameW(hfindstream: Handle, stringlength: COpaquePointer?, linkname: Pwstr): Bool

public expect fun findNextFileW(hfindfile: Handle, lpfindfiledata: COpaquePointer?): Bool

public expect fun findNextStreamW(hfindstream: Handle, lpfindstreamdata: COpaquePointer?): Bool

public expect fun findNextVolumeA(hfindvolume: Handle, lpszvolumename: Pstr, cchbufferlength: UInt): Bool

public expect fun findNextVolumeMountPointA(hfindvolumemountpoint: Handle, lpszvolumemountpoint: Pstr, cchbufferlength: UInt): Bool

public expect fun findNextVolumeMountPointW(hfindvolumemountpoint: Handle, lpszvolumemountpoint: Pwstr, cchbufferlength: UInt): Bool

public expect fun findNextVolumeW(hfindvolume: Handle, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool

public expect fun findVolumeClose(hfindvolume: Handle): Bool

public expect fun findVolumeMountPointClose(hfindvolumemountpoint: Handle): Bool

public expect fun flushFileBuffers(hfile: Handle): Bool

public expect fun flushLogBuffers(pvmarshal: COpaquePointer?, poverlapped: COpaquePointer?): Bool

public expect fun flushLogToLsn(pvmarshalcontext: COpaquePointer?, plsnflush: COpaquePointer?, plsnlastflushed: COpaquePointer?, poverlapped: COpaquePointer?): Bool

public expect fun freeEncryptedFileMetadata(pbmetadata: COpaquePointer?)

public expect fun freeEncryptionCertificateHashList(pusers: COpaquePointer?)

public expect fun freeReservedLog(pvmarshal: COpaquePointer?, creservedrecords: UInt, pcbadjustment: COpaquePointer?): Bool

public expect fun getBinaryTypeA(lpapplicationname: Pcstr, lpbinarytype: COpaquePointer?): Bool

public expect fun getBinaryTypeW(lpapplicationname: Pcwstr, lpbinarytype: COpaquePointer?): Bool

public expect fun getCompressedFileSizeA(lpfilename: Pcstr, lpfilesizehigh: COpaquePointer?): UInt

public expect fun getCompressedFileSizeTransactedA(lpfilename: Pcstr, lpfilesizehigh: COpaquePointer?, htransaction: Handle): UInt

public expect fun getCompressedFileSizeTransactedW(lpfilename: Pcwstr, lpfilesizehigh: COpaquePointer?, htransaction: Handle): UInt

public expect fun getCompressedFileSizeW(lpfilename: Pcwstr, lpfilesizehigh: COpaquePointer?): UInt

public expect fun getCurrentClockTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: COpaquePointer?): Bool

public expect fun getDiskFreeSpaceA(lprootpathname: Pcstr, lpsectorspercluster: COpaquePointer?, lpbytespersector: COpaquePointer?, lpnumberoffreeclusters: COpaquePointer?, lptotalnumberofclusters: COpaquePointer?): Bool

public expect fun getDiskFreeSpaceExA(lpdirectoryname: Pcstr, lpfreebytesavailabletocaller: COpaquePointer?, lptotalnumberofbytes: COpaquePointer?, lptotalnumberoffreebytes: COpaquePointer?): Bool

public expect fun getDiskFreeSpaceExW(lpdirectoryname: Pcwstr, lpfreebytesavailabletocaller: COpaquePointer?, lptotalnumberofbytes: COpaquePointer?, lptotalnumberoffreebytes: COpaquePointer?): Bool

public expect fun getDiskFreeSpaceW(lprootpathname: Pcwstr, lpsectorspercluster: COpaquePointer?, lpbytespersector: COpaquePointer?, lpnumberoffreeclusters: COpaquePointer?, lptotalnumberofclusters: COpaquePointer?): Bool

public expect fun getDiskSpaceInformationA(rootpath: Pcstr, diskspaceinfo: COpaquePointer?): Hresult

public expect fun getDiskSpaceInformationW(rootpath: Pcwstr, diskspaceinfo: COpaquePointer?): Hresult

public expect fun getDriveTypeA(lprootpathname: Pcstr): UInt

public expect fun getDriveTypeW(lprootpathname: Pcwstr): UInt

public expect fun getEncryptedFileMetadata(lpfilename: Pcwstr, pcbmetadata: COpaquePointer?, ppbmetadata: COpaquePointer?): UInt

public expect fun getEnlistmentId(enlistmenthandle: Handle, enlistmentid: COpaquePointer?): Bool

public expect fun getEnlistmentRecoveryInformation(enlistmenthandle: Handle, buffersize: UInt, buffer: COpaquePointer?, bufferused: COpaquePointer?): Bool

public expect fun getExpandedNameA(lpszsource: Pcstr, lpszbuffer: Pstr): Int

public expect fun getExpandedNameW(lpszsource: Pcwstr, lpszbuffer: Pwstr): Int

public expect fun getFileAttributesA(lpfilename: Pcstr): UInt

public expect fun getFileAttributesExA(lpfilename: Pcstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?): Bool

public expect fun getFileAttributesExFromAppW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?): Bool

public expect fun getFileAttributesExW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?): Bool

public expect fun getFileAttributesTransactedA(lpfilename: Pcstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?, htransaction: Handle): Bool

public expect fun getFileAttributesTransactedW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: COpaquePointer?, htransaction: Handle): Bool

public expect fun getFileAttributesW(lpfilename: Pcwstr): UInt

public expect fun getFileBandwidthReservation(hfile: Handle, lpperiodmilliseconds: COpaquePointer?, lpbytesperperiod: COpaquePointer?, pdiscardable: COpaquePointer?, lptransfersize: COpaquePointer?, lpnumoutstandingrequests: COpaquePointer?): Bool

public expect fun getFileInformationByHandle(hfile: Handle, lpfileinformation: COpaquePointer?): Bool

public expect fun getFileInformationByHandleEx(hfile: Handle, fileinformationclass: FileInfoByHandleClass, lpfileinformation: COpaquePointer?, dwbuffersize: UInt): Bool

public expect fun getFileSize(hfile: Handle, lpfilesizehigh: COpaquePointer?): UInt

public expect fun getFileSizeEx(hfile: Handle, lpfilesize: COpaquePointer?): Bool

public expect fun getFileTime(hfile: Handle, lpcreationtime: COpaquePointer?, lplastaccesstime: COpaquePointer?, lplastwritetime: COpaquePointer?): Bool

public expect fun getFileType(hfile: Handle): FileType

public expect fun getFileVersionInfoA(lptstrfilename: Pcstr, dwhandle: UInt, dwlen: UInt, lpdata: COpaquePointer?): Bool

public expect fun getFileVersionInfoExA(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcstr, dwhandle: UInt, dwlen: UInt, lpdata: COpaquePointer?): Bool

public expect fun getFileVersionInfoExW(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcwstr, dwhandle: UInt, dwlen: UInt, lpdata: COpaquePointer?): Bool

public expect fun getFileVersionInfoSizeA(lptstrfilename: Pcstr, lpdwhandle: COpaquePointer?): UInt

public expect fun getFileVersionInfoSizeExA(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcstr, lpdwhandle: COpaquePointer?): UInt

public expect fun getFileVersionInfoSizeExW(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcwstr, lpdwhandle: COpaquePointer?): UInt

public expect fun getFileVersionInfoSizeW(lptstrfilename: Pcwstr, lpdwhandle: COpaquePointer?): UInt

public expect fun getFileVersionInfoW(lptstrfilename: Pcwstr, dwhandle: UInt, dwlen: UInt, lpdata: COpaquePointer?): Bool

public expect fun getFinalPathNameByHandleA(hfile: Handle, lpszfilepath: Pstr, cchfilepath: UInt, dwflags: GetfinalpathnamebyhandleFlags): UInt

public expect fun getFinalPathNameByHandleW(hfile: Handle, lpszfilepath: Pwstr, cchfilepath: UInt, dwflags: GetfinalpathnamebyhandleFlags): UInt

public expect fun getFullPathNameA(lpfilename: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: COpaquePointer?): UInt

public expect fun getFullPathNameTransactedA(lpfilename: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: COpaquePointer?, htransaction: Handle): UInt

public expect fun getFullPathNameTransactedW(lpfilename: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: COpaquePointer?, htransaction: Handle): UInt

public expect fun getFullPathNameW(lpfilename: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: COpaquePointer?): UInt

public expect fun getIoRingInfo(ioring: Hioring, info: COpaquePointer?): Hresult

public expect fun getLogContainerName(hlog: Handle, cidlogicalcontainer: UInt, pwstrcontainername: Pcwstr, clencontainername: UInt, pcactuallencontainername: COpaquePointer?): Bool

public expect fun getLogFileInformation(hlog: Handle, pinfobuffer: COpaquePointer?, cbbuffer: COpaquePointer?): Bool

public expect fun getLogIoStatistics(hlog: Handle, pvstatsbuffer: COpaquePointer?, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: COpaquePointer?): Bool

public expect fun getLogReservationInfo(pvmarshal: COpaquePointer?, pcbrecordnumber: COpaquePointer?, pcbuserreservation: COpaquePointer?, pcbcommitreservation: COpaquePointer?): Bool

public expect fun getLogicalDriveStringsA(nbufferlength: UInt, lpbuffer: Pstr): UInt

public expect fun getLogicalDriveStringsW(nbufferlength: UInt, lpbuffer: Pwstr): UInt

public expect fun getLogicalDrives(): UInt

public expect fun getLongPathNameA(lpszshortpath: Pcstr, lpszlongpath: Pstr, cchbuffer: UInt): UInt

public expect fun getLongPathNameTransactedA(lpszshortpath: Pcstr, lpszlongpath: Pstr, cchbuffer: UInt, htransaction: Handle): UInt

public expect fun getLongPathNameTransactedW(lpszshortpath: Pcwstr, lpszlongpath: Pwstr, cchbuffer: UInt, htransaction: Handle): UInt

public expect fun getLongPathNameW(lpszshortpath: Pcwstr, lpszlongpath: Pwstr, cchbuffer: UInt): UInt

public expect fun getNextLogArchiveExtent(pvarchivecontext: COpaquePointer?, rgadextent: COpaquePointer?, cdescriptors: UInt, pcdescriptorsreturned: COpaquePointer?): Bool

public expect fun getNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: COpaquePointer?, notificationlength: UInt, dwmilliseconds: UInt, returnlength: COpaquePointer?): Bool

public expect fun getNotificationResourceManagerAsync(resourcemanagerhandle: Handle, transactionnotification: COpaquePointer?, transactionnotificationlength: UInt, returnlength: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool

public expect fun getShortPathNameA(lpszlongpath: Pcstr, lpszshortpath: Pstr, cchbuffer: UInt): UInt

public expect fun getShortPathNameW(lpszlongpath: Pcwstr, lpszshortpath: Pwstr, cchbuffer: UInt): UInt

public expect fun getTapeParameters(hdevice: Handle, dwoperation: GetTapeDriveParametersOperation, lpdwsize: COpaquePointer?, lptapeinformation: COpaquePointer?): UInt

public expect fun getTapePosition(hdevice: Handle, dwpositiontype: TapePositionType, lpdwpartition: COpaquePointer?, lpdwoffsetlow: COpaquePointer?, lpdwoffsethigh: COpaquePointer?): UInt

public expect fun getTapeStatus(hdevice: Handle): UInt

public expect fun getTempFileNameA(lppathname: Pcstr, lpprefixstring: Pcstr, uunique: UInt, lptempfilename: Pstr): UInt

public expect fun getTempFileNameW(lppathname: Pcwstr, lpprefixstring: Pcwstr, uunique: UInt, lptempfilename: Pwstr): UInt

public expect fun getTempPath2A(bufferlength: UInt, buffer: Pstr): UInt

public expect fun getTempPath2W(bufferlength: UInt, buffer: Pwstr): UInt

public expect fun getTempPathA(nbufferlength: UInt, lpbuffer: Pstr): UInt

public expect fun getTempPathW(nbufferlength: UInt, lpbuffer: Pwstr): UInt

public expect fun getTransactionId(transactionhandle: Handle, transactionid: COpaquePointer?): Bool

public expect fun getTransactionInformation(transactionhandle: Handle, outcome: COpaquePointer?, isolationlevel: COpaquePointer?, isolationflags: COpaquePointer?, timeout: COpaquePointer?, bufferlength: UInt, description: Pwstr): Bool

public expect fun getTransactionManagerId(transactionmanagerhandle: Handle, transactionmanagerid: COpaquePointer?): Bool

public expect fun getVolumeInformationA(lprootpathname: Pcstr, lpvolumenamebuffer: Pstr, nvolumenamesize: UInt, lpvolumeserialnumber: COpaquePointer?, lpmaximumcomponentlength: COpaquePointer?, lpfilesystemflags: COpaquePointer?, lpfilesystemnamebuffer: Pstr, nfilesystemnamesize: UInt): Bool

public expect fun getVolumeInformationByHandleW(hfile: Handle, lpvolumenamebuffer: Pwstr, nvolumenamesize: UInt, lpvolumeserialnumber: COpaquePointer?, lpmaximumcomponentlength: COpaquePointer?, lpfilesystemflags: COpaquePointer?, lpfilesystemnamebuffer: Pwstr, nfilesystemnamesize: UInt): Bool

public expect fun getVolumeInformationW(lprootpathname: Pcwstr, lpvolumenamebuffer: Pwstr, nvolumenamesize: UInt, lpvolumeserialnumber: COpaquePointer?, lpmaximumcomponentlength: COpaquePointer?, lpfilesystemflags: COpaquePointer?, lpfilesystemnamebuffer: Pwstr, nfilesystemnamesize: UInt): Bool

public expect fun getVolumeNameForVolumeMountPointA(lpszvolumemountpoint: Pcstr, lpszvolumename: Pstr, cchbufferlength: UInt): Bool

public expect fun getVolumeNameForVolumeMountPointW(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool

public expect fun getVolumePathNameA(lpszfilename: Pcstr, lpszvolumepathname: Pstr, cchbufferlength: UInt): Bool

public expect fun getVolumePathNameW(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, cchbufferlength: UInt): Bool

public expect fun getVolumePathNamesForVolumeNameA(lpszvolumename: Pcstr, lpszvolumepathnames: Pstr, cchbufferlength: UInt, lpcchreturnlength: COpaquePointer?): Bool

public expect fun getVolumePathNamesForVolumeNameW(lpszvolumename: Pcwstr, lpszvolumepathnames: Pwstr, cchbufferlength: UInt, lpcchreturnlength: COpaquePointer?): Bool

public expect fun handleLogFull(hlog: Handle): Bool

public expect fun installLogPolicy(hlog: Handle, ppolicy: COpaquePointer?): Bool

public expect fun isIoRingOpSupported(ioring: Hioring, op: IoringOpCode): Bool

public expect fun lZClose(hfile: Int)

public expect fun lZCopy(hfsource: Int, hfdest: Int): Int

public expect fun lZDone()

public expect fun lZInit(hfsource: Int): Int

public expect fun lZOpenFileA(lpfilename: Pcstr, lpreopenbuf: COpaquePointer?, wstyle: LzopenfileStyle): Int

public expect fun lZOpenFileW(lpfilename: Pcwstr, lpreopenbuf: COpaquePointer?, wstyle: LzopenfileStyle): Int

public expect fun lZRead(hfile: Int, lpbuffer: Pstr, cbread: Int): Int

public expect fun lZSeek(hfile: Int, loffset: Int, iorigin: Int): Int

public expect fun lZStart(): Int

public expect fun localFileTimeToFileTime(lplocalfiletime: COpaquePointer?, lpfiletime: COpaquePointer?): Bool

public expect fun lockFile(hfile: Handle, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt): Bool

public expect fun lockFileEx(hfile: Handle, dwflags: LockFileFlags, dwreserved: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt, lpoverlapped: COpaquePointer?): Bool

public expect fun logTailAdvanceFailure(hlog: Handle, dwreason: UInt): Bool

public expect fun lsnBlockOffset(plsn: COpaquePointer?): UInt

public expect fun lsnContainer(plsn: COpaquePointer?): UInt

public expect fun lsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn

public expect fun lsnEqual(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean

public expect fun lsnGreater(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean

public expect fun lsnIncrement(plsn: COpaquePointer?): ClsLsn

public expect fun lsnInvalid(plsn: COpaquePointer?): Boolean

public expect fun lsnLess(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean

public expect fun lsnNull(plsn: COpaquePointer?): Boolean

public expect fun lsnRecordSequence(plsn: COpaquePointer?): UInt

public expect fun moveFileA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr): Bool

public expect fun moveFileExA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, dwflags: MoveFileFlags): Bool

public expect fun moveFileExW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: MoveFileFlags): Bool

public expect fun moveFileFromAppW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr): Bool

public expect fun moveFileTransactedA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, dwflags: MoveFileFlags, htransaction: Handle): Bool

public expect fun moveFileTransactedW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, dwflags: MoveFileFlags, htransaction: Handle): Bool

public expect fun moveFileW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr): Bool

public expect fun moveFileWithProgressA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, dwflags: MoveFileFlags): Bool

public expect fun moveFileWithProgressW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: COpaquePointer?, dwflags: MoveFileFlags): Bool

public expect fun netConnectionEnum(servername: Pcwstr, qualifier: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt

public expect fun netFileClose(servername: Pcwstr, fileid: UInt): UInt

public expect fun netFileEnum(servername: Pcwstr, basepath: Pcwstr, username: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt

public expect fun netFileGetInfo(servername: Pcwstr, fileid: UInt, level: UInt, bufptr: COpaquePointer?): UInt

public expect fun netServerAliasAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?): UInt

public expect fun netServerAliasDel(servername: Pcwstr, level: UInt, buf: COpaquePointer?): UInt

public expect fun netServerAliasEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumehandle: COpaquePointer?): UInt

public expect fun netSessionDel(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr): UInt

public expect fun netSessionEnum(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt

public expect fun netSessionGetInfo(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt

public expect fun netShareAdd(servername: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt

public expect fun netShareCheck(servername: Pcwstr, device: Pcwstr, type: COpaquePointer?): UInt

public expect fun netShareDel(servername: Pcwstr, netname: Pcwstr, reserved: UInt): UInt

public expect fun netShareDelEx(servername: Pcwstr, level: UInt, buf: COpaquePointer?): UInt

public expect fun netShareDelSticky(servername: Pcwstr, netname: Pcwstr, reserved: UInt): UInt

public expect fun netShareEnum(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt

public expect fun netShareEnumSticky(servername: Pcwstr, level: UInt, bufptr: COpaquePointer?, prefmaxlen: UInt, entriesread: COpaquePointer?, totalentries: COpaquePointer?, resumeHandle: COpaquePointer?): UInt

public expect fun netShareGetInfo(servername: Pcwstr, netname: Pcwstr, level: UInt, bufptr: COpaquePointer?): UInt

public expect fun netShareSetInfo(servername: Pcwstr, netname: Pcwstr, level: UInt, buf: COpaquePointer?, parmErr: COpaquePointer?): UInt

public expect fun netStatisticsGet(servername: COpaquePointer?, service: COpaquePointer?, level: UInt, options: UInt, buffer: COpaquePointer?): UInt

public expect fun openEncryptedFileRawA(lpfilename: Pcstr, ulflags: UInt, pvcontext: COpaquePointer?): UInt

public expect fun openEncryptedFileRawW(lpfilename: Pcwstr, ulflags: UInt, pvcontext: COpaquePointer?): UInt

public expect fun openEnlistment(dwdesiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentid: COpaquePointer?): Handle

public expect fun openFile(lpfilename: Pcstr, lpreopenbuff: COpaquePointer?, ustyle: UInt): Int

public expect fun openFileById(hvolumehint: Handle, lpfileid: COpaquePointer?, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: COpaquePointer?, dwflagsandattributes: FileFlagsAndAttributes): Handle

public expect fun openResourceManager(dwdesiredaccess: UInt, tmhandle: Handle, resourcemanagerid: COpaquePointer?): Handle

public expect fun openTransaction(dwdesiredaccess: UInt, transactionid: COpaquePointer?): Handle

public expect fun openTransactionManager(logfilename: Pcwstr, desiredaccess: UInt, openoptions: UInt): Handle

public expect fun openTransactionManagerById(transactionmanagerid: COpaquePointer?, desiredaccess: UInt, openoptions: UInt): Handle

public expect fun popIoRingCompletion(ioring: Hioring, cqe: COpaquePointer?): Hresult

public expect fun prePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool

public expect fun prePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool

public expect fun prepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool

public expect fun prepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool

public expect fun prepareLogArchive(hlog: Handle, pszbaselogfilename: Pwstr, clen: UInt, plsnlow: COpaquePointer?, plsnhigh: COpaquePointer?, pcactuallength: COpaquePointer?, poffbaselogfiledata: COpaquePointer?, pcbbaselogfilelength: COpaquePointer?, plsnbase: COpaquePointer?, plsnlast: COpaquePointer?, plsncurrentarchivetail: COpaquePointer?, ppvarchivecontext: COpaquePointer?): Bool

public expect fun prepareTape(hdevice: Handle, dwoperation: PrepareTapeOperation, bimmediate: Bool): UInt

public expect fun queryDosDeviceA(lpdevicename: Pcstr, lptargetpath: Pstr, ucchmax: UInt): UInt

public expect fun queryDosDeviceW(lpdevicename: Pcwstr, lptargetpath: Pwstr, ucchmax: UInt): UInt

public expect fun queryIoRingCapabilities(capabilities: COpaquePointer?): Hresult

public expect fun queryLogPolicy(hlog: Handle, epolicytype: ClfsMgmtPolicyType, ppolicybuffer: COpaquePointer?, pcbpolicybuffer: COpaquePointer?): Bool

public expect fun queryRecoveryAgentsOnEncryptedFile(lpfilename: Pcwstr, precoveryagents: COpaquePointer?): UInt

public expect fun queryUsersOnEncryptedFile(lpfilename: Pcwstr, pusers: COpaquePointer?): UInt

public expect fun reOpenFile(horiginalfile: Handle, dwdesiredaccess: UInt, dwsharemode: FileShareMode, dwflagsandattributes: FileFlagsAndAttributes): Handle

public expect fun readDirectoryChangesExW(hdirectory: Handle, lpbuffer: COpaquePointer?, nbufferlength: UInt, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange, lpbytesreturned: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpoverlappedCompletionRoutine, readdirectorynotifyinformationclass: ReadDirectoryNotifyInformationClass): Bool

public expect fun readDirectoryChangesW(hdirectory: Handle, lpbuffer: COpaquePointer?, nbufferlength: UInt, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange, lpbytesreturned: COpaquePointer?, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool

public expect fun readEncryptedFileRaw(pfexportcallback: PfeExportFunc, pvcallbackcontext: COpaquePointer?, pvcontext: COpaquePointer?): UInt

public expect fun readFile(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, lpnumberofbytesread: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool

public expect fun readFileEx(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool

public expect fun readFileScatter(hfile: Handle, asegmentarray: COpaquePointer?, nnumberofbytestoread: UInt, lpreserved: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool

public expect fun readLogArchiveMetadata(pvarchivecontext: COpaquePointer?, cboffset: UInt, cbbytestoread: UInt, pbreadbuffer: COpaquePointer?, pcbbytesread: COpaquePointer?): Bool

public expect fun readLogNotification(hlog: Handle, pnotification: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool

public expect fun readLogRecord(pvmarshal: COpaquePointer?, plsnfirst: COpaquePointer?, econtextmode: ClfsContextMode, ppvreadbuffer: COpaquePointer?, pcbreadbuffer: COpaquePointer?, perecordtype: COpaquePointer?, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, ppvreadcontext: COpaquePointer?, poverlapped: COpaquePointer?): Bool

public expect fun readLogRestartArea(pvmarshal: COpaquePointer?, ppvrestartbuffer: COpaquePointer?, pcbrestartbuffer: COpaquePointer?, plsn: COpaquePointer?, ppvcontext: COpaquePointer?, poverlapped: COpaquePointer?): Bool

public expect fun readNextLogRecord(pvreadcontext: COpaquePointer?, ppvbuffer: COpaquePointer?, pcbbuffer: COpaquePointer?, perecordtype: COpaquePointer?, plsnuser: COpaquePointer?, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, plsnrecord: COpaquePointer?, poverlapped: COpaquePointer?): Bool

public expect fun readOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool

public expect fun readPreviousLogRestartArea(pvreadcontext: COpaquePointer?, ppvrestartbuffer: COpaquePointer?, pcbrestartbuffer: COpaquePointer?, plsnrestart: COpaquePointer?, poverlapped: COpaquePointer?): Bool

public expect fun recoverEnlistment(enlistmenthandle: Handle, enlistmentkey: COpaquePointer?): Bool

public expect fun recoverResourceManager(resourcemanagerhandle: Handle): Bool

public expect fun recoverTransactionManager(transactionmanagerhandle: Handle): Bool

public expect fun registerForLogWriteNotification(hlog: Handle, cbthreshold: UInt, fenable: Bool): Bool

public expect fun registerManageableLogClient(hlog: Handle, pcallbacks: COpaquePointer?): Bool

public expect fun removeDirectoryA(lppathname: Pcstr): Bool

public expect fun removeDirectoryFromAppW(lppathname: Pcwstr): Bool

public expect fun removeDirectoryTransactedA(lppathname: Pcstr, htransaction: Handle): Bool

public expect fun removeDirectoryTransactedW(lppathname: Pcwstr, htransaction: Handle): Bool

public expect fun removeDirectoryW(lppathname: Pcwstr): Bool

public expect fun removeLogContainer(hlog: Handle, pwszcontainerpath: Pcwstr, fforce: Bool, preserved: COpaquePointer?): Bool

public expect fun removeLogContainerSet(hlog: Handle, ccontainer: UShort, rgwszcontainerpath: COpaquePointer?, fforce: Bool, preserved: COpaquePointer?): Bool

public expect fun removeLogPolicy(hlog: Handle, epolicytype: ClfsMgmtPolicyType): Bool

public expect fun removeUsersFromEncryptedFile(lpfilename: Pcwstr, phashes: COpaquePointer?): UInt

public expect fun renameTransactionManager(logfilename: Pcwstr, existingtransactionmanagerguid: COpaquePointer?): Bool

public expect fun replaceFileA(lpreplacedfilename: Pcstr, lpreplacementfilename: Pcstr, lpbackupfilename: Pcstr, dwreplaceflags: ReplaceFileFlags, lpexclude: COpaquePointer?, lpreserved: COpaquePointer?): Bool

public expect fun replaceFileFromAppW(lpreplacedfilename: Pcwstr, lpreplacementfilename: Pcwstr, lpbackupfilename: Pcwstr, dwreplaceflags: UInt, lpexclude: COpaquePointer?, lpreserved: COpaquePointer?): Bool

public expect fun replaceFileW(lpreplacedfilename: Pcwstr, lpreplacementfilename: Pcwstr, lpbackupfilename: Pcwstr, dwreplaceflags: ReplaceFileFlags, lpexclude: COpaquePointer?, lpreserved: COpaquePointer?): Bool

public expect fun reserveAndAppendLog(pvmarshal: COpaquePointer?, rgwriteentries: COpaquePointer?, cwriteentries: UInt, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, creserverecords: UInt, rgcbreservation: COpaquePointer?, fflags: ClfsFlag, plsn: COpaquePointer?, poverlapped: COpaquePointer?): Bool

public expect fun reserveAndAppendLogAligned(pvmarshal: COpaquePointer?, rgwriteentries: COpaquePointer?, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, creserverecords: UInt, rgcbreservation: COpaquePointer?, fflags: ClfsFlag, plsn: COpaquePointer?, poverlapped: COpaquePointer?): Bool

public expect fun rollbackComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool

public expect fun rollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool

public expect fun rollbackTransaction(transactionhandle: Handle): Bool

public expect fun rollbackTransactionAsync(transactionhandle: Handle): Bool

public expect fun rollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: COpaquePointer?): Bool

public expect fun scanLogContainers(pcxscan: COpaquePointer?, escanmode: UByte, preserved: COpaquePointer?): Bool

public expect fun searchPathA(lppath: Pcstr, lpfilename: Pcstr, lpextension: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: COpaquePointer?): UInt

public expect fun searchPathW(lppath: Pcwstr, lpfilename: Pcwstr, lpextension: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: COpaquePointer?): UInt

public expect fun setEncryptedFileMetadata(lpfilename: Pcwstr, pboldmetadata: COpaquePointer?, pbnewmetadata: COpaquePointer?, pownerhash: COpaquePointer?, dwoperation: UInt, pcertificatesadded: COpaquePointer?): UInt

public expect fun setEndOfFile(hfile: Handle): Bool

public expect fun setEndOfLog(hlog: Handle, plsnend: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool

public expect fun setEnlistmentRecoveryInformation(enlistmenthandle: Handle, buffersize: UInt, buffer: COpaquePointer?): Bool

public expect fun setFileApisToANSI()

public expect fun setFileApisToOEM()

public expect fun setFileAttributesA(lpfilename: Pcstr, dwfileattributes: FileFlagsAndAttributes): Bool

public expect fun setFileAttributesFromAppW(lpfilename: Pcwstr, dwfileattributes: UInt): Bool

public expect fun setFileAttributesTransactedA(lpfilename: Pcstr, dwfileattributes: UInt, htransaction: Handle): Bool

public expect fun setFileAttributesTransactedW(lpfilename: Pcwstr, dwfileattributes: UInt, htransaction: Handle): Bool

public expect fun setFileAttributesW(lpfilename: Pcwstr, dwfileattributes: FileFlagsAndAttributes): Bool

public expect fun setFileBandwidthReservation(hfile: Handle, nperiodmilliseconds: UInt, nbytesperperiod: UInt, bdiscardable: Bool, lptransfersize: COpaquePointer?, lpnumoutstandingrequests: COpaquePointer?): Bool

public expect fun setFileCompletionNotificationModes(filehandle: Handle, flags: UByte): Bool

public expect fun setFileInformationByHandle(hfile: Handle, fileinformationclass: FileInfoByHandleClass, lpfileinformation: COpaquePointer?, dwbuffersize: UInt): Bool

public expect fun setFileIoOverlappedRange(filehandle: Handle, overlappedrangestart: COpaquePointer?, length: UInt): Bool

public expect fun setFilePointer(hfile: Handle, ldistancetomove: Int, lpdistancetomovehigh: COpaquePointer?, dwmovemethod: SetFilePointerMoveMethod): UInt

public expect fun setFilePointerEx(hfile: Handle, lidistancetomove: Long, lpnewfilepointer: COpaquePointer?, dwmovemethod: SetFilePointerMoveMethod): Bool

public expect fun setFileShortNameA(hfile: Handle, lpshortname: Pcstr): Bool

public expect fun setFileShortNameW(hfile: Handle, lpshortname: Pcwstr): Bool

public expect fun setFileTime(hfile: Handle, lpcreationtime: COpaquePointer?, lplastaccesstime: COpaquePointer?, lplastwritetime: COpaquePointer?): Bool

public expect fun setFileValidData(hfile: Handle, validdatalength: Long): Bool

public expect fun setIoRingCompletionEvent(ioring: Hioring, hevent: Handle): Hresult

public expect fun setLogArchiveMode(hlog: Handle, emode: ClfsLogArchiveMode): Bool

public expect fun setLogArchiveTail(hlog: Handle, plsnarchivetail: COpaquePointer?, preserved: COpaquePointer?): Bool

public expect fun setLogFileSizeWithPolicy(hlog: Handle, pdesiredsize: COpaquePointer?, presultingsize: COpaquePointer?): Bool

public expect fun setResourceManagerCompletionPort(resourcemanagerhandle: Handle, iocompletionporthandle: Handle, completionkey: ULong): Bool

public expect fun setSearchPathMode(flags: UInt): Bool

public expect fun setTapeParameters(hdevice: Handle, dwoperation: TapeInformationType, lptapeinformation: COpaquePointer?): UInt

public expect fun setTapePosition(hdevice: Handle, dwpositionmethod: TapePositionMethod, dwpartition: UInt, dwoffsetlow: UInt, dwoffsethigh: UInt, bimmediate: Bool): UInt

public expect fun setTransactionInformation(transactionhandle: Handle, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: Pcwstr): Bool

public expect fun setUserFileEncryptionKey(pencryptioncertificate: COpaquePointer?): UInt

public expect fun setUserFileEncryptionKeyEx(pencryptioncertificate: COpaquePointer?, dwcapabilities: UInt, dwflags: UInt, pvreserved: COpaquePointer?): UInt

public expect fun setVolumeLabelA(lprootpathname: Pcstr, lpvolumename: Pcstr): Bool

public expect fun setVolumeLabelW(lprootpathname: Pcwstr, lpvolumename: Pcwstr): Bool

public expect fun setVolumeMountPointA(lpszvolumemountpoint: Pcstr, lpszvolumename: Pcstr): Bool

public expect fun setVolumeMountPointW(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pcwstr): Bool

public expect fun singlePhaseReject(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Bool

public expect fun submitIoRing(ioring: Hioring, waitoperations: UInt, milliseconds: UInt, submittedentries: COpaquePointer?): Hresult

public expect fun terminateLogArchive(pvarchivecontext: COpaquePointer?): Bool

public expect fun terminateReadLog(pvcursorcontext: COpaquePointer?): Bool

public expect fun truncateLog(pvmarshal: COpaquePointer?, plsnend: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool

public expect fun txfGetThreadMiniVersionForCreate(miniversion: COpaquePointer?)

public expect fun txfLogCreateFileReadContext(logpath: Pcwstr, beginninglsn: ClsLsn, endinglsn: ClsLsn, txffileid: COpaquePointer?, txflogcontext: COpaquePointer?): Bool

public expect fun txfLogCreateRangeReadContext(logpath: Pcwstr, beginninglsn: ClsLsn, endinglsn: ClsLsn, beginningvirtualclock: COpaquePointer?, endingvirtualclock: COpaquePointer?, recordtypemask: UInt, txflogcontext: COpaquePointer?): Bool

public expect fun txfLogDestroyReadContext(txflogcontext: COpaquePointer?): Bool

public expect fun txfLogReadRecords(txflogcontext: COpaquePointer?, bufferlength: UInt, buffer: COpaquePointer?, bytesused: COpaquePointer?, recordcount: COpaquePointer?): Bool

public expect fun txfLogRecordGetFileName(recordbuffer: COpaquePointer?, recordbufferlengthinbytes: UInt, namebuffer: Pwstr, namebufferlengthinbytes: COpaquePointer?, txfid: COpaquePointer?): Bool

public expect fun txfLogRecordGetGenericType(recordbuffer: COpaquePointer?, recordbufferlengthinbytes: UInt, generictype: COpaquePointer?, virtualclock: COpaquePointer?): Bool

public expect fun txfReadMetadataInfo(filehandle: Handle, txffileid: COpaquePointer?, lastlsn: COpaquePointer?, transactionstate: COpaquePointer?, lockingtransaction: COpaquePointer?): Bool

public expect fun txfSetThreadMiniVersionForCreate(miniversion: UShort)

public expect fun unlockFile(hfile: Handle, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt): Bool

public expect fun unlockFileEx(hfile: Handle, dwreserved: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt, lpoverlapped: COpaquePointer?): Bool

public expect fun validateLog(pszlogfilename: Pcwstr, psalogfile: COpaquePointer?, pinfobuffer: COpaquePointer?, pcbbuffer: COpaquePointer?): Bool

public expect fun verFindFileA(uflags: VerFindFileFlags, szfilename: Pcstr, szwindir: Pcstr, szappdir: Pcstr, szcurdir: Pstr, pucurdirlen: COpaquePointer?, szdestdir: Pstr, pudestdirlen: COpaquePointer?): VerFindFileStatus

public expect fun verFindFileW(uflags: VerFindFileFlags, szfilename: Pcwstr, szwindir: Pcwstr, szappdir: Pcwstr, szcurdir: Pwstr, pucurdirlen: COpaquePointer?, szdestdir: Pwstr, pudestdirlen: COpaquePointer?): VerFindFileStatus

public expect fun verInstallFileA(uflags: VerInstallFileFlags, szsrcfilename: Pcstr, szdestfilename: Pcstr, szsrcdir: Pcstr, szdestdir: Pcstr, szcurdir: Pcstr, sztmpfile: Pstr, putmpfilelen: COpaquePointer?): VerInstallFileStatus

public expect fun verInstallFileW(uflags: VerInstallFileFlags, szsrcfilename: Pcwstr, szdestfilename: Pcwstr, szsrcdir: Pcwstr, szdestdir: Pcwstr, szcurdir: Pcwstr, sztmpfile: Pwstr, putmpfilelen: COpaquePointer?): VerInstallFileStatus

public expect fun verLanguageNameA(wlang: UInt, szlang: Pstr, cchlang: UInt): UInt

public expect fun verLanguageNameW(wlang: UInt, szlang: Pwstr, cchlang: UInt): UInt

public expect fun verQueryValueA(pblock: COpaquePointer?, lpsubblock: Pcstr, lplpbuffer: COpaquePointer?, pulen: COpaquePointer?): Bool

public expect fun verQueryValueW(pblock: COpaquePointer?, lpsubblock: Pcwstr, lplpbuffer: COpaquePointer?, pulen: COpaquePointer?): Bool

public expect fun wofEnumEntries(volumename: Pcwstr, provider: UInt, enumproc: WofEnumEntryProc, userdata: COpaquePointer?): Hresult

public expect fun wofFileEnumFiles(volumename: Pcwstr, algorithm: UInt, enumproc: WofEnumFilesProc, userdata: COpaquePointer?): Hresult

public expect fun wofGetDriverVersion(fileorvolumehandle: Handle, provider: UInt, wofversion: COpaquePointer?): Hresult

public expect fun wofIsExternalFile(filepath: Pcwstr, isexternalfile: COpaquePointer?, provider: COpaquePointer?, externalfileinfo: COpaquePointer?, bufferlength: COpaquePointer?): Hresult

public expect fun wofSetFileDataLocation(filehandle: Handle, provider: UInt, externalfileinfo: COpaquePointer?, length: UInt): Hresult

public expect fun wofShouldCompressBinaries(volume: Pcwstr, algorithm: COpaquePointer?): Bool

public expect fun wofWimAddEntry(volumename: Pcwstr, wimpath: Pcwstr, wimtype: UInt, wimindex: UInt, datasourceid: COpaquePointer?): Hresult

public expect fun wofWimEnumFiles(volumename: Pcwstr, datasourceid: Long, enumproc: WofEnumFilesProc, userdata: COpaquePointer?): Hresult

public expect fun wofWimRemoveEntry(volumename: Pcwstr, datasourceid: Long): Hresult

public expect fun wofWimSuspendEntry(volumename: Pcwstr, datasourceid: Long): Hresult

public expect fun wofWimUpdateEntry(volumename: Pcwstr, datasourceid: Long, newwimpath: Pcwstr): Hresult

public expect fun wow64DisableWow64FsRedirection(oldvalue: COpaquePointer?): Bool

public expect fun wow64EnableWow64FsRedirection(wow64fsenableredirection: Boolean): Boolean

public expect fun wow64RevertWow64FsRedirection(olvalue: COpaquePointer?): Bool

public expect fun writeEncryptedFileRaw(pfimportcallback: PfeImportFunc, pvcallbackcontext: COpaquePointer?, pvcontext: COpaquePointer?): UInt

public expect fun writeFile(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool

public expect fun writeFileEx(hfile: Handle, lpbuffer: COpaquePointer?, nnumberofbytestowrite: UInt, lpoverlapped: COpaquePointer?, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool

public expect fun writeFileGather(hfile: Handle, asegmentarray: COpaquePointer?, nnumberofbytestowrite: UInt, lpreserved: COpaquePointer?, lpoverlapped: COpaquePointer?): Bool

public expect fun writeLogRestartArea(pvmarshal: COpaquePointer?, pvrestartbuffer: COpaquePointer?, cbrestartbuffer: UInt, plsnbase: COpaquePointer?, fflags: ClfsFlag, pcbwritten: COpaquePointer?, plsnnext: COpaquePointer?, poverlapped: COpaquePointer?): Bool

public expect fun writeTapemark(hdevice: Handle, dwtapemarktype: TapemarkType, dwtapemarkcount: UInt, bimmediate: Bool): UInt
