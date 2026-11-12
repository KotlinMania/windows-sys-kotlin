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

public expect fun addLogContainer(hlog: Handle, pcbcontainer: ConstPtr<ULong>, pwszcontainerpath: Pcwstr, preserved: MutPtr<CVoid>): Bool

public expect fun addLogContainerSet(hlog: Handle, ccontainer: UShort, pcbcontainer: ConstPtr<ULong>, rgwszcontainerpath: ConstPtr<Pcwstr>, preserved: MutPtr<CVoid>): Bool

public expect fun addUsersToEncryptedFile(lpfilename: Pcwstr, pencryptioncertificates: ConstPtr<EncryptionCertificateList>): UInt

public expect fun advanceLogBase(pvmarshal: MutPtr<CVoid>, plsnbase: MutPtr<ClsLsn>, fflags: UInt, poverlapped: MutPtr<Overlapped>): Bool

public expect fun alignReservedLog(pvmarshal: MutPtr<CVoid>, creservedrecords: UInt, rgcbreservation: MutPtr<Long>, pcbalignreservation: MutPtr<Long>): Bool

public expect fun allocReservedLog(pvmarshal: MutPtr<CVoid>, creservedrecords: UInt, pcbadjustment: MutPtr<Long>): Bool

public expect fun areFileApisANSI(): Bool

public expect fun areShortNamesEnabled(handle: Handle, enabled: MutPtr<Bool>): Bool

public expect fun backupRead(hfile: Handle, lpbuffer: MutPtr<UByte>, nnumberofbytestoread: UInt, lpnumberofbytesread: MutPtr<UInt>, babort: Bool, bprocesssecurity: Bool, lpcontext: MutPtr<MutPtr<CVoid>>): Bool

public expect fun backupSeek(hfile: Handle, dwlowbytestoseek: UInt, dwhighbytestoseek: UInt, lpdwlowbyteseeked: MutPtr<UInt>, lpdwhighbyteseeked: MutPtr<UInt>, lpcontext: MutPtr<MutPtr<CVoid>>): Bool

public expect fun backupWrite(hfile: Handle, lpbuffer: ConstPtr<UByte>, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: MutPtr<UInt>, babort: Bool, bprocesssecurity: Bool, lpcontext: MutPtr<MutPtr<CVoid>>): Bool

public expect fun buildIoRingCancelRequest(ioring: Hioring, file: IoringHandleRef, optocancel: ULong, userdata: ULong): Hresult

public expect fun buildIoRingFlushFile(ioring: Hioring, fileref: IoringHandleRef, flushmode: FileFlushMode, userdata: ULong, sqeflags: IoringSqeFlags): Hresult

public expect fun buildIoRingReadFile(ioring: Hioring, fileref: IoringHandleRef, dataref: IoringBufferRef, numberofbytestoread: UInt, fileoffset: ULong, userdata: ULong, sqeflags: IoringSqeFlags): Hresult

public expect fun buildIoRingRegisterBuffers(ioring: Hioring, count: UInt, buffers: ConstPtr<IoringBufferInfo>, userdata: ULong): Hresult

public expect fun buildIoRingRegisterFileHandles(ioring: Hioring, count: UInt, handles: ConstPtr<Handle>, userdata: ULong): Hresult

public expect fun buildIoRingWriteFile(ioring: Hioring, fileref: IoringHandleRef, bufferref: IoringBufferRef, numberofbytestowrite: UInt, fileoffset: ULong, writeflags: FileWriteFlags, userdata: ULong, sqeflags: IoringSqeFlags): Hresult

public expect fun checkNameLegalDOS8Dot3A(lpname: Pcstr, lpoemname: Pstr, oemnamesize: UInt, pbnamecontainsspaces: MutPtr<Bool>, pbnamelegal: MutPtr<Bool>): Bool

public expect fun checkNameLegalDOS8Dot3W(lpname: Pcwstr, lpoemname: Pstr, oemnamesize: UInt, pbnamecontainsspaces: MutPtr<Bool>, pbnamelegal: MutPtr<Bool>): Bool

public expect fun closeAndResetLogFile(hlog: Handle): Bool

public expect fun closeEncryptedFileRaw(pvcontext: ConstPtr<CVoid>)

public expect fun closeIoRing(ioring: Hioring): Hresult

public expect fun commitComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool

public expect fun commitEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool

public expect fun commitTransaction(transactionhandle: Handle): Bool

public expect fun commitTransactionAsync(transactionhandle: Handle): Bool

public expect fun compareFileTime(lpfiletime1: ConstPtr<Filetime>, lpfiletime2: ConstPtr<Filetime>): Int

public expect fun copyFile2(pwszexistingfilename: Pcwstr, pwsznewfilename: Pcwstr, pextendedparameters: ConstPtr<Copyfile2ExtendedParameters>): Hresult

public expect fun copyFileA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, bfailifexists: Bool): Bool

public expect fun copyFileExA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, pbcancel: MutPtr<Bool>, dwcopyflags: CopyfileFlags): Bool

public expect fun copyFileExW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, pbcancel: MutPtr<Bool>, dwcopyflags: CopyfileFlags): Bool

public expect fun copyFileFromAppW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, bfailifexists: Bool): Bool

public expect fun copyFileTransactedA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, pbcancel: ConstPtr<Bool>, dwcopyflags: UInt, htransaction: Handle): Bool

public expect fun copyFileTransactedW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, pbcancel: ConstPtr<Bool>, dwcopyflags: UInt, htransaction: Handle): Bool

public expect fun copyFileW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, bfailifexists: Bool): Bool

public expect fun copyLZFile(hfsource: Int, hfdest: Int): Int

