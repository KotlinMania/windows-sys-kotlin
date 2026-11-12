package io.github.kotlinmania.windowssys.windows.win32.storage.filesystem

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.io.LpoverlappedCompletionRoutine

public expect fun addLogContainer(hlog: Handle, pcbcontainer: ConstPtr, pwszcontainerpath: Pcwstr, preserved: MutPtr): Bool

public expect fun addLogContainerSet(hlog: Handle, ccontainer: UShort, pcbcontainer: ConstPtr, rgwszcontainerpath: ConstPtr, preserved: MutPtr): Bool

public expect fun addUsersToEncryptedFile(lpfilename: Pcwstr, pencryptioncertificates: ConstPtr): UInt

public expect fun advanceLogBase(pvmarshal: MutPtr, plsnbase: MutPtr, fflags: UInt, poverlapped: MutPtr): Bool

public expect fun alignReservedLog(pvmarshal: MutPtr, creservedrecords: UInt, rgcbreservation: MutPtr, pcbalignreservation: MutPtr): Bool

public expect fun allocReservedLog(pvmarshal: MutPtr, creservedrecords: UInt, pcbadjustment: MutPtr): Bool

public expect fun areFileApisANSI(): Bool

public expect fun areShortNamesEnabled(handle: Handle, enabled: MutPtr): Bool

public expect fun backupRead(hfile: Handle, lpbuffer: MutPtr, nnumberofbytestoread: UInt, lpnumberofbytesread: MutPtr, babort: Bool, bprocesssecurity: Bool, lpcontext: MutPtr): Bool

public expect fun backupSeek(hfile: Handle, dwlowbytestoseek: UInt, dwhighbytestoseek: UInt, lpdwlowbyteseeked: MutPtr, lpdwhighbyteseeked: MutPtr, lpcontext: MutPtr): Bool

public expect fun backupWrite(hfile: Handle, lpbuffer: ConstPtr, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: MutPtr, babort: Bool, bprocesssecurity: Bool, lpcontext: MutPtr): Bool

public expect fun buildIoRingCancelRequest(ioring: Hioring, file: IoringHandleRef, optocancel: ULong, userdata: ULong): Hresult

public expect fun buildIoRingFlushFile(ioring: Hioring, fileref: IoringHandleRef, flushmode: FileFlushMode, userdata: ULong, sqeflags: IoringSqeFlags): Hresult

public expect fun buildIoRingReadFile(ioring: Hioring, fileref: IoringHandleRef, dataref: IoringBufferRef, numberofbytestoread: UInt, fileoffset: ULong, userdata: ULong, sqeflags: IoringSqeFlags): Hresult

public expect fun buildIoRingRegisterBuffers(ioring: Hioring, count: UInt, buffers: ConstPtr, userdata: ULong): Hresult

public expect fun buildIoRingRegisterFileHandles(ioring: Hioring, count: UInt, handles: ConstPtr, userdata: ULong): Hresult

public expect fun buildIoRingWriteFile(ioring: Hioring, fileref: IoringHandleRef, bufferref: IoringBufferRef, numberofbytestowrite: UInt, fileoffset: ULong, writeflags: FileWriteFlags, userdata: ULong, sqeflags: IoringSqeFlags): Hresult

public expect fun checkNameLegalDOS8Dot3A(lpname: Pcstr, lpoemname: Pstr, oemnamesize: UInt, pbnamecontainsspaces: MutPtr, pbnamelegal: MutPtr): Bool

public expect fun checkNameLegalDOS8Dot3W(lpname: Pcwstr, lpoemname: Pstr, oemnamesize: UInt, pbnamecontainsspaces: MutPtr, pbnamelegal: MutPtr): Bool

public expect fun closeAndResetLogFile(hlog: Handle): Bool

public expect fun closeEncryptedFileRaw(pvcontext: ConstPtr)

public expect fun closeIoRing(ioring: Hioring): Hresult

public expect fun commitComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr): Bool

public expect fun commitEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr): Bool

public expect fun commitTransaction(transactionhandle: Handle): Bool

public expect fun commitTransactionAsync(transactionhandle: Handle): Bool

public expect fun compareFileTime(lpfiletime1: ConstPtr, lpfiletime2: ConstPtr): Int

public expect fun copyFile2(pwszexistingfilename: Pcwstr, pwsznewfilename: Pcwstr, pextendedparameters: ConstPtr): Hresult

public expect fun copyFileA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, bfailifexists: Bool): Bool

public expect fun copyFileExA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr, pbcancel: MutPtr, dwcopyflags: CopyfileFlags): Bool

public expect fun copyFileExW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr, pbcancel: MutPtr, dwcopyflags: CopyfileFlags): Bool

public expect fun copyFileFromAppW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, bfailifexists: Bool): Bool

public expect fun copyFileTransactedA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr, pbcancel: ConstPtr, dwcopyflags: UInt, htransaction: Handle): Bool

public expect fun copyFileTransactedW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr, pbcancel: ConstPtr, dwcopyflags: UInt, htransaction: Handle): Bool

public expect fun copyFileW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, bfailifexists: Bool): Bool

public expect fun copyLZFile(hfsource: Int, hfdest: Int): Int

public expect fun createDirectoryA(lppathname: Pcstr, lpsecurityattributes: ConstPtr): Bool

public expect fun createDirectoryExA(lptemplatedirectory: Pcstr, lpnewdirectory: Pcstr, lpsecurityattributes: ConstPtr): Bool

public expect fun createDirectoryExW(lptemplatedirectory: Pcwstr, lpnewdirectory: Pcwstr, lpsecurityattributes: ConstPtr): Bool

public expect fun createDirectoryFromAppW(lppathname: Pcwstr, lpsecurityattributes: ConstPtr): Bool

public expect fun createDirectoryTransactedA(lptemplatedirectory: Pcstr, lpnewdirectory: Pcstr, lpsecurityattributes: ConstPtr, htransaction: Handle): Bool

public expect fun createDirectoryTransactedW(lptemplatedirectory: Pcwstr, lpnewdirectory: Pcwstr, lpsecurityattributes: ConstPtr, htransaction: Handle): Bool

public expect fun createDirectoryW(lppathname: Pcwstr, lpsecurityattributes: ConstPtr): Bool

public expect fun createEnlistment(lpenlistmentattributes: MutPtr, resourcemanagerhandle: Handle, transactionhandle: Handle, notificationmask: UInt, createoptions: UInt, enlistmentkey: MutPtr): Handle

public expect fun createFile2(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, dwcreationdisposition: FileCreationDisposition, pcreateexparams: ConstPtr): Handle

public expect fun createFile2FromAppW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationdisposition: UInt, pcreateexparams: ConstPtr): Handle

public expect fun createFileA(lpfilename: Pcstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle): Handle

public expect fun createFileFromAppW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: ConstPtr, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle

