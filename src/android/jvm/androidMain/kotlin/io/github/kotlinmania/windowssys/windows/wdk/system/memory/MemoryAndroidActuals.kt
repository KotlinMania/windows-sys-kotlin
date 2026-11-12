@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.memory

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWdkSystemMemoryJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWdkSystemMemoryNtMapViewOfSection(sectionhandle: Long, processhandle: Long, baseaddress: Long, zerobits: Long, commitsize: Long, sectionoffset: Long, viewsize: Long, inheritdisposition: Int, allocationtype: Int, win32protect: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemMemoryNtOpenSection(sectionhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemMemoryNtUnmapViewOfSection(processhandle: Long, baseaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemMemoryZwMapViewOfSection(sectionhandle: Long, processhandle: Long, baseaddress: Long, zerobits: Long, commitsize: Long, sectionoffset: Long, viewsize: Long, inheritdisposition: Int, allocationtype: Int, win32protect: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemMemoryZwOpenSection(sectionhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemMemoryZwUnmapViewOfSection(processhandle: Long, baseaddress: Long): Int
}

public actual fun ntMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, zerobits: ULong, commitsize: ULong, sectionoffset: MutPtr<Long>, viewsize: MutPtr<ULong>, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus =
    WindowsWdkSystemMemoryJniBridge.windowssysWindowsWdkSystemMemoryNtMapViewOfSection(sectionhandle.rawAddress, processhandle.rawAddress, baseaddress.rawAddress, zerobits.toLong(), commitsize.toLong(), sectionoffset.rawAddress, viewsize.rawAddress, inheritdisposition, allocationtype.toInt(), win32protect.toInt())

public actual fun ntOpenSection(sectionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    WindowsWdkSystemMemoryJniBridge.windowssysWindowsWdkSystemMemoryNtOpenSection(sectionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress)

public actual fun ntUnmapViewOfSection(processhandle: Handle, baseaddress: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemMemoryJniBridge.windowssysWindowsWdkSystemMemoryNtUnmapViewOfSection(processhandle.rawAddress, baseaddress.rawAddress)

public actual fun zwMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, zerobits: ULong, commitsize: ULong, sectionoffset: MutPtr<Long>, viewsize: MutPtr<ULong>, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus =
    WindowsWdkSystemMemoryJniBridge.windowssysWindowsWdkSystemMemoryZwMapViewOfSection(sectionhandle.rawAddress, processhandle.rawAddress, baseaddress.rawAddress, zerobits.toLong(), commitsize.toLong(), sectionoffset.rawAddress, viewsize.rawAddress, inheritdisposition, allocationtype.toInt(), win32protect.toInt())

public actual fun zwOpenSection(sectionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    WindowsWdkSystemMemoryJniBridge.windowssysWindowsWdkSystemMemoryZwOpenSection(sectionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress)

public actual fun zwUnmapViewOfSection(processhandle: Handle, baseaddress: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemMemoryJniBridge.windowssysWindowsWdkSystemMemoryZwUnmapViewOfSection(processhandle.rawAddress, baseaddress.rawAddress)