public expect fun createDirectoryA(lppathname: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool

public expect fun createDirectoryExA(lptemplatedirectory: Pcstr, lpnewdirectory: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool

public expect fun createDirectoryExW(lptemplatedirectory: Pcwstr, lpnewdirectory: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool

public expect fun createDirectoryFromAppW(lppathname: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool

public expect fun createDirectoryTransactedA(lptemplatedirectory: Pcstr, lpnewdirectory: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, htransaction: Handle): Bool

public expect fun createDirectoryTransactedW(lptemplatedirectory: Pcwstr, lpnewdirectory: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, htransaction: Handle): Bool

public expect fun createDirectoryW(lppathname: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool

public expect fun createEnlistment(lpenlistmentattributes: MutPtr<SecurityAttributes>, resourcemanagerhandle: Handle, transactionhandle: Handle, notificationmask: UInt, createoptions: UInt, enlistmentkey: MutPtr<CVoid>): Handle

public expect fun createFile2(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, dwcreationdisposition: FileCreationDisposition, pcreateexparams: ConstPtr<Createfile2ExtendedParameters>): Handle

public expect fun createFile2FromAppW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, dwcreationdisposition: UInt, pcreateexparams: ConstPtr<Createfile2ExtendedParameters>): Handle

public expect fun createFileA(lpfilename: Pcstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle): Handle

public expect fun createFileFromAppW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: UInt, dwflagsandattributes: UInt, htemplatefile: Handle): Handle

public expect fun createFileTransactedA(lpfilename: Pcstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle, htransaction: Handle, pusminiversion: ConstPtr<TxfsMiniversion>, lpextendedparameter: ConstPtr<CVoid>): Handle

public expect fun createFileTransactedW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle, htransaction: Handle, pusminiversion: ConstPtr<TxfsMiniversion>, lpextendedparameter: ConstPtr<CVoid>): Handle

public expect fun createFileW(lpfilename: Pcwstr, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwcreationdisposition: FileCreationDisposition, dwflagsandattributes: FileFlagsAndAttributes, htemplatefile: Handle): Handle

public expect fun createHardLinkA(lpfilename: Pcstr, lpexistingfilename: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool

public expect fun createHardLinkTransactedA(lpfilename: Pcstr, lpexistingfilename: Pcstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, htransaction: Handle): Bool

public expect fun createHardLinkTransactedW(lpfilename: Pcwstr, lpexistingfilename: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>, htransaction: Handle): Bool

public expect fun createHardLinkW(lpfilename: Pcwstr, lpexistingfilename: Pcwstr, lpsecurityattributes: ConstPtr<SecurityAttributes>): Bool

public expect fun createIoRing(ioringversion: IoringVersion, flags: IoringCreateFlags, submissionqueuesize: UInt, completionqueuesize: UInt, h: MutPtr<Hioring>): Hresult

public expect fun createLogContainerScanContext(hlog: Handle, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: MutPtr<ClsScanContext>, poverlapped: MutPtr<Overlapped>): Bool

public expect fun createLogFile(pszlogfilename: Pcwstr, fdesiredaccess: UInt, dwsharemode: FileShareMode, psalogfile: MutPtr<SecurityAttributes>, fcreatedisposition: FileCreationDisposition, fflagsandattributes: FileFlagsAndAttributes): Handle

public expect fun createLogMarshallingArea(hlog: Handle, pfnallocbuffer: ClfsBlockAllocation, pfnfreebuffer: ClfsBlockDeallocation, pvblockalloccontext: MutPtr<CVoid>, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshal: MutPtr<MutPtr<CVoid>>): Bool

public expect fun createResourceManager(lpresourcemanagerattributes: MutPtr<SecurityAttributes>, resourcemanagerid: MutPtr<Guid>, createoptions: UInt, tmhandle: Handle, description: Pcwstr): Handle

public expect fun createSymbolicLinkA(lpsymlinkfilename: Pcstr, lptargetfilename: Pcstr, dwflags: SymbolicLinkFlags): Boolean

public expect fun createSymbolicLinkTransactedA(lpsymlinkfilename: Pcstr, lptargetfilename: Pcstr, dwflags: SymbolicLinkFlags, htransaction: Handle): Boolean

public expect fun createSymbolicLinkTransactedW(lpsymlinkfilename: Pcwstr, lptargetfilename: Pcwstr, dwflags: SymbolicLinkFlags, htransaction: Handle): Boolean

public expect fun createSymbolicLinkW(lpsymlinkfilename: Pcwstr, lptargetfilename: Pcwstr, dwflags: SymbolicLinkFlags): Boolean

public expect fun createTapePartition(hdevice: Handle, dwpartitionmethod: CreateTapePartitionMethod, dwcount: UInt, dwsize: UInt): UInt

public expect fun createTransaction(lptransactionattributes: MutPtr<SecurityAttributes>, uow: MutPtr<Guid>, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: Pcwstr): Handle

public expect fun createTransactionManager(lptransactionattributes: MutPtr<SecurityAttributes>, logfilename: Pcwstr, createoptions: UInt, commitstrength: UInt): Handle

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

public expect fun deleteLogFile(pszlogfilename: Pcwstr, pvreserved: MutPtr<CVoid>): Bool

public expect fun deleteLogMarshallingArea(pvmarshal: MutPtr<CVoid>): Bool

public expect fun deleteVolumeMountPointA(lpszvolumemountpoint: Pcstr): Bool

public expect fun deleteVolumeMountPointW(lpszvolumemountpoint: Pcwstr): Bool

public expect fun deregisterManageableLogClient(hlog: Handle): Bool

public expect fun duplicateEncryptionInfoFile(srcfilename: Pcwstr, dstfilename: Pcwstr, dwcreationdistribution: UInt, dwattributes: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>): UInt

public expect fun encryptFileA(lpfilename: Pcstr): Bool

public expect fun encryptFileW(lpfilename: Pcwstr): Bool

public expect fun encryptionDisable(dirpath: Pcwstr, disable: Bool): Bool

public expect fun eraseTape(hdevice: Handle, dwerasetype: EraseTapeType, bimmediate: Bool): UInt

public expect fun fileEncryptionStatusA(lpfilename: Pcstr, lpstatus: MutPtr<UInt>): Bool

public expect fun fileEncryptionStatusW(lpfilename: Pcwstr, lpstatus: MutPtr<UInt>): Bool

public expect fun fileTimeToLocalFileTime(lpfiletime: ConstPtr<Filetime>, lplocalfiletime: MutPtr<Filetime>): Bool

public expect fun findClose(hfindfile: Handle): Bool

public expect fun findCloseChangeNotification(hchangehandle: Handle): Bool

public expect fun findFirstChangeNotificationA(lppathname: Pcstr, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange): Handle

public expect fun findFirstChangeNotificationW(lppathname: Pcwstr, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange): Handle

public expect fun findFirstFileA(lpfilename: Pcstr, lpfindfiledata: MutPtr<Win32FindDataa>): Handle

public expect fun findFirstFileExA(lpfilename: Pcstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr<CVoid>, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr<CVoid>, dwadditionalflags: FindFirstExFlags): Handle

public expect fun findFirstFileExFromAppW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr<CVoid>, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr<CVoid>, dwadditionalflags: UInt): Handle

public expect fun findFirstFileExW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr<CVoid>, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr<CVoid>, dwadditionalflags: FindFirstExFlags): Handle

public expect fun findFirstFileNameTransactedW(lpfilename: Pcwstr, dwflags: UInt, stringlength: MutPtr<UInt>, linkname: Pwstr, htransaction: Handle): Handle

public expect fun findFirstFileNameW(lpfilename: Pcwstr, dwflags: UInt, stringlength: MutPtr<UInt>, linkname: Pwstr): Handle

public expect fun findFirstFileTransactedA(lpfilename: Pcstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr<CVoid>, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr<CVoid>, dwadditionalflags: UInt, htransaction: Handle): Handle

public expect fun findFirstFileTransactedW(lpfilename: Pcwstr, finfolevelid: FindexInfoLevels, lpfindfiledata: MutPtr<CVoid>, fsearchop: FindexSearchOps, lpsearchfilter: ConstPtr<CVoid>, dwadditionalflags: UInt, htransaction: Handle): Handle

public expect fun findFirstFileW(lpfilename: Pcwstr, lpfindfiledata: MutPtr<Win32FindDataw>): Handle

public expect fun findFirstStreamTransactedW(lpfilename: Pcwstr, infolevel: StreamInfoLevels, lpfindstreamdata: MutPtr<CVoid>, dwflags: UInt, htransaction: Handle): Handle

public expect fun findFirstStreamW(lpfilename: Pcwstr, infolevel: StreamInfoLevels, lpfindstreamdata: MutPtr<CVoid>, dwflags: UInt): Handle

public expect fun findFirstVolumeA(lpszvolumename: Pstr, cchbufferlength: UInt): Handle

public expect fun findFirstVolumeMountPointA(lpszrootpathname: Pcstr, lpszvolumemountpoint: Pstr, cchbufferlength: UInt): Handle

public expect fun findFirstVolumeMountPointW(lpszrootpathname: Pcwstr, lpszvolumemountpoint: Pwstr, cchbufferlength: UInt): Handle

public expect fun findFirstVolumeW(lpszvolumename: Pwstr, cchbufferlength: UInt): Handle

public expect fun findNextChangeNotification(hchangehandle: Handle): Bool

public expect fun findNextFileA(hfindfile: Handle, lpfindfiledata: MutPtr<Win32FindDataa>): Bool

public expect fun findNextFileNameW(hfindstream: Handle, stringlength: MutPtr<UInt>, linkname: Pwstr): Bool

public expect fun findNextFileW(hfindfile: Handle, lpfindfiledata: MutPtr<Win32FindDataw>): Bool

public expect fun findNextStreamW(hfindstream: Handle, lpfindstreamdata: MutPtr<CVoid>): Bool

public expect fun findNextVolumeA(hfindvolume: Handle, lpszvolumename: Pstr, cchbufferlength: UInt): Bool

public expect fun findNextVolumeMountPointA(hfindvolumemountpoint: Handle, lpszvolumemountpoint: Pstr, cchbufferlength: UInt): Bool

public expect fun findNextVolumeMountPointW(hfindvolumemountpoint: Handle, lpszvolumemountpoint: Pwstr, cchbufferlength: UInt): Bool

public expect fun findNextVolumeW(hfindvolume: Handle, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool

public expect fun findVolumeClose(hfindvolume: Handle): Bool

public expect fun findVolumeMountPointClose(hfindvolumemountpoint: Handle): Bool

public expect fun flushFileBuffers(hfile: Handle): Bool

public expect fun flushLogBuffers(pvmarshal: ConstPtr<CVoid>, poverlapped: MutPtr<Overlapped>): Bool

public expect fun flushLogToLsn(pvmarshalcontext: MutPtr<CVoid>, plsnflush: MutPtr<ClsLsn>, plsnlastflushed: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool

public expect fun freeEncryptedFileMetadata(pbmetadata: ConstPtr<UByte>)

public expect fun freeEncryptionCertificateHashList(pusers: ConstPtr<EncryptionCertificateHashList>)

public expect fun freeReservedLog(pvmarshal: MutPtr<CVoid>, creservedrecords: UInt, pcbadjustment: MutPtr<Long>): Bool

public expect fun getBinaryTypeA(lpapplicationname: Pcstr, lpbinarytype: MutPtr<UInt>): Bool

public expect fun getBinaryTypeW(lpapplicationname: Pcwstr, lpbinarytype: MutPtr<UInt>): Bool

public expect fun getCompressedFileSizeA(lpfilename: Pcstr, lpfilesizehigh: MutPtr<UInt>): UInt

public expect fun getCompressedFileSizeTransactedA(lpfilename: Pcstr, lpfilesizehigh: MutPtr<UInt>, htransaction: Handle): UInt

public expect fun getCompressedFileSizeTransactedW(lpfilename: Pcwstr, lpfilesizehigh: MutPtr<UInt>, htransaction: Handle): UInt

public expect fun getCompressedFileSizeW(lpfilename: Pcwstr, lpfilesizehigh: MutPtr<UInt>): UInt

public expect fun getCurrentClockTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: MutPtr<Long>): Bool

public expect fun getDiskFreeSpaceA(lprootpathname: Pcstr, lpsectorspercluster: MutPtr<UInt>, lpbytespersector: MutPtr<UInt>, lpnumberoffreeclusters: MutPtr<UInt>, lptotalnumberofclusters: MutPtr<UInt>): Bool

public expect fun getDiskFreeSpaceExA(lpdirectoryname: Pcstr, lpfreebytesavailabletocaller: MutPtr<ULong>, lptotalnumberofbytes: MutPtr<ULong>, lptotalnumberoffreebytes: MutPtr<ULong>): Bool

public expect fun getDiskFreeSpaceExW(lpdirectoryname: Pcwstr, lpfreebytesavailabletocaller: MutPtr<ULong>, lptotalnumberofbytes: MutPtr<ULong>, lptotalnumberoffreebytes: MutPtr<ULong>): Bool

public expect fun getDiskFreeSpaceW(lprootpathname: Pcwstr, lpsectorspercluster: MutPtr<UInt>, lpbytespersector: MutPtr<UInt>, lpnumberoffreeclusters: MutPtr<UInt>, lptotalnumberofclusters: MutPtr<UInt>): Bool

public expect fun getDiskSpaceInformationA(rootpath: Pcstr, diskspaceinfo: MutPtr<DiskSpaceInformation>): Hresult

public expect fun getDiskSpaceInformationW(rootpath: Pcwstr, diskspaceinfo: MutPtr<DiskSpaceInformation>): Hresult

public expect fun getDriveTypeA(lprootpathname: Pcstr): UInt

public expect fun getDriveTypeW(lprootpathname: Pcwstr): UInt

public expect fun getEncryptedFileMetadata(lpfilename: Pcwstr, pcbmetadata: MutPtr<UInt>, ppbmetadata: MutPtr<MutPtr<UByte>>): UInt

public expect fun getEnlistmentId(enlistmenthandle: Handle, enlistmentid: MutPtr<Guid>): Bool

public expect fun getEnlistmentRecoveryInformation(enlistmenthandle: Handle, buffersize: UInt, buffer: MutPtr<CVoid>, bufferused: MutPtr<UInt>): Bool

public expect fun getExpandedNameA(lpszsource: Pcstr, lpszbuffer: Pstr): Int

public expect fun getExpandedNameW(lpszsource: Pcwstr, lpszbuffer: Pwstr): Int

public expect fun getFileAttributesA(lpfilename: Pcstr): UInt

public expect fun getFileAttributesExA(lpfilename: Pcstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr<CVoid>): Bool

public expect fun getFileAttributesExFromAppW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr<CVoid>): Bool

public expect fun getFileAttributesExW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr<CVoid>): Bool