public expect fun createFileTransactedA(lpfilename: Pcstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle, htransaction: Handle, pusminiversion: ConstPtr, lpextendedparameter: ConstPtr): Handle

public expect fun createFileTransactedW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle, htransaction: Handle, pusminiversion: ConstPtr, lpextendedparameter: ConstPtr): Handle

public expect fun createFileW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle): Handle

public expect fun createHardLinkA(lpfilename: Pcstr, lpexistingfilename: Pcstr, lpsecurityattributes: ConstPtr): Bool

public expect fun createHardLinkTransactedA(lpfilename: Pcstr, lpexistingfilename: Pcstr, lpsecurityattributes: ConstPtr, htransaction: Handle): Bool

public expect fun createHardLinkTransactedW(lpfilename: Pcwstr, lpexistingfilename: Pcwstr, lpsecurityattributes: ConstPtr, htransaction: Handle): Bool

public expect fun createHardLinkW(lpfilename: Pcwstr, lpexistingfilename: Pcwstr, lpsecurityattributes: ConstPtr): Bool

public expect fun createIoRing(ioringversion: IoringVersion, flags: IoringCreateFlags, submissionqueuesize: UInt, completionqueuesize: UInt, h: MutPtr): Hresult

public expect fun createLogContainerScanContext(hlog: Handle, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: MutPtr, poverlapped: MutPtr): Bool

public expect fun createLogFile(pszlogfilename: Pcwstr, fdesiredaccess: UInt, dwsharemode: FileShareMode, psalogfile: MutPtr, fcreatedisposition: FileCreationDisposition, fflagsandattributes: FileFlagsAndAttributes): Handle

public expect fun createLogMarshallingArea(hlog: Handle, pfnallocbuffer: ClfsBlockAllocation, pfnfreebuffer: ClfsBlockDeallocation, pvblockalloccontext: MutPtr, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshal: MutPtr): Bool

public expect fun createResourceManager(lpresourcemanagerattributes: MutPtr, resourcemanagerid: MutPtr, createoptions: UInt, tmhandle: Handle, description: Pcwstr): Handle

public expect fun createSymbolicLinkA(lpsymlinkfilename: Pcstr, lptargetfilename: Pcstr, dwflags: SymbolicLinkFlags): Boolean

public expect fun createSymbolicLinkTransactedA(lpsymlinkfilename: Pcstr, lptargetfilename: Pcstr, dwflags: SymbolicLinkFlags, htransaction: Handle): Boolean

public expect fun createSymbolicLinkTransactedW(lpsymlinkfilename: Pcwstr, lptargetfilename: Pcwstr, dwflags: SymbolicLinkFlags, htransaction: Handle): Boolean

public expect fun createSymbolicLinkW(lpsymlinkfilename: Pcwstr, lptargetfilename: Pcwstr, dwflags: SymbolicLinkFlags): Boolean

public expect fun createTapePartition(hdevice: Handle, dwpartitionmethod: CreateTapePartitionMethod, dwcount: UInt, dwsize: UInt): UInt

public expect fun createTransaction(lptransactionattributes: MutPtr, uow: MutPtr, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: Pcwstr): Handle

public expect fun createTransactionManager(lptransactionattributes: MutPtr, logfilename: Pcwstr, createoptions: UInt, commitstrength: UInt): Handle

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

public expect fun deleteLogFile(pszlogfilename: Pcwstr, pvreserved: MutPtr): Bool

public expect fun deleteLogMarshallingArea(pvmarshal: MutPtr): Bool

public expect fun deleteVolumeMountPointA(lpszvolumemountpoint: Pcstr): Bool

public expect fun deleteVolumeMountPointW(lpszvolumemountpoint: Pcwstr): Bool

public expect fun deregisterManageableLogClient(hlog: Handle): Bool

public expect fun duplicateEncryptionInfoFile(srcfilename: Pcwstr, dstfilename: Pcwstr, dwcreationdistribution: UInt, dwattributes: UInt, lpsecurityattributes: ConstPtr): UInt

public expect fun encryptFileA(lpfilename: Pcstr): Bool

public expect fun encryptFileW(lpfilename: Pcwstr): Bool

public expect fun encryptionDisable(dirpath: Pcwstr, disable: Bool): Bool

public expect fun eraseTape(hdevice: Handle, dwerasetype: EraseTapeType, bimmediate: Bool): UInt

public expect fun fileEncryptionStatusA(lpfilename: Pcstr, lpstatus: MutPtr): Bool

public expect fun fileEncryptionStatusW(lpfilename: Pcwstr, lpstatus: MutPtr): Bool

public expect fun fileTimeToLocalFileTime(lpfiletime: ConstPtr, lplocalfiletime: MutPtr): Bool

public expect fun findClose(hfindfile: Handle): Bool

public expect fun findCloseChangeNotification(hchangehandle: Handle): Bool

public expect fun findFirstChangeNotificationA(lppathname: Pcstr, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange): Handle

public expect fun findFirstChangeNotificationW(lppathname: Pcwstr, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange): Handle

public expect fun findFirstFileA(lpfilename: Pcstr, lpfindfiledata: MutPtr): Handle

public expect fun findFirstFileExA(lpfilename: Pcstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr, dwadditionalflags: FindFirstExFlags): Handle

public expect fun findFirstFileExFromAppW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr, dwadditionalflags: UInt): Handle

public expect fun findFirstFileExW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr, dwadditionalflags: FindFirstExFlags): Handle

public expect fun findFirstFileNameTransactedW(lpfilename: Pcwstr, dwflags: UInt, stringlength: MutPtr, linkname: Pwstr, htransaction: Handle): Handle

public expect fun findFirstFileNameW(lpfilename: Pcwstr, dwflags: UInt, stringlength: MutPtr, linkname: Pwstr): Handle

public expect fun findFirstFileTransactedA(lpfilename: Pcstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr, dwadditionalflags: UInt, htransaction: Handle): Handle

public expect fun findFirstFileTransactedW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr, dwadditionalflags: UInt, htransaction: Handle): Handle

public expect fun findFirstFileW(lpfilename: Pcwstr, lpfindfiledata: MutPtr): Handle

public expect fun findFirstStreamTransactedW(lpfilename: Pcwstr, infolevel: StreamInfoLevels, lpfindstreamdata: MutPtr, dwflags: UInt, htransaction: Handle): Handle

public expect fun findFirstStreamW(lpfilename: Pcwstr, infolevel: StreamInfoLevels, lpfindstreamdata: MutPtr, dwflags: UInt): Handle

public expect fun findFirstVolumeA(lpszvolumename: Pstr, cchbufferlength: UInt): Handle

public expect fun findFirstVolumeMountPointA(lpszrootpathname: Pcstr, lpszvolumemountpoint: Pstr, cchbufferlength: UInt): Handle

