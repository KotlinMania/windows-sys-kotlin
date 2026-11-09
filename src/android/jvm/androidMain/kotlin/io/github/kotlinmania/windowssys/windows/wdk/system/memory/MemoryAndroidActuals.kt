@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.memory

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS

private object WindowsWdkSystemMemoryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_system_memory_NtMapViewOfSection(sectionhandle: Long, processhandle: Long, baseaddress: Long, zerobits: Long, commitsize: Long, sectionoffset: Long, viewsize: Long, inheritdisposition: Int, allocationtype: Int, win32protect: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_memory_NtOpenSection(sectionhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_memory_NtUnmapViewOfSection(processhandle: Long, baseaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_memory_ZwMapViewOfSection(sectionhandle: Long, processhandle: Long, baseaddress: Long, zerobits: Long, commitsize: Long, sectionoffset: Long, viewsize: Long, inheritdisposition: Int, allocationtype: Int, win32protect: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_memory_ZwOpenSection(sectionhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_memory_ZwUnmapViewOfSection(processhandle: Long, baseaddress: Long): Int
}

public actual fun NtMapViewOfSection(sectionhandle: HANDLE, processhandle: HANDLE, baseaddress: Long, zerobits: ULong, commitsize: ULong, sectionoffset: Long, viewsize: Long, inheritdisposition: SECTION_INHERIT, allocationtype: UInt, win32protect: UInt): NTSTATUS =
    WindowsWdkSystemMemoryJniBridge.windowssys_windows_wdk_system_memory_NtMapViewOfSection(sectionhandle, processhandle, baseaddress, zerobits.toLong(), commitsize.toLong(), sectionoffset, viewsize, inheritdisposition, allocationtype.toInt(), win32protect.toInt())

public actual fun NtOpenSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    WindowsWdkSystemMemoryJniBridge.windowssys_windows_wdk_system_memory_NtOpenSection(sectionhandle, desiredaccess.toInt(), objectattributes)

public actual fun NtUnmapViewOfSection(processhandle: HANDLE, baseaddress: Long): NTSTATUS =
    WindowsWdkSystemMemoryJniBridge.windowssys_windows_wdk_system_memory_NtUnmapViewOfSection(processhandle, baseaddress)

public actual fun ZwMapViewOfSection(sectionhandle: HANDLE, processhandle: HANDLE, baseaddress: Long, zerobits: ULong, commitsize: ULong, sectionoffset: Long, viewsize: Long, inheritdisposition: SECTION_INHERIT, allocationtype: UInt, win32protect: UInt): NTSTATUS =
    WindowsWdkSystemMemoryJniBridge.windowssys_windows_wdk_system_memory_ZwMapViewOfSection(sectionhandle, processhandle, baseaddress, zerobits.toLong(), commitsize.toLong(), sectionoffset, viewsize, inheritdisposition, allocationtype.toInt(), win32protect.toInt())

public actual fun ZwOpenSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    WindowsWdkSystemMemoryJniBridge.windowssys_windows_wdk_system_memory_ZwOpenSection(sectionhandle, desiredaccess.toInt(), objectattributes)

public actual fun ZwUnmapViewOfSection(processhandle: HANDLE, baseaddress: Long): NTSTATUS =
    WindowsWdkSystemMemoryJniBridge.windowssys_windows_wdk_system_memory_ZwUnmapViewOfSection(processhandle, baseaddress)
