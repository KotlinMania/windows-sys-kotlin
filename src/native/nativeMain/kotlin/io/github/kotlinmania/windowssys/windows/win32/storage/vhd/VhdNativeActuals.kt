@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.vhd

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_addVirtualDiskParent
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_applySnapshotVhdSet
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_attachVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_breakMirrorVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_compactVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_completeForkVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_createVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_deleteSnapshotVhdSet
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_deleteVirtualDiskMetadata
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_detachVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_enumerateVirtualDiskMetadata
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_expandVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_forkVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_getAllAttachedVirtualDiskPhysicalPaths
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_getStorageDependencyInformation
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_getVirtualDiskInformation
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_getVirtualDiskMetadata
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_getVirtualDiskOperationProgress
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_getVirtualDiskPhysicalPath
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_mergeVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_mirrorVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_modifyVhdSet
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_openVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_queryChangesVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_rawSCSIVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_resizeVirtualDisk
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_setVirtualDiskInformation
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_setVirtualDiskMetadata
import io.github.kotlinmania.windowssys.windows.win32.storage.vhd.cinterop.windowssys_windows_win32_storage_vhd_takeSnapshotVhdSet
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun addVirtualDiskParent(virtualdiskhandle: Handle, parentpath: Pcwstr): Win32Error =
    windowssys_windows_win32_storage_vhd_addVirtualDiskParent(virtualdiskhandle?.value?.toCPointer<ByteVar>(), parentpath?.value?.toCPointer<ByteVar>())

public actual fun applySnapshotVhdSet(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: ApplySnapshotVhdsetFlag): Win32Error =
    windowssys_windows_win32_storage_vhd_applySnapshotVhdSet(virtualdiskhandle?.value?.toCPointer<ByteVar>(), parameters?.value?.toCPointer<ByteVar>(), flags)