public expect fun findFirstVolumeMountPointW(lpszrootpathname: Pcwstr, lpszvolumemountpoint: Pwstr, cchbufferlength: UInt): Handle

public expect fun findFirstVolumeW(lpszvolumename: Pwstr, cchbufferlength: UInt): Handle

public expect fun findNextChangeNotification(hchangehandle: Handle): Bool

public expect fun findNextFileA(hfindfile: Handle, lpfindfiledata: MutPtr): Bool

public expect fun findNextFileNameW(hfindstream: Handle, stringlength: MutPtr, linkname: Pwstr): Bool

public expect fun findNextFileW(hfindfile: Handle, lpfindfiledata: MutPtr): Bool

public expect fun findNextStreamW(hfindstream: Handle, lpfindstreamdata: MutPtr): Bool

public expect fun findNextVolumeA(hfindvolume: Handle, lpszvolumename: Pstr, cchbufferlength: UInt): Bool

public expect fun findNextVolumeMountPointA(hfindvolumemountpoint: Handle, lpszvolumemountpoint: Pstr, cchbufferlength: UInt): Bool

public expect fun findNextVolumeMountPointW(hfindvolumemountpoint: Handle, lpszvolumemountpoint: Pwstr, cchbufferlength: UInt): Bool

public expect fun findNextVolumeW(hfindvolume: Handle, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool

public expect fun findVolumeClose(hfindvolume: Handle): Bool

public expect fun findVolumeMountPointClose(hfindvolumemountpoint: Handle): Bool

public expect fun flushFileBuffers(hfile: Handle): Bool

public expect fun flushLogBuffers(pvmarshal: ConstPtr, poverlapped: MutPtr): Bool

public expect fun flushLogToLsn(pvmarshalcontext: MutPtr, plsnflush: MutPtr, plsnlastflushed: MutPtr, poverlapped: MutPtr): Bool

public expect fun freeEncryptedFileMetadata(pbmetadata: ConstPtr)

public expect fun freeEncryptionCertificateHashList(pusers: ConstPtr)

public expect fun freeReservedLog(pvmarshal: MutPtr, creservedrecords: UInt, pcbadjustment: MutPtr): Bool

public expect fun getBinaryTypeA(lpapplicationname: Pcstr, lpbinarytype: MutPtr): Bool

public expect fun getBinaryTypeW(lpapplicationname: Pcwstr, lpbinarytype: MutPtr): Bool

public expect fun getCompressedFileSizeA(lpfilename: Pcstr, lpfilesizehigh: MutPtr): UInt

public expect fun getCompressedFileSizeTransactedA(lpfilename: Pcstr, lpfilesizehigh: MutPtr, htransaction: Handle): UInt

public expect fun getCompressedFileSizeTransactedW(lpfilename: Pcwstr, lpfilesizehigh: MutPtr, htransaction: Handle): UInt

public expect fun getCompressedFileSizeW(lpfilename: Pcwstr, lpfilesizehigh: MutPtr): UInt

public expect fun getCurrentClockTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: MutPtr): Bool

public expect fun getDiskFreeSpaceA(lprootpathname: Pcstr, lpsectorspercluster: MutPtr, lpbytespersector: MutPtr, lpnumberoffreeclusters: MutPtr, lptotalnumberofclusters: MutPtr): Bool

public expect fun getDiskFreeSpaceExA(lpdirectoryname: Pcstr, lpfreebytesavailabletocaller: MutPtr, lptotalnumberofbytes: MutPtr, lptotalnumberoffreebytes: MutPtr): Bool

public expect fun getDiskFreeSpaceExW(lpdirectoryname: Pcwstr, lpfreebytesavailabletocaller: MutPtr, lptotalnumberofbytes: MutPtr, lptotalnumberoffreebytes: MutPtr): Bool

public expect fun getDiskFreeSpaceW(lprootpathname: Pcwstr, lpsectorspercluster: MutPtr, lpbytespersector: MutPtr, lpnumberoffreeclusters: MutPtr, lptotalnumberofclusters: MutPtr): Bool

public expect fun getDiskSpaceInformationA(rootpath: Pcstr, diskspaceinfo: MutPtr): Hresult

public expect fun getDiskSpaceInformationW(rootpath: Pcwstr, diskspaceinfo: MutPtr): Hresult

public expect fun getDriveTypeA(lprootpathname: Pcstr): UInt

public expect fun getDriveTypeW(lprootpathname: Pcwstr): UInt

public expect fun getEncryptedFileMetadata(lpfilename: Pcwstr, pcbmetadata: MutPtr, ppbmetadata: MutPtr): UInt

public expect fun getEnlistmentId(enlistmenthandle: Handle, enlistmentid: MutPtr): Bool

public expect fun getEnlistmentRecoveryInformation(enlistmenthandle: Handle, buffersize: UInt, buffer: MutPtr, bufferused: MutPtr): Bool

public expect fun getExpandedNameA(lpszsource: Pcstr, lpszbuffer: Pstr): Int

public expect fun getExpandedNameW(lpszsource: Pcwstr, lpszbuffer: Pwstr): Int

public expect fun getFileAttributesA(lpfilename: Pcstr): UInt

public expect fun getFileAttributesExA(lpfilename: Pcstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr): Bool

public expect fun getFileAttributesExFromAppW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr): Bool

public expect fun getFileAttributesExW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr): Bool

public expect fun getFileAttributesTransactedA(lpfilename: Pcstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr, htransaction: Handle): Bool

public expect fun getFileAttributesTransactedW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr, htransaction: Handle): Bool

public expect fun getFileAttributesW(lpfilename: Pcwstr): UInt

public expect fun getFileBandwidthReservation(hfile: Handle, lpperiodmilliseconds: MutPtr, lpbytesperperiod: MutPtr, pdiscardable: MutPtr, lptransfersize: MutPtr, lpnumoutstandingrequests: MutPtr): Bool

public expect fun getFileInformationByHandle(hfile: Handle, lpfileinformation: MutPtr): Bool

public expect fun getFileInformationByHandleEx(hfile: Handle, fileinformationclass: FileInfoByHandleClass, lpfileinformation: MutPtr, dwbuffersize: UInt): Bool

public expect fun getFileSize(hfile: Handle, lpfilesizehigh: MutPtr): UInt

public expect fun getFileSizeEx(hfile: Handle, lpfilesize: MutPtr): Bool

public expect fun getFileTime(hfile: Handle, lpcreationtime: MutPtr, lplastaccesstime: MutPtr, lplastwritetime: MutPtr): Bool

public expect fun getFileType(hfile: Handle): FileType

public expect fun getFileVersionInfoA(lptstrfilename: Pcstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr): Bool

public expect fun getFileVersionInfoExA(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr): Bool

public expect fun getFileVersionInfoExW(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcwstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr): Bool