public expect fun getFileAttributesTransactedA(lpfilename: Pcstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr<CVoid>, htransaction: Handle): Bool

public expect fun getFileAttributesTransactedW(lpfilename: Pcwstr, finfolevelid: GetFileexInfoLevels, lpfileinformation: MutPtr<CVoid>, htransaction: Handle): Bool

public expect fun getFileAttributesW(lpfilename: Pcwstr): UInt

public expect fun getFileBandwidthReservation(hfile: Handle, lpperiodmilliseconds: MutPtr<UInt>, lpbytesperperiod: MutPtr<UInt>, pdiscardable: MutPtr<Bool>, lptransfersize: MutPtr<UInt>, lpnumoutstandingrequests: MutPtr<UInt>): Bool

public expect fun getFileInformationByHandle(hfile: Handle, lpfileinformation: MutPtr<ByHandleFileInformation>): Bool

public expect fun getFileInformationByHandleEx(hfile: Handle, fileinformationclass: FileInfoByHandleClass, lpfileinformation: MutPtr<CVoid>, dwbuffersize: UInt): Bool

public expect fun getFileSize(hfile: Handle, lpfilesizehigh: MutPtr<UInt>): UInt

public expect fun getFileSizeEx(hfile: Handle, lpfilesize: MutPtr<Long>): Bool

public expect fun getFileTime(hfile: Handle, lpcreationtime: MutPtr<Filetime>, lplastaccesstime: MutPtr<Filetime>, lplastwritetime: MutPtr<Filetime>): Bool

public expect fun getFileType(hfile: Handle): FileType

public expect fun getFileVersionInfoA(lptstrfilename: Pcstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr<CVoid>): Bool

public expect fun getFileVersionInfoExA(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr<CVoid>): Bool

public expect fun getFileVersionInfoExW(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcwstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr<CVoid>): Bool

public expect fun getFileVersionInfoSizeA(lptstrfilename: Pcstr, lpdwhandle: MutPtr<UInt>): UInt

public expect fun getFileVersionInfoSizeExA(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcstr, lpdwhandle: MutPtr<UInt>): UInt

