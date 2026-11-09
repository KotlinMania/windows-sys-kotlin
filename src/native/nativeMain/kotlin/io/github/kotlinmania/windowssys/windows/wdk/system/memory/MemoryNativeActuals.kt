@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.memory

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.NTSTATUS
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun NtMapViewOfSection(sectionhandle: HANDLE, processhandle: HANDLE, baseaddress: Long, zerobits: ULong, commitsize: ULong, sectionoffset: Long, viewsize: Long, inheritdisposition: SECTION_INHERIT, allocationtype: UInt, win32protect: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.memory.cinterop.windowssys_windows_wdk_system_memory_NtMapViewOfSection(sectionhandle.toCPointer<ByteVar>(), processhandle.toCPointer<ByteVar>(), baseaddress.toCPointer<ByteVar>(), zerobits, commitsize, sectionoffset.toCPointer<ByteVar>(), viewsize.toCPointer<ByteVar>(), inheritdisposition, allocationtype, win32protect)

public actual fun NtOpenSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.memory.cinterop.windowssys_windows_wdk_system_memory_NtOpenSection(sectionhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>())

public actual fun NtUnmapViewOfSection(processhandle: HANDLE, baseaddress: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.memory.cinterop.windowssys_windows_wdk_system_memory_NtUnmapViewOfSection(processhandle.toCPointer<ByteVar>(), baseaddress.toCPointer<ByteVar>())

public actual fun ZwMapViewOfSection(sectionhandle: HANDLE, processhandle: HANDLE, baseaddress: Long, zerobits: ULong, commitsize: ULong, sectionoffset: Long, viewsize: Long, inheritdisposition: SECTION_INHERIT, allocationtype: UInt, win32protect: UInt): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.memory.cinterop.windowssys_windows_wdk_system_memory_ZwMapViewOfSection(sectionhandle.toCPointer<ByteVar>(), processhandle.toCPointer<ByteVar>(), baseaddress.toCPointer<ByteVar>(), zerobits, commitsize, sectionoffset.toCPointer<ByteVar>(), viewsize.toCPointer<ByteVar>(), inheritdisposition, allocationtype, win32protect)

public actual fun ZwOpenSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.memory.cinterop.windowssys_windows_wdk_system_memory_ZwOpenSection(sectionhandle.toCPointer<ByteVar>(), desiredaccess, objectattributes.toCPointer<ByteVar>())

public actual fun ZwUnmapViewOfSection(processhandle: HANDLE, baseaddress: Long): NTSTATUS =
    io.github.kotlinmania.windowssys.windows.wdk.system.memory.cinterop.windowssys_windows_wdk_system_memory_ZwUnmapViewOfSection(processhandle.toCPointer<ByteVar>(), baseaddress.toCPointer<ByteVar>())