public expect fun getFileVersionInfoSizeA(lptstrfilename: Pcstr, lpdwhandle: MutPtr): UInt

public expect fun getFileVersionInfoSizeExA(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcstr, lpdwhandle: MutPtr): UInt

public expect fun getFileVersionInfoSizeExW(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcwstr, lpdwhandle: MutPtr): UInt

public expect fun getFileVersionInfoSizeW(lptstrfilename: Pcwstr, lpdwhandle: MutPtr): UInt

public expect fun getFileVersionInfoW(lptstrfilename: Pcwstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr): Bool

public expect fun getFinalPathNameByHandleA(hfile: Handle, lpszfilepath: Pstr, cchfilepath: UInt, dwflags: GetfinalpathnamebyhandleFlags): UInt

public expect fun getFinalPathNameByHandleW(hfile: Handle, lpszfilepath: Pwstr, cchfilepath: UInt, dwflags: GetfinalpathnamebyhandleFlags): UInt

public expect fun getFullPathNameA(lpfilename: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: MutPtr): UInt

public expect fun getFullPathNameTransactedA(lpfilename: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: MutPtr, htransaction: Handle): UInt

public expect fun getFullPathNameTransactedW(lpfilename: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: MutPtr, htransaction: Handle): UInt

public expect fun getFullPathNameW(lpfilename: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: MutPtr): UInt

public expect fun getIoRingInfo(ioring: Hioring, info: MutPtr): Hresult

public expect fun getLogContainerName(hlog: Handle, cidlogicalcontainer: UInt, pwstrcontainername: Pcwstr, clencontainername: UInt, pcactuallencontainername: MutPtr): Bool

public expect fun getLogFileInformation(hlog: Handle, pinfobuffer: MutPtr, cbbuffer: MutPtr): Bool

public expect fun getLogIoStatistics(hlog: Handle, pvstatsbuffer: MutPtr, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: MutPtr): Bool

public expect fun getLogReservationInfo(pvmarshal: ConstPtr, pcbrecordnumber: MutPtr, pcbuserreservation: MutPtr, pcbcommitreservation: MutPtr): Bool

public expect fun getLogicalDriveStringsA(nbufferlength: UInt, lpbuffer: Pstr): UInt

public expect fun getLogicalDriveStringsW(nbufferlength: UInt, lpbuffer: Pwstr): UInt

public expect fun getLogicalDrives(): UInt

public expect fun getLongPathNameA(lpszshortpath: Pcstr, lpszlongpath: Pstr, cchbuffer: UInt): UInt

public expect fun getLongPathNameTransactedA(lpszshortpath: Pcstr, lpszlongpath: Pstr, cchbuffer: UInt, htransaction: Handle): UInt

public expect fun getLongPathNameTransactedW(lpszshortpath: Pcwstr, lpszlongpath: Pwstr, cchbuffer: UInt, htransaction: Handle): UInt

public expect fun getLongPathNameW(lpszshortpath: Pcwstr, lpszlongpath: Pwstr, cchbuffer: UInt): UInt

public expect fun getNextLogArchiveExtent(pvarchivecontext: MutPtr, rgadextent: MutPtr, cdescriptors: UInt, pcdescriptorsreturned: MutPtr): Bool

public expect fun getNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: MutPtr, notificationlength: UInt, dwmilliseconds: UInt, returnlength: MutPtr): Bool

public expect fun getNotificationResourceManagerAsync(resourcemanagerhandle: Handle, transactionnotification: MutPtr, transactionnotificationlength: UInt, returnlength: MutPtr, lpoverlapped: MutPtr): Bool

public expect fun getShortPathNameA(lpszlongpath: Pcstr, lpszshortpath: Pstr, cchbuffer: UInt): UInt

public expect fun getShortPathNameW(lpszlongpath: Pcwstr, lpszshortpath: Pwstr, cchbuffer: UInt): UInt

public expect fun getTapeParameters(hdevice: Handle, dwoperation: GetTapeDriveParametersOperation, lpdwsize: MutPtr, lptapeinformation: MutPtr): UInt

public expect fun getTapePosition(hdevice: Handle, dwpositiontype: TapePositionType, lpdwpartition: MutPtr, lpdwoffsetlow: MutPtr, lpdwoffsethigh: MutPtr): UInt

public expect fun getTapeStatus(hdevice: Handle): UInt

public expect fun getTempFileNameA(lppathname: Pcstr, lpprefixstring: Pcstr, uunique: UInt, lptempfilename: Pstr): UInt

public expect fun getTempFileNameW(lppathname: Pcwstr, lpprefixstring: Pcwstr, uunique: UInt, lptempfilename: Pwstr): UInt

public expect fun getTempPath2A(bufferlength: UInt, buffer: Pstr): UInt

public expect fun getTempPath2W(bufferlength: UInt, buffer: Pwstr): UInt

public expect fun getTempPathA(nbufferlength: UInt, lpbuffer: Pstr): UInt

public expect fun getTempPathW(nbufferlength: UInt, lpbuffer: Pwstr): UInt

public expect fun getTransactionId(transactionhandle: Handle, transactionid: MutPtr): Bool

public expect fun getTransactionInformation(transactionhandle: Handle, outcome: MutPtr, isolationlevel: MutPtr, isolationflags: MutPtr, timeout: MutPtr, bufferlength: UInt, description: Pwstr): Bool

public expect fun getTransactionManagerId(transactionmanagerhandle: Handle, transactionmanagerid: MutPtr): Bool

public expect fun getVolumeInformationA(lprootpathname: Pcstr, lpvolumenamebuffer: Pstr, nvolumenamesize: UInt, lpvolumeserialnumber: MutPtr, lpmaximumcomponentlength: MutPtr, lpfilesystemflags: MutPtr, lpfilesystemnamebuffer: Pstr, nfilesystemnamesize: UInt): Bool

public expect fun getVolumeInformationByHandleW(hfile: Handle, lpvolumenamebuffer: Pwstr, nvolumenamesize: UInt, lpvolumeserialnumber: MutPtr, lpmaximumcomponentlength: MutPtr, lpfilesystemflags: MutPtr, lpfilesystemnamebuffer: Pwstr, nfilesystemnamesize: UInt): Bool

public expect fun getVolumeInformationW(lprootpathname: Pcwstr, lpvolumenamebuffer: Pwstr, nvolumenamesize: UInt, lpvolumeserialnumber: MutPtr, lpmaximumcomponentlength: MutPtr, lpfilesystemflags: MutPtr, lpfilesystemnamebuffer: Pwstr, nfilesystemnamesize: UInt): Bool

public expect fun getVolumeNameForVolumeMountPointA(lpszvolumemountpoint: Pcstr, lpszvolumename: Pstr, cchbufferlength: UInt): Bool