public expect fun getFileVersionInfoSizeExW(dwflags: GetFileVersionInfoFlags, lpwstrfilename: Pcwstr, lpdwhandle: MutPtr<UInt>): UInt

public expect fun getFileVersionInfoSizeW(lptstrfilename: Pcwstr, lpdwhandle: MutPtr<UInt>): UInt

public expect fun getFileVersionInfoW(lptstrfilename: Pcwstr, dwhandle: UInt, dwlen: UInt, lpdata: MutPtr<CVoid>): Bool

public expect fun getFinalPathNameByHandleA(hfile: Handle, lpszfilepath: Pstr, cchfilepath: UInt, dwflags: GetfinalpathnamebyhandleFlags): UInt

public expect fun getFinalPathNameByHandleW(hfile: Handle, lpszfilepath: Pwstr, cchfilepath: UInt, dwflags: GetfinalpathnamebyhandleFlags): UInt

public expect fun getFullPathNameA(lpfilename: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: MutPtr<Pstr>): UInt

public expect fun getFullPathNameTransactedA(lpfilename: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: MutPtr<Pstr>, htransaction: Handle): UInt

public expect fun getFullPathNameTransactedW(lpfilename: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: MutPtr<Pwstr>, htransaction: Handle): UInt

public expect fun getFullPathNameW(lpfilename: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: MutPtr<Pwstr>): UInt

public expect fun getIoRingInfo(ioring: Hioring, info: MutPtr<IoringInfo>): Hresult

public expect fun getLogContainerName(hlog: Handle, cidlogicalcontainer: UInt, pwstrcontainername: Pcwstr, clencontainername: UInt, pcactuallencontainername: MutPtr<UInt>): Bool

public expect fun getLogFileInformation(hlog: Handle, pinfobuffer: MutPtr<ClsInformation>, cbbuffer: MutPtr<UInt>): Bool

public expect fun getLogIoStatistics(hlog: Handle, pvstatsbuffer: MutPtr<CVoid>, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: MutPtr<UInt>): Bool

public expect fun getLogReservationInfo(pvmarshal: ConstPtr<CVoid>, pcbrecordnumber: MutPtr<UInt>, pcbuserreservation: MutPtr<Long>, pcbcommitreservation: MutPtr<Long>): Bool

public expect fun getLogicalDriveStringsA(nbufferlength: UInt, lpbuffer: Pstr): UInt

public expect fun getLogicalDriveStringsW(nbufferlength: UInt, lpbuffer: Pwstr): UInt

public expect fun getLogicalDrives(): UInt

public expect fun getLongPathNameA(lpszshortpath: Pcstr, lpszlongpath: Pstr, cchbuffer: UInt): UInt

public expect fun getLongPathNameTransactedA(lpszshortpath: Pcstr, lpszlongpath: Pstr, cchbuffer: UInt, htransaction: Handle): UInt

public expect fun getLongPathNameTransactedW(lpszshortpath: Pcwstr, lpszlongpath: Pwstr, cchbuffer: UInt, htransaction: Handle): UInt

public expect fun getLongPathNameW(lpszshortpath: Pcwstr, lpszlongpath: Pwstr, cchbuffer: UInt): UInt

public expect fun getNextLogArchiveExtent(pvarchivecontext: MutPtr<CVoid>, rgadextent: MutPtr<ClsArchiveDescriptor>, cdescriptors: UInt, pcdescriptorsreturned: MutPtr<UInt>): Bool

public expect fun getNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: MutPtr<TransactionNotification>, notificationlength: UInt, dwmilliseconds: UInt, returnlength: MutPtr<UInt>): Bool

public expect fun getNotificationResourceManagerAsync(resourcemanagerhandle: Handle, transactionnotification: MutPtr<TransactionNotification>, transactionnotificationlength: UInt, returnlength: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool

public expect fun getShortPathNameA(lpszlongpath: Pcstr, lpszshortpath: Pstr, cchbuffer: UInt): UInt

public expect fun getShortPathNameW(lpszlongpath: Pcwstr, lpszshortpath: Pwstr, cchbuffer: UInt): UInt

public expect fun getTapeParameters(hdevice: Handle, dwoperation: GetTapeDriveParametersOperation, lpdwsize: MutPtr<UInt>, lptapeinformation: MutPtr<CVoid>): UInt

public expect fun getTapePosition(hdevice: Handle, dwpositiontype: TapePositionType, lpdwpartition: MutPtr<UInt>, lpdwoffsetlow: MutPtr<UInt>, lpdwoffsethigh: MutPtr<UInt>): UInt

public expect fun getTapeStatus(hdevice: Handle): UInt

public expect fun getTempFileNameA(lppathname: Pcstr, lpprefixstring: Pcstr, uunique: UInt, lptempfilename: Pstr): UInt

public expect fun getTempFileNameW(lppathname: Pcwstr, lpprefixstring: Pcwstr, uunique: UInt, lptempfilename: Pwstr): UInt

public expect fun getTempPath2A(bufferlength: UInt, buffer: Pstr): UInt

public expect fun getTempPath2W(bufferlength: UInt, buffer: Pwstr): UInt

public expect fun getTempPathA(nbufferlength: UInt, lpbuffer: Pstr): UInt

public expect fun getTempPathW(nbufferlength: UInt, lpbuffer: Pwstr): UInt

public expect fun getTransactionId(transactionhandle: Handle, transactionid: MutPtr<Guid>): Bool

public expect fun getTransactionInformation(transactionhandle: Handle, outcome: MutPtr<UInt>, isolationlevel: MutPtr<UInt>, isolationflags: MutPtr<UInt>, timeout: MutPtr<UInt>, bufferlength: UInt, description: Pwstr): Bool

public expect fun getTransactionManagerId(transactionmanagerhandle: Handle, transactionmanagerid: MutPtr<Guid>): Bool

public expect fun getVolumeInformationA(lprootpathname: Pcstr, lpvolumenamebuffer: Pstr, nvolumenamesize: UInt, lpvolumeserialnumber: MutPtr<UInt>, lpmaximumcomponentlength: MutPtr<UInt>, lpfilesystemflags: MutPtr<UInt>, lpfilesystemnamebuffer: Pstr, nfilesystemnamesize: UInt): Bool

public expect fun getVolumeInformationByHandleW(hfile: Handle, lpvolumenamebuffer: Pwstr, nvolumenamesize: UInt, lpvolumeserialnumber: MutPtr<UInt>, lpmaximumcomponentlength: MutPtr<UInt>, lpfilesystemflags: MutPtr<UInt>, lpfilesystemnamebuffer: Pwstr, nfilesystemnamesize: UInt): Bool

public expect fun getVolumeInformationW(lprootpathname: Pcwstr, lpvolumenamebuffer: Pwstr, nvolumenamesize: UInt, lpvolumeserialnumber: MutPtr<UInt>, lpmaximumcomponentlength: MutPtr<UInt>, lpfilesystemflags: MutPtr<UInt>, lpfilesystemnamebuffer: Pwstr, nfilesystemnamesize: UInt): Bool

public expect fun getVolumeNameForVolumeMountPointA(lpszvolumemountpoint: Pcstr, lpszvolumename: Pstr, cchbufferlength: UInt): Bool

public expect fun getVolumeNameForVolumeMountPointW(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool

public expect fun getVolumePathNameA(lpszfilename: Pcstr, lpszvolumepathname: Pstr, cchbufferlength: UInt): Bool

public expect fun getVolumePathNameW(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, cchbufferlength: UInt): Bool

public expect fun getVolumePathNamesForVolumeNameA(lpszvolumename: Pcstr, lpszvolumepathnames: Pstr, cchbufferlength: UInt, lpcchreturnlength: MutPtr<UInt>): Bool

public expect fun getVolumePathNamesForVolumeNameW(lpszvolumename: Pcwstr, lpszvolumepathnames: Pwstr, cchbufferlength: UInt, lpcchreturnlength: MutPtr<UInt>): Bool

public expect fun handleLogFull(hlog: Handle): Bool

public expect fun installLogPolicy(hlog: Handle, ppolicy: MutPtr<ClfsMgmtPolicy>): Bool

public expect fun isIoRingOpSupported(ioring: Hioring, op: IoringOpCode): Bool

public expect fun lZClose(hfile: Int)

public expect fun lZCopy(hfsource: Int, hfdest: Int): Int

public expect fun lZDone()

public expect fun lZInit(hfsource: Int): Int

public expect fun lZOpenFileA(lpfilename: Pcstr, lpreopenbuf: MutPtr<Ofstruct>, wstyle: LzopenfileStyle): Int

public expect fun lZOpenFileW(lpfilename: Pcwstr, lpreopenbuf: MutPtr<Ofstruct>, wstyle: LzopenfileStyle): Int

public expect fun lZRead(hfile: Int, lpbuffer: Pstr, cbread: Int): Int

public expect fun lZSeek(hfile: Int, loffset: Int, iorigin: Int): Int

public expect fun lZStart(): Int

public expect fun localFileTimeToFileTime(lplocalfiletime: ConstPtr<Filetime>, lpfiletime: MutPtr<Filetime>): Bool

public expect fun lockFile(hfile: Handle, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt): Bool

public expect fun lockFileEx(hfile: Handle, dwflags: LockFileFlags, dwreserved: UInt, nnumberofbytestolocklow: UInt, nnumberofbytestolockhigh: UInt, lpoverlapped: MutPtr<Overlapped>): Bool

public expect fun logTailAdvanceFailure(hlog: Handle, dwreason: UInt): Bool

public expect fun lsnBlockOffset(plsn: ConstPtr<ClsLsn>): UInt

public expect fun lsnContainer(plsn: ConstPtr<ClsLsn>): UInt

public expect fun lsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn

public expect fun lsnEqual(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean

public expect fun lsnGreater(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean

public expect fun lsnIncrement(plsn: ConstPtr<ClsLsn>): ClsLsn

public expect fun lsnInvalid(plsn: ConstPtr<ClsLsn>): Boolean

public expect fun lsnLess(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean

public expect fun lsnNull(plsn: ConstPtr<ClsLsn>): Boolean

public expect fun lsnRecordSequence(plsn: ConstPtr<ClsLsn>): UInt

public expect fun moveFileA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr): Bool

public expect fun moveFileExA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, dwflags: MoveFileFlags): Bool

public expect fun moveFileExW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, dwflags: MoveFileFlags): Bool

public expect fun moveFileFromAppW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr): Bool

public expect fun moveFileTransactedA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, dwflags: MoveFileFlags, htransaction: Handle): Bool

