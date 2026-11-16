package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileInfoByHandleClass

public expect fun cfCloseHandle(filehandle: Handle)

public expect fun cfConnectSyncRoot(syncrootpath: Pcwstr, callbacktable: ConstPtr, callbackcontext: ConstPtr, connectflags: CfConnectFlags, connectionkey: MutPtr): Hresult

public expect fun cfConvertToPlaceholder(filehandle: Handle, fileidentity: ConstPtr, fileidentitylength: UInt, convertflags: CfConvertFlags, convertusn: MutPtr, overlapped: MutPtr): Hresult

public expect fun cfCreatePlaceholders(basedirectorypath: Pcwstr, placeholderarray: MutPtr, placeholdercount: UInt, createflags: CfCreateFlags, entriesprocessed: MutPtr): Hresult

public expect fun cfDehydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, dehydrateflags: CfDehydrateFlags, overlapped: MutPtr): Hresult

public expect fun cfDisconnectSyncRoot(connectionkey: CfConnectionKey): Hresult

public expect fun cfExecute(opinfo: ConstPtr, opparams: MutPtr): Hresult

public expect fun cfGetCorrelationVector(filehandle: Handle, correlationvector: MutPtr): Hresult

public expect fun cfGetPlaceholderInfo(filehandle: Handle, infoclass: CfPlaceholderInfoClass, infobuffer: MutPtr, infobufferlength: UInt, returnedlength: MutPtr): Hresult

public expect fun cfGetPlaceholderRangeInfo(filehandle: Handle, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, length: Long, infobuffer: MutPtr, infobufferlength: UInt, returnedlength: MutPtr): Hresult

public expect fun cfGetPlaceholderRangeInfoForHydration(connectionkey: CfConnectionKey, transferkey: Long, fileid: Long, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, rangelength: Long, infobuffer: MutPtr, infobuffersize: UInt, infobufferwritten: MutPtr): Hresult

public expect fun cfGetPlaceholderStateFromAttributeTag(fileattributes: UInt, reparsetag: UInt): CfPlaceholderState

public expect fun cfGetPlaceholderStateFromFileInfo(infobuffer: ConstPtr, infoclass: FileInfoByHandleClass): CfPlaceholderState

public expect fun cfGetPlaceholderStateFromFindData(finddata: ConstPtr): CfPlaceholderState

public expect fun cfGetPlatformInfo(platformversion: MutPtr): Hresult

public expect fun cfGetSyncRootInfoByHandle(filehandle: Handle, infoclass: CfSyncRootInfoClass, infobuffer: MutPtr, infobufferlength: UInt, returnedlength: MutPtr): Hresult

public expect fun cfGetSyncRootInfoByPath(filepath: Pcwstr, infoclass: CfSyncRootInfoClass, infobuffer: MutPtr, infobufferlength: UInt, returnedlength: MutPtr): Hresult

public expect fun cfGetTransferKey(filehandle: Handle, transferkey: MutPtr): Hresult

public expect fun cfGetWin32HandleFromProtectedHandle(protectedhandle: Handle): Handle

public expect fun cfHydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, hydrateflags: CfHydrateFlags, overlapped: MutPtr): Hresult

public expect fun cfOpenFileWithOplock(filepath: Pcwstr, flags: CfOpenFileFlags, protectedhandle: MutPtr): Hresult

public expect fun cfQuerySyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: MutPtr): Hresult

public expect fun cfReferenceProtectedHandle(protectedhandle: Handle): Boolean

public expect fun cfRegisterSyncRoot(syncrootpath: Pcwstr, registration: ConstPtr, policies: ConstPtr, registerflags: CfRegisterFlags): Hresult

public expect fun cfReleaseProtectedHandle(protectedhandle: Handle)

public expect fun cfReleaseTransferKey(filehandle: Handle, transferkey: ConstPtr)

public expect fun cfReportProviderProgress(connectionkey: CfConnectionKey, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): Hresult

public expect fun cfReportProviderProgress2(connectionkey: CfConnectionKey, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: UInt): Hresult

public expect fun cfReportSyncStatus(syncrootpath: Pcwstr, syncstatus: ConstPtr): Hresult

public expect fun cfRevertPlaceholder(filehandle: Handle, revertflags: CfRevertFlags, overlapped: MutPtr): Hresult

public expect fun cfSetCorrelationVector(filehandle: Handle, correlationvector: ConstPtr): Hresult

public expect fun cfSetInSyncState(filehandle: Handle, insyncstate: CfInSyncState, insyncflags: CfSetInSyncFlags, insyncusn: MutPtr): Hresult

public expect fun cfSetPinState(filehandle: Handle, pinstate: CfPinState, pinflags: CfSetPinFlags, overlapped: MutPtr): Hresult

public expect fun cfUnregisterSyncRoot(syncrootpath: Pcwstr): Hresult

public expect fun cfUpdatePlaceholder(filehandle: Handle, fsmetadata: ConstPtr, fileidentity: ConstPtr, fileidentitylength: UInt, dehydraterangearray: ConstPtr, dehydraterangecount: UInt, updateflags: CfUpdateFlags, updateusn: MutPtr, overlapped: MutPtr): Hresult

public expect fun cfUpdateSyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: CfSyncProviderStatus): Hresult