public expect fun getVolumeNameForVolumeMountPointW(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool

public expect fun getVolumePathNameA(lpszfilename: Pcstr, lpszvolumepathname: Pstr, cchbufferlength: UInt): Bool

public expect fun getVolumePathNameW(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, cchbufferlength: UInt): Bool

public expect fun getVolumePathNamesForVolumeNameA(lpszvolumename: Pcstr, lpszvolumepathnames: Pstr, cchbufferlength: UInt, lpcchreturnlength: MutPtr): Bool

public expect fun getVolumePathNamesForVolumeNameW(lpszvolumename: Pcwstr, lpszvolumepathnames: Pwstr, cchbufferlength: UInt, lpcchreturnlength: MutPtr): Bool

public expect fun handleLogFull(hlog: Handle): Bool

public expect fun installLogPolicy(hlog: Handle, ppolicy: MutPtr): Bool

public expect fun isIoRingOpSupported(ioring: Hioring, op: IoringOpCode): Bool

public expect fun lZClose(hfile: Int)

public expect fun lZCopy(hfsource: Int, hfdest: Int): Int

public expect fun lZDone()

public expect fun lZInit(hfsource: Int): Int

public expect fun lZOpenFileA(lpfilename: Pcstr, lpreopenbuf: MutPtr, wstyle: LzopenfileStyle): Int

public expect fun lZOpenFileW(lpfilename: Pcwstr, lpreopenbuf: MutPtr, wstyle: LzopenfileStyle): Int

public expect fun lZRead(hfile: Int, lpbuffer: Pstr, cbread: Int): Int

public expect fun lZSeek(hfile: Int, loffset: Int, iorigin: Int): Int

public expect fun lZStart(): Int

public expect fun localFileTimeToFileTime(lplocalfiletime: ConstPtr, lpfiletime: MutPtr): Bool

public expect fun lockFile(hfile: Handle, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt): Bool

public expect fun lockFileEx(hfile: Handle, dwflags: LockFileFlags, dwreserved: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt, lpoverlapped: MutPtr): Bool

public expect fun logTailAdvanceFailure(hlog: Handle, dwreason: UInt): Bool

public expect fun lsnBlockOffset(plsn: ConstPtr): UInt

public expect fun lsnContainer(plsn: ConstPtr): UInt

public expect fun lsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn

public expect fun lsnEqual(plsn1: ConstPtr, plsn2: ConstPtr): Boolean

public expect fun lsnGreater(plsn1: ConstPtr, plsn2: ConstPtr): Boolean

public expect fun lsnIncrement(plsn: ConstPtr): ClsLsn

public expect fun lsnInvalid(plsn: ConstPtr): Boolean

public expect fun lsnLess(plsn1: ConstPtr, plsn2: ConstPtr): Boolean

public expect fun lsnNull(plsn: ConstPtr): Boolean

public expect fun lsnRecordSequence(plsn: ConstPtr): UInt

public expect fun moveFileA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr): Bool

public expect fun moveFileExA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, dwflags: MoveFileFlags): Bool

public expect fun moveFileExW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: MoveFileFlags): Bool

public expect fun moveFileFromAppW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr): Bool

public expect fun moveFileTransactedA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr, dwflags: MoveFileFlags, htransaction: Handle): Bool

public expect fun moveFileTransactedW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr, dwflags: MoveFileFlags, htransaction: Handle): Bool

public expect fun moveFileW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr): Bool

public expect fun moveFileWithProgressA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr, dwflags: MoveFileFlags): Bool

public expect fun moveFileWithProgressW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr, dwflags: MoveFileFlags): Bool

public expect fun netConnectionEnum(servername: Pcwstr, qualifier: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumeHandle: MutPtr): UInt

public expect fun netFileClose(servername: Pcwstr, fileid: UInt): UInt

public expect fun netFileEnum(servername: Pcwstr, basepath: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumeHandle: MutPtr): UInt

public expect fun netFileGetInfo(servername: Pcwstr, fileid: UInt, level: UInt, bufptr: MutPtr): UInt

public expect fun netServerAliasAdd(servername: Pcwstr, level: UInt, buf: ConstPtr): UInt

public expect fun netServerAliasDel(servername: Pcwstr, level: UInt, buf: ConstPtr): UInt

public expect fun netServerAliasEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumehandle: MutPtr): UInt

public expect fun netSessionDel(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr): UInt

public expect fun netSessionEnum(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumeHandle: MutPtr): UInt

public expect fun netSessionGetInfo(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr): UInt

public expect fun netShareAdd(servername: Pcwstr, level: UInt, buf: ConstPtr, parmErr: MutPtr): UInt

public expect fun netShareCheck(servername: Pcwstr, device: Pcwstr, type: MutPtr): UInt

public expect fun netShareDel(servername: Pcwstr, netname: Pcwstr, reserved: UInt): UInt

public expect fun netShareDelEx(servername: Pcwstr, level: UInt, buf: ConstPtr): UInt

public expect fun netShareDelSticky(servername: Pcwstr, netname: Pcwstr, reserved: UInt): UInt

public expect fun netShareEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumeHandle: MutPtr): UInt

public expect fun netShareEnumSticky(servername: Pcwstr, level: UInt, bufptr: MutPtr, prefmaxlen: UInt, entriesread: MutPtr, totalentries: MutPtr, resumeHandle: MutPtr): UInt

public expect fun netShareGetInfo(servername: Pcwstr, netname: Pcwstr, level: UInt, bufptr: MutPtr): UInt

public expect fun netShareSetInfo(servername: Pcwstr, netname: Pcwstr, level: UInt, buf: ConstPtr, parmErr: MutPtr): UInt

public expect fun netStatisticsGet(servername: ConstPtr, service: ConstPtr, level: UInt, options: UInt, buffer: MutPtr): UInt

public expect fun openEncryptedFileRawA(lpfilename: Pcstr, ulflags: UInt, pvcontext: MutPtr): UInt

public expect fun openEncryptedFileRawW(lpfilename: Pcwstr, ulflags: UInt, pvcontext: MutPtr): UInt

public expect fun openEnlistment(dwdesiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentid: MutPtr): Handle

public expect fun openFile(lpfilename: Pcstr, lpreopenbuff: MutPtr, ustyle: UInt): Int

public expect fun openFileById(hvolumehint: Handle, lpfileid: ConstPtr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr, dwflagsandattributes: FileFlagsAndAttributes): Handle

public expect fun openResourceManager(dwdesiredaccess: UInt, tmhandle: Handle, resourcemanagerid: MutPtr): Handle

public expect fun openTransaction(dwdesiredaccess: UInt, transactionid: MutPtr): Handle

public expect fun openTransactionManager(logfilename: Pcwstr, desiredaccess: UInt, openoptions: UInt): Handle

public expect fun openTransactionManagerById(transactionmanagerid: ConstPtr, desiredaccess: UInt, openoptions: UInt): Handle

