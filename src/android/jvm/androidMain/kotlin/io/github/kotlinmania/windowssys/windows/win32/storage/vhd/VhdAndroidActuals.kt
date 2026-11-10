@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.vhd

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

private object WindowsWin32StorageVhdJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_addVirtualDiskParent(virtualdiskhandle: Long, parentpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_applySnapshotVhdSet(virtualdiskhandle: Long, parameters: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_attachVirtualDisk(virtualdiskhandle: Long, securitydescriptor: Long, flags: Int, providerspecificflags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_breakMirrorVirtualDisk(virtualdiskhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_compactVirtualDisk(virtualdiskhandle: Long, flags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_completeForkVirtualDisk(virtualdiskhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_createVirtualDisk(virtualstoragetype: Long, path: Long, virtualdiskaccessmask: Int, securitydescriptor: Long, flags: Int, providerspecificflags: Int, parameters: Long, overlapped: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_deleteSnapshotVhdSet(virtualdiskhandle: Long, parameters: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_deleteVirtualDiskMetadata(virtualdiskhandle: Long, item: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_detachVirtualDisk(virtualdiskhandle: Long, flags: Int, providerspecificflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_enumerateVirtualDiskMetadata(virtualdiskhandle: Long, numberofitems: Long, items: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_expandVirtualDisk(virtualdiskhandle: Long, flags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_forkVirtualDisk(virtualdiskhandle: Long, flags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_getAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: Long, pathsbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_getStorageDependencyInformation(objecthandle: Long, flags: Int, storagedependencyinfosize: Int, storagedependencyinfo: Long, sizeused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_getVirtualDiskInformation(virtualdiskhandle: Long, virtualdiskinfosize: Long, virtualdiskinfo: Long, sizeused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_getVirtualDiskMetadata(virtualdiskhandle: Long, item: Long, metadatasize: Long, metadata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_getVirtualDiskOperationProgress(virtualdiskhandle: Long, overlapped: Long, progress: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_getVirtualDiskPhysicalPath(virtualdiskhandle: Long, diskpathsizeinbytes: Long, diskpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_mergeVirtualDisk(virtualdiskhandle: Long, flags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_mirrorVirtualDisk(virtualdiskhandle: Long, flags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_modifyVhdSet(virtualdiskhandle: Long, parameters: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_openVirtualDisk(virtualstoragetype: Long, path: Long, virtualdiskaccessmask: Int, flags: Int, parameters: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_queryChangesVirtualDisk(virtualdiskhandle: Long, changetrackingid: Long, byteoffset: Long, bytelength: Long, flags: Int, ranges: Long, rangecount: Long, processedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_rawSCSIVirtualDisk(virtualdiskhandle: Long, parameters: Long, flags: Int, response: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_resizeVirtualDisk(virtualdiskhandle: Long, flags: Int, parameters: Long, overlapped: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_setVirtualDiskInformation(virtualdiskhandle: Long, virtualdiskinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_setVirtualDiskMetadata(virtualdiskhandle: Long, item: Long, metadatasize: Int, metadata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_vhd_takeSnapshotVhdSet(virtualdiskhandle: Long, parameters: Long, flags: Int): Int
}

public actual fun addVirtualDiskParent(virtualdiskhandle: Handle, parentpath: Pcwstr): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_addVirtualDiskParent((virtualdiskhandle?.value ?: 0L), (parentpath?.value ?: 0L)).toUInt()

public actual fun applySnapshotVhdSet(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: ApplySnapshotVhdsetFlag): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_applySnapshotVhdSet((virtualdiskhandle?.value ?: 0L), (parameters?.value ?: 0L), flags).toUInt()

public actual fun attachVirtualDisk(virtualdiskhandle: Handle, securitydescriptor: PsecurityDescriptor, flags: AttachVirtualDiskFlag, providerspecificflags: UInt, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_attachVirtualDisk((virtualdiskhandle?.value ?: 0L), (securitydescriptor?.value ?: 0L), flags, providerspecificflags.toInt(), (parameters?.value ?: 0L), (overlapped?.value ?: 0L)).toUInt()

public actual fun breakMirrorVirtualDisk(virtualdiskhandle: Handle): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_breakMirrorVirtualDisk((virtualdiskhandle?.value ?: 0L)).toUInt()

public actual fun compactVirtualDisk(virtualdiskhandle: Handle, flags: CompactVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_compactVirtualDisk((virtualdiskhandle?.value ?: 0L), flags, (parameters?.value ?: 0L), (overlapped?.value ?: 0L)).toUInt()

public actual fun completeForkVirtualDisk(virtualdiskhandle: Handle): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_completeForkVirtualDisk((virtualdiskhandle?.value ?: 0L)).toUInt()

public actual fun createVirtualDisk(virtualstoragetype: COpaquePointer?, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, securitydescriptor: PsecurityDescriptor, flags: CreateVirtualDiskFlag, providerspecificflags: UInt, parameters: COpaquePointer?, overlapped: COpaquePointer?, handle: COpaquePointer?): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_createVirtualDisk((virtualstoragetype?.value ?: 0L), (path?.value ?: 0L), virtualdiskaccessmask, (securitydescriptor?.value ?: 0L), flags, providerspecificflags.toInt(), (parameters?.value ?: 0L), (overlapped?.value ?: 0L), (handle?.value ?: 0L)).toUInt()

public actual fun deleteSnapshotVhdSet(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: DeleteSnapshotVhdsetFlag): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_deleteSnapshotVhdSet((virtualdiskhandle?.value ?: 0L), (parameters?.value ?: 0L), flags).toUInt()

public actual fun deleteVirtualDiskMetadata(virtualdiskhandle: Handle, item: COpaquePointer?): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_deleteVirtualDiskMetadata((virtualdiskhandle?.value ?: 0L), (item?.value ?: 0L)).toUInt()

public actual fun detachVirtualDisk(virtualdiskhandle: Handle, flags: DetachVirtualDiskFlag, providerspecificflags: UInt): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_detachVirtualDisk((virtualdiskhandle?.value ?: 0L), flags, providerspecificflags.toInt()).toUInt()

public actual fun enumerateVirtualDiskMetadata(virtualdiskhandle: Handle, numberofitems: COpaquePointer?, items: COpaquePointer?): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_enumerateVirtualDiskMetadata((virtualdiskhandle?.value ?: 0L), (numberofitems?.value ?: 0L), (items?.value ?: 0L)).toUInt()

public actual fun expandVirtualDisk(virtualdiskhandle: Handle, flags: ExpandVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_expandVirtualDisk((virtualdiskhandle?.value ?: 0L), flags, (parameters?.value ?: 0L), (overlapped?.value ?: 0L)).toUInt()

public actual fun forkVirtualDisk(virtualdiskhandle: Handle, flags: ForkVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_forkVirtualDisk((virtualdiskhandle?.value ?: 0L), flags, (parameters?.value ?: 0L), (overlapped?.value ?: 0L)).toUInt()

public actual fun getAllAttachedVirtualDiskPhysicalPaths(pathsbuffersizeinbytes: COpaquePointer?, pathsbuffer: Pwstr): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_getAllAttachedVirtualDiskPhysicalPaths((pathsbuffersizeinbytes?.value ?: 0L), (pathsbuffer?.value ?: 0L)).toUInt()

public actual fun getStorageDependencyInformation(objecthandle: Handle, flags: GetStorageDependencyFlag, storagedependencyinfosize: UInt, storagedependencyinfo: COpaquePointer?, sizeused: COpaquePointer?): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_getStorageDependencyInformation((objecthandle?.value ?: 0L), flags, storagedependencyinfosize.toInt(), (storagedependencyinfo?.value ?: 0L), (sizeused?.value ?: 0L)).toUInt()

public actual fun getVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfosize: COpaquePointer?, virtualdiskinfo: COpaquePointer?, sizeused: COpaquePointer?): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_getVirtualDiskInformation((virtualdiskhandle?.value ?: 0L), (virtualdiskinfosize?.value ?: 0L), (virtualdiskinfo?.value ?: 0L), (sizeused?.value ?: 0L)).toUInt()

public actual fun getVirtualDiskMetadata(virtualdiskhandle: Handle, item: COpaquePointer?, metadatasize: COpaquePointer?, metadata: COpaquePointer?): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_getVirtualDiskMetadata((virtualdiskhandle?.value ?: 0L), (item?.value ?: 0L), (metadatasize?.value ?: 0L), (metadata?.value ?: 0L)).toUInt()

public actual fun getVirtualDiskOperationProgress(virtualdiskhandle: Handle, overlapped: COpaquePointer?, progress: COpaquePointer?): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_getVirtualDiskOperationProgress((virtualdiskhandle?.value ?: 0L), (overlapped?.value ?: 0L), (progress?.value ?: 0L)).toUInt()

public actual fun getVirtualDiskPhysicalPath(virtualdiskhandle: Handle, diskpathsizeinbytes: COpaquePointer?, diskpath: Pwstr): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_getVirtualDiskPhysicalPath((virtualdiskhandle?.value ?: 0L), (diskpathsizeinbytes?.value ?: 0L), (diskpath?.value ?: 0L)).toUInt()

public actual fun mergeVirtualDisk(virtualdiskhandle: Handle, flags: MergeVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_mergeVirtualDisk((virtualdiskhandle?.value ?: 0L), flags, (parameters?.value ?: 0L), (overlapped?.value ?: 0L)).toUInt()

public actual fun mirrorVirtualDisk(virtualdiskhandle: Handle, flags: MirrorVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_mirrorVirtualDisk((virtualdiskhandle?.value ?: 0L), flags, (parameters?.value ?: 0L), (overlapped?.value ?: 0L)).toUInt()

public actual fun modifyVhdSet(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: ModifyVhdsetFlag): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_modifyVhdSet((virtualdiskhandle?.value ?: 0L), (parameters?.value ?: 0L), flags).toUInt()

public actual fun openVirtualDisk(virtualstoragetype: COpaquePointer?, path: Pcwstr, virtualdiskaccessmask: VirtualDiskAccessMask, flags: OpenVirtualDiskFlag, parameters: COpaquePointer?, handle: COpaquePointer?): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_openVirtualDisk((virtualstoragetype?.value ?: 0L), (path?.value ?: 0L), virtualdiskaccessmask, flags, (parameters?.value ?: 0L), (handle?.value ?: 0L)).toUInt()

public actual fun queryChangesVirtualDisk(virtualdiskhandle: Handle, changetrackingid: Pcwstr, byteoffset: ULong, bytelength: ULong, flags: QueryChangesVirtualDiskFlag, ranges: COpaquePointer?, rangecount: COpaquePointer?, processedlength: COpaquePointer?): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_queryChangesVirtualDisk((virtualdiskhandle?.value ?: 0L), (changetrackingid?.value ?: 0L), byteoffset.toLong(), bytelength.toLong(), flags, (ranges?.value ?: 0L), (rangecount?.value ?: 0L), (processedlength?.value ?: 0L)).toUInt()

public actual fun rawSCSIVirtualDisk(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: RawScsiVirtualDiskFlag, response: COpaquePointer?): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_rawSCSIVirtualDisk((virtualdiskhandle?.value ?: 0L), (parameters?.value ?: 0L), flags, (response?.value ?: 0L)).toUInt()

public actual fun resizeVirtualDisk(virtualdiskhandle: Handle, flags: ResizeVirtualDiskFlag, parameters: COpaquePointer?, overlapped: COpaquePointer?): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_resizeVirtualDisk((virtualdiskhandle?.value ?: 0L), flags, (parameters?.value ?: 0L), (overlapped?.value ?: 0L)).toUInt()

public actual fun setVirtualDiskInformation(virtualdiskhandle: Handle, virtualdiskinfo: COpaquePointer?): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_setVirtualDiskInformation((virtualdiskhandle?.value ?: 0L), (virtualdiskinfo?.value ?: 0L)).toUInt()

public actual fun setVirtualDiskMetadata(virtualdiskhandle: Handle, item: COpaquePointer?, metadatasize: UInt, metadata: COpaquePointer?): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_setVirtualDiskMetadata((virtualdiskhandle?.value ?: 0L), (item?.value ?: 0L), metadatasize.toInt(), (metadata?.value ?: 0L)).toUInt()

public actual fun takeSnapshotVhdSet(virtualdiskhandle: Handle, parameters: COpaquePointer?, flags: TakeSnapshotVhdsetFlag): Win32Error =
    WindowsWin32StorageVhdJniBridge.windowssys_windows_win32_storage_vhd_takeSnapshotVhdSet((virtualdiskhandle?.value ?: 0L), (parameters?.value ?: 0L), flags).toUInt()
