@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.memory

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWdkSystemMemoryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_system_memory_ntMapViewOfSection(sectionhandle: Long, processhandle: Long, baseaddress: Long, zerobits: Long, commitsize: Long, sectionoffset: Long, viewsize: Long, inheritdisposition: Int, allocationtype: Int, win32protect: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_memory_ntOpenSection(sectionhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_memory_ntUnmapViewOfSection(processhandle: Long, baseaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_memory_zwMapViewOfSection(sectionhandle: Long, processhandle: Long, baseaddress: Long, zerobits: Long, commitsize: Long, sectionoffset: Long, viewsize: Long, inheritdisposition: Int, allocationtype: Int, win32protect: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_memory_zwOpenSection(sectionhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_memory_zwUnmapViewOfSection(processhandle: Long, baseaddress: Long): Int
}

public actual fun ntMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: COpaquePointer?, zerobits: ULong, commitsize: ULong, sectionoffset: COpaquePointer?, viewsize: COpaquePointer?, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus =
    WindowsWdkSystemMemoryJniBridge.windowssys_windows_wdk_system_memory_ntMapViewOfSection((sectionhandle?.value ?: 0L), (processhandle?.value ?: 0L), (baseaddress?.value ?: 0L), zerobits.toLong(), commitsize.toLong(), (sectionoffset?.value ?: 0L), (viewsize?.value ?: 0L), inheritdisposition, allocationtype.toInt(), win32protect.toInt())

public actual fun ntOpenSection(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkSystemMemoryJniBridge.windowssys_windows_wdk_system_memory_ntOpenSection((sectionhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L))

public actual fun ntUnmapViewOfSection(processhandle: Handle, baseaddress: COpaquePointer?): Ntstatus =
    WindowsWdkSystemMemoryJniBridge.windowssys_windows_wdk_system_memory_ntUnmapViewOfSection((processhandle?.value ?: 0L), (baseaddress?.value ?: 0L))

public actual fun zwMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: COpaquePointer?, zerobits: ULong, commitsize: ULong, sectionoffset: COpaquePointer?, viewsize: COpaquePointer?, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus =
    WindowsWdkSystemMemoryJniBridge.windowssys_windows_wdk_system_memory_zwMapViewOfSection((sectionhandle?.value ?: 0L), (processhandle?.value ?: 0L), (baseaddress?.value ?: 0L), zerobits.toLong(), commitsize.toLong(), (sectionoffset?.value ?: 0L), (viewsize?.value ?: 0L), inheritdisposition, allocationtype.toInt(), win32protect.toInt())

public actual fun zwOpenSection(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkSystemMemoryJniBridge.windowssys_windows_wdk_system_memory_zwOpenSection((sectionhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L))

public actual fun zwUnmapViewOfSection(processhandle: Handle, baseaddress: COpaquePointer?): Ntstatus =
    WindowsWdkSystemMemoryJniBridge.windowssys_windows_wdk_system_memory_zwUnmapViewOfSection((processhandle?.value ?: 0L), (baseaddress?.value ?: 0L))