public expect fun popIoRingCompletion(ioring: Hioring, cqe: MutPtr): Hresult

public expect fun prePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr): Bool

public expect fun prePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr): Bool

public expect fun prepareComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr): Bool

public expect fun prepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr): Bool

public expect fun prepareLogArchive(hlog: Handle, pszbaselogfilename: Pwstr, clen: UInt, plsnlow: ConstPtr, plsnhigh: ConstPtr, pcactuallength: MutPtr, poffbaselogfiledata: MutPtr, pcbbaselogfilelength: MutPtr, plsnbase: MutPtr, plsnlast: MutPtr, plsncurrentarchivetail: MutPtr, ppvarchivecontext: MutPtr): Bool

public expect fun prepareTape(hdevice: Handle, dwoperation: PrepareTapeOperation, bimmediate: Bool): UInt

public expect fun queryDosDeviceA(lpdevicename: Pcstr, lptargetpath: Pstr, ucchmax: UInt): UInt

public expect fun queryDosDeviceW(lpdevicename: Pcwstr, lptargetpath: Pwstr, ucchmax: UInt): UInt

public expect fun queryIoRingCapabilities(capabilities: MutPtr): Hresult

public expect fun queryLogPolicy(hlog: Handle, epolicytype: ClfsMgmtPolicyType, ppolicybuffer: MutPtr, pcbpolicybuffer: MutPtr): Bool

public expect fun queryRecoveryAgentsOnEncryptedFile(lpfilename: Pcwstr, precoveryagents: MutPtr): UInt

public expect fun queryUsersOnEncryptedFile(lpfilename: Pcwstr, pusers: MutPtr): UInt

public expect fun reOpenFile(horiginalfile: Handle, dwdesiredaccess: UInt, dwsharemode: FileShareMode, dwflagsandattributes: FileFlagsAndAttributes): Handle

public expect fun readDirectoryChangesExW(hdirectory: Handle, lpbuffer: MutPtr, nbufferlength: UInt, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange, lpbytesreturned: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpoverlappedCompletionRoutine, readdirectorynotifyinformationclass: ReadDirectoryNotifyInformationClass): Bool

public expect fun readDirectoryChangesW(hdirectory: Handle, lpbuffer: MutPtr, nbufferlength: UInt, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange, lpbytesreturned: MutPtr, lpoverlapped: MutPtr, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool

public expect fun readEncryptedFileRaw(pfexportcallback: PfeExportFunc, pvcallbackcontext: ConstPtr, pvcontext: ConstPtr): UInt

public expect fun readFile(hfile: Handle, lpbuffer: MutPtr, nnumberofbytestoread: UInt, lpnumberofbytesread: MutPtr, lpoverlapped: MutPtr): Bool

public expect fun readFileEx(hfile: Handle, lpbuffer: MutPtr, nnumberofbytestoread: UInt, lpoverlapped: MutPtr, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool

public expect fun readFileScatter(hfile: Handle, asegmentarray: ConstPtr, nnumberofbytestoread: UInt, lpreserved: ConstPtr, lpoverlapped: MutPtr): Bool

public expect fun readLogArchiveMetadata(pvarchivecontext: MutPtr, cboffset: UInt, cbbytestoread: UInt, pbreadbuffer: MutPtr, pcbbytesread: MutPtr): Bool

public expect fun readLogNotification(hlog: Handle, pnotification: MutPtr, lpoverlapped: MutPtr): Bool

public expect fun readLogRecord(pvmarshal: MutPtr, plsnfirst: MutPtr, econtextmode: ClfsContextMode, ppvreadbuffer: MutPtr, pcbreadbuffer: MutPtr, perecordtype: MutPtr, plsnundonext: MutPtr, plsnprevious: MutPtr, ppvreadcontext: MutPtr, poverlapped: MutPtr): Bool

public expect fun readLogRestartArea(pvmarshal: MutPtr, ppvrestartbuffer: MutPtr, pcbrestartbuffer: MutPtr, plsn: MutPtr, ppvcontext: MutPtr, poverlapped: MutPtr): Bool

public expect fun readNextLogRecord(pvreadcontext: MutPtr, ppvbuffer: MutPtr, pcbbuffer: MutPtr, perecordtype: MutPtr, plsnuser: MutPtr, plsnundonext: MutPtr, plsnprevious: MutPtr, plsnrecord: MutPtr, poverlapped: MutPtr): Bool

public expect fun readOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr): Bool

public expect fun readPreviousLogRestartArea(pvreadcontext: MutPtr, ppvrestartbuffer: MutPtr, pcbrestartbuffer: MutPtr, plsnrestart: MutPtr, poverlapped: MutPtr): Bool

public expect fun recoverEnlistment(enlistmenthandle: Handle, enlistmentkey: MutPtr): Bool

public expect fun recoverResourceManager(resourcemanagerhandle: Handle): Bool

public expect fun recoverTransactionManager(transactionmanagerhandle: Handle): Bool

public expect fun registerForLogWriteNotification(hlog: Handle, cbthreshold: UInt, fenable: Bool): Bool

public expect fun registerManageableLogClient(hlog: Handle, pcallbacks: MutPtr): Bool

public expect fun removeDirectoryA(lppathname: Pcstr): Bool

public expect fun removeDirectoryFromAppW(lppathname: Pcwstr): Bool

public expect fun removeDirectoryTransactedA(lppathname: Pcstr, htransaction: Handle): Bool

public expect fun removeDirectoryTransactedW(lppathname: Pcwstr, htransaction: Handle): Bool

public expect fun removeDirectoryW(lppathname: Pcwstr): Bool

public expect fun removeLogContainer(hlog: Handle, pwszcontainerpath: Pcwstr, fforce: Bool, preserved: MutPtr): Bool

public expect fun removeLogContainerSet(hlog: Handle, ccontainer: UShort, rgwszcontainerpath: ConstPtr, fforce: Bool, preserved: MutPtr): Bool

public expect fun removeLogPolicy(hlog: Handle, epolicytype: ClfsMgmtPolicyType): Bool

public expect fun removeUsersFromEncryptedFile(lpfilename: Pcwstr, phashes: ConstPtr): UInt

public expect fun renameTransactionManager(logfilename: Pcwstr, existingtransactionmanagerguid: MutPtr): Bool

public expect fun replaceFileA(lpreplacedfilename: Pcstr, lpreplacementfilename: Pcstr, lpbackupfilename: Pcstr, dwreplaceflags: ReplaceFileFlags, lpexclude: ConstPtr, lpreserved: ConstPtr): Bool

public expect fun replaceFileFromAppW(lpreplacedfilename: Pcwstr, lpreplacementfilename: Pcwstr, lpbackupfilename: Pcwstr, dwreplaceflags: UInt, lpexclude: ConstPtr, lpreserved: ConstPtr): Bool

public expect fun replaceFileW(lpreplacedfilename: Pcwstr, lpreplacementfilename: Pcwstr, lpbackupfilename: Pcwstr, dwreplaceflags: ReplaceFileFlags, lpexclude: ConstPtr, lpreserved: ConstPtr): Bool

public expect fun reserveAndAppendLog(pvmarshal: MutPtr, rgwriteentries: MutPtr, cwriteentries: UInt, plsnundonext: MutPtr, plsnprevious: MutPtr, creserverecords: UInt, rgcbreservation: MutPtr, fflags: ClfsFlag, plsn: MutPtr, poverlapped: MutPtr): Bool

public expect fun reserveAndAppendLogAligned(pvmarshal: MutPtr, rgwriteentries: MutPtr, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: MutPtr, plsnprevious: MutPtr, creserverecords: UInt, rgcbreservation: MutPtr, fflags: ClfsFlag, plsn: MutPtr, poverlapped: MutPtr): Bool

public expect fun rollbackComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr): Bool

