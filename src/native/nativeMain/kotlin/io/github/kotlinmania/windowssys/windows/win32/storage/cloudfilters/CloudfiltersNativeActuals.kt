@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfCloseHandle
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfConnectSyncRoot
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfConvertToPlaceholder
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfCreatePlaceholders
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfDehydratePlaceholder
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfDisconnectSyncRoot
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfExecute
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfGetCorrelationVector
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderInfo
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfo
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfoForHydration
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromAttributeTag
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFileInfo
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFindData
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfGetPlatformInfo
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByHandle
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByPath
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfGetTransferKey
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfGetWin32HandleFromProtectedHandle
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfHydratePlaceholder
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfOpenFileWithOplock
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfQuerySyncProviderStatus
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfReferenceProtectedHandle
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfRegisterSyncRoot
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfReleaseProtectedHandle
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfReleaseTransferKey
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress2
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfReportSyncStatus
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfRevertPlaceholder
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfSetCorrelationVector
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfSetInSyncState
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfSetPinState
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfUnregisterSyncRoot
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfUpdatePlaceholder
import io.github.kotlinmania.windowssys.windows.win32.storage.cloudfilters.cinterop.windowssysWindowsWin32StorageCloudfiltersCfUpdateSyncProviderStatus
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileInfoByHandleClass
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.Win32FindDataa
import io.github.kotlinmania.windowssys.windows.win32.system.CorrelationVector
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun cfCloseHandle(filehandle: Handle) {
    windowssysWindowsWin32StorageCloudfiltersCfCloseHandle(filehandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun cfConnectSyncRoot(syncrootpath: Pcwstr, callbacktable: ConstPtr<CfCallbackRegistration>, callbackcontext: ConstPtr<CVoid>, connectflags: CfConnectFlags, connectionkey: MutPtr<CfConnectionKey>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfConnectSyncRoot(syncrootpath.rawAddress.toCPointer<ByteVar>(), callbacktable.rawAddress.toCPointer<ByteVar>(), callbackcontext.rawAddress.toCPointer<ByteVar>(), connectflags, connectionkey.rawAddress.toCPointer<ByteVar>())

public actual fun cfConvertToPlaceholder(filehandle: Handle, fileidentity: ConstPtr<CVoid>, fileidentitylength: UInt, convertflags: CfConvertFlags, convertusn: MutPtr<Long>, overlapped: MutPtr<Overlapped>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfConvertToPlaceholder(filehandle.rawAddress.toCPointer<ByteVar>(), fileidentity.rawAddress.toCPointer<ByteVar>(), fileidentitylength, convertflags, convertusn.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun cfCreatePlaceholders(basedirectorypath: Pcwstr, placeholderarray: MutPtr<CfPlaceholderCreateInfo>, placeholdercount: UInt, createflags: CfCreateFlags, entriesprocessed: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfCreatePlaceholders(basedirectorypath.rawAddress.toCPointer<ByteVar>(), placeholderarray.rawAddress.toCPointer<ByteVar>(), placeholdercount, createflags, entriesprocessed.rawAddress.toCPointer<ByteVar>())

public actual fun cfDehydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, dehydrateflags: CfDehydrateFlags, overlapped: MutPtr<Overlapped>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfDehydratePlaceholder(filehandle.rawAddress.toCPointer<ByteVar>(), startingoffset, length, dehydrateflags, overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun cfDisconnectSyncRoot(connectionkey: CfConnectionKey): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfDisconnectSyncRoot(connectionkey)

public actual fun cfExecute(opinfo: ConstPtr<CfOperationInfo>, opparams: MutPtr<CfOperationParameters>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfExecute(opinfo.rawAddress.toCPointer<ByteVar>(), opparams.rawAddress.toCPointer<ByteVar>())

public actual fun cfGetCorrelationVector(filehandle: Handle, correlationvector: MutPtr<CorrelationVector.CorrelationVector>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfGetCorrelationVector(filehandle.rawAddress.toCPointer<ByteVar>(), correlationvector.rawAddress.toCPointer<ByteVar>())

public actual fun cfGetPlaceholderInfo(filehandle: Handle, infoclass: CfPlaceholderInfoClass, infobuffer: MutPtr<CVoid>, infobufferlength: UInt, returnedlength: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderInfo(filehandle.rawAddress.toCPointer<ByteVar>(), infoclass, infobuffer.rawAddress.toCPointer<ByteVar>(), infobufferlength, returnedlength.rawAddress.toCPointer<ByteVar>())

public actual fun cfGetPlaceholderRangeInfo(filehandle: Handle, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, length: Long, infobuffer: MutPtr<CVoid>, infobufferlength: UInt, returnedlength: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfo(filehandle.rawAddress.toCPointer<ByteVar>(), infoclass, startingoffset, length, infobuffer.rawAddress.toCPointer<ByteVar>(), infobufferlength, returnedlength.rawAddress.toCPointer<ByteVar>())

public actual fun cfGetPlaceholderRangeInfoForHydration(connectionkey: CfConnectionKey, transferkey: Long, fileid: Long, infoclass: CfPlaceholderRangeInfoClass, startingoffset: Long, rangelength: Long, infobuffer: MutPtr<CVoid>, infobuffersize: UInt, infobufferwritten: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderRangeInfoForHydration(connectionkey, transferkey, fileid, infoclass, startingoffset, rangelength, infobuffer.rawAddress.toCPointer<ByteVar>(), infobuffersize, infobufferwritten.rawAddress.toCPointer<ByteVar>())

public actual fun cfGetPlaceholderStateFromAttributeTag(fileattributes: UInt, reparsetag: UInt): CfPlaceholderState =
    windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromAttributeTag(fileattributes, reparsetag)

public actual fun cfGetPlaceholderStateFromFileInfo(infobuffer: ConstPtr<CVoid>, infoclass: FileInfoByHandleClass): CfPlaceholderState =
    windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFileInfo(infobuffer.rawAddress.toCPointer<ByteVar>(), infoclass)

public actual fun cfGetPlaceholderStateFromFindData(finddata: ConstPtr<Win32FindDataa>): CfPlaceholderState =
    windowssysWindowsWin32StorageCloudfiltersCfGetPlaceholderStateFromFindData(finddata.rawAddress.toCPointer<ByteVar>())

public actual fun cfGetPlatformInfo(platformversion: MutPtr<CfPlatformInfo>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfGetPlatformInfo(platformversion.rawAddress.toCPointer<ByteVar>())

public actual fun cfGetSyncRootInfoByHandle(filehandle: Handle, infoclass: CfSyncRootInfoClass, infobuffer: MutPtr<CVoid>, infobufferlength: UInt, returnedlength: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByHandle(filehandle.rawAddress.toCPointer<ByteVar>(), infoclass, infobuffer.rawAddress.toCPointer<ByteVar>(), infobufferlength, returnedlength.rawAddress.toCPointer<ByteVar>())

public actual fun cfGetSyncRootInfoByPath(filepath: Pcwstr, infoclass: CfSyncRootInfoClass, infobuffer: MutPtr<CVoid>, infobufferlength: UInt, returnedlength: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfGetSyncRootInfoByPath(filepath.rawAddress.toCPointer<ByteVar>(), infoclass, infobuffer.rawAddress.toCPointer<ByteVar>(), infobufferlength, returnedlength.rawAddress.toCPointer<ByteVar>())

public actual fun cfGetTransferKey(filehandle: Handle, transferkey: MutPtr<Long>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfGetTransferKey(filehandle.rawAddress.toCPointer<ByteVar>(), transferkey.rawAddress.toCPointer<ByteVar>())

public actual fun cfGetWin32HandleFromProtectedHandle(protectedhandle: Handle): Handle =
    MutPtr(windowssysWindowsWin32StorageCloudfiltersCfGetWin32HandleFromProtectedHandle(protectedhandle.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun cfHydratePlaceholder(filehandle: Handle, startingoffset: Long, length: Long, hydrateflags: CfHydrateFlags, overlapped: MutPtr<Overlapped>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfHydratePlaceholder(filehandle.rawAddress.toCPointer<ByteVar>(), startingoffset, length, hydrateflags, overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun cfOpenFileWithOplock(filepath: Pcwstr, flags: CfOpenFileFlags, protectedhandle: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfOpenFileWithOplock(filepath.rawAddress.toCPointer<ByteVar>(), flags, protectedhandle.rawAddress.toCPointer<ByteVar>())

public actual fun cfQuerySyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: MutPtr<CfSyncProviderStatus>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfQuerySyncProviderStatus(connectionkey, providerstatus.rawAddress.toCPointer<ByteVar>())

public actual fun cfReferenceProtectedHandle(protectedhandle: Handle): Boolean =
    windowssysWindowsWin32StorageCloudfiltersCfReferenceProtectedHandle(protectedhandle.rawAddress.toCPointer<ByteVar>())

public actual fun cfRegisterSyncRoot(syncrootpath: Pcwstr, registration: ConstPtr<CfSyncRegistration>, policies: ConstPtr<CfSyncPolicies>, registerflags: CfRegisterFlags): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfRegisterSyncRoot(syncrootpath.rawAddress.toCPointer<ByteVar>(), registration.rawAddress.toCPointer<ByteVar>(), policies.rawAddress.toCPointer<ByteVar>(), registerflags)

public actual fun cfReleaseProtectedHandle(protectedhandle: Handle) {
    windowssysWindowsWin32StorageCloudfiltersCfReleaseProtectedHandle(protectedhandle.rawAddress.toCPointer<ByteVar>())
}

public actual fun cfReleaseTransferKey(filehandle: Handle, transferkey: ConstPtr<Long>) {
    windowssysWindowsWin32StorageCloudfiltersCfReleaseTransferKey(filehandle.rawAddress.toCPointer<ByteVar>(), transferkey.rawAddress.toCPointer<ByteVar>())
}

public actual fun cfReportProviderProgress(connectionkey: CfConnectionKey, transferkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress(connectionkey, transferkey, providerprogresstotal, providerprogresscompleted)

public actual fun cfReportProviderProgress2(connectionkey: CfConnectionKey, transferkey: Long, requestkey: Long, providerprogresstotal: Long, providerprogresscompleted: Long, targetsessionid: UInt): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfReportProviderProgress2(connectionkey, transferkey, requestkey, providerprogresstotal, providerprogresscompleted, targetsessionid)

public actual fun cfReportSyncStatus(syncrootpath: Pcwstr, syncstatus: ConstPtr<CfSyncStatus>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfReportSyncStatus(syncrootpath.rawAddress.toCPointer<ByteVar>(), syncstatus.rawAddress.toCPointer<ByteVar>())

public actual fun cfRevertPlaceholder(filehandle: Handle, revertflags: CfRevertFlags, overlapped: MutPtr<Overlapped>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfRevertPlaceholder(filehandle.rawAddress.toCPointer<ByteVar>(), revertflags, overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun cfSetCorrelationVector(filehandle: Handle, correlationvector: ConstPtr<CorrelationVector.CorrelationVector>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfSetCorrelationVector(filehandle.rawAddress.toCPointer<ByteVar>(), correlationvector.rawAddress.toCPointer<ByteVar>())

public actual fun cfSetInSyncState(filehandle: Handle, insyncstate: CfInSyncState, insyncflags: CfSetInSyncFlags, insyncusn: MutPtr<Long>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfSetInSyncState(filehandle.rawAddress.toCPointer<ByteVar>(), insyncstate, insyncflags, insyncusn.rawAddress.toCPointer<ByteVar>())

public actual fun cfSetPinState(filehandle: Handle, pinstate: CfPinState, pinflags: CfSetPinFlags, overlapped: MutPtr<Overlapped>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfSetPinState(filehandle.rawAddress.toCPointer<ByteVar>(), pinstate, pinflags, overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun cfUnregisterSyncRoot(syncrootpath: Pcwstr): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfUnregisterSyncRoot(syncrootpath.rawAddress.toCPointer<ByteVar>())

public actual fun cfUpdatePlaceholder(filehandle: Handle, fsmetadata: ConstPtr<CfFsMetadata>, fileidentity: ConstPtr<CVoid>, fileidentitylength: UInt, dehydraterangearray: ConstPtr<CfFileRange>, dehydraterangecount: UInt, updateflags: CfUpdateFlags, updateusn: MutPtr<Long>, overlapped: MutPtr<Overlapped>): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfUpdatePlaceholder(filehandle.rawAddress.toCPointer<ByteVar>(), fsmetadata.rawAddress.toCPointer<ByteVar>(), fileidentity.rawAddress.toCPointer<ByteVar>(), fileidentitylength, dehydraterangearray.rawAddress.toCPointer<ByteVar>(), dehydraterangecount, updateflags, updateusn.rawAddress.toCPointer<ByteVar>(), overlapped.rawAddress.toCPointer<ByteVar>())

public actual fun cfUpdateSyncProviderStatus(connectionkey: CfConnectionKey, providerstatus: CfSyncProviderStatus): Hresult =
    windowssysWindowsWin32StorageCloudfiltersCfUpdateSyncProviderStatus(connectionkey, providerstatus)
