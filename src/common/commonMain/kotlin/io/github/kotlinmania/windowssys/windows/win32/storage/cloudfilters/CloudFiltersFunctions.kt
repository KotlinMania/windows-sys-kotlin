package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileInfoByHandleClass
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.Win32FindDataa
import io.github.kotlinmania.windowssys.windows.win32.system.CorrelationVector
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped

public expect fun cfCloseHandle(filehandle: Handle)

public expect fun cfConnectSyncRoot(syncrootpath: Pcwstr, callbacktable: ConstPtr<CfCallbackRegistration>, callbackcontext: ConstPtr<CVoid>, connectflags: CfConnectFlags, connectionkey: MutPtr<CfConnectionKey>): Hresult

public expect fun cfConvertToPlaceholder(filehandle: Handle, fileidentity: ConstPtr<CVoid>, fileidentitylength: UInt, convertflags: CfConvertFlags, convertusn: MutPtr<Long>, overlapped: MutPtr<Overlapped>): Hresult

public expect fun cfCreatePlaceholders(basedirectorypath: Pcwstr, placeholderarray: MutPtr<CfPlaceholderCreateInfo>, placeholdercount: UInt, createflags: CfCreateFlags, entriesprocessed: MutPtr<UInt>): Hresult

public expect fun cfDehydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, dehydrateflags: CfDehydrateFlags, overlapped: MutPtr<Overlapped>): Hresult

public expect fun cfDisconnectSyncRoot(connectionkey: CfConnectionKey): Hresult

public expect fun cfExecute(opinfo: ConstPtr<CfOperationInfo>, opparams: MutPtr<CfOperationParameters>): Hresult

public expect fun cfGetCorrelationVector(filehandle: Handle, correlationvector: MutPtr<CorrelationVector.CorrelationVector>): Hresult

public expect fun cfGetPlaceholderInfo(filehandle: Handle, infoclass: CfPlaceholderInfoClass, infobuffer: MutPtr<CVoid>, infobufferlength: UInt, returnedlength: MutPtr<UInt>): Hresult

public expect fun cfGetPlaceholderRangeInfo(filehandle: Handle, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, length: Long, infobuffer: MutPtr<CVoid>, infobufferlength: UInt, returnedlength: MutPtr<UInt>): Hresult

public expect fun cfGetPlaceholderRangeInfoForHydration(connectionkey: CfConnectionKey, transferkey: Long, fileid: Long, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, rangelength: Long, infobuffer: MutPtr<CVoid>, infobuffersize: UInt, infobufferwritten: MutPtr<UInt>): Hresult

public expect fun cfGetPlaceholderStateFromAttributeTag(fileattributes: UInt, reparsetag: UInt): CfPlaceholderState

public expect fun cfGetPlaceholderStateFromFileInfo(infobuffer: ConstPtr<CVoid>, infoclass: FileInfoByHandleClass): CfPlaceholderState

public expect fun cfGetPlaceholderStateFromFindData(finddata: ConstPtr<Win32FindDataa>): CfPlaceholderState

public expect fun cfGetPlatformInfo(platformversion: MutPtr<CfPlatformInfo>): Hresult

public expect fun cfGetSyncRootInfoByHandle(filehandle: Handle, infoclass: CfSyncRootInfoClass, infobuffer: MutPtr<CVoid>, infobufferlength: UInt, returnedlength: MutPtr<UInt>): Hresult

public expect fun cfGetSyncRootInfoByPath(filepath: Pcwstr, infoclass: CfSyncRootInfoClass, infobuffer: MutPtr<CVoid>, infobufferlength: UInt, returnedlength: MutPtr<UInt>): Hresult

public expect fun cfGetTransferKey(filehandle: Handle, transferkey: MutPtr<Long>): Hresult

public expect fun cfGetWin32HandleFromProtectedHandle(protectedhandle: Handle): Handle

public expect fun cfHydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, hydrateflags: CfHydrateFlags, overlapped: MutPtr<Overlapped>): Hresult

public expect fun cfOpenFileWithOplock(filepath: Pcwstr, flags: CfOpenFileFlags, protectedhandle: MutPtr<Handle>): Hresult

public expect fun cfQuerySyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: MutPtr<CfSyncProviderStatus>): Hresult

public expect fun cfReferenceProtectedHandle(protectedhandle: Handle): Boolean

public expect fun cfRegisterSyncRoot(syncrootpath: Pcwstr, registration: ConstPtr<CfSyncRegistration>, policies: ConstPtr<CfSyncPolicies>, registerflags: CfRegisterFlags): Hresult

public expect fun cfReleaseProtectedHandle(protectedhandle: Handle)

public expect fun cfReleaseTransferKey(filehandle: Handle, transferkey: ConstPtr<Long>)

public expect fun cfReportProviderProgress(connectionkey: CfConnectionKey, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): Hresult

public expect fun cfReportProviderProgress2(connectionkey: CfConnectionKey, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: UInt): Hresult

public expect fun cfReportSyncStatus(syncrootpath: Pcwstr, syncstatus: ConstPtr<CfSyncStatus>): Hresult

public expect fun cfRevertPlaceholder(filehandle: Handle, revertflags: CfRevertFlags, overlapped: MutPtr<Overlapped>): Hresult

public expect fun cfSetCorrelationVector(filehandle: Handle, correlationvector: ConstPtr<CorrelationVector.CorrelationVector>): Hresult

public expect fun cfSetInSyncState(filehandle: Handle, insyncstate: CfInSyncState, insyncflags: CfSetInSyncFlags, insyncusn: MutPtr<Long>): Hresult

public expect fun cfSetPinState(filehandle: Handle, pinstate: CfPinState, pinflags: CfSetPinFlags, overlapped: MutPtr<Overlapped>): Hresult

public expect fun cfUnregisterSyncRoot(syncrootpath: Pcwstr): Hresult

public expect fun cfUpdatePlaceholder(filehandle: Handle, fsmetadata: ConstPtr<CfFsMetadata>, fileidentity: ConstPtr<CVoid>, fileidentitylength: UInt, dehydraterangearray: ConstPtr<CfFileRange>, dehydraterangecount: UInt, updateflags: CfUpdateFlags, updateusn: MutPtr<Long>, overlapped: MutPtr<Overlapped>): Hresult

public expect fun cfUpdateSyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: CfSyncProviderStatus): Hresult