public expect fun rollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr): Bool

public expect fun rollbackTransaction(transactionhandle: Handle): Bool

public expect fun rollbackTransactionAsync(transactionhandle: Handle): Bool

public expect fun rollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: MutPtr): Bool

public expect fun scanLogContainers(pcxscan: MutPtr, escanmode: UByte, preserved: MutPtr): Bool

public expect fun searchPathA(lppath: Pcstr, lpfilename: Pcstr, lpextension: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: MutPtr): UInt

public expect fun searchPathW(lppath: Pcwstr, lpfilename: Pcwstr, lpextension: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: MutPtr): UInt

public expect fun setEncryptedFileMetadata(lpfilename: Pcwstr, pboldmetadata: ConstPtr, pbnewmetadata: ConstPtr, pownerhash: ConstPtr, dwoperation: UInt, pcertificatesadded: ConstPtr): UInt

public expect fun setEndOfFile(hfile: Handle): Bool

public expect fun setEndOfLog(hlog: Handle, plsnend: MutPtr, lpoverlapped: MutPtr): Bool

public expect fun setEnlistmentRecoveryInformation(enlistmenthandle: Handle, buffersize: UInt, buffer: MutPtr): Bool

public expect fun setFileApisToANSI()

public expect fun setFileApisToOEM()

public expect fun setFileAttributesA(lpfilename: Pcstr, dwfileattributes: FileFlagsAndAttributes): Bool

public expect fun setFileAttributesFromAppW(lpfilename: Pcwstr, dwfileattributes: UInt): Bool

public expect fun setFileAttributesTransactedA(lpfilename: Pcstr, dwfileattributes: UInt, htransaction: Handle): Bool

public expect fun setFileAttributesTransactedW(lpfilename: Pcwstr, dwfileattributes: UInt, htransaction: Handle): Bool

public expect fun setFileAttributesW(lpfilename: Pcwstr, dwfileattributes: FileFlagsAndAttributes): Bool

public expect fun setFileBandwidthReservation(hfile: Handle, nperiodmilliseconds: UInt, nbytesperperiod: UInt, bdiscardable: Bool, lptransfersize: MutPtr, lpnumoutstandingrequests: MutPtr): Bool

public expect fun setFileCompletionNotificationModes(filehandle: Handle, flags: UByte): Bool

public expect fun setFileInformationByHandle(hfile: Handle, fileinformationclass: FileInfoByHandleClass, lpfileinformation: ConstPtr, dwbuffersize: UInt): Bool

public expect fun setFileIoOverlappedRange(filehandle: Handle, overlappedrangestart: ConstPtr, length: UInt): Bool

public expect fun setFilePointer(hfile: Handle, ldistancetomove: Int, lpdistancetomovehigh: MutPtr, dwmovemethod: SetFilePointerMoveMethod): UInt

public expect fun setFilePointerEx(hfile: Handle, lidistancetomove: Long, lpnewfilepointer: MutPtr, dwmovemethod: SetFilePointerMoveMethod): Bool

public expect fun setFileShortNameA(hfile: Handle, lpshortname: Pcstr): Bool

public expect fun setFileShortNameW(hfile: Handle, lpshortname: Pcwstr): Bool

public expect fun setFileTime(hfile: Handle, lpcreationtime: ConstPtr, lplastaccesstime: ConstPtr, lplastwritetime: ConstPtr): Bool

public expect fun setFileValidData(hfile: Handle, validdatalength: Long): Bool

public expect fun setIoRingCompletionEvent(ioring: Hioring, hevent: Handle): Hresult

public expect fun setLogArchiveMode(hlog: Handle, emode: ClfsLogArchiveMode): Bool

public expect fun setLogArchiveTail(hlog: Handle, plsnarchivetail: MutPtr, preserved: MutPtr): Bool

public expect fun setLogFileSizeWithPolicy(hlog: Handle, pdesiredsize: ConstPtr, presultingsize: MutPtr): Bool

public expect fun setResourceManagerCompletionPort(resourcemanagerhandle: Handle, iocompletionporthandle: Handle, completionkey: ULong): Bool

public expect fun setSearchPathMode(flags: UInt): Bool

public expect fun setTapeParameters(hdevice: Handle, dwoperation: TapeInformationType, lptapeinformation: ConstPtr): UInt

public expect fun setTapePosition(hdevice: Handle, dwpositionmethod: TapePositionMethod, dwpartition: UInt, dwoffsetlow: UInt, dwoffsethigh: UInt, bimmediate: Bool): UInt

public expect fun setTransactionInformation(transactionhandle: Handle, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: Pcwstr): Bool

public expect fun setUserFileEncryptionKey(pencryptioncertificate: ConstPtr): UInt

public expect fun setUserFileEncryptionKeyEx(pencryptioncertificate: ConstPtr, dwcapabilities: UInt, dwflags: UInt, pvreserved: ConstPtr): UInt

public expect fun setVolumeLabelA(lprootpathname: Pcstr, lpvolumename: Pcstr): Bool

public expect fun setVolumeLabelW(lprootpathname: Pcwstr, lpvolumename: Pcwstr): Bool

public expect fun setVolumeMountPointA(lpszvolumemountpoint: Pcstr, lpszvolumename: Pcstr): Bool

public expect fun setVolumeMountPointW(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pcwstr): Bool

public expect fun singlePhaseReject(enlistmenthandle: Handle, tmvirtualclock: MutPtr): Bool

public expect fun submitIoRing(ioring: Hioring, waitoperations: UInt, milliseconds: UInt, submittedentries: MutPtr): Hresult

public expect fun terminateLogArchive(pvarchivecontext: MutPtr): Bool

public expect fun terminateReadLog(pvcursorcontext: MutPtr): Bool

public expect fun truncateLog(pvmarshal: ConstPtr, plsnend: ConstPtr, lpoverlapped: MutPtr): Bool

