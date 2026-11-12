@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.memory

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun ntMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: MutPtr, zerobits: ULong, commitsize: ULong, sectionoffset: MutPtr, viewsize: MutPtr, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemMemoryNtMapViewOfSection")

public actual fun ntOpenSection(sectionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemMemoryNtOpenSection")

public actual fun ntUnmapViewOfSection(processhandle: Handle, baseaddress: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemMemoryNtUnmapViewOfSection")

public actual fun zwMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: MutPtr, zerobits: ULong, commitsize: ULong, sectionoffset: MutPtr, viewsize: MutPtr, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemMemoryZwMapViewOfSection")

public actual fun zwOpenSection(sectionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemMemoryZwOpenSection")

public actual fun zwUnmapViewOfSection(processhandle: Handle, baseaddress: ConstPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemMemoryZwUnmapViewOfSection")
