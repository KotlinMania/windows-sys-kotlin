@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.memory

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
import io.github.kotlinmania.windowssys.windows.wdk.system.memory.cinterop.windowssysWindowsWdkSystemMemoryNtMapViewOfSection
import io.github.kotlinmania.windowssys.windows.wdk.system.memory.cinterop.windowssysWindowsWdkSystemMemoryNtOpenSection
import io.github.kotlinmania.windowssys.windows.wdk.system.memory.cinterop.windowssysWindowsWdkSystemMemoryNtUnmapViewOfSection
import io.github.kotlinmania.windowssys.windows.wdk.system.memory.cinterop.windowssysWindowsWdkSystemMemoryZwMapViewOfSection
import io.github.kotlinmania.windowssys.windows.wdk.system.memory.cinterop.windowssysWindowsWdkSystemMemoryZwOpenSection
import io.github.kotlinmania.windowssys.windows.wdk.system.memory.cinterop.windowssysWindowsWdkSystemMemoryZwUnmapViewOfSection
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ntMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, zerobits: ULong, commitsize: ULong, sectionoffset: MutPtr<Long>, viewsize: MutPtr<ULong>, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus =
    windowssysWindowsWdkSystemMemoryNtMapViewOfSection(sectionhandle.rawAddress.toCPointer<ByteVar>(), processhandle.rawAddress.toCPointer<ByteVar>(), baseaddress.rawAddress.toCPointer<ByteVar>(), zerobits, commitsize, sectionoffset.rawAddress.toCPointer<ByteVar>(), viewsize.rawAddress.toCPointer<ByteVar>(), inheritdisposition, allocationtype, win32protect)

public actual fun ntOpenSection(sectionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    windowssysWindowsWdkSystemMemoryNtOpenSection(sectionhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>())

public actual fun ntUnmapViewOfSection(processhandle: Handle, baseaddress: ConstPtr<CVoid>): Ntstatus =
    windowssysWindowsWdkSystemMemoryNtUnmapViewOfSection(processhandle.rawAddress.toCPointer<ByteVar>(), baseaddress.rawAddress.toCPointer<ByteVar>())

public actual fun zwMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, zerobits: ULong, commitsize: ULong, sectionoffset: MutPtr<Long>, viewsize: MutPtr<ULong>, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus =
    windowssysWindowsWdkSystemMemoryZwMapViewOfSection(sectionhandle.rawAddress.toCPointer<ByteVar>(), processhandle.rawAddress.toCPointer<ByteVar>(), baseaddress.rawAddress.toCPointer<ByteVar>(), zerobits, commitsize, sectionoffset.rawAddress.toCPointer<ByteVar>(), viewsize.rawAddress.toCPointer<ByteVar>(), inheritdisposition, allocationtype, win32protect)

public actual fun zwOpenSection(sectionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    windowssysWindowsWdkSystemMemoryZwOpenSection(sectionhandle.rawAddress.toCPointer<ByteVar>(), desiredaccess, objectattributes.rawAddress.toCPointer<ByteVar>())

public actual fun zwUnmapViewOfSection(processhandle: Handle, baseaddress: ConstPtr<CVoid>): Ntstatus =
    windowssysWindowsWdkSystemMemoryZwUnmapViewOfSection(processhandle.rawAddress.toCPointer<ByteVar>(), baseaddress.rawAddress.toCPointer<ByteVar>())
