package io.github.kotlinmania.windowssys.windows.wdk.system.memory

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public expect fun ntMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, zerobits: ULong, commitsize: ULong, sectionoffset: MutPtr<Long>, viewsize: MutPtr<ULong>, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus

public expect fun ntOpenSection(sectionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun ntUnmapViewOfSection(processhandle: Handle, baseaddress: ConstPtr<CVoid>): Ntstatus

public expect fun zwMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: MutPtr<MutPtr<CVoid>>, zerobits: ULong, commitsize: ULong, sectionoffset: MutPtr<Long>, viewsize: MutPtr<ULong>, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus

public expect fun zwOpenSection(sectionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus

public expect fun zwUnmapViewOfSection(processhandle: Handle, baseaddress: ConstPtr<CVoid>): Ntstatus