public actual fun attachVirtualDisk(virtualdiskhandle: Handle, securitydescriptor: PsecurityDescriptor, flags: AttachVirtualDiskFlag, providerspecificflags: UInt, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    windowssys_windows_win32_storage_vhd_attachVirtualDisk(virtualdiskhandle?.value?.toCPointer<ByteVar>(), securitydescriptor?.value?.toCPointer<ByteVar>(), flags, providerspecificflags, parameters?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun breakMirrorVirtualDisk(virtualdiskhandle: Handle): Win32Error =
    windowssys_windows_win32_storage_vhd_breakMirrorVirtualDisk(virtualdiskhandle?.value?.toCPointer<ByteVar>())

public actual fun compactVirtualDisk(virtualdiskhandle: Handle, flags: CompactVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    windowssys_windows_win32_storage_vhd_compactVirtualDisk(virtualdiskhandle?.value?.toCPointer<ByteVar>(), flags, parameters?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun completeForkVirtualDisk(virtualdiskhandle: Handle): Win32Error =
    windowssys_windows_win32_storage_vhd_completeForkVirtualDisk(virtualdiskhandle?.value?.toCPointer<ByteVar>())

public actual fun createVirtualDisk(virtualstoragetype: COpaquePointer?, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, securitydescriptor: PsecurityDescriptor, flags: CreateVirtualDiskFlag, providerspecificflags: UInt, parameters: COpaquePointer?, overlapped: COpaquePointer?, handle: COpaquePointer?): Win32Error =
    windowssys_windows_win32_storage_vhd_createVirtualDisk(virtualstoragetype?.value?.toCPointer<ByteVar>(), path?.value?.toCPointer<ByteVar>(), virtualdiskaccessmask, securitydescriptor?.value?.toCPointer<ByteVar>(), flags, providerspecificflags, parameters?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>(), handle?.value?.toCPointer<ByteVar>())

public actual fun deleteSnapshotVhdSet(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: DeleteSnapshotVhdsetFlag): Win32Error =
    windowssys_windows_win32_storage_vhd_deleteSnapshotVhdSet(virtualdiskhandle?.value?.toCPointer<ByteVar>(), parameters?.value?.toCPointer<ByteVar>(), flags)

public actual fun deleteVirtualDiskMetadata(virtualdiskhandle: Handle, item: COpaquePointer?): Win32Error =
    windowssys_windows_win32_storage_vhd_deleteVirtualDiskMetadata(virtualdiskhandle?.value?.toCPointer<ByteVar>(), item?.value?.toCPointer<ByteVar>())

public actual fun detachVirtualDisk(virtualdiskhandle: Handle, flags: DetachVirtualDiskFlag, providerspecificflags: UInt): Win32Error =
    windowssys_windows_win32_storage_vhd_detachVirtualDisk(virtualdiskhandle?.value?.toCPointer<ByteVar>(), flags, providerspecificflags)

public actual fun enumerateVirtualDiskMetadata(virtualdiskhandle: Handle, numberofitems: COpaquePointer?, items: COpaquePointer?): Win32Error =
    windowssys_windows_win32_storage_vhd_enumerateVirtualDiskMetadata(virtualdiskhandle?.value?.toCPointer<ByteVar>(), numberofitems?.value?.toCPointer<ByteVar>(), items?.value?.toCPointer<ByteVar>())

public actual fun expandVirtualDisk(virtualdiskhandle: Handle, flags: ExpandVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    windowssys_windows_win32_storage_vhd_expandVirtualDisk(virtualdiskhandle?.value?.toCPointer<ByteVar>(), flags, parameters?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun forkVirtualDisk(virtualdiskhandle: Handle, flags: ForkVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    windowssys_windows_win32_storage_vhd_forkVirtualDisk(virtualdiskhandle?.value?.toCPointer<ByteVar>(), flags, parameters?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun getAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: COpaquePointer?, pathsbuffer: Pwstr): Win32Error =
    windowssys_windows_win32_storage_vhd_getAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes?.value?.toCPointer<ByteVar>(), pathsbuffer?.value?.toCPointer<ByteVar>())

public actual fun getStorageDependencyInformation(objecthandle: Handle, flags: GetStorageDependencyFlag, storagedependencyinfosize: UInt, storagedependencyinfo: COpaquePointer?, sizeused: COpaquePointer?): Win32Error =
    windowssys_windows_win32_storage_vhd_getStorageDependencyInformation(objecthandle?.value?.toCPointer<ByteVar>(), flags, storagedependencyinfosize, storagedependencyinfo?.value?.toCPointer<ByteVar>(), sizeused?.value?.toCPointer<ByteVar>())

public actual fun getVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfosize: COpaquePointer?, virtualdiskinfo: COpaquePointer?, sizeused: COpaquePointer?): Win32Error =
    windowssys_windows_win32_storage_vhd_getVirtualDiskInformation(virtualdiskhandle?.value?.toCPointer<ByteVar>(), virtualdiskinfosize?.value?.toCPointer<ByteVar>(), virtualdiskinfo?.value?.toCPointer<ByteVar>(), sizeused?.value?.toCPointer<ByteVar>())

public actual fun getVirtualDiskMetadata(virtualdiskhandle: Handle, item: COpaquePointer?, metadatasize: COpaquePointer?, metadata: COpaquePointer?): Win32Error =
    windowssys_windows_win32_storage_vhd_getVirtualDiskMetadata(virtualdiskhandle?.value?.toCPointer<ByteVar>(), item?.value?.toCPointer<ByteVar>(), metadatasize?.value?.toCPointer<ByteVar>(), metadata?.value?.toCPointer<ByteVar>())

public actual fun getVirtualDiskOperationProgress(virtualdiskhandle: Handle, overlapped: COpaquePointer?, progress: COpaquePointer?): Win32Error =
    windowssys_windows_win32_storage_vhd_getVirtualDiskOperationProgress(virtualdiskhandle?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>(), progress?.value?.toCPointer<ByteVar>())

public actual fun getVirtualDiskPhysicalPath(virtualdiskhandle: Handle, diskpathsizeinbytes: COpaquePointer?, diskpath: Pwstr): Win32Error =
    windowssys_windows_win32_storage_vhd_getVirtualDiskPhysicalPath(virtualdiskhandle?.value?.toCPointer<ByteVar>(), diskpathsizeinbytes?.value?.toCPointer<ByteVar>(), diskpath?.value?.toCPointer<ByteVar>())

public actual fun mergeVirtualDisk(virtualdiskhandle: Handle, flags: MergeVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    windowssys_windows_win32_storage_vhd_mergeVirtualDisk(virtualdiskhandle?.value?.toCPointer<ByteVar>(), flags, parameters?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun mirrorVirtualDisk(virtualdiskhandle: Handle, flags: MirrorVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    windowssys_windows_win32_storage_vhd_mirrorVirtualDisk(virtualdiskhandle?.value?.toCPointer<ByteVar>(), flags, parameters?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun modifyVhdSet(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: ModifyVhdsetFlag): Win32Error =
    windowssys_windows_win32_storage_vhd_modifyVhdSet(virtualdiskhandle?.value?.toCPointer<ByteVar>(), parameters?.value?.toCPointer<ByteVar>(), flags)

public actual fun openVirtualDisk(virtualstoragetype: COpaquePointer?, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, flags: OpenVirtualDiskFlag, parameters: COpaquePointer?, handle: COpaquePointer?): Win32Error =
    windowssys_windows_win32_storage_vhd_openVirtualDisk(virtualstoragetype?.value?.toCPointer<ByteVar>(), path?.value?.toCPointer<ByteVar>(), virtualdiskaccessmask, flags, parameters?.value?.toCPointer<ByteVar>(), handle?.value?.toCPointer<ByteVar>())

public actual fun queryChangesVirtualDisk(virtualdiskhandle: Handle, changetrackingid: Pcwstr, byteoffset: ULong, bytelength: ULong, flags: QueryChangesVirtualDiskFlag, ranges: COpaquePointer?, rangecount: COpaquePointer?, processedlength: COpaquePointer?): Win32Error =
    windowssys_windows_win32_storage_vhd_queryChangesVirtualDisk(virtualdiskhandle?.value?.toCPointer<ByteVar>(), changetrackingid?.value?.toCPointer<ByteVar>(), byteoffset, bytelength, flags, ranges?.value?.toCPointer<ByteVar>(), rangecount?.value?.toCPointer<ByteVar>(), processedlength?.value?.toCPointer<ByteVar>())

public actual fun rawSCSIVirtualDisk(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: RawScsiVirtualDiskFlag, response: COpaquePointer?): Win32Error =
    windowssys_windows_win32_storage_vhd_rawSCSIVirtualDisk(virtualdiskhandle?.value?.toCPointer<ByteVar>(), parameters?.value?.toCPointer<ByteVar>(), flags, response?.value?.toCPointer<ByteVar>())

public actual fun resizeVirtualDisk(virtualdiskhandle: Handle, flags: ResizeVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    windowssys_windows_win32_storage_vhd_resizeVirtualDisk(virtualdiskhandle?.value?.toCPointer<ByteVar>(), flags, parameters?.value?.toCPointer<ByteVar>(), overlapped?.value?.toCPointer<ByteVar>())

public actual fun setVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfo: COpaquePointer?): Win32Error =
    windowssys_windows_win32_storage_vhd_setVirtualDiskInformation(virtualdiskhandle?.value?.toCPointer<ByteVar>(), virtualdiskinfo?.value?.toCPointer<ByteVar>())

public actual fun setVirtualDiskMetadata(virtualdiskhandle: Handle, item: COpaquePointer?, metadatasize: UInt, metadata: COpaquePointer?): Win32Error =
    windowssys_windows_win32_storage_vhd_setVirtualDiskMetadata(virtualdiskhandle?.value?.toCPointer<ByteVar>(), item?.value?.toCPointer<ByteVar>(), metadatasize, metadata?.value?.toCPointer<ByteVar>())

public actual fun takeSnapshotVhdSet(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: TakeSnapshotVhdsetFlag): Win32Error =
    windowssys_windows_win32_storage_vhd_takeSnapshotVhdSet(virtualdiskhandle?.value?.toCPointer<ByteVar>(), parameters?.value?.toCPointer<ByteVar>(), flags)