public expect fun moveFileTransactedW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, dwflags: MoveFileFlags, htransaction: Handle): Bool

public expect fun moveFileW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr): Bool

public expect fun moveFileWithProgressA(lpexistingfilename: Pcstr, lpnewfilename: Pcstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, dwflags: MoveFileFlags): Bool

public expect fun moveFileWithProgressW(lpexistingfilename: Pcwstr, lpnewfilename: Pcwstr, lpprogressroutine: LpprogressRoutine, lpdata: ConstPtr<CVoid>, dwflags: MoveFileFlags): Bool

public expect fun netConnectionEnum(servername: Pcwstr, qualifier: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt

public expect fun netFileClose(servername: Pcwstr, fileid: UInt): UInt

public expect fun netFileEnum(servername: Pcwstr, basepath: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<ULong>): UInt

public expect fun netFileGetInfo(servername: Pcwstr, fileid: UInt, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt

public expect fun netServerAliasAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>): UInt

public expect fun netServerAliasDel(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>): UInt

public expect fun netServerAliasEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumehandle: MutPtr<UInt>): UInt

public expect fun netSessionDel(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr): UInt

public expect fun netSessionEnum(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt

public expect fun netSessionGetInfo(servername: Pcwstr, uncclientname: Pcwstr, username: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt

public expect fun netShareAdd(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt

public expect fun netShareCheck(servername: Pcwstr, device: Pcwstr, type: MutPtr<UInt>): UInt

public expect fun netShareDel(servername: Pcwstr, netname: Pcwstr, reserved: UInt): UInt

public expect fun netShareDelEx(servername: Pcwstr, level: UInt, buf: ConstPtr<UByte>): UInt

public expect fun netShareDelSticky(servername: Pcwstr, netname: Pcwstr, reserved: UInt): UInt

public expect fun netShareEnum(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt

public expect fun netShareEnumSticky(servername: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>, prefmaxlen: UInt, entriesread: MutPtr<UInt>, totalentries: MutPtr<UInt>, resumeHandle: MutPtr<UInt>): UInt

public expect fun netShareGetInfo(servername: Pcwstr, netname: Pcwstr, level: UInt, bufptr: MutPtr<MutPtr<UByte>>): UInt

public expect fun netShareSetInfo(servername: Pcwstr, netname: Pcwstr, level: UInt, buf: ConstPtr<UByte>, parmErr: MutPtr<UInt>): UInt

public expect fun netStatisticsGet(servername: ConstPtr<Byte>, service: ConstPtr<Byte>, level: UInt, options: UInt, buffer: MutPtr<MutPtr<UByte>>): UInt

public expect fun openEncryptedFileRawA(lpfilename: Pcstr, ulflags: UInt, pvcontext: MutPtr<MutPtr<CVoid>>): UInt

public expect fun openEncryptedFileRawW(lpfilename: Pcwstr, ulflags: UInt, pvcontext: MutPtr<MutPtr<CVoid>>): UInt

public expect fun openEnlistment(dwdesiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentid: MutPtr<Guid>): Handle

public expect fun openFile(lpfilename: Pcstr, lpreopenbuff: MutPtr<Ofstruct>, ustyle: UInt): Int

public expect fun openFileById(hvolumehint: Handle, lpfileid: ConstPtr<FileIdDescriptor>, dwdesiredaccess: UInt, dwsharemode: FileShareMode, lpsecurityattributes: ConstPtr<SecurityAttributes>, dwflagsandattributes: FileFlagsAndAttributes): Handle

public expect fun openResourceManager(dwdesiredaccess: UInt, tmhandle: Handle, resourcemanagerid: MutPtr<Guid>): Handle

public expect fun openTransaction(dwdesiredaccess: UInt, transactionid: MutPtr<Guid>): Handle

public expect fun openTransactionManager(logfilename: Pcwstr, desiredaccess: UInt, openoptions: UInt): Handle

public expect fun openTransactionManagerById(transactionmanagerid: ConstPtr<Guid>, desiredaccess: UInt, openoptions: UInt): Handle

public expect fun popIoRingCompletion(ioring: Hioring, cqe: MutPtr<IoringCqe>): Hresult

public expect fun prePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool

public expect fun prePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool

public expect fun prepareComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool

public expect fun prepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool

public expect fun prepareLogArchive(hlog: Handle, pszbaselogfilename: Pwstr, clen: UInt, plsnlow: ConstPtr<ClsLsn>, plsnhigh: ConstPtr<ClsLsn>, pcactuallength: MutPtr<UInt>, poffbaselogfiledata: MutPtr<ULong>, pcbbaselogfilelength: MutPtr<ULong>, plsnbase: MutPtr<ClsLsn>, plsnlast: MutPtr<ClsLsn>, plsncurrentarchivetail: MutPtr<ClsLsn>, ppvarchivecontext: MutPtr<MutPtr<CVoid>>): Bool

public expect fun prepareTape(hdevice: Handle, dwoperation: PrepareTapeOperation, bimmediate: Bool): UInt

public expect fun queryDosDeviceA(lpdevicename: Pcstr, lptargetpath: Pstr, ucchmax: UInt): UInt

public expect fun queryDosDeviceW(lpdevicename: Pcwstr, lptargetpath: Pwstr, ucchmax: UInt): UInt

public expect fun queryIoRingCapabilities(capabilities: MutPtr<IoringCapabilities>): Hresult

public expect fun queryLogPolicy(hlog: Handle, epolicytype: ClfsMgmtPolicyType, ppolicybuffer: MutPtr<ClfsMgmtPolicy>, pcbpolicybuffer: MutPtr<UInt>): Bool

public expect fun queryRecoveryAgentsOnEncryptedFile(lpfilename: Pcwstr, precoveryagents: MutPtr<MutPtr<EncryptionCertificateHashList>>): UInt

public expect fun queryUsersOnEncryptedFile(lpfilename: Pcwstr, pusers: MutPtr<MutPtr<EncryptionCertificateHashList>>): UInt

public expect fun reOpenFile(horiginalfile: Handle, dwdesiredaccess: UInt, dwsharemode: FileShareMode, dwflagsandattributes: FileFlagsAndAttributes): Handle

public expect fun readDirectoryChangesExW(hdirectory: Handle, lpbuffer: MutPtr<CVoid>, nbufferlength: UInt, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange, lpbytesreturned: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpoverlappedCompletionRoutine, readdirectorynotifyinformationclass: ReadDirectoryNotifyInformationClass): Bool

public expect fun readDirectoryChangesW(hdirectory: Handle, lpbuffer: MutPtr<CVoid>, nbufferlength: UInt, bwatchsubtree: Bool, dwnotifyfilter: FileNotifyChange, lpbytesreturned: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool

public expect fun readEncryptedFileRaw(pfexportcallback: PfeExportFunc, pvcallbackcontext: ConstPtr<CVoid>, pvcontext: ConstPtr<CVoid>): UInt

public expect fun readFile(hfile: Handle, lpbuffer: MutPtr<UByte>, nnumberofbytestoread: UInt, lpnumberofbytesread: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool

public expect fun readFileEx(hfile: Handle, lpbuffer: MutPtr<UByte>, nnumberofbytestoread: UInt, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool

public expect fun readFileScatter(hfile: Handle, asegmentarray: ConstPtr<FileSegmentElement>, nnumberofbytestoread: UInt, lpreserved: ConstPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool

public expect fun readLogArchiveMetadata(pvarchivecontext: MutPtr<CVoid>, cboffset: UInt, cbbytestoread: UInt, pbreadbuffer: MutPtr<UByte>, pcbbytesread: MutPtr<UInt>): Bool

public expect fun readLogNotification(hlog: Handle, pnotification: MutPtr<ClfsMgmtNotification>, lpoverlapped: MutPtr<Overlapped>): Bool

public expect fun readLogRecord(pvmarshal: MutPtr<CVoid>, plsnfirst: MutPtr<ClsLsn>, econtextmode: ClfsContextMode, ppvreadbuffer: MutPtr<MutPtr<CVoid>>, pcbreadbuffer: MutPtr<UInt>, perecordtype: MutPtr<UByte>, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, ppvreadcontext: MutPtr<MutPtr<CVoid>>, poverlapped: MutPtr<Overlapped>): Bool

public expect fun readLogRestartArea(pvmarshal: MutPtr<CVoid>, ppvrestartbuffer: MutPtr<MutPtr<CVoid>>, pcbrestartbuffer: MutPtr<UInt>, plsn: MutPtr<ClsLsn>, ppvcontext: MutPtr<MutPtr<CVoid>>, poverlapped: MutPtr<Overlapped>): Bool

public expect fun readNextLogRecord(pvreadcontext: MutPtr<CVoid>, ppvbuffer: MutPtr<MutPtr<CVoid>>, pcbbuffer: MutPtr<UInt>, perecordtype: MutPtr<UByte>, plsnuser: MutPtr<ClsLsn>, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, plsnrecord: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool

public expect fun readOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool

public expect fun readPreviousLogRestartArea(pvreadcontext: MutPtr<CVoid>, ppvrestartbuffer: MutPtr<MutPtr<CVoid>>, pcbrestartbuffer: MutPtr<UInt>, plsnrestart: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool

public expect fun recoverEnlistment(enlistmenthandle: Handle, enlistmentkey: MutPtr<CVoid>): Bool

public expect fun recoverResourceManager(resourcemanagerhandle: Handle): Bool

public expect fun recoverTransactionManager(transactionmanagerhandle: Handle): Bool

public expect fun registerForLogWriteNotification(hlog: Handle, cbthreshold: UInt, fenable: Bool): Bool

public expect fun registerManageableLogClient(hlog: Handle, pcallbacks: MutPtr<LogManagementCallbacks>): Bool

public expect fun removeDirectoryA(lppathname: Pcstr): Bool

public expect fun removeDirectoryFromAppW(lppathname: Pcwstr): Bool

public expect fun removeDirectoryTransactedA(lppathname: Pcstr, htransaction: Handle): Bool

public expect fun removeDirectoryTransactedW(lppathname: Pcwstr, htransaction: Handle): Bool

public expect fun removeDirectoryW(lppathname: Pcwstr): Bool

public expect fun removeLogContainer(hlog: Handle, pwszcontainerpath: Pcwstr, fforce: Bool, preserved: MutPtr<CVoid>): Bool

public expect fun removeLogContainerSet(hlog: Handle, ccontainer: UShort, rgwszcontainerpath: ConstPtr<Pcwstr>, fforce: Bool, preserved: MutPtr<CVoid>): Bool

public expect fun removeLogPolicy(hlog: Handle, epolicytype: ClfsMgmtPolicyType): Bool

public expect fun removeUsersFromEncryptedFile(lpfilename: Pcwstr, phashes: ConstPtr<EncryptionCertificateHashList>): UInt

public expect fun renameTransactionManager(logfilename: Pcwstr, existingtransactionmanagerguid: MutPtr<Guid>): Bool

public expect fun replaceFileA(lpreplacedfilename: Pcstr, lpreplacementfilename: Pcstr, lpbackupfilename: Pcstr, dwreplaceflags: ReplaceFileFlags, lpexclude: ConstPtr<CVoid>, lpreserved: ConstPtr<CVoid>): Bool

public expect fun replaceFileFromAppW(lpreplacedfilename: Pcwstr, lpreplacementfilename: Pcwstr, lpbackupfilename: Pcwstr, dwreplaceflags: UInt, lpexclude: ConstPtr<CVoid>, lpreserved: ConstPtr<CVoid>): Bool

public expect fun replaceFileW(lpreplacedfilename: Pcwstr, lpreplacementfilename: Pcwstr, lpbackupfilename: Pcwstr, dwreplaceflags: ReplaceFileFlags, lpexclude: ConstPtr<CVoid>, lpreserved: ConstPtr<CVoid>): Bool

public expect fun reserveAndAppendLog(pvmarshal: MutPtr<CVoid>, rgwriteentries: MutPtr<ClsWriteEntry>, cwriteentries: UInt, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, creserverecords: UInt, rgcbreservation: MutPtr<Long>, fflags: ClfsFlag, plsn: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool

public expect fun reserveAndAppendLogAligned(pvmarshal: MutPtr<CVoid>, rgwriteentries: MutPtr<ClsWriteEntry>, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, creserverecords: UInt, rgcbreservation: MutPtr<Long>, fflags: ClfsFlag, plsn: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool

public expect fun rollbackComplete(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool

public expect fun rollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool

public expect fun rollbackTransaction(transactionhandle: Handle): Bool

public expect fun rollbackTransactionAsync(transactionhandle: Handle): Bool

public expect fun rollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: MutPtr<Long>): Bool

public expect fun scanLogContainers(pcxscan: MutPtr<ClsScanContext>, escanmode: UByte, preserved: MutPtr<CVoid>): Bool

public expect fun searchPathA(lppath: Pcstr, lpfilename: Pcstr, lpextension: Pcstr, nbufferlength: UInt, lpbuffer: Pstr, lpfilepart: MutPtr<Pstr>): UInt

public expect fun searchPathW(lppath: Pcwstr, lpfilename: Pcwstr, lpextension: Pcwstr, nbufferlength: UInt, lpbuffer: Pwstr, lpfilepart: MutPtr<Pwstr>): UInt

public expect fun setEncryptedFileMetadata(lpfilename: Pcwstr, pboldmetadata: ConstPtr<UByte>, pbnewmetadata: ConstPtr<UByte>, pownerhash: ConstPtr<EncryptionCertificateHash>, dwoperation: UInt, pcertificatesadded: ConstPtr<EncryptionCertificateHashList>): UInt

public expect fun setEndOfFile(hfile: Handle): Bool

public expect fun setEndOfLog(hlog: Handle, plsnend: MutPtr<ClsLsn>, lpoverlapped: MutPtr<Overlapped>): Bool

public expect fun setEnlistmentRecoveryInformation(enlistmenthandle: Handle, buffersize: UInt, buffer: MutPtr<CVoid>): Bool

public expect fun setFileApisToANSI()

public expect fun setFileApisToOEM()

public expect fun setFileAttributesA(lpfilename: Pcstr, dwfileattributes: FileFlagsAndAttributes): Bool

public expect fun setFileAttributesFromAppW(lpfilename: Pcwstr, dwfileattributes: UInt): Bool

public expect fun setFileAttributesTransactedA(lpfilename: Pcstr, dwfileattributes: UInt, htransaction: Handle): Bool

public expect fun setFileAttributesTransactedW(lpfilename: Pcwstr, dwfileattributes: UInt, htransaction: Handle): Bool

public expect fun setFileAttributesW(lpfilename: Pcwstr, dwfileattributes: FileFlagsAndAttributes): Bool

public expect fun setFileBandwidthReservation(hfile: Handle, nperiodmilliseconds: UInt, nbytesperperiod: UInt, bdiscardable: Bool, lptransfersize: MutPtr<UInt>, lpnumoutstandingrequests: MutPtr<UInt>): Bool

public expect fun setFileCompletionNotificationModes(filehandle: Handle, flags: UByte): Bool

public expect fun setFileInformationByHandle(hfile: Handle, fileinformationclass: FileInfoByHandleClass, lpfileinformation: ConstPtr<CVoid>, dwbuffersize: UInt): Bool

public expect fun setFileIoOverlappedRange(filehandle: Handle, overlappedrangestart: ConstPtr<UByte>, length: UInt): Bool

public expect fun setFilePointer(hfile: Handle, ldistancetomove: Int, lpdistancetomovehigh: MutPtr<Int>, dwmovemethod: SetFilePointerMoveMethod): UInt

public expect fun setFilePointerEx(hfile: Handle, lidistancetomove: Long, lpnewfilepointer: MutPtr<Long>, dwmovemethod: SetFilePointerMoveMethod): Bool

public expect fun setFileShortNameA(hfile: Handle, lpshortname: Pcstr): Bool

public expect fun setFileShortNameW(hfile: Handle, lpshortname: Pcwstr): Bool

public expect fun setFileTime(hfile: Handle, lpcreationtime: ConstPtr<Filetime>, lplastaccesstime: ConstPtr<Filetime>, lplastwritetime: ConstPtr<Filetime>): Bool

public expect fun setFileValidData(hfile: Handle, validdatalength: Long): Bool

public expect fun setIoRingCompletionEvent(ioring: Hioring, hevent: Handle): Hresult

public expect fun setLogArchiveMode(hlog: Handle, emode: ClfsLogArchiveMode): Bool

public expect fun setLogArchiveTail(hlog: Handle, plsnarchivetail: MutPtr<ClsLsn>, preserved: MutPtr<CVoid>): Bool

public expect fun setLogFileSizeWithPolicy(hlog: Handle, pdesiredsize: ConstPtr<ULong>, presultingsize: MutPtr<ULong>): Bool

public expect fun setResourceManagerCompletionPort(resourcemanagerhandle: Handle, iocompletionporthandle: Handle, completionkey: ULong): Bool

public expect fun setSearchPathMode(flags: UInt): Bool

public expect fun setTapeParameters(hdevice: Handle, dwoperation: TapeInformationType, lptapeinformation: ConstPtr<CVoid>): UInt

public expect fun setTapePosition(hdevice: Handle, dwpositionmethod: TapePositionMethod, dwpartition: UInt, dwoffsetlow: UInt, dwoffsethigh: UInt, bimmediate: Bool): UInt

public expect fun setTransactionInformation(transactionhandle: Handle, isolationlevel: UInt, isolationflags: UInt, timeout: UInt, description: Pcwstr): Bool

public expect fun setUserFileEncryptionKey(pencryptioncertificate: ConstPtr<EncryptionCertificate>): UInt

public expect fun setUserFileEncryptionKeyEx(pencryptioncertificate: ConstPtr<EncryptionCertificate>, dwcapabilities: UInt, dwflags: UInt, pvreserved: ConstPtr<CVoid>): UInt

public expect fun setVolumeLabelA(lprootpathname: Pcstr, lpvolumename: Pcstr): Bool

public expect fun setVolumeLabelW(lprootpathname: Pcwstr, lpvolumename: Pcwstr): Bool

public expect fun setVolumeMountPointA(lpszvolumemountpoint: Pcstr, lpszvolumename: Pcstr): Bool

public expect fun setVolumeMountPointW(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pcwstr): Bool

public expect fun singlePhaseReject(enlistmenthandle: Handle, tmvirtualclock: MutPtr<Long>): Bool

public expect fun submitIoRing(ioring: Hioring, waitoperations: UInt, milliseconds: UInt, submittedentries: MutPtr<UInt>): Hresult

public expect fun terminateLogArchive(pvarchivecontext: MutPtr<CVoid>): Bool

public expect fun terminateReadLog(pvcursorcontext: MutPtr<CVoid>): Bool

public expect fun truncateLog(pvmarshal: ConstPtr<CVoid>, plsnend: ConstPtr<ClsLsn>, lpoverlapped: MutPtr<Overlapped>): Bool

public expect fun txfGetThreadMiniVersionForCreate(miniversion: MutPtr<UShort>)

public expect fun txfLogCreateFileReadContext(logpath: Pcwstr, beginninglsn: ClsLsn, endinglsn: ClsLsn, txffileid: ConstPtr<TxfId>, txflogcontext: MutPtr<MutPtr<CVoid>>): Bool

public expect fun txfLogCreateRangeReadContext(logpath: Pcwstr, beginninglsn: ClsLsn, endinglsn: ClsLsn, beginningvirtualclock: ConstPtr<Long>, endingvirtualclock: ConstPtr<Long>, recordtypemask: UInt, txflogcontext: MutPtr<MutPtr<CVoid>>): Bool

public expect fun txfLogDestroyReadContext(txflogcontext: ConstPtr<CVoid>): Bool

public expect fun txfLogReadRecords(txflogcontext: ConstPtr<CVoid>, bufferlength: UInt, buffer: MutPtr<CVoid>, bytesused: MutPtr<UInt>, recordcount: MutPtr<UInt>): Bool

public expect fun txfLogRecordGetFileName(recordbuffer: ConstPtr<CVoid>, recordbufferlengthinbytes: UInt, namebuffer: Pwstr, namebufferlengthinbytes: MutPtr<UInt>, txfid: MutPtr<TxfId>): Bool

public expect fun txfLogRecordGetGenericType(recordbuffer: ConstPtr<CVoid>, recordbufferlengthinbytes: UInt, generictype: MutPtr<UInt>, virtualclock: MutPtr<Long>): Bool

public expect fun txfReadMetadataInfo(filehandle: Handle, txffileid: MutPtr<TxfId>, lastlsn: MutPtr<ClsLsn>, transactionstate: MutPtr<UInt>, lockingtransaction: MutPtr<Guid>): Bool

public expect fun txfSetThreadMiniVersionForCreate(miniversion: UShort)

public expect fun unlockFile(hfile: Handle, dwfileoffsetlow: UInt, dwfileoffsethigh: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt): Bool

public expect fun unlockFileEx(hfile: Handle, dwreserved: UInt, nnumberofbytestounlocklow: UInt, nnumberofbytestounlockhigh: UInt, lpoverlapped: MutPtr<Overlapped>): Bool

public expect fun validateLog(pszlogfilename: Pcwstr, psalogfile: MutPtr<SecurityAttributes>, pinfobuffer: MutPtr<ClsInformation>, pcbbuffer: MutPtr<UInt>): Bool

public expect fun verFindFileA(uflags: VerFindFileFlags, szfilename: Pcstr, szwindir: Pcstr, szappdir: Pcstr, szcurdir: Pstr, pucurdirlen: MutPtr<UInt>, szdestdir: Pstr, pudestdirlen: MutPtr<UInt>): VerFindFileStatus

public expect fun verFindFileW(uflags: VerFindFileFlags, szfilename: Pcwstr, szwindir: Pcwstr, szappdir: Pcwstr, szcurdir: Pwstr, pucurdirlen: MutPtr<UInt>, szdestdir: Pwstr, pudestdirlen: MutPtr<UInt>): VerFindFileStatus

public expect fun verInstallFileA(uflags: VerInstallFileFlags, szsrcfilename: Pcstr, szdestfilename: Pcstr, szsrcdir: Pcstr, szdestdir: Pcstr, szcurdir: Pcstr, sztmpfile: Pstr, putmpfilelen: MutPtr<UInt>): VerInstallFileStatus

public expect fun verInstallFileW(uflags: VerInstallFileFlags, szsrcfilename: Pcwstr, szdestfilename: Pcwstr, szsrcdir: Pcwstr, szdestdir: Pcwstr, szcurdir: Pcwstr, sztmpfile: Pwstr, putmpfilelen: MutPtr<UInt>): VerInstallFileStatus

public expect fun verLanguageNameA(wlang: UInt, szlang: Pstr, cchlang: UInt): UInt

public expect fun verLanguageNameW(wlang: UInt, szlang: Pwstr, cchlang: UInt): UInt

public expect fun verQueryValueA(pblock: ConstPtr<CVoid>, lpsubblock: Pcstr, lplpbuffer: MutPtr<MutPtr<CVoid>>, pulen: MutPtr<UInt>): Bool

public expect fun verQueryValueW(pblock: ConstPtr<CVoid>, lpsubblock: Pcwstr, lplpbuffer: MutPtr<MutPtr<CVoid>>, pulen: MutPtr<UInt>): Bool

public expect fun wofEnumEntries(volumename: Pcwstr, provider: UInt, enumproc: WofEnumEntryProc, userdata: ConstPtr<CVoid>): Hresult

public expect fun wofFileEnumFiles(volumename: Pcwstr, algorithm: UInt, enumproc: WofEnumFilesProc, userdata: ConstPtr<CVoid>): Hresult

public expect fun wofGetDriverVersion(fileorvolumehandle: Handle, provider: UInt, wofversion: MutPtr<UInt>): Hresult

public expect fun wofIsExternalFile(filepath: Pcwstr, isexternalfile: MutPtr<Bool>, provider: MutPtr<UInt>, externalfileinfo: MutPtr<CVoid>, bufferlength: MutPtr<UInt>): Hresult

public expect fun wofSetFileDataLocation(filehandle: Handle, provider: UInt, externalfileinfo: ConstPtr<CVoid>, length: UInt): Hresult

public expect fun wofShouldCompressBinaries(volume: Pcwstr, algorithm: MutPtr<UInt>): Bool

public expect fun wofWimAddEntry(volumename: Pcwstr, wimpath: Pcwstr, wimtype: UInt, wimindex: UInt, datasourceid: MutPtr<Long>): Hresult

public expect fun wofWimEnumFiles(volumename: Pcwstr, datasourceid: Long, enumproc: WofEnumFilesProc, userdata: ConstPtr<CVoid>): Hresult

public expect fun wofWimRemoveEntry(volumename: Pcwstr, datasourceid: Long): Hresult

public expect fun wofWimSuspendEntry(volumename: Pcwstr, datasourceid: Long): Hresult

public expect fun wofWimUpdateEntry(volumename: Pcwstr, datasourceid: Long, newwimpath: Pcwstr): Hresult

public expect fun wow64DisableWow64FsRedirection(oldvalue: MutPtr<MutPtr<CVoid>>): Bool

public expect fun wow64EnableWow64FsRedirection(wow64fsenableredirection: Boolean): Boolean

public expect fun wow64RevertWow64FsRedirection(olvalue: ConstPtr<CVoid>): Bool

public expect fun writeEncryptedFileRaw(pfimportcallback: PfeImportFunc, pvcallbackcontext: ConstPtr<CVoid>, pvcontext: ConstPtr<CVoid>): UInt

public expect fun writeFile(hfile: Handle, lpbuffer: ConstPtr<UByte>, nnumberofbytestowrite: UInt, lpnumberofbyteswritten: MutPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool

public expect fun writeFileEx(hfile: Handle, lpbuffer: ConstPtr<UByte>, nnumberofbytestowrite: UInt, lpoverlapped: MutPtr<Overlapped>, lpcompletionroutine: LpoverlappedCompletionRoutine): Bool

public expect fun writeFileGather(hfile: Handle, asegmentarray: ConstPtr<FileSegmentElement>, nnumberofbytestowrite: UInt, lpreserved: ConstPtr<UInt>, lpoverlapped: MutPtr<Overlapped>): Bool

public expect fun writeLogRestartArea(pvmarshal: MutPtr<CVoid>, pvrestartbuffer: MutPtr<CVoid>, cbrestartbuffer: UInt, plsnbase: MutPtr<ClsLsn>, fflags: ClfsFlag, pcbwritten: MutPtr<UInt>, plsnnext: MutPtr<ClsLsn>, poverlapped: MutPtr<Overlapped>): Bool

public expect fun writeTapemark(hdevice: Handle, dwtapemarktype: TapemarkType, dwtapemarkcount: UInt, bimmediate: Bool): UInt
