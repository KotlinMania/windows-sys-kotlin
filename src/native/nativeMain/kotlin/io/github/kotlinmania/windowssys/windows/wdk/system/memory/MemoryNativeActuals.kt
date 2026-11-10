@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.memory

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ntMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: COpaquePointer?, zerobits: ULong, commitsize: ULong, sectionoffset: COpaquePointer?, viewsize: COpaquePointer?, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.memory.cinterop.windowssys_windows_wdk_system_memory_ntMapViewOfSection(sectionhandle?.value?.toCPointer<ByteVar>(), processhandle?.value?.toCPointer<ByteVar>(), baseaddress?.value?.toCPointer<ByteVar>(), zerobits, commitsize, sectionoffset?.value?.toCPointer<ByteVar>(), viewsize?.value?.toCPointer<ByteVar>(), inheritdisposition, allocationtype, win32protect)

public actual fun ntOpenSection(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.memory.cinterop.windowssys_windows_wdk_system_memory_ntOpenSection(sectionhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>())

public actual fun ntUnmapViewOfSection(processhandle: Handle, baseaddress: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.memory.cinterop.windowssys_windows_wdk_system_memory_ntUnmapViewOfSection(processhandle?.value?.toCPointer<ByteVar>(), baseaddress?.value?.toCPointer<ByteVar>())

public actual fun zwMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: COpaquePointer?, zerobits: ULong, commitsize: ULong, sectionoffset: COpaquePointer?, viewsize: COpaquePointer?, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.memory.cinterop.windowssys_windows_wdk_system_memory_zwMapViewOfSection(sectionhandle?.value?.toCPointer<ByteVar>(), processhandle?.value?.toCPointer<ByteVar>(), baseaddress?.value?.toCPointer<ByteVar>(), zerobits, commitsize, sectionoffset?.value?.toCPointer<ByteVar>(), viewsize?.value?.toCPointer<ByteVar>(), inheritdisposition, allocationtype, win32protect)

public actual fun zwOpenSection(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.memory.cinterop.windowssys_windows_wdk_system_memory_zwOpenSection(sectionhandle?.value?.toCPointer<ByteVar>(), desiredaccess, objectattributes?.value?.toCPointer<ByteVar>())

public actual fun zwUnmapViewOfSection(processhandle: Handle, baseaddress: COpaquePointer?): Ntstatus =
    io.github.kotlinmania.windowssys.windows.wdk.system.memory.cinterop.windowssys_windows_wdk_system_memory_zwUnmapViewOfSection(processhandle?.value?.toCPointer<ByteVar>(), baseaddress?.value?.toCPointer<ByteVar>())