public expect fun txfGetThreadMiniVersionForCreate(miniversion: MutPtr)

public expect fun txfLogCreateFileReadContext(logpath: Pcwstr, beginninglsn: ClsLsn, endinglsn: ClsLsn, txffileid: ConstPtr, txflogcontext: MutPtr): Bool

public expect fun txfLogCreateRangeReadContext(logpath: Pcwstr, beginninglsn: ClsLsn, endinglsn: ClsLsn, beginningvirtualclock: ConstPtr, endingvirtualclock: ConstPtr, recordtypemask: UInt, txflogcontext: MutPtr): Bool

public expect fun txfLogDestroyReadContext(txflogcontext: ConstPtr): Bool

public expect fun txfLogReadRecords(txflogcontext: ConstPtr, bufferlength: UInt, buffer: MutPtr, bytesused: MutPtr, recordcount: MutPtr): Bool

public expect fun txfLogRecordGetFileName(recordbuffer: ConstPtr, recordbufferlengthinbytes: UInt, namebuffer: Pwstr, namebufferlengthinbytes: MutPtr, txfid: MutPtr): Bool

public expect fun txfLogRecordGetGenericType(recordbuffer: ConstPtr, recordbufferlengthinbytes: UInt, generictype: MutPtr, virtualclock: MutPtr): Bool

public expect fun txfReadMetadataInfo(filehandle: Handle, txffileid: MutPtr, lastlsn: MutPtr, transactionstate: MutPtr, lockingtransaction: MutPtr): Bool

public expect fun txfSetThreadMiniVersionForCreate(miniversion: UShort)

public expect fun unlockFile(hfile: Handle, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt): Bool

public expect fun unlockFileEx(hfile: Handle, dwreserved: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt, lpoverlapped: MutPtr): Bool

public expect fun validateLog(pszlogfilename: Pcwstr, psalogfile: MutPtr, pinfobuffer: MutPtr, pcbbuffer: MutPtr): Bool

public expect fun verFindFileA(uflags: VerFindFileFlags, szfilename: Pcstr, szwindir: Pcstr, szappdir: Pcstr, szcurdir: Pstr, pucurdirlen: MutPtr, szdestdir: Pstr, pudestdirlen: MutPtr): VerFindFileStatus

public expect fun verFindFileW(uflags: VerFindFileFlags, szfilename: Pcwstr, szwindir: Pcwstr, szappdir: Pcwstr, szcurdir: Pwstr, pucurdirlen: MutPtr, szdestdir: Pwstr, pudestdirlen: MutPtr): VerFindFileStatus

public expect fun verInstallFileA(uflags: VerInstallFileFlags, szsrcfilename: Pcstr, szdestfilename: Pcstr, szsrcdir: Pcstr, szdestdir: Pcstr, szcurdir: Pcstr, sztmpfile: Pstr, putmpfilelen: MutPtr): VerInstallFileStatus

public expect fun verInstallFileW(uflags: VerInstallFileFlags, szsrcfilename: Pcwstr, szdestfilename: Pcwstr, szsrcdir: Pcwstr, szdestdir: Pcwstr, szcurdir: Pcwstr, sztmpfile: Pwstr, putmpfilelen: MutPtr): VerInstallFileStatus

public expect fun verLanguageNameA(wlang: UInt, szlang: Pstr, cchlang: UInt): UInt

public expect fun verLanguageNameW(wlang: UInt, szlang: Pwstr, cchlang: UInt): UInt

public expect fun verQueryValueA(pblock: ConstPtr, lpsubblock: Pcstr, lplpbuffer: MutPtr, pulen: MutPtr): Bool

public expect fun verQueryValueW(pblock: ConstPtr, lpsubblock: Pcwstr, lplpbuffer: MutPtr, pulen: MutPtr): Bool

public expect fun wofEnumEntries(volumename: Pcwstr, provider: UInt, enumproc: WofEnumEntryProc, userdata: ConstPtr): Hresult

public expect fun wofFileEnumFiles(volumename: Pcwstr, algorithm: UInt, enumproc: WofEnumFilesProc, userdata: ConstPtr): Hresult

public expect fun wofGetDriverVersion(fileorvolumehandle: Handle, provider: UInt, wofversion: MutPtr): Hresult

public expect fun wofIsExternalFile(filepath: Pcwstr, isexternalfile: MutPtr, provider: MutPtr, externalfileinfo: MutPtr, bufferlength: MutPtr): Hresult

public expect fun wofSetFileDataLocation(filehandle: Handle, provider: UInt, externalfileinfo: ConstPtr, length: UInt): Hresult

public expect fun wofShouldCompressBinaries(volume: Pcwstr, algorithm: MutPtr): Bool

public expect fun wofWimAddEntry(volumename: Pcwstr, wimpath: Pcwstr, wimtype: UInt, wimindex: UInt, datasourceid: MutPtr): Hresult

public expect fun wofWimEnumFiles(volumename: Pcwstr, datasourceid: Long, enumproc: WofEnumFilesProc, userdata: ConstPtr): Hresult

public expect fun wofWimRemoveEntry(volumename: Pcwstr, datasourceid: Long): Hresult

public expect fun wofWimSuspendEntry(volumename: Pcwstr, datasourceid: Long): Hresult

public expect fun wofWimUpdateEntry(volumename: Pcwstr, datasourceid: Long, newwimpath: Pcwstr): Hresult

public expect fun wow64DisableWow64FsRedirection(oldvalue: MutPtr): Bool

public expect fun wow64EnableWow64FsRedirection(wow64fsenableredirection: Boolean): Boolean

public expect fun wow64RevertWow64FsRedirection(olvalue: ConstPtr): Bool

public expect fun writeEncryptedFileRaw(pfimportcallback: PfeImportFunc, pvcallbackcontext: ConstPtr, pvcontext: ConstPtr): UInt

public expect fun writeFile(hfile: Handle, lpbuffer: ConstPtr, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: MutPtr, lpoverlapped: MutPtr): Bool

public expect fun writeFileEx(hfile: Handle, lpbuffer: ConstPtr, nnumberofbytestowrite: UInt, lpoverlapped: MutPtr, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool

public expect fun writeFileGather(hfile: Handle, asegmentarray: ConstPtr, nnumberofbytestowrite: UInt, lpreserved: ConstPtr, lpoverlapped: MutPtr): Bool

public expect fun writeLogRestartArea(pvmarshal: MutPtr, pvrestartbuffer: MutPtr, cbrestartbuffer: UInt, plsnbase: MutPtr, fflags: ClfsFlag, pcbwritten: MutPtr, plsnnext: MutPtr, poverlapped: MutPtr): Bool

public expect fun writeTapemark(hdevice: Handle, dwtapemarktype: TapemarkType, dwtapemarkcount: UInt, bimmediate: Bool): UInt
