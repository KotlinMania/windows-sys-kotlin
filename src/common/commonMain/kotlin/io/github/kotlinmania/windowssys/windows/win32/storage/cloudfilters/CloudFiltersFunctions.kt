package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileInfoByHandleClass

public expect fun cfCloseHandle(filehandle: Handle)

public expect fun cfConnectSyncRoot(syncrootpath: Pcwstr, callbacktable: COpaquePointer?, callbackcontext: COpaquePointer?, connectflags: CfConnectFlags, connectionkey: COpaquePointer?): Hresult

public expect fun cfConvertToPlaceholder(filehandle: Handle, fileidentity: COpaquePointer?, fileidentitylength: UInt, convertflags: CfConvertFlags, convertusn: COpaquePointer?, overlapped: COpaquePointer?): Hresult

public expect fun cfCreatePlaceholders(basedirectorypath: Pcwstr, placeholderarray: COpaquePointer?, placeholdercount: UInt, createflags: CfCreateFlags, entriesprocessed: COpaquePointer?): Hresult

public expect fun cfDehydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, dehydrateflags: CfDehydrateFlags, overlapped: COpaquePointer?): Hresult

public expect fun cfDisconnectSyncRoot(connectionkey: CfConnectionKey): Hresult

public expect fun cfExecute(opinfo: COpaquePointer?, opparams: COpaquePointer?): Hresult

public expect fun cfGetCorrelationVector(filehandle: Handle, correlationvector: COpaquePointer?): Hresult

public expect fun cfGetPlaceholderInfo(filehandle: Handle, infoclass: CfPlaceholderInfoClass, infobuffer: COpaquePointer?, infobufferlength: UInt, returnedlength: COpaquePointer?): Hresult

public expect fun cfGetPlaceholderRangeInfo(filehandle: Handle, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, length: Long, infobuffer: COpaquePointer?, infobufferlength: UInt, returnedlength: COpaquePointer?): Hresult

public expect fun cfGetPlaceholderRangeInfoForHydration(connectionkey: CfConnectionKey, transferkey: Long, fileid: Long, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, rangelength: Long, infobuffer: COpaquePointer?, infobuffersize: UInt, infobufferwritten: COpaquePointer?): Hresult

public expect fun cfGetPlaceholderStateFromAttributeTag(fileattributes: UInt, reparsetag: UInt): CfPlaceholderState

public expect fun cfGetPlaceholderStateFromFileInfo(infobuffer: COpaquePointer?, infoclass: FileInfoByHandleClass): CfPlaceholderState

public expect fun cfGetPlaceholderStateFromFindData(finddata: COpaquePointer?): CfPlaceholderState

public expect fun cfGetPlatformInfo(platformversion: COpaquePointer?): Hresult

public expect fun cfGetSyncRootInfoByHandle(filehandle: Handle, infoclass: CfSyncRootInfoClass, infobuffer: COpaquePointer?, infobufferlength: UInt, returnedlength: COpaquePointer?): Hresult

public expect fun cfGetSyncRootInfoByPath(filepath: Pcwstr, infoclass: CfSyncRootInfoClass, infobuffer: COpaquePointer?, infobufferlength: UInt, returnedlength: COpaquePointer?): Hresult

public expect fun cfGetTransferKey(filehandle: Handle, transferkey: COpaquePointer?): Hresult

public expect fun cfGetWin32HandleFromProtectedHandle(protectedhandle: Handle): Handle

public expect fun cfHydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, hydrateflags: CfHydrateFlags, overlapped: COpaquePointer?): Hresult

public expect fun cfOpenFileWithOplock(filepath: Pcwstr, flags: CfOpenFileFlags, protectedhandle: COpaquePointer?): Hresult

public expect fun cfQuerySyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: COpaquePointer?): Hresult

public expect fun cfReferenceProtectedHandle(protectedhandle: Handle): Boolean

public expect fun cfRegisterSyncRoot(syncrootpath: Pcwstr, registration: COpaquePointer?, policies: COpaquePointer?, registerflags: CfRegisterFlags): Hresult

public expect fun cfReleaseProtectedHandle(protectedhandle: Handle)

public expect fun cfReleaseTransferKey(filehandle: Handle, transferkey: COpaquePointer?)

public expect fun cfReportProviderProgress(connectionkey: CfConnectionKey, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): Hresult

public expect fun cfReportProviderProgress2(connectionkey: CfConnectionKey, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: UInt): Hresult

public expect fun cfReportSyncStatus(syncrootpath: Pcwstr, syncstatus: COpaquePointer?): Hresult

public expect fun cfRevertPlaceholder(filehandle: Handle, revertflags: CfRevertFlags, overlapped: COpaquePointer?): Hresult

public expect fun cfSetCorrelationVector(filehandle: Handle, correlationvector: COpaquePointer?): Hresult

public expect fun cfSetInSyncState(filehandle: Handle, insyncstate: CfInSyncState, insyncflags: CfSetInSyncFlags, insyncusn: COpaquePointer?): Hresult

public expect fun cfSetPinState(filehandle: Handle, pinstate: CfPinState, pinflags: CfSetPinFlags, overlapped: COpaquePointer?): Hresult

public expect fun cfUnregisterSyncRoot(syncrootpath: Pcwstr): Hresult

public expect fun cfUpdatePlaceholder(filehandle: Handle, fsmetadata: COpaquePointer?, fileidentity: COpaquePointer?, fileidentitylength: UInt, dehydraterangearray: COpaquePointer?, dehydraterangecount: UInt, updateflags: CfUpdateFlags, updateusn: COpaquePointer?, overlapped: COpaquePointer?): Hresult

public expect fun cfUpdateSyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: CfSyncProviderStatus): Hresult
